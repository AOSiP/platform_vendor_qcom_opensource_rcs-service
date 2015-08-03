/*
 * Copyright (c) 2015 pci-suntektech Technologies, Inc.  All Rights Reserved.
 * pci-suntektech Technologies Proprietary and Confidential.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
package com.suntek.rcs.ui.common.mms;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.ImageView;

import com.suntek.mway.rcs.client.aidl.constant.Parameter;
import com.suntek.mway.rcs.client.aidl.plugin.entity.profile.Avatar;
import com.suntek.mway.rcs.client.api.exception.ServiceDisconnectedException;
import com.suntek.mway.rcs.client.api.groupchat.GroupChatCallback;
import com.suntek.mway.rcs.client.api.groupchat.GroupChatApi;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

public class GroupMemberPhotoCache {
    private final static int IMAGE_PIXEL = 120;
    private HashMap<String, SoftReference<Bitmap>> mImageCache;
    private LinkedBlockingQueue<LoaderImageTask> mTaskQueue;
    private boolean mIsRuning = false;
    private static GroupMemberPhotoCache sInstance = new GroupMemberPhotoCache();
    private static Drawable mDefaultContectImage = null;

    private GroupMemberPhotoCache() {
        mImageCache = new HashMap<String, SoftReference<Bitmap>>();
        mTaskQueue = new LinkedBlockingQueue<LoaderImageTask>();
        mIsRuning = true;
        new Thread(runnable).start();
    }

    public void loadGroupMemberPhoto(long rcsGroupId, String addr,
            final ImageView mAvatar,final Drawable defaultContactImage) {
        if (mDefaultContectImage == null) {
            mDefaultContectImage = defaultContactImage;
        }
        if(mAvatar == null){
            return;
        }
        mAvatar.setTag(addr);
        if (mImageCache.containsKey(addr)) {
            SoftReference<Bitmap> rf = mImageCache.get(addr);
            Bitmap bitmap = rf.get();
            if (bitmap == null) {
                mImageCache.remove(addr);
            } else {
                mAvatar.setImageBitmap(bitmap);
                return;
            }
        }
        mTaskQueue.add(new LoaderImageTask(addr, mAvatar, rcsGroupId));
    }

    public static GroupMemberPhotoCache getInstance() {
        if (sInstance == null) {
            sInstance = new GroupMemberPhotoCache();
        }
        return sInstance;
    }

    public class LoaderImageTask {
        String number;

        ImageView imageView;

        Bitmap bitmap;

        long mGroupId;

        public LoaderImageTask(String number, ImageView imageView, long groupId) {
            this.number = number;
            this.imageView = imageView;
            this.mGroupId = groupId;
        }
    }

    private Bitmap getbitmap(String number, long groupId) {
        Bitmap bitmap = null;
        try {
            GroupChatApi.getInstance().getMemberAvatar(groupId, number, IMAGE_PIXEL,
                    new GroupChatCallback() {

                        @Override
                        public void onUpdateAvatar(Avatar avatar, int resultCode,
                                String resultDesc) throws RemoteException {
                            if (avatar != null) {
                                String str = avatar.getImgBase64Str();
                                if (str != null) {
                                    byte[] imageByte = Base64.decode(str, Base64.DEFAULT);
                                    Bitmap bitmap = BitmapFactory.decodeByteArray(imageByte, 0,
                                            imageByte.length);
                                }
                            }
                        }
                    });
        } catch (ServiceDisconnectedException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if (bitmap != null) {
            mImageCache.put(number, new SoftReference<Bitmap>(bitmap));
        }
        return bitmap;
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            while (mIsRuning) {
                try {
                    LoaderImageTask task = mTaskQueue.take();
                    String imageId = (String) task.imageView.getTag();
                    if (!TextUtils.isEmpty(imageId) && imageId.equals(task.number)) {
                        task.bitmap = getbitmap(task.number, task.mGroupId);
                        if (mHandler != null) {
                            Message msg = mHandler.obtainMessage();
                            msg.obj = task;
                            mHandler.sendMessage(msg);
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            LoaderImageTask task = (LoaderImageTask) msg.obj;
            String number = (String) task.imageView.getTag();
            if (!TextUtils.isEmpty(number) && number.equals(task.number)) {
                if (task.bitmap != null) {
                    task.imageView.setImageBitmap(task.bitmap);
                }
            }
        }
    };
}
