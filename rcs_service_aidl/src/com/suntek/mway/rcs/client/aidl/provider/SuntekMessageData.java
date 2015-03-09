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
 * <p>Title: SuntekMessageData class</p>
 * <p>
 * Description: The class <code>SuntekMessageData</code> represents a rich message data database
 * definition used by RCS.
 * The constants definition include the access database URI, some column names, chat types,
 * message status and so on.
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
public class SuntekMessageData {

    /**
     * Database URI prefix.
     */
    public static final String MESSAGE_AUTHORITY = "com.suntek.mway.rcs.message";

    /** Table name of thread */
    public static final String TABLE_MESSAGE_THREAD = "stkThread";

    /** Table name of message */
    public static final String TABLE_RICH_MESSAGE = "stkMessage";

    /** Table name of message backup */
    public static final String TABLE_RICH_MESSAGE_BACKUP = "stkMessageBak";

    /** Table name of group */
    public static final String TABLE_CHAT_GROUP= "chatGroup";
    
    public static final String TABLE_DIVICE_API_CHAT_GROUP = "group_chat_device_api";
    public static final String TABLE_DIVICE_API_CHAT_GROUP_USER = "group_chat_user_device_api";
    public static final String TABLE_DIVICE_API_MESSAGE = "message_device_api";
    public static final String TABLE_DIVICE_API_FAVOR_MESSAGE = "favor_message_device_api";

    /** The Constant SUNTEK_MESSAGE_CONTENT_URI. */
    public static final Uri SUNTEK_MESSAGE_CONTENT_URI = Uri.parse("content://" + MESSAGE_AUTHORITY + "/" + TABLE_RICH_MESSAGE);

    /** The Constant CHAT_GROUP_CONTENT_URI. */
    public static final Uri CHAT_GROUP_CONTENT_URI = Uri.parse("content://" + MESSAGE_AUTHORITY + "/" + TABLE_CHAT_GROUP);
    
    /** The Constant CHAT_THREAD_CONTENT_URI. */
    public static final Uri CHAT_THREAD_CONTENT_URI = Uri.parse("content://" + MESSAGE_AUTHORITY + "/" + TABLE_MESSAGE_THREAD);
    
    /** The Constant GROUP_CHAT_DIVICE_API_CONTENT_URI. */
    public static final Uri GROUP_CHAT_DIVICE_API_CONTENT_URI = Uri.parse("content://" + MESSAGE_AUTHORITY + "/" + TABLE_DIVICE_API_CHAT_GROUP);
    
    /** The Constant GROUP_CHAT_USER_DIVICE_API_CONTENT_URI. */
    public static final Uri GROUP_CHAT_USER_DIVICE_API_CONTENT_URI = Uri.parse("content://" + MESSAGE_AUTHORITY + "/" + TABLE_DIVICE_API_CHAT_GROUP_USER);
    
    /** The Constant MESSAGE_DIVICE_API_CONTENT_URI. */
    public static final Uri MESSAGE_DIVICE_API_CONTENT_URI = Uri.parse("content://" + MESSAGE_AUTHORITY + "/" + TABLE_DIVICE_API_MESSAGE);
    
    /** The Constant FAVOR_MESSAGE_DIVICE_API_CONTENT_URI. */
    public static final Uri FAVOR_MESSAGE_DIVICE_API_CONTENT_URI = Uri.parse("content://" + MESSAGE_AUTHORITY + "/" + TABLE_DIVICE_API_FAVOR_MESSAGE);

    /**
     * Chat type about one to one.
     */
    public static final int CHAT_TYPE_ONE2ONE = 1;

    /**
     *  Chat type about group chat.
     */
    public static final int CHAT_TYPE_ONE2GROUP = 2;

    /**
     *  Chat type about group chat.
     */
    public static final int CHAT_TYPE_GROUP = 3;


    /**
     * Chat type about group-sent message.
     */
    public static final int CHAT_TYPE_PUBLIC = 4;

    /**
     * Message type about text message.
     */
    public static final int MSG_TYPE_TEXT = 0;
    /**
     * Message type about image message.
     */
    public static final int MSG_TYPE_IMAGE = 1;
    /**
     * Message type about audio message.
     */
    public static final int MSG_TYPE_AUDIO = 2;
    /**
     * Message type about video message.
     */
    public static final int MSG_TYPE_VIDEO = 3;
    /**
     * Message type about map message.
     */
    public static final int MSG_TYPE_MAP = 4;
    /**
     * Message type about contact message.
     */
    public static final int MSG_TYPE_CONTACT = 5;
    /**
     * Message type about gif message.
     */
    public static final int MSG_TYPE_GIF = 6;
    /**
     * Message type about group message.
     */
    public static final int MSG_TYPE_GROUP_INFO = 7;
    /**
     * Message type about public account message.
     */
    public static final int MSG_TYPE_PUBLIC_TOPIC = 8;

    /** Message type about notification. */
    public static final int MSG_TYPE_NOTIFICATION = 9;

    /** Message type about MMS. */
    public static final int MSG_TYPE_MMS = 10;

    /** Message type about paid emo. */
    public static final int MSG_TYPE_PAID_EMO = 11;

    /** Message type about cloud file. */
    public static final int MSG_TYPE_CLOUD_FILE = 12;

    /** Message type for MMS. */
    public static final int MSG_TYPE_MMS_SEND_REQ = 128;

    /** Message type for MMS. */
    public static final int MSG_TYPE_MMS_NOTIFICATION_IND = 130;

    /** Message type for MMS. */
    public static final int MSG_TYPE_MMS_RETRIEVE_CONF = 132;

    /** Message type about SMS. */
    public static final int MSG_TYPE_SMS = 12;

    /**
     * Message sent status that the opposite has received.
     */
    public static final int MSG_STATE_SEND_REC = -1;

    /**
     * Message status about message is sent out but not received by the other side.
     */
    public static final int MSG_STATE_SENDED = 32;

    /**
     * Message status about message is in the queue waiting for sending.
     */
    public static final int MSG_STATE_SEND_ING = 64;

    /**
     * Message status about message is sent failure.
     */
    public static final int MSG_STATE_SEND_FAIL = 128;

    /**
     * Message status about video download failure.
     */
    public static final int MSG_STATE_DOWNLOAD_FAIL = 5;

    /**
     * Message status about read status.
     */
    public static final int MSG_READ = 1;

    /**
     * Message status about unread status.
     */
    public static final int MSG_UNREAD = 0;

    /**
     * Message status about send.
     * Ue send message to another
     */
    public static final int MSG_SEND = 2;

    /**
     * Message status about receive.
     * Ue received message from another
     */
    public static final int MSG_RECEIVE = 1;

    /** The message which not burn message. */
    public static final int MSG_BURN_AFTER_READ_NOT = 0;

    /** The message which is burn message. */
    public static final int MSG_BURN_AFTER_READ_FLAG = 1;

    /** The Constant MSG_BAR_CYCLE_NONE. */
    public static final int MSG_BAR_CYCLE_NONE = 0;

    /** The message is unread. */
    public static final int MSG_BURN_UNREAD = MSG_UNREAD;

    /** The message has been readed. */
    public static final int MSG_BURN_READED = MSG_READ;

    /** The message has been burned. */
    public static final int MSG_BURN_HAS_BEEN_BURNED = 2;

    /** The message which not blacklist message */
    public static final int MSG_BLACK_NOT = 0;

    /** The message which is blacklist message */
    public static final int MSG_BLACK_FLAG = 1;

    /** no need to continue */
    public static final int CONTINUE_NONE = 0;

    /** need continue upload */
    public static final int CONTINUE_UPLOAD = 1;

    /** need continue download */
    public static final int CONTINUE_DOWNLOAD = 2;

    /**
     * Column name about key id of message.
     */
    public static final String KEY_ID = "_id";

    /**
     * Column name about contact of message.
     */
    public static final String KEY_CONTACT = "_contact";
    /**
     * Column name about message id of message.
     */
    public static final String KEY_MESSAGE_ID = "_message_id";

    /**
     * Column name about data of message.
     */
    public static final String KEY_DATA = "_data";
    /**
     * Column name about time of message.
     */
    public static final String KEY_TIME = "_time";
    /**
     * Column name about file name of message.
     */
    public static final String KEY_FILENAME = "_filename";
    /**
     * Column name about file size of message.
     */
    public static final String KEY_FILESIZE = "_filesize";
    /**
     * Column name about mine type of message.
     */
    public static final String KEY_MIME_TYPE = "_mime_type";
    /**
     * Column name about type of message.
     */
    public static final String KEY_MSG_TYPE = "_msg_type";
    /**
     * Column name about send and receive of message.
     */
    public static final String KEY_SEND_RECEIVE = "_send_receive";

    /**
     * Column name about whether message is read or not.
     */
    public static final String KEY_IS_READ = "_is_read";

    /**
     * Column name about status of message.
     */
    public static final String KEY_MSG_STATE = "_msg_state";
    /**
     * Column name about thread id of message.
     */
    public static final String KEY_THREAD_ID = "_thread_id";
    /**
     * Column name about chat type of message.
     */
    public static final String KEY_CHAT_TYPE = "_chat_type";

    /**
    * Column name about contribution id of chat message.
    */
    public static final String KEY_CONTRIBUTION_ID = "_contribution_id";

    /**
     * column name about conversation id of chat message.
     */
    public static final String KEY_CONVERSATION_ID = "_conversation_id";

    /** file selector. */
    public static final String KEY_FILE_SELECTOR = "_file_selector";

    /** File transfer id. */
    public static final String KEY_FILE_TRANSFER_ID = "_file_transfer_id";

    /** File transfer name. */
    public static final String KEY_FILE_TRANSFER_EXT = "_file_transfer_ext";

    /** File icon. */
    public static final String KEY_FILE_ICON = "_file_icon";

    /** Flag of message which is burn after reading. */
    public static final String KEY_MSG_BURN_AFTER_READ_FLAG = "_burn_flag";

    /** The barCycle of message which is burn after reading. */
    public static final String KEY_MSG_BURN_BAR_CYCLE = "_barcycle";

    /** The Constant kEY_MSG_HEADER. */
    public static final String kEY_MSG_HEADER = "_header";

    /** The Constant KEY_MSG_BODY. */
    public static final String KEY_MSG_BODY = "_body";

    /**
     * Column name about subject of group chat.
     */
    public static final String KEY_SUBJECT = "_subject";

    /**
     * Column name about chat uri of group chat.
     */
    public static final String KEY_CHAT_URI = "_chat_uri";

    /**
     * Column name about status of group chat.
     */
    public static final String KEY_GROUP_STATUS = "_status";

    /**
     * Column name about data members of group chat.
     */
    public static final String KEY_DATA_MEMBERS = "_data_members";

    /**
     * column name about group last chat time.
     */
    public static final String KEY_LAST_CHAT_TIME = "_last_chat_time";

    /**
     * Column name about contact group id of group chat.
     */
    public static final String KEY_CONTACT_GROUP_ID = "_contact_group_id";

    /**
     * Column name about max count of members.
     */
    public static final String KEY_MAX_COUNT = "_maxcount";

    /**
     * Column name about remark of group.
     */
    public static final String KEY_REMARK = "_remark";

    /**
     * Column name about remind policy of group.
     */
    public static final String KEY_REMIND_POLICY = "_policy";

    /** Flag of message which is blacklist message. */
    public static final String KEY_MSG_BLACK_FLAG = "_black_flag";

    /** Last message identity. */
    public static final String KEY_LAST_MSG_ID = "_lstMsgId";

    /** Last message data. */
    public static final String KEY_LAST_MSG = "_lstData";

    /** Last message time. */
    public static final String KEY_LAST_TIME = "_lstTime";

    /** Count of message. */
    public static final String KEY_THREAD_COUNT = "_count";

    /** Count of unread message. */
    public static final String KEY_THREAD_UNREAD_COUNT = "_unReadCount";

    /**
     * Column name about SMS of store type.
     */
    public static final int STORE_TYPE_SMS = 1;

    /**
     * Column name about MMS of store type.
     */
    public static final int STORE_TYPE_MMS = 2;

    /**
     * Column name about new message of store type.
     */
    public static final int STORE_TYPE_NEW_MSG = 3;
}
