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
package com.suntek.mway.rcs.client.aidl.provider;

import android.net.Uri;

/**
 * The Class PublicAccountData.
 */
public class PublicAccountData {

    /** The Constant PUBLIC_ACCOUNT_AUTHORITY. */
    public static final String PUBLIC_ACCOUNT_AUTHORITY = "com.suntek.mway.rcs.pubacct";

    /** The Constant TABLE_ACCOUNT. */
    public static final String TABLE_ACCOUNT = "publicAccount";
    
    /** The Constant TABLE_ACCOUNT. */
    public static final String TABLE_ACCOUNT_HIS = "publicAccountHis";

    /** The Constant PUBLIC_ACCOUNT_CONTENT_URI. */
    public static final Uri PUBLIC_ACCOUNT_CONTENT_URI = Uri.parse("content://" + PUBLIC_ACCOUNT_AUTHORITY + "/" + TABLE_ACCOUNT);

    /** The Constant ID. */
    public static final String ID = "_id";

    /** The Constant ACCOUNT_ID. */
    public static final String ACCOUNT_ID = "_pa_uuid";

    /** The Constant ACCOUNT_NAME. */
    public static final String ACCOUNT_NAME = "_name";

    /** The Constant ACCOUNT_PHOTO_URL. */
    public static final String ACCOUNT_LOGO = "_logo";

    /** The Constant ACCOUNT_ENTERPRISE. */
    public static final String ACCOUNT_RECOMMEND_LEVEL = "_recommend_level";

    /** The Constant ACCOUNT_FUNTION. */
    public static final String ACCOUNT_SIP_URI = "_sip_uri";

    /** The Constant ACCOUNT_FOLLOWRD. */
    public static final String ACCOUNT_FOLLOWRD = "_followed";

    /** The Constant ACCOUNT_ACCEPT. */
    public static final String ACCOUNT_ACCEPT = "_accept";

    /** The Constant ACCOUNT_FOLLOWRD_TIME. */
    public static final String ACCOUNT_FOLLOWRD_TIME = "_followed_time";

    /** The Constant ACCOUNT_COMPANY. */
    public static final String ACCOUNT_COMPANY = "_company";

    /** The Constant ACCOUNT_INTRO. */
    public static final String ACCOUNT_INTRO = "_intro";

    /** The Constant ACCOUNT_TYPE. */
    public static final String ACCOUNT_TYPE = "_type";

    /** The Constant ACCOUNT_UPDATETIME. */
    public static final String ACCOUNT_UPDATETIME = "_updateTime";

    /** The Constant ACCOUNT_MENUTYPE. */
    public static final String ACCOUNT_MENUTYPE = "_menuType";

    /** The Constant ACCOUNT_MENUTIMESTAMP. */
    public static final String ACCOUNT_MENUTIMESTAMP = "_menuTimestamp";

    /** The Constant ACCOUNT_SUBSCRIBESTATUS. */
    public static final String ACCOUNT_SUBSCRIBESTATUS = "_subscribeStatus";

    /** The Constant ACCOUNT_ACTIVESTATUS. */
    public static final String ACCOUNT_ACTIVESTATUS = "_activeStatus";

    /** The Constant ACCOUNT_TEL. */
    public static final String ACCOUNT_TEL = "_tel";

    /** The Constant ACCOUNT_EMAIL. */
    public static final String ACCOUNT_EMAIL = "_email";

    /** The Constant ACCOUNT_ZIP. */
    public static final String ACCOUNT_ZIP = "_zip";

    /** The Constant ACCOUNT_ADDR. */
    public static final String ACCOUNT_ADDR = "_addr";

    /** The Constant ACCOUNT_FIELD. */
    public static final String ACCOUNT_FIELD = "_field";

    /** The Constant ACCOUNT_QRCODE. */
    public static final String ACCOUNT_QRCODE = "_qrCode";
    
    /** The Constant ACCOUNT_LOGO_TYPE. */
    public static final String ACCOUNT_LOGO_TYPE = "_logoType";
    
    /** The Constant ACCOUNT_MENU_STRING. */
    public static final String ACCOUNT_MENU_STRING = "_menuString";
}
