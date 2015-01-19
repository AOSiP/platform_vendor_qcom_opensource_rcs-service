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

import java.io.Serializable;

public class GroupUserData implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -6652084152928469940L;

    public static final String TABLE_GROUP_USER = "chatGroupUser";

    public static final String KEY_ID = "_id";

    public static final String KEY_URI = "_uri";

    public static final String KEY_GROUP_ID = "_groupid";

    public static final String KEY_NAME = "_name";

    public static final String KEY_NUMBER = "_number";

    public static final String KEY_ROLE = "_role";

    public static final String KEY_TIME = "_time";

    public static final String KEY_AGREE_TO_JOIN = "_agreetojoin";

    public static final String KEY_INVITE_NUMBER = "_invitenumber";

    public static final String KEY_ETYPE = "_etype";

    /**
     * Column name about alias of member.
     */
    public static final String KEY_ALIAS = "_alias";

    /**
     * Column name about etag.
     */
    public static final String KEY_ETAG = "_etag";

    /**
     * Column name about image type.
     */
    public static final String KEY_IMG_TYPE = "_imgtype";

    /**
     * Column name about header image.
     */
    public static final String KEY_HEADER_IMG = "_headimg";

}
