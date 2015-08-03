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
package com.suntek.rcs.ui.common.provider;

import android.content.UriMatcher;
import android.provider.BaseColumns;
import android.provider.Telephony.CanonicalAddressesColumns;
import android.provider.Telephony.Mms;
import android.provider.Telephony.MmsSms;
import android.provider.Telephony.MmsSms.PendingMessages;
import android.provider.Telephony.Sms;
import android.provider.Telephony.Sms.Conversations;
import android.provider.Telephony.Threads;
import android.provider.Telephony.ThreadsColumns;
import android.telephony.SubscriptionManager;

import com.suntek.mway.rcs.client.aidl.common.RcsColumns;

import java.util.HashSet;
import java.util.Set;

public class RcsMessageProviderConstants {

    public static final String TABLE_GROUP_STATUS = "group_status";
    public static final boolean isRcs = true;

    // These are the columns that appear in both the MMS ("pdu") and
    // SMS ("sms") message tables.
    private static final String[] MMS_SMS_COLUMNS =
            { BaseColumns._ID, Mms.DATE, Mms.DATE_SENT, Mms.READ, Mms.THREAD_ID, Mms.LOCKED,
                     Mms.SUBSCRIPTION_ID, Mms.PHONE_ID};

    // These are the columns that appear only in the MMS message
    // table.
    private static final String[] MMS_ONLY_COLUMNS = {
        Mms.CONTENT_CLASS, Mms.CONTENT_LOCATION, Mms.CONTENT_TYPE,
        Mms.DELIVERY_REPORT, Mms.EXPIRY, Mms.MESSAGE_CLASS, Mms.MESSAGE_ID,
        Mms.MESSAGE_SIZE, Mms.MESSAGE_TYPE, Mms.MESSAGE_BOX, Mms.PRIORITY,
        Mms.READ_STATUS, Mms.RESPONSE_STATUS, Mms.RESPONSE_TEXT,
        Mms.RETRIEVE_STATUS, Mms.RETRIEVE_TEXT_CHARSET, Mms.REPORT_ALLOWED,
        Mms.READ_REPORT, Mms.STATUS, Mms.SUBJECT, Mms.SUBJECT_CHARSET,
        Mms.TRANSACTION_ID, Mms.MMS_VERSION, Mms.TEXT_ONLY };
    // These are the columns that appear only in the SMS message
    // table.
    public static final String[] RCS_SMS_ONLY_COLUMNS = {
        "address", "body", "person", "reply_path_present",
        "service_center", "status", "subject", "type", "error_code", "priority",
        RcsColumns.SmsRcsColumns.RCS_FILENAME, RcsColumns.SmsRcsColumns.RCS_THUMB_PATH,
        RcsColumns.SmsRcsColumns.RCS_MIME_TYPE, RcsColumns.SmsRcsColumns.RCS_MSG_TYPE,
        RcsColumns.SmsRcsColumns.RCS_CHAT_TYPE, RcsColumns.SmsRcsColumns.RCS_FAVOURITE,
        RcsColumns.SmsRcsColumns.RCS_MSG_STATE, RcsColumns.SmsRcsColumns.RCS_BURN,
        RcsColumns.SmsRcsColumns.RCS_IS_DOWNLOAD, RcsColumns.SmsRcsColumns.RCS_FILE_SIZE,
        RcsColumns.SmsRcsColumns.RCS_BURN_BODY, RcsColumns.SmsRcsColumns.RCS_MESSAGE_ID,
        RcsColumns.SmsRcsColumns.RCS_MEDIA_PLAYED,RcsColumns.SmsRcsColumns.RCS_EXT_CONTACT,
        RcsColumns.SmsRcsColumns.RCS_FILE_RECORD
};

    // These are all the columns that appear in the MMS and SMS
    // message tables.
    private static final String[] UNION_COLUMNS =
            new String[MMS_SMS_COLUMNS.length
                       + MMS_ONLY_COLUMNS.length
                       + RCS_SMS_ONLY_COLUMNS.length];

    private static final String[] ID_PROJECTION = { BaseColumns._ID };

    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    private static final String[] SEARCH_STRING = new String[1];

    // search on sms and thread table according  rcs_file_transfer_id and rcs_chat_type.

    public static final String[] DEVICE_API_DEFAULT_PROJECT = {
        "CHATMESSAGE_MESSAGE_ID",
        "CHATMESSAGE_CHAT_ID",
        "CHATMESSAGE_CONTACT_NUMBER",
        "CHATMESSAGE_BODY",
        "CHATMESSAGE_TIMESTAMP",
        "CHATMESSAGE_MIME_TYPE",
        "CHATMESSAGE_MESSAGE_STATUS",
        "CHATMESSAGE_DIRECTION",
        "CHATMESSAGE_TYPE",
        "CHATMESSAGE_FLAG"
    };

    public static final String DEVICE_API_TABLE = "SELECT " +
            "sms._id as CHATMESSAGE_MESSAGE_ID," +
            "sms.date as CHATMESSAGE_TIMESTAMP," +
            "sms.rcs_mime_type as CHATMESSAGE_MIME_TYPE," +
            "sms.rcs_chat_type as CHATMESSAGE_FLAG," +
            "sms.rcs_file_name as file_name," +
            "sms.rcs_file_size as file_size," +
            "sms.rcs_file_transfered as file_transferred," +
            "sms.rcs_file_icon as file_icon," +
            "sms.thread_id as CHATMESSAGE_CHAT_ID," +
            "(CASE WHEN sms.type = 1 then -5 ELSE -6 END) as CHATMESSAGE_DIRECTION," +
            "(CASE WHEN  rcs_file_transfer_id IS not NULL THEN 4 " +
            "WHEN sms.rcs_message_id is not null then 3 ELSE 1 END) as CHATMESSAGE_TYPE," +
            "(CASE sms.type = 1  WHEN sms.read = 0 THEN 1 WHEN sms.read = 1 then 2 " +
            "ELSE (CASE sms.rcs_message_id is null WHEN sms.status = 32 THEN 3 " +
            " WHEN sms.status = 0 THEN 4 WHEN sms.status = 64 THEN 5 " +
            "ELSE (CASE when sms.rcs_msg_state = 64 THEN 3 WHEN sms.rcs_msg_state = 32 THEN 4 " +
            "WHEN sms.rcs_msg_state = 128 THEN 5 ELSE 6 END)END)END)" +
            " as CHATMESSAGE_MESSAGE_STATUS," +
            "(CASE WHEN rcs_file_transfer_id IS not NULL THEN rcs_file_transfer_id " +
            "ELSE (CASE WHEN rcs_message_id is not null THEN body ELSE NULL END) END)" +
            " as CHATMESSAGE_BODY,(CASE WHEN (sms.rcs_chat_type = 0 OR sms.rcs_chat_type = 1) " +
            "THEN threads.rcs_number " +
            "ELSE (CASE WHEN sms.rcs_chat_type = 2 THEN sms.address " +
            "ELSE rcs_ext_contact END ) END) as CHATMESSAGE_CONTACT_NUMBER " +
            "from sms inner join threads on sms.thread_id = threads._id";


    private static final String RCS_SMS_PROJECTION =
            "rcs_file_path,"
            + "rcs_thumb_path,"
            + "rcs_msg_type, "
            + "rcs_burn,"
            + "rcs_is_download,"
            + "rcs_msg_state,"
            + "rcs_mime_type,"
            + "favourite,"
            + "rcs_file_size,"
            + "rcs_message_id,"
            + "rcs_chat_type,";

    private static final String RCS_OTHER_PROJECTION =
             "NULL AS rcs_file_path,"
            + "NULL AS rcs_thumb_path,"
            + "NULL AS rcs_msg_type,"
            + "NULL AS rcs_burn,"
            + "NULL AS rcs_is_download,"
            + "NULL AS rcs_msg_state, "
            + "NULL AS rcs_mime_type, "
            + "NULL AS favourite,"
            + "NULL AS rcs_file_size,"
            + "NULL AS rcs_message_id,"
            + "NULL AS rcs_chat_type,";

    private static final String SMS_PROJECTION = "'sms' AS transport_type, _id, thread_id,"
            + "address, body, phone_id,"
            + RCS_SMS_PROJECTION
            + "date, date_sent, read, type,"
            + "status, locked, NULL AS error_code,"
            + "NULL AS sub, NULL AS sub_cs, date, date_sent, read,"
            + "NULL as m_type,"
            + "NULL AS msg_box,"
            + "NULL AS d_rpt, NULL AS rr, NULL AS err_type,"
            + "locked, NULL AS st, NULL AS text_only,"
            + "phone_id, NULL AS recipient_ids";

    private static final String MMS_PROJECTION = "'mms' AS transport_type, pdu._id, thread_id,"
            + "addr.address AS address, part.text as body, phone_id,"
            + RCS_OTHER_PROJECTION
            + "pdu.date * 1000 AS date, date_sent, read, NULL AS type,"
            + "NULL AS status, locked, NULL AS error_code,"
            + "sub, sub_cs, date, date_sent, read,"
            + "m_type,"
            + "pdu.msg_box AS msg_box,"
            + "d_rpt, rr, NULL AS err_type,"
            + "locked, NULL AS st, NULL AS text_only,"
            + "phone_id, NULL AS recipient_ids";

    private static final String MMS_PROJECTION_FOR_SUBJECT_SEARCH =
            "'mms' AS transport_type, pdu._id, thread_id,"
            + "addr.address AS address, pdu.sub as body, phone_id,"
            + RCS_OTHER_PROJECTION
            + "pdu.date * 1000 AS date, date_sent, read, NULL AS type,"
            + "NULL AS status, locked, NULL AS error_code,"
            + "sub, sub_cs, date, date_sent, read,"
            + "m_type,"
            + "pdu.msg_box AS msg_box,"
            + "d_rpt, rr, NULL AS err_type,"
            + "locked, NULL AS st, NULL AS text_only,"
            + "phone_id, NULL AS recipient_ids";

    private static final String MMS_PROJECTION_FOR_NUMBER_SEARCH =
            "'mms' AS transport_type, pdu._id, thread_id,"
            + "addr.address AS address, NULL AS body, phone_id,"
            + RCS_OTHER_PROJECTION
            + "pdu.date * 1000 AS date, date_sent, read, NULL AS type,"
            + "NULL AS status, locked, NULL AS error_code,"
            + "sub, sub_cs, date, date_sent, read,"
            + "m_type,"
            + "pdu.msg_box AS msg_box,"
            + "d_rpt, rr, NULL AS err_type,"
            + "locked, NULL AS st, NULL AS text_only,"
            + "phone_id, NULL AS recipient_ids";

    public static final String SMS_UPDATE_THREAD_RCS_MESSAGE_INFO_ON_NEW =
            "BEGIN " +
            "  UPDATE threads SET " + RcsColumns.ThreadColumns.RCS_CHAT_TYPE + " = " +
            "    (CASE WHEN " + RcsColumns.ThreadColumns.RCS_CHAT_TYPE + " != -1 " +
            "    THEN " + RcsColumns.ThreadColumns.RCS_CHAT_TYPE +" WHEN " +
                 RcsColumns.ThreadColumns.RCS_CHAT_TYPE + "= -1 AND new." +
                 RcsColumns.SmsRcsColumns.RCS_CHAT_TYPE + "!= -1 THEN new." +
                 RcsColumns.SmsRcsColumns.RCS_CHAT_TYPE + " ELSE "+
                 RcsColumns.ThreadColumns.RCS_CHAT_TYPE +
                 " END)," +
                 RcsColumns.ThreadColumns.RCS_NUMBER + " = " +
            "    (CASE WHEN new."+ RcsColumns.SmsRcsColumns.RCS_CHAT_TYPE + "= 1" +
            "    or new."+ RcsColumns.SmsRcsColumns.RCS_CHAT_TYPE +" = 2" +
            "    or new." + RcsColumns.SmsRcsColumns.RCS_CHAT_TYPE +"= 4 " +
            "    THEN new.address ELSE " + RcsColumns.ThreadColumns.RCS_NUMBER +
            "    END) " +
            "    WHERE threads._id = new." + Sms.THREAD_ID +
            "    AND new." + RcsColumns.SmsRcsColumns.RCS_MSG_TYPE +" != -1; " +
            "  UPDATE threads SET " + RcsColumns.ThreadColumns.RCS_MSG_ID + " = " +
            "    new." + Sms._ID + "," +
                 RcsColumns.ThreadColumns.RCS_MSG_TYPE +
            "    = new."+ RcsColumns.SmsRcsColumns.RCS_MSG_TYPE +
            "    WHERE threads . _id = new . thread_id;" +
            " END;";

    public final static String[] RCS_ICC_COLUMNS = new String[] {
        // N.B.: These columns must appear in the same order as the
        // calls to add appear in convertIccToSms.
        "service_center_address",       // getServiceCenterAddress
        "address",                      // getDisplayOriginatingAddress
        "message_class",                // getMessageClass
        "body",                         // getDisplayMessageBody
        "date",                         // getTimestampMillis
        "status",                       // getStatusOnIcc
        "index_on_icc",                 // getIndexOnIcc
        "is_status_report",             // isStatusReportMessage
        "transport_type",               // Always "sms".
        "type",                         // Always MESSAGE_TYPE_ALL.
        "locked",                       // Always 0 (false).
        "error_code",                   // Always 0
        "_id",
        "phone_id",
        //RCS column
        RcsColumns.SmsRcsColumns.RCS_FILENAME,
        RcsColumns.SmsRcsColumns.RCS_THUMB_PATH,
        RcsColumns.SmsRcsColumns.RCS_MSG_TYPE,
        RcsColumns.SmsRcsColumns.RCS_BURN,
        RcsColumns.SmsRcsColumns.RCS_MSG_STATE,
        RcsColumns.SmsRcsColumns.RCS_IS_DOWNLOAD,
        RcsColumns.SmsRcsColumns.RCS_MIME_TYPE,
        RcsColumns.SmsRcsColumns.RCS_FAVOURITE,
        RcsColumns.SmsRcsColumns.RCS_FILE_SIZE,
        RcsColumns.SmsRcsColumns.RCS_MESSAGE_ID,
        RcsColumns.SmsRcsColumns.RCS_CHAT_TYPE
    };

    // Those Strings are copied form TelephonyProvider,
    // should update when TelephonyProvider update.
    public static final String SMS_UPDATE_THREAD_READ_BODY =
            "  UPDATE threads SET read = " +
            "    CASE (SELECT COUNT(*)" +
            "          FROM sms" +
            "          WHERE " + Sms.READ + " = 0" +
            "            AND " + Sms.THREAD_ID + " = threads._id)" +
            "      WHEN 0 THEN 1" +
            "      ELSE 0" +
            "    END" +
            "  WHERE threads._id = new." + Sms.THREAD_ID + "; ";

    public static final String UPDATE_THREAD_COUNT_ON_NEW =
            "  UPDATE threads SET message_count = " +
            "     (SELECT COUNT(sms._id) FROM sms LEFT JOIN threads " +
            "      ON threads._id = " + Sms.THREAD_ID +
            "      WHERE " + Sms.THREAD_ID + " = new.thread_id" +
            "        AND sms." + Sms.TYPE + " != 3) + " +
            "     (SELECT COUNT(pdu._id) FROM pdu LEFT JOIN threads " +
            "      ON threads._id = " + Mms.THREAD_ID +
            "      WHERE " + Mms.THREAD_ID + " = new.thread_id" +
            "        AND (m_type=132 OR m_type=130 OR m_type=128)" +
            "        AND " + Mms.MESSAGE_BOX + " != 3) " +
            "  WHERE threads._id = new.thread_id; ";

    public static final String SMS_UPDATE_THREAD_DATE_SNIPPET_COUNT_ON_UPDATE =
            "BEGIN" +
            "  UPDATE threads SET" +
            "    date = (strftime('%s','now') * 1000), " +
            "    snippet = new." + Sms.BODY + ", " +
            "    snippet_cs = 0" +
            "  WHERE threads._id = new." + Sms.THREAD_ID + "; " +
            UPDATE_THREAD_COUNT_ON_NEW +
            SMS_UPDATE_THREAD_READ_BODY +
            "END;";
}
