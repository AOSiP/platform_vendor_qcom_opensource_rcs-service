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
 * <p>Title: NewAddressBookData class</p>
 * <p>
 * Description: The class <code>NewAddressBookData</code> represents a new address book data database
 * definition used by RCS.
 * The constants definition include the access database URI and some column names.
 * </p>
 * <p>
 * Copyright: Copyright (c) 2014
 * </p>
 * <p>
 * Company: pci-suntek
 * </p>
 * @author YE JIE MING
 * @version 1.0
 *
 */
public class NewAddressBookData {

    /** The Constant CONTENT_URI. */
    public static final Uri CONTENT_URI = Uri.parse("content://com.suntek.mway.rcs.new.contacts/contacts");

    /** The Constant ID. */
    public static final String ID = "_id";


    /** The Constant CONTACT_NUMBER. */
    public static final String CONTACT_NUMBER = "contact_number";

    /** The Constant PRESENCE_SHARING_STATUS. */
    public static final String PRESENCE_SHARING_STATUS = "presence_sharing_status";


    /** The Constant TIMESTAMP. */
    public static final String TIMESTAMP = "timestamp";

    /** The Constant RCS_STATUS. */
    public static final String RCS_STATUS = "rcs_status";


    /** The Constant REGISTRATION_STATE. */
    public static final String REGISTRATION_STATE = "registration_state";


    /** The Constant RCS_STATUS_TIMESTAMP. */
    public static final String RCS_STATUS_TIMESTAMP = "rcs_status_timestamp";


    /** The Constant PRESENCE_FREE_TEXT. */
    public static final String PRESENCE_FREE_TEXT = "presence_free_text";


    /** The Constant PRESENCE_WEBLINK_NAME. */
    public static final String PRESENCE_WEBLINK_NAME = "presence_weblink_name";

    /** The Constant PRESENCE_WEBLINK_URL. */
    public static final String PRESENCE_WEBLINK_URL = "presence_weblink_url";

    /** The Constant PRESENCE_PHOTO_EXIST_FLAG. */
    public static final String PRESENCE_PHOTO_EXIST_FLAG = "presence_photo_exist_flag";

    /** The Constant PRESENCE_PHOTO_ETAG. */
    public static final String PRESENCE_PHOTO_ETAG = "presence_photo_etag";


    /** The Constant PRESENCE_PHOTO_DATA. */
    public static final String PRESENCE_PHOTO_DATA = "presence_photo_data";


    /** The Constant PRESENCE_GEOLOC_EXIST_FLAG. */
    public static final String PRESENCE_GEOLOC_EXIST_FLAG = "presence_geoloc_exist_flag";


    /** The Constant PRESENCE_GEOLOC_LATITUDE. */
    public static final String PRESENCE_GEOLOC_LATITUDE = "presence_geoloc_latitude";

    /** The Constant PRESENCE_GEOLOC_LONGITUDE. */
    public static final String PRESENCE_GEOLOC_LONGITUDE = "presence_geoloc_longitude";


    /** The Constant PRESENCE_GEOLOC_ALTITUDE. */
    public static final String PRESENCE_GEOLOC_ALTITUDE = "presence_geoloc_altitude";


    /** The Constant PRESENCE_TIMESTAMP. */
    public static final String PRESENCE_TIMESTAMP = "presence_timestamp";


    /** The Constant CAPABILITY_TIMESTAMP. */
    public static final String CAPABILITY_TIMESTAMP = "capability_timestamp";

    /** The Constant CAPABILITY_CS_VIDEO. */
    public static final String CAPABILITY_CS_VIDEO = "capability_cs_video";


    /** The Constant CAPABILITY_IMAGE_SHARING. */
    public static final String CAPABILITY_IMAGE_SHARING = "capability_image_sharing";


    /** The Constant CAPABILITY_VIDEO_SHARING. */
    public static final String CAPABILITY_VIDEO_SHARING = "capability_video_sharing";

    /** The Constant CAPABILITY_IP_VOICE_CALL. */
    public static final String CAPABILITY_IP_VOICE_CALL = "capability_ip_voice_call";


    /** The Constant CAPABILITY_IP_VIDEO_CALL. */
    public static final String CAPABILITY_IP_VIDEO_CALL = "capability_ip_video_call";


    /** The Constant CAPABILITY_IM_SESSION. */
    public static final String CAPABILITY_IM_SESSION = "capability_im_session";


    /** The Constant CAPABILITY_FILE_TRANSFER. */
    public static final String CAPABILITY_FILE_TRANSFER = "capability_file_transfer";

    /** The Constant CAPABILITY_PRESENCE_DISCOVERY. */
    public static final String CAPABILITY_PRESENCE_DISCOVERY = "capability_presence_discovery";


    /** The Constant CAPABILITY_SOCIAL_PRESENCE. */
    public static final String CAPABILITY_SOCIAL_PRESENCE = "capability_social_presence";


    /** The Constant CAPABILITY_GEOLOCATION_PUSH. */
    public static final String CAPABILITY_GEOLOCATION_PUSH = "capability_geolocation_push";


    /** The Constant CAPABILITY_FILE_TRANSFER_HTTP. */
    public static final String CAPABILITY_FILE_TRANSFER_HTTP = "capability_file_transfer_http";

    /** The Constant CAPABILITY_FILE_TRANSFER_THUMBNAIL. */
    public static final String CAPABILITY_FILE_TRANSFER_THUMBNAIL = "capability_file_transfer_thumbnail";


    /** The Constant CAPABILITY_FILE_TRANSFER_SF. */
    public static final String CAPABILITY_FILE_TRANSFER_SF = "capability_file_transfer_sf";


    /** The Constant CAPABILITY_GROUP_CHAT_SF. */
    public static final String CAPABILITY_GROUP_CHAT_SF = "capability_group_chat_sf";


    /** The Constant CAPABILITY_EXTENSIONS. */
    public static final String CAPABILITY_EXTENSIONS = "capability_extensions";


    /** The Constant CAPABILITY_COMMON_EXTENSION. */
    public static final String CAPABILITY_COMMON_EXTENSION = "capability_common_extension";


    /** The Constant IM_BLOCKED. */
    public static final String IM_BLOCKED = "im_blocked";


    /** The Constant CAPABILITY_IM_BLOCKED_TIMESTAMP. */
    public static final String CAPABILITY_IM_BLOCKED_TIMESTAMP = "im_blocked_timestamp";

    /** The Constant TRUE. */
    public static final String TRUE = Boolean.toString(true);

    /** The Constant FALSE. */
    public static final String FALSE = Boolean.toString(false);

}
