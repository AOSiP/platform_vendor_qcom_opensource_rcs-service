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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;

import com.suntek.mway.rcs.client.aidl.provider.model.ChatMessage;
import com.suntek.mway.rcs.client.aidl.provider.model.ChatThread;
import com.suntek.mway.rcs.client.aidl.provider.model.GroupChatModel;

/**
 * <p>Title: SuntekMessageDbSlct class</p>
 * <p>
 * Description: The class <code>SuntekMessageDbSlct</code> offers functions for query rich message database.
 * </p>
 * <p>
 * Copyright: Copyright (c) 2014
 * </p>
 * <p>
 * Company: pci-sunteck
 * </p>
 * @author YE JIE MING
 * @version 1.0
 *
 */
public class SuntekMessageDbSlct {

    /**
     * a singleton instance of SuntekMessageDbSlct
     */
    private static SuntekMessageDbSlct instance;

    /**
     * an instance of android.content.ContentResolver
     */
    private ContentResolver contentResolver;

    /**
     * Static method for instance creation with the specified subclass of android.content.Context,
     * here is the instance of RCSApplication.
     * @param context subclass of android.content.Context, here is the instance of RCSApplication.
     * @return instance of SuntekMessageDbSlct
     */
    public static SuntekMessageDbSlct createInstance(Context context) {
        if(instance == null){
            synchronized(SuntekMessageDbSlct.class){
                if(instance == null){
                    instance = new SuntekMessageDbSlct(context);
                }
            }
        }
        return instance;
    }

    /**
     * Private constructor to avoid creating instance directly
     * @param context subclass of android.content.Context, here is the instance of RCSApplication.
     */
    private SuntekMessageDbSlct(Context context) {
        contentResolver = context.getContentResolver();
    }


    /**
     * Query all phone numbers of contact by thread id.
     * @param threadId a thread id that identities a chat session.
     * @return phone numbers which are semicolon-separated.
     */
    public String getAllNumbersByThreadId(String threadId) {
        StringBuffer sb = new StringBuffer();
        Cursor cursor = contentResolver.query(SuntekMessageData.SUNTEK_MESSAGE_CONTENT_URI, new String[] {
                "distinct " + SuntekMessageData.KEY_CONTACT
        },
        SuntekMessageData.KEY_THREAD_ID + "=?", new String[] {
                threadId + ""
                }, null);
        if (cursor != null) {
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                sb.append(cursor.getString(0));
                sb.append(";");
                cursor.moveToNext();
            }
            cursor.close();
        }

        String number = sb.toString();
        if (number.endsWith(";")) {
            number = number.substring(0, number.length() - 1);
        }
        return number;
    }

    /**
     * Query chat group detail information by thread id. The chat group information is represented by class {@link  com.suntek.mway.rcs.client.api.provider.model.ChatGroupModel}
     * @param threadId thread_id a thread id that identities a chat session.
     * @return return null if can not find record
     */
    public GroupChatModel getChatGroupByThreadId(String threadId) {
        String[] projection = new String[]{SuntekMessageData.KEY_ID,
                SuntekMessageData.KEY_SUBJECT,
                SuntekMessageData.KEY_CHAT_URI,
                SuntekMessageData.KEY_CONTRIBUTION_ID,
                SuntekMessageData.KEY_CONTACT_GROUP_ID,
                SuntekMessageData.KEY_DATA_MEMBERS,
                SuntekMessageData.KEY_THREAD_ID};
        Cursor cursor = contentResolver.query(SuntekMessageData.CHAT_GROUP_CONTENT_URI, projection, SuntekMessageData.KEY_THREAD_ID+"=?",
                new String[]{threadId}, null);
        if(cursor != null) {
            while(cursor.moveToNext()) {
                GroupChatModel model = cursorToChatGroupModel(cursor);
                return model;
            }
            cursor.close();
        }
        return null;
    }

    /**
     * Query a list of chat group information which is represented by class {@link  com.suntek.mway.rcs.client.api.provider.model.ChatGroupModel}
     * @return a list of chat group
     */
    public List<GroupChatModel> getChatGroupList() {
        List<GroupChatModel> list = new ArrayList<GroupChatModel>();
        String[] projection = new String[]{SuntekMessageData.KEY_ID,
                SuntekMessageData.KEY_SUBJECT,
                SuntekMessageData.KEY_CHAT_URI,
                SuntekMessageData.KEY_CONTRIBUTION_ID,
                SuntekMessageData.KEY_CONTACT_GROUP_ID,
                SuntekMessageData.KEY_DATA_MEMBERS,
                SuntekMessageData.KEY_THREAD_ID};
        Cursor cursor = contentResolver.query(SuntekMessageData.CHAT_GROUP_CONTENT_URI, projection, null,
                null, null);
        if(cursor != null) {
            while(cursor.moveToNext()) {
                GroupChatModel model = cursorToChatGroupModel(cursor);
                list.add(model);
            }
            cursor.close();
        }
        return list;
    }

    /**
     * Transform a record pointed by an android.database.Cursor to
     * a chat group information represented by class {@link com.suntek.mway.rcs.client.api.contacts.ChatGroupModel}
     * @param cursor an android.database.Cursor
     * @return a chat group information represented by class {@link  com.suntek.mway.rcs.client.api.provider.model.ChatGroupModel}
     */
    private GroupChatModel cursorToChatGroupModel(Cursor cursor) {
        int id = cursor.getInt(cursor.getColumnIndex(SuntekMessageData.KEY_ID));
        String subject = cursor.getString(cursor.getColumnIndex(SuntekMessageData.KEY_SUBJECT));
        String chatUri = cursor.getString(cursor.getColumnIndex(SuntekMessageData.KEY_CHAT_URI));
        String contributionId = cursor.getString(cursor.getColumnIndex(SuntekMessageData.KEY_CONTRIBUTION_ID));
        String contactGroupId = cursor.getString(cursor.getColumnIndex(SuntekMessageData.KEY_CONTACT_GROUP_ID));
        String dataMembers = cursor.getString(cursor.getColumnIndex(SuntekMessageData.KEY_DATA_MEMBERS));
        long threadId = cursor.getLong(cursor.getColumnIndex(SuntekMessageData.KEY_THREAD_ID));
        GroupChatModel model = new GroupChatModel();
        model.setId(id);
        model.setSubject(subject);
        model.setChatUri(chatUri);
        model.setContributionId(contributionId);
        model.setContactGroupId(contactGroupId);
        model.setDataMembers(dataMembers);
        model.setThreadId(threadId);
        return model;

    }

    /**
     * Transform a record pointed by an android.database.Cursor to
     * a chat message information represented by class {@link com.suntek.mway.rcs.client.api.contacts.ChatMessage}
     * @param cursor an android.database.Cursor
     * @return a chat message information represented by class {@link  com.suntek.mway.rcs.client.aidl.provider.model.ChatMessage}
     */
    private ChatMessage cursorToChatMessage(Cursor cursor) {
        int id = cursor.getInt(cursor.getColumnIndex(SuntekMessageData.KEY_ID));
        String contact = cursor.getString(cursor.getColumnIndex(SuntekMessageData.KEY_CONTACT));
        String messageId = cursor.getString(cursor.getColumnIndex(SuntekMessageData.KEY_MESSAGE_ID));
        String data = cursor.getString(cursor.getColumnIndex(SuntekMessageData.KEY_DATA));
        long time = cursor.getLong(cursor.getColumnIndex(SuntekMessageData.KEY_TIME));
        String filename = cursor.getString(cursor.getColumnIndex(SuntekMessageData.KEY_FILENAME));
        long filesize = cursor.getLong(cursor.getColumnIndex(SuntekMessageData.KEY_FILESIZE));
        String mimeType = cursor.getString(cursor.getColumnIndex(SuntekMessageData.KEY_MIME_TYPE));
        int msgType = cursor.getInt(cursor.getColumnIndex(SuntekMessageData.KEY_MSG_TYPE));
        int sendReceive = cursor.getInt(cursor.getColumnIndex(SuntekMessageData.KEY_SEND_RECEIVE));
        int isRead = cursor.getInt(cursor.getColumnIndex(SuntekMessageData.KEY_IS_READ));
        int msgState = cursor.getInt(cursor.getColumnIndex(SuntekMessageData.KEY_MSG_STATE));
        int chatType = cursor.getInt(cursor.getColumnIndex(SuntekMessageData.KEY_CHAT_TYPE));
        long threadId = cursor.getLong(cursor.getColumnIndex(SuntekMessageData.KEY_THREAD_ID));
        ChatMessage model = new ChatMessage();
        model.setId(id);
        model.setContact(contact);
        model.setMessageId(messageId);
        model.setData(data);
        model.setTime(time);
        model.setFilename(filename);
        model.setFilesize(filesize);
        model.setMimeType(mimeType);
        model.setMsgType(msgType);
        model.setSendReceive(sendReceive);
        model.setIsRead(isRead);
        model.setMsgState(msgState);
        model.setChatType(chatType);
        model.setThreadId(threadId);
        return model;

    }

    /**
     * Query a list of chat message by thread id.
     * @param threadId a thread id that identities a chat session.
     * @return a list of chat message
     */
    public List<ChatMessage> getChatMessageListByThreadId(String threadId) {
        List<ChatMessage> list = new ArrayList<ChatMessage>();
        String[] projection = new String[]{SuntekMessageData.KEY_ID,
                SuntekMessageData.KEY_CONTACT,
                SuntekMessageData.KEY_MESSAGE_ID,
                SuntekMessageData.KEY_DATA,
                SuntekMessageData.KEY_TIME,
                SuntekMessageData.KEY_FILENAME,
                SuntekMessageData.KEY_FILESIZE,
                SuntekMessageData.KEY_MIME_TYPE,
                SuntekMessageData.KEY_MSG_TYPE,
                SuntekMessageData.KEY_SEND_RECEIVE,
                SuntekMessageData.KEY_IS_READ,
                SuntekMessageData.KEY_MSG_STATE,
                SuntekMessageData.KEY_CHAT_TYPE,
                SuntekMessageData.KEY_THREAD_ID
                };
        String selection = SuntekMessageData.KEY_THREAD_ID+"=?";
        String[] selectionArgs = new String[]{threadId};
        Cursor cursor = contentResolver.query(SuntekMessageData.SUNTEK_MESSAGE_CONTENT_URI, projection, selection,
                selectionArgs, null);
        if(cursor != null) {
            while(cursor.moveToNext()) {
                ChatMessage model = cursorToChatMessage(cursor);
                list.add(model);
            }
            cursor.close();
        }
        return list;
    }

}
