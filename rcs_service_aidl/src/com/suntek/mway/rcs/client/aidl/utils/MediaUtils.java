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
package com.suntek.mway.rcs.client.aidl.utils;

import java.io.File;
import java.util.Locale;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;

import com.suntek.mway.rcs.client.aidl.constant.MediaConstants;

/**
 * The Class MediaUtils.
 */
public class MediaUtils {

    /**
     * Checks if is image file.
     *
     * @param fileName the file name
     * @return true, if is image file
     */
    public static boolean isImageFile(String fileName){
        if(TextUtils.isEmpty(fileName)){
            return false;
        }

        int suffixIndex = fileName.lastIndexOf(".");
        if(suffixIndex != -1){
            String suffix = fileName.substring(suffixIndex + 1);
            return isImageSuffix(suffix);
        }else{
            return false;
        }
    }

    /**
     * Checks if is audio file.
     *
     * @param fileName the file name
     * @return true, if is audio file
     */
    public static boolean isAudioFile(String fileName){
        if(TextUtils.isEmpty(fileName)){
            return false;
        }

        int suffixIndex = fileName.lastIndexOf(".");
        if(suffixIndex != -1){
            String suffix = fileName.substring(suffixIndex + 1);
            return isAudioSuffix(suffix);
        }else{
            return false;
        }
    }

    /**
     * Checks if is video file.
     *
     * @param fileName the file name
     * @return true, if is video file
     */
    public static boolean isVideoFile(String fileName){
        if(TextUtils.isEmpty(fileName)){
            return false;
        }

        int suffixIndex = fileName.lastIndexOf(".");
        if(suffixIndex != -1){
            String suffix = fileName.substring(suffixIndex + 1);
            return isVideoSuffix(suffix);
        }else{
            return false;
        }
    }
    
    /**
     * Checks if is vcard file.
     *
     * @param fileName the file name
     * @return true, if is vcard file
     */
    public static boolean isVcardFile(String fileName){
        if(TextUtils.isEmpty(fileName)){
            return false;
        }
        
        int suffixIndex = fileName.lastIndexOf(".");
        if(suffixIndex != -1){
            String suffix = fileName.substring(suffixIndex + 1);
            return isVcardSuffix(suffix);
        }else{
            return false;
        }
    }

    /**
     * Checks if is video file.
     *
     * @param fileName the file name
     * @return true, if is video file
     */
    public static boolean isCloudFileAllowedFile(String fileName){
        if(TextUtils.isEmpty(fileName)){
            return false;
        }

        int suffixIndex = fileName.lastIndexOf(".");
        if(suffixIndex != -1){
            String suffix = fileName.substring(suffixIndex + 1);
            return !isCloudFileExcludeSuffix(suffix);
        }else{
            return false;
        }
    }

    /**
     * Checks if is image suffix.
     *
     * @param suffix the suffix
     * @return true, if is image suffix
     */
    public static boolean isImageSuffix(String suffix){
        if(TextUtils.isEmpty(suffix)){
            return false;
        }

        return MediaConstants.IMAGE_SUFFIX.indexOf(suffix.toUpperCase(Locale.getDefault())) != -1;
    }

    /**
     * Checks if is audio suffix.
     *
     * @param suffix the suffix
     * @return true, if is audio suffix
     */
    public static boolean isAudioSuffix(String suffix){
        if(TextUtils.isEmpty(suffix)){
            return false;
        }

        return MediaConstants.AUDIO_SUFFIX.indexOf(suffix.toUpperCase(Locale.getDefault())) != -1;
    }

    /**
     * Checks if is video suffix.
     *
     * @param suffix the suffix
     * @return true, if is video suffix
     */
    public static boolean isVideoSuffix(String suffix){
        if(TextUtils.isEmpty(suffix)){
            return false;
        }

        return MediaConstants.VIDEO_SUFFIX.indexOf(suffix.toUpperCase(Locale.getDefault())) != -1;
    }
    
    /**
     * Checks if is vcard suffix.
     *
     * @param suffix the suffix
     * @return true, if is vcard suffix
     */
    public static boolean isVcardSuffix(String suffix){
        if(TextUtils.isEmpty(suffix)){
            return false;
        }
        
        return MediaConstants.VCARD_SUFFIX.indexOf(suffix.toUpperCase(Locale.getDefault())) != -1;
    }
    
    /**
     * Checks if is cloud file exclude suffix.
     *
     * @param suffix the suffix
     * @return true, if is cloud file exclude suffix
     */
    public static boolean isCloudFileExcludeSuffix(String suffix){
        if(TextUtils.isEmpty(suffix)){
            return false;
        }

        return MediaConstants.CLOUD_FILE_EXCLUDE_SUFFIX.indexOf(suffix.toUpperCase(Locale.getDefault())) != -1;
    }

    /**
     * Gets the amr file duration.
     *
     * @param context
     *            the context
     * @param file
     *            the file
     * @return the amr file duration
     */
    public static final int getAmrFileDuration(Context context, File file) {
        MediaPlayer mp = MediaPlayer.create(context, Uri.fromFile(file));
        int duration = mp.getDuration();
        mp.release();
        return duration;
    }

    /**
     * Gets the video file duration.
     *
     * @param context
     *            the context
     * @param file
     *            the file
     * @return the video file duration
     */
    public static final int getVideoFileDuration(Context context, File file) {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.prepare();
            mediaPlayer.getDuration();
            int duration = mediaPlayer.getDuration();
            mediaPlayer.release();
            return duration;
        } catch (Exception e) {

        }
        return -1;
    }
}
