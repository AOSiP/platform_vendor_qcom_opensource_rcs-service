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

package com.suntek.mway.rcs.client.aidl.constant;

import android.net.Uri;
import android.provider.BaseColumns;

public class Constants {

    /** The Constant of im off line. */
    public static final int CONST_IM_OFFLINE = 0;

    /** The Constant of im online. */
    public static final int CONST_IM_ONLINE = 1;

    public static final int CONST_ERROR_EVENT_DOWNLOAD_FILE = 1;

    public static final int CONST_ERROR_EVENT_PAUSE_DOWNLOAD_FILE = 2;

    public static final int CONST_ERROR_TYPE_TIMEOUT = -1;

    public static final int CONST_ERROR_TYPE_UNKNOW = -2;

    public static final int CONST_ERROR_TYPE_INTERNAL = -3;

    public static final int CONST_ERROR_TYPE_NOT_REGISTER = -4;

    public static class RegisterConstants {
        public static final int CONST_ONLINE = 0;

        public static final int CONST_OFFLINE = 1;

        public static final int CONST_SIM_NOT_EXIST = 2;

        public static final int CONST_NETWORK_UNAVAILABLE = 3;

        public static final int CONST_ACCOUNT_NOT_EXIST = 4;

        public static final int CONST_NEED_OPEN_PS = 5;

        public static final int CONST_ACCOUNT_STATUS_EXCEPTION = 6;

        public static final int CONST_DMS_INVALID = 7;

        public static final int CONST_SERVER_REJECTED = 8;

        public static final int CONST_TYPE_TERMINAL = 1;

        public static final int CONST_TYPE_SIM_CARD = 2;

        public static final int CONST_TYPE_ACCOUNT = 3;

        public static final int CONST_TYPE_SIP = 4;

        public static final int CONST_TYPE_DMS = 5;

        public static final int CONST_TYPE_SERVER = 6;
    }

    public static class MessageConstants {
        public static final String CONST_IMAGE_SUFFIX = "JPG,JPEG,PNG,GIF,BMP";

        public static final String CONST_AUDIO_SUFFIX = "MP3,M4A,AAC,AMR,3GP";

        public static final String CONST_VIDEO_SUFFIX = "3GP,MP4";

        public static final String CONST_VCARD_SUFFIX = "VCF";

        public static final String CONST_CLOUD_FILE_EXCLUDE_SUFFIX = "EXE,BAT,APK,SH,IPA,DEB,PXL,XAP";

        /** Maximum default file size. */
        public static final long CONST_DEFAULT_FT_MAX_SIZE = 10 * 1024;

        /** Maximum image file size. */
        public static final long CONST_IMAGE_FT_MAX_SIZE = 10 * 1024;

        /** Maximum video file size. */
        public static final long CONST_VIDEO_FT_MAX_SIZE = 500 * 1024;

        /** Maximum cloud file size. */
        public static final long CONST_CLOUD_FT_MAX_SIZE = 500 * 1024;

        /** Maximum video file time. */
        public static final long CONST_VIDEO_MAX_TIME = 90;

        /** Maximum audio file time. */
        public static final long CONST_AUDIO_MAX_TIME = 180;

        /** Maximum file size. */
        public static final long CONST_FT_MAX_SIZE = 500 * 1024;

        public static final String CONST_FT_THUMB = "1";

        public static final int CONST_MIN_QUALITY = 0;

        public static final int CONST_MAX_QUALITY = 100;

        public static final int CONST_CHAT_O2O = 1;

        public static final int CONST_CHAT_O2M = 2;

        public static final int CONST_CHAT_GROUP = 3;

        public static final int CONST_CHAT_PUBLIC_ACCOUNT = 4;

        public static final int CONST_CHAT_PC = 5;

        public static final int CONST_MESSAGE_SMS = -1;

        public static final int CONST_MESSAGE_TEXT = 0;

        public static final int CONST_MESSAGE_IMAGE = 1;

        public static final int CONST_MESSAGE_AUDIO = 2;

        public static final int CONST_MESSAGE_VIDEO = 3;

        public static final int CONST_MESSAGE_MAP = 4;

        public static final int CONST_MESSAGE_CONTACT = 5;

        public static final int CONST_MESSAGE_PUBLIC_ACCOUNT_ARTICLE = 6;

        public static final int CONST_MESSAGE_NOTIFICATION = 7;

        public static final int CONST_MESSAGE_PAID_EMOTICON = 8;

        public static final int CONST_MESSAGE_CLOUD_FILE = 9;

        public static final int CONST_MESSAGE_OTHER_FILE = 10;

        public static final int CONST_MESSAGE_PUBLIC_ACCOUNT_SYNC_SUBSCRIBE = 11;

        public static final int CONST_MESSAGE_PUBLIC_ACCOUNT_SYNC_DETAIL = 12;

        public static final int CONST_DIRECTION_SEND_FAILED = 5;

        public static final int CONST_DIRECTION_SEND = 2;

        public static final int CONST_DIRECTION_RECEIVE = 1;

        public static final int CONST_STATUS_BURNED = -128;

        public static final int CONST_STATUS_ALREADY_READ = -64;

        public static final int CONST_STATUS_UNREAD = -32;

        public static final int CONST_STATUS_SEND_RECEIVED = -1;

        public static final int CONST_STATUS_SENDED = 32;

        public static final int CONST_STATUS_SENDING = 64;

        public static final int CONST_STATUS_SEND_FAIL = 128;

        public static final int CONST_BURN_AFTER_READ_NOT = -1;

        public static final int CONST_FAVORITE = 1;

        public static final int CONST_FAVORITE_NOT = 0;

        public static final int CONST_FILE_RECORD = 1;

        public static final int CONST_FILE_RECORD_NOT = 0;

        public static final int CONST_BLACK_MESSAGE = 1;

        public static final int CONST_BLACK_MESSAGE_NOT = 0;

        public static final int CONST_THREAD_TOP = 1;

        public static final int CONST_THREAD_TOP_NOT = 0;

        public static final int CONST_STORE_TYPE_SMS = 1;

        public static final int CONST_STORE_TYPE_MMS = 2;

        public static final int CONST_STORE_TYPE_IM = 3;

        public static final int CONST_SEND_POLICY_FORWARD_SMS = 1;

        public static final int CONST_SEND_POLICY_NOT_FORWARD_SMS = 2;

        public static final int CONST_SEND_POLICY_DEFAULT_NOT_SET = -1;

        public static final String CONST_CHAT_PC_NUMBER_PREFIX = "PC_";

        public static final int CONST_NOT_CC = 0;

        public static final int CONST_CC_RECEIVE = 1;

        public static final int CONST_CC_SEND = 2;

        public static final int CONST_NOT_SILENCE = 0;

        public static final int CONST_SILENCE = 1;
    }

    public static class GroupChatConstants {
        public static final int CONST_SUCCESS = -2;

        public static final int CONST_OFFLINE = -3;

        public static final int CONST_INVITE_TIMEOUT = -4;

        public static final int CONST_NOT_EXIST = -5;

        public static final int CONST_NOT_CHAIRMAN = -6;

        public static final int CONST_MEMBERS_REACHED_MAX_COUNT = -7;

        public static final int CONST_NOT_ACTIVE = -8;

        public static final int CONST_INTERNAL_ERROR = -998;

        public static final int CONST_OTHRE_ERROR = -999;

        /**
         * Group chat notification definition
         */
        public static final String CONST_NOTIFY_CREATE = "create";

        public static final String CONST_NOTIFY_ACCEPT = "accept";

        public static final String CONST_NOTIFY_JOIN = "join";

        public static final String CONST_NOTIFY_SET_SUBJECT = "setsubject";

        public static final String CONST_NOTIFY_SET_CHAIRMAN = "setchairman";

        public static final String CONST_NOTIFY_BOOTED = "booted";

        public static final String CONST_NOTIFY_QUIT = "quit";

        public static final String CONST_NOTIFY_DISBAND = "disband";

        public static final String CONST_NOTIFY_GONE = "gone";

        public static final String CONST_NOTIFY_SET_POLICY = "setpolicy";

        public static final String CONST_NOTIFY_FAILED = "failed";

        public static final String CONST_NOTIFY_GROUP_FULL = "groupfull";

        public static final String CONST_NOTIFY_INVITE_EXPIRED = "inviteExpired";

        /**
         * Group chat manager broadcast parameter type definition
         */
        public static final int CONST_CREATE = 1;

        public static final int CONST_JOIN = 2;

        public static final int CONST_SET_SUBJECT = 3;

        public static final int CONST_SET_REMARK = 4;

        public static final int CONST_SET_ALIAS = 5;

        public static final int CONST_SET_CHAIRMAN = 6;

        public static final int CONST_BOOTED = 7;

        public static final int CONST_QUIT = 8;

        public static final int CONST_DISBAND = 9;

        public static final int CONST_GONE = 10;

        public static final int CONST_SET_MAX_COUNT = 11;

        public static final int CONST_REACHED_MAX_COUNT = 12;

        public static final int CONST_GROUP_FULL = 13;

        public static final int CONST_INVITE_EXPIRED = 14;

        /**
         * Group chat operation definition
         */
        public static final int CONST_OPERATION_CREATE = 1;

        public static final int CONST_OPERATION_ACCEPT_TO_JOIN = 2;

        public static final int CONST_OPERATION_REFUSE_TO_JOIN = 3;

        public static final int CONST_OPERATION_INVITE = 4;

        public static final int CONST_OPERATION_SET_ALIAS = 5;

        public static final int CONST_OPERATION_QUIT = 6;

        public static final int CONST_OPERATION_SET_SUBJECT = 7;

        public static final int CONST_OPERATION_SET_CHAIRMAN = 8;

        public static final int CONST_OPERATION_KICK_OUT = 9;

        public static final int CONST_OPERATION_DISBAND = 10;

        public static final int CONST_OPERATION_SEND_TEXT = 11;

        public static final int CONST_OPERATION_SEND_INVITATION = 12;
    }

    public static class DMSConstants {
        public static final int CONST_OPEN_ACCOUNT_FAILED = -1;

        public static final int CONST_OPEN_ACCOUNT_SUCCESS = 0;

        public static final int CONST_OPEN_PS_AUTO = 0;

        public static final int CONST_OPEN_PS_PROMPT = 1;

        public static final int CONST_BUTTON_HIDDEN = 0;

        public static final int CONST_BUTTON_DISPLAY = 1;

        /** The Constant DMS_USER_STATUS_OK. */
        public static final int CONST_DMS_USER_STATUS_OK = 0;

        /** The Constant DMS_USER_STATUS_TEMP_PASSIVE_DISABLED. */
        public static final int CONST_DMS_USER_STATUS_TEMP_PASSIVE_DISABLED = 1;

        /** The Constant DMS_USER_STATUS_PERMANENT_DISABLED. */
        public static final int CONST_DMS_USER_STATUS_PERMANENT_DISABLED = 2;

        /** The Constant DMS_USER_STATUS_TEMP_ACTIVE_DISABLED. */
        public static final int CONST_DMS_USER_STATUS_TEMP_ACTIVE_DISABLED = 3;

        /** The Constant DMS_USER_STATUS_DORMANT. */
        public static final int CONST_DMS_USER_STATUS_DORMANT = 4;
    }

    public static class PluginConstants {
        // plugin
        public static final String CONST_PLUGIN_PACKAGE_NAME = "com.suntek.mway.rcs.app.plugin";

        public static final String CONST_PLUGIN_API_AIDL = ".mway.rcs.app.plugin.service.PluginApiService";

        public final static long CONST_PLUGIN_BIND_TIMEOUT = 3000;

        public final static long CONST_PLUGIN_LOGIN_SSO_TIMEOUT = 3000;

        public final static long CONST_PLUGIN_BINDING_INTERVAL = 5000;

        public final static long CONST_PLUGIN_SSO_LOGING_INTERVAL = 5000;

        public static final String CONST_PLUGIN_MODULE = "pluginModuleName";

        public static final String CONST_PLUGIN_MODULE_PROFILE = "profile";

        public static final String CONST_PLUGIN_MODULE_PUBLICACCOUNT = "publicAccount";

        public static final String CONST_PLUGIN_MODULE_CONTACT = "contact";

        public static final String CONST_PLUGIN_MODULE_CLOUDFILE = "cloudFile";

        public static final String CONST_PLUGIN_MODULE_EMOTICON = "emoticon";

        public static final String CONST_PLUGIN_MODULE_RICHSCREEN = "richScreen";

        public static final String CONST_PLUGIN_MODULE_PLUGINCENTER = "pluginCenter";

        public static final String CONST_PLUGIN_MODULE_MESSAGEBACKUP = "messagebackup";
        // plugin center
        public static final String CONST_PLUGIN_CENTER_PACKAGE_NAME = "com.cmri.rcs.plugincenter";

        public static final String CONST_PLUGIN_CENTER_MAIN_ACTIVITY = "com.cmri.rcs.plugincenter.PluginCenterMainPage";

        // profile
        public static final int CONST_PROFILE_RLT_OK = 0;

        public static final int CONST_PROFILE_RLT_FAIL = -1;

        public static final int CONST_PROFILE_RLT_CODE_412 = 412;

        public static final int CONST_PROFILE_HD_AVATAR_PIXEL = 640;

        public static final long CONST_PROFILE_RETRY_SECONDS = 4000;

        public static final String CONST_PROFILE_UPDATE_STATUS = "__PROFILE_UPDATE_STATUS__";

        public static final String CONST_PROFILE_UPDATE_TIMESTAMP = "__PROFILE_UPDATE_TIMESTAMP__";

        public static final String CONST_PROFILE_UPDATE_CONTACTS_FIXED_RATE = "__UPDATE_CONTACTS_FIXED_RATE__";

        public static final String CONST_PROFILE_ETAG_PROFILE = "__PROFILE_ETAG__";

        public static final String CONST_PROFILE_ETAG_AVATAR = "__AVATAR_ETAG__";

        public static final String CONST_PROFILE_ETAG_QRCARDIMG = "__QRCARDIMG_ETAG__";

        public static final String CONST_PROFILE_ETAG_QRCARDINFO = "__ETAG_QRCARDINFO__";

        public static final String CONST_PROFILE_OBJ_AVATAR = "__AVATAR_OBJ__";

        public static final String CONST_PROFILE_OBJ_PROFILE = "__PROFILE_OBJ__";

        public static final String CONST_PROFILE_OBJ_QRCARDIMG = "__QRCARDIMG_OBJ__";

        public static final String CONST_PROFILE_OBJ_QRCARDINFO = "__QRCARDINFO_OBJ__";

        // cloud file
        public static final String CONST_MCLOUD_EVENT_STARTED = "started";

        public static final String CONST_MCLOUD_EVENT_SUCCESS = "success";

        public static final String CONST_MCLOUD_EVENT_ERROR = "error";

        public static final String CONST_MCLOUD_EVENT_PROGRESS = "progress";

        public static final String CONST_MCLOUD_EVENT_FILE_TOO_LARGE = "fileToLarge";

        public static final String CONST_MCLOUD_EVENT_SUFFIX_NOT_ALLOWED = "suffixNotAllowed";

        public static final String CONST_MCLOUD_EVENT_OTHER = "other";

        public static final String CONST_MCLOUD_SMS_FILE_NAME = "$FILE_NAME$";

        public static final String CONST_MCLOUD_SMS_FILE_SIZE = "$FILE_SIZE$";

        public static final String CONST_MCLOUD_SMS_SHARE_URL = "$SHARE_URL$";

        // emoticon
        public static final int CONST_EMO_STATIC_FILE = 1;

        public static final int CONST_EMO_DYNAMIC_FILE = 2;

        public static final int CONST_EMO_PACKAGE_FILE = 3;

        public static final int CONST_EMO_DOWNLOAD_SUCCESS = 1;

        public static final int CONST_EMO_DOWNLOAD_FAILURE = 0;

        public static final int CONST_EMO_DOWNLOAD_LOADING = 2;
    }

    public static interface BlacklistProvider {

        public static Uri CONST_BLACKLIST_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.blacklist");

        public static Uri CONST_BLACKLIST_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.blacklist/id");

        public static final Uri CONST_BLACKLIST_FIREWALL_CONTENT_URI = Uri
                .parse("content://com.android.firewall/blacklistitems");

        public static interface Blacklist extends BaseColumns {

            /** The Constant NUMBER. */
            public static final String NUMBER = "number";

            /** The Constant NAME. */
            public static final String NAME = "name";

            /** The Constant CALL_BOLCK */
            public static final String CALL_BOLCK = "call_block";

            /** The Constant SMS_BOLCK */
            public static final String SMS_BOLCK = "sms_block";

            /** The Constant SMS_BOLCK */
            public static final String PERSON_ID = "person_id";
        }
    }

    public static interface CapabilityProvider {
        public static Uri CONST_CAPABILITY_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.capability");

        public static Uri CONST_CAPABILITY_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.capability/id");

        public static interface Capability extends BaseColumns {
            public static final String CONTACT = "contact";

            public static final String RESPONSE_CODE = "response_code";

            public static final String IMAGE_SHARING = "image_sharing";

            public static final String VIDEO_SHARING = "video_sharing";

            public static final String IM_SESSION = "im_session";

            public static final String FILE_TRANSFER = "file_transfer";

            public static final String GEOLOC_PUSH = "geoloc_push";

            public static final String IP_VOICE_CALL = "ip_voice_call";

            public static final String IP_VIDEO_CALL = "ip_video_call";

            public static final String EXTENDSIONS = "extensions";

            public static final String DATE = "date";
        }
    }

    public static interface GroupChatMemberProvider {
        public static Uri CONST_GROUP_CHAT_MEMBER_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.groupchat_member");

        public static Uri CONST_GROUP_CHAT_MEMBER_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.groupchat_member/id");

        public static interface GroupChatMember extends BaseColumns {
            public static final String GROUP_ID = "group_id";

            public static final String NUMBER = "number";

            public static final String ALIAS = "alias";

            public static final String ROLE = "role";

            public static final String ETYPE = "etype";

            public static final String ETAG = "etag";

            public static final String IMG_TYPE = "img_type";

            public static final String HEAD_IMG = "head_img";

            public static final String DATE = "date";
        }
    }

    public static interface GroupChatProvider {
        public static Uri CONST_GROUP_CHAT_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.groupchat");

        public static Uri CONST_GROUP_CHAT_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.groupchat/id");

        public static interface GroupChat extends BaseColumns {
            public static final String THREAD_ID = "thread_id";

            public static final String SUBJECT = "subject";

            public static final String CHAT_URI = "chat_uri";

            public static final String STATUS = "status";

            public static final String CHAIRMAN = "chairman";

            public static final String DIRECTION = "direction";

            public static final String MAX_COUNT = "max_count";

            public static final String REMARK = "remark";

            public static final String POLICY = "policy";

            public static final String CONVERSATION_ID = "conversation_id";

            public static final String CONTRIBUTION_ID = "contribution_id";

            public static final String OWNER = "owner";

            public static final String DATE = "date";
        }
    }

    public static interface PublicAccountHisProvider {
        public static Uri CONST_PUBLIC_ACCOUNT_HIS_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.public_account_his");

        public static Uri CONST_PUBLIC_ACCOUNT_HIS_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.public_account_his/id");

        public static interface PublicAccountHis extends BaseColumns {
            /** The Constant ACCOUNT_ID. */
            public static final String ACCOUNT_ID = "pa_uuid";

            /** The Constant ACCOUNT_NAME. */
            public static final String ACCOUNT_NAME = "name";

            /** The Constant ACCOUNT_PHOTO_URL. */
            public static final String ACCOUNT_LOGO = "logo";

            /** The Constant ACCOUNT_SIP_URI. */
            public static final String ACCOUNT_SIP_URI = "sip_uri";
        }
    }

    public static interface PublicAccountProvider {
        public static Uri CONST_PUBLIC_ACCOUNT_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.public_account");

        public static Uri CONST_PUBLIC_ACCOUNT_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.public_account/id");

        public static interface PublicAccount extends BaseColumns {
            /** The Constant ACCOUNT_ID. */
            public static final String ACCOUNT_ID = "pa_uuid";

            /** The Constant ACCOUNT_NAME. */
            public static final String ACCOUNT_NAME = "name";

            /** The Constant ACCOUNT_LOGO. */
            public static final String ACCOUNT_LOGO = "logo";

            /** The Constant ACCOUNT_RECOMMEND_LEVEL. */
            public static final String ACCOUNT_RECOMMEND_LEVEL = "recommend_level";

            /** The Constant ACCOUNT_SIP_URI. */
            public static final String ACCOUNT_SIP_URI = "sip_uri";

            /** The Constant ACCOUNT_FOLLOWRD. */
            public static final String ACCOUNT_FOLLOWRD = "followed";

            /** The Constant ACCOUNT_ACCEPT. */
            public static final String ACCOUNT_ACCEPT = "accept";

            /** The Constant ACCOUNT_FOLLOWRD_TIME. */
            public static final String ACCOUNT_FOLLOWRD_TIME = "followed_time";

            /** The Constant ACCOUNT_COMPANY. */
            public static final String ACCOUNT_COMPANY = "company";

            /** The Constant ACCOUNT_INTRO. */
            public static final String ACCOUNT_INTRO = "intro";

            /** The Constant ACCOUNT_TYPE. */
            public static final String ACCOUNT_TYPE = "type";

            /** The Constant ACCOUNT_UPDATETIME. */
            public static final String ACCOUNT_UPDATETIME = "update_time";

            /** The Constant ACCOUNT_MENUTYPE. */
            public static final String ACCOUNT_MENUTYPE = "menu_type";

            /** The Constant ACCOUNT_MENUTIMESTAMP. */
            public static final String ACCOUNT_MENUTIMESTAMP = "menu_timestamp";

            /** The Constant ACCOUNT_ACTIVESTATUS. */
            public static final String ACCOUNT_ACTIVESTATUS = "active_status";

            /** The Constant ACCOUNT_TEL. */
            public static final String ACCOUNT_TEL = "tel";

            /** The Constant ACCOUNT_EMAIL. */
            public static final String ACCOUNT_EMAIL = "email";

            /** The Constant ACCOUNT_ZIP. */
            public static final String ACCOUNT_ZIP = "zip";

            /** The Constant ACCOUNT_ADDR. */
            public static final String ACCOUNT_ADDR = "addr";

            /** The Constant ACCOUNT_FIELD. */
            public static final String ACCOUNT_FIELD = "field";

            /** The Constant ACCOUNT_QRCODE. */
            public static final String ACCOUNT_QRCODE = "qr_code";

            /** The Constant ACCOUNT_LOGO_TYPE. */
            public static final String ACCOUNT_LOGO_TYPE = "logo_type";

            /** The Constant ACCOUNT_MENU_STRING. */
            public static final String ACCOUNT_MENU_STRING = "menu_string";

            /** The Constant ACCOUNT_NUMBER. */
            public static final String ACCOUNT_NUMBER = "number";
        }
    }

    public static interface ThreadProvider {
        public static Uri CONST_THREAD_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.threads");

        public static Uri CONST_THREAD_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.threads/id");

        public static Uri CONST_THREAD_UPDATE_TOP_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.threads/update-top");

        public static Uri CONST_THREAD_DELETE_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.threads/delete");

        public static interface Thread extends BaseColumns {
            public static final String NUMBER = "rcs_number";

            public static final String MSG_ID = "rcs_msg_id";

            public static final String CONTENT = "snippet";

            public static final String TOTAL_COUNT = "message_count";

            // public static final String UNREAD_COUNT = "unread_count";

            public static final String CHAT_TYPE = "rcs_chat_type";

            public static final String MSG_TYPE = "rcs_msg_type";

            // public static final String DRAFT = "draft";

            public static final String TOP = "top";

            public static final String TOP_TIME = "top_time";

            public static final String DATE = "date";
        }
    }

    public static interface OrigMessageProvider {
        public static Uri CONST_ORIG_MESSAGE_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.orig_message");

        public static Uri CONST_ORIG_MESSAGE_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.orig_message/id");

        public static interface OrigMessage extends BaseColumns {
            public static final String MSG_ID = "msg_id";

            public static final String HEADER = "header";

            public static final String BODY = "body";
        }
    }

    public static interface MessageProvider {
        public static String CONST_MESSAGE_URI_AUTHORITIES = "com.suntek.mway.rcs.app.service.message";

        public static Uri CONST_MESSAGE_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.message");

        public static Uri CONST_MESSAGE_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.message/id");

        static interface Message extends BaseColumns {
            public static final String THREAD_ID = "thread_id";

            public static final String NUMBER = "address";

            public static final String CONTENT = "body";

            public static final String TYPE = "type";

            public static final String CHAT_TYPE = "rcs_chat_type";

            public static final String MSG_TYPE = "rcs_msg_type";

            public static final String STATUS = "rcs_status";

            public static final String BURN = "rcs_burn";

            public static final String CONVERSATION_ID = "rcs_conversation_id";

            public static final String CONTRIBUTION_ID = "rcs_contribution_id";

            public static final String MESSAGE_ID = "rcs_message_id";

            public static final String FILE_NAME = "rcs_file_name";

            public static final String THUMBNAIL = "rcs_thumb_path";

            public static final String MIME_TYPE = "rcs_mime_type";

            public static final String FILE_SIZE = "rcs_file_size";

            public static final String FILE_SELECTOR = "rcs_file_selector";

            public static final String TRANSFER_ID = "rcs_file_transfer_id";

            public static final String FILE_ICON = "rcs_file_icon";

            public static final String TRANSFERED = "rcs_file_transfered";

            // public static final String BLACK = "black";

            public static final String FILE_RECORD = "rcs_file_record";

            public static final String DATE = "date";

            public static final String FAVOURITE = "favourite";

            public static final String PHONE_ID = "phone_id";

            public static final String COPY = "rcs_copy";

            public static final String SUB_ID = "sub_id";

            public static final String DOWN_LOAD_OK = "rcs_is_download";
        }
    }

    public static interface FavoriteMessageProvider {
        public static Uri CONST_FAVOURITE_MESSAGE_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.fav_message");

        public static Uri CONST_FAVOURITE_MESSAGE_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.fav_message/id");

        static interface FavoriteMessage extends BaseColumns {

            public static final String MSG_ID = "msg_id";

            public static final String THREAD_ID = "thread_id";

            public static final String NUMBER = "number";

            public static final String CONTENT = "body";

            public static final String DIRECTION = "direction";

            public static final String CHAT_TYPE = "chat_type";

            public static final String MSG_TYPE = "msg_type";

            public static final String STATUS = "status";

            public static final String BURN = "burn";

            public static final String CONVERSATION_ID = "conversation_id";

            public static final String CONTRIBUTION_ID = "contribution_id";

            public static final String MESSAGE_ID = "message_id";

            public static final String FILE_NAME = "filename";

            public static final String THUMBNAIL = "thumbnail";

            public static final String MIME_TYPE = "mimetype";

            public static final String FILE_SIZE = "filesize";

            public static final String FILE_SELECTOR = "file_selector";

            public static final String TRANSFER_ID = "transfer_id";

            public static final String FILE_ICON = "fileicon";

            public static final String TRANSFERED = "transfered";

            public static final String BLACK = "black";

            public static final String FILE_RECORD = "file_record";

            public static final String DATE = "date";

            public static final String BLOCK_TYPE = "block_type";
        }
    }

    public static interface BlockMessageProvider {
        public static Uri CONST_BLOCK_MESSAGE_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.block_message");

        public static Uri CONST_BLOCK_MESSAGE_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.block_message/id");

        static interface BlockMessage extends FavoriteMessageProvider.FavoriteMessage {
        }
    }

    public static interface MessageDetailProvider {
        public static String CONST_MESSAGE_DETAIL_AUTHORITIES = "com.suntek.mway.rcs.app.service.message_detail";

        public static Uri CONST_MESSAGE_DETAIL_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.message_detail");

        public static Uri CONST_MESSAGE_DETAIL_ID_URI = Uri
                .parse("content://com.suntek.mway.rcs.app.service.message_detail/id");

        public static interface MessageDetail extends BaseColumns {
            public static final String MSG_ID = "msg_id";

            public static final String NUMBER = "number";

            public static final String BODY = "body";

            public static final String STATUS = "status";

            public static final String DATE = "date";
        }
    }
}
