/*
 * Copyright (c) 2014 pci-suntektech Technologies, Inc.  All Rights Reserved.
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
package com.suntek.mway.rcs.client.aidl.provider.model;

import android.os.Parcel;
import android.os.Parcelable;


public class TopMessageData implements Parcelable{


    // messages show on the top of frame
    public static final String TABLE_TOP_MESSAGE = "topMessage";

    // autoincrement id
    public static final String KEY_ID = "_id";

    // thread id
    public static final String KEY_THREAD_ID = "_threadId";

    // the time of setting message placed at the top
    public static final String KEY_TIME = "_time";


    private int id;

    private String threadId;

    private long time;

    public TopMessageData(){
    }

    public TopMessageData(Parcel in) {
        readFromParcel(in);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<TopMessageData> CREATOR = new Parcelable.Creator<TopMessageData>() {
        public TopMessageData createFromParcel(Parcel in) {
            return new TopMessageData(in);
        }

        @Override
        public TopMessageData[] newArray(int size) {
            return new TopMessageData[size];
        }

    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(threadId);
        dest.writeLong(time);
    }

    public void readFromParcel(Parcel source) {
        id = source.readInt();
        threadId = source.readString();
        time = source.readLong();
    }

    @Override
    public String toString() {
        return "TopMessageData [id=" + id + ", threadId=" + threadId
                + ", time=" + time + "]";
    }
}
