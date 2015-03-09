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
package com.suntek.mway.rcs.client.aidl.constant;

/**
 * The Class MediaConstants.
 */
public class MediaConstants {

    /** The suffixs of image. */
    public static final String IMAGE_SUFFIX = "JPG,JPEG,PNG,GIF,BMP";

    /** The suffixs of audio. */
    public static final String AUDIO_SUFFIX = "MP3,M4A,AAC,AMR,3GP";

    /** The suffixs of video. */
    public static final String VIDEO_SUFFIX = "3GP,MP4";
    
    /** The suffixs of video. */
    public static final String VCARD_SUFFIX = "VCF";
    
    /** The suffixs of video. */
    public static final String CLOUD_FILE_EXCLUDE_SUFFIX = "EXE,BAT,APK,SH,IPA,DEB,PXL,XAP";

    /** Maximum default file size. */
    public static final long DEFAULT_FT_MAX_SIZE = 10 * 1024;

    /** Maximum image file size. */
    public static final long IMAGE_FT_MAX_SIZE = 10 * 1024;

    /** Maximum video file size. */
    public static final long VIDEO_FT_MAX_SIZE = 500 * 1024;
    
    /** Maximum cloud file size. */
    public static final long CLOUD_FT_MAX_SIZE = 500 * 1024;

    /** Maximum video file time. */
    public static final long VIDEO_MAX_TIME = 90;

    /** Maximum audio file time. */
    public static final long AUDIO_MAX_TIME = 180;

    /** Maximum file size. */
    public static final long FT_MAX_SIZE = 500 * 1024;

    public static final String FT_THUMB = "1";
}
