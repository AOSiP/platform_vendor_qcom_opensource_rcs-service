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

import com.suntek.mway.rcs.client.aidl.plugin.entity.pubacct.PublicAccounts;
import com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData;

/**
 * <p>
 * Title:Message session object.
 * </p>
 * <p>
 * Description: the message session
 * </p>
 * <p>
 * Copyright:Copyright (c) 2014
 * </p>
 * <p>
 * Company:pci-suntek
 * </p>
 *
 * @author YFB
 * @version 1.0
 */
public class MessageSessionModel implements Parcelable, Comparable<MessageSessionModel> {

    /**
     * chat message id
     */
    private int messageId;

    /**
     * message thread id
     */
    private long threadId;

    /**
     * The chat message contact
     */
    private String contact;

    /**
     * The message content
     */
    private String data;

    /**
     * The time that received or sent message
     */
    private long time;

    /**
     * Receiving or sending messages
     * send message @see {@link SuntekMessageData#MSG_SEND} or receive message @see {@link SuntekMessageData#MSG_RECEIVE}
     */
    private int sendReceive;

    /**
     * The chat type
     * @see {@link SuntekMessageData#KEY_CHAT_TYPE}
     */
    private int chatType;

    /**
     * Number of messages in session
     */
    private int messageCount;

    /**
     * Time of the last message
     */
    private long lastTime;

    /**
     * The receivers of one to many chat message
     * null if chat type is not @see {@link SuntekMessageData#CHAT_TYPE_ONE2GROUP}
     */
    private String receiversOfOne2Many;

    /**
     * The group chat info
     * null if chat type is not @see {@link SuntekMessageData#CHAT_TYPE_GROUP}
     */
    private GroupChatModel groupChatModel;

    private PublicAccounts publicAccountModel;

    public static final String KEY_MSG_COUNT = "_msgCount";

    public static final String KEY_LAST_TIME = "_lastTime";

    private static final String KEY_COLUMN_NAME_COUNT = "count(distinct " + SuntekMessageData.KEY_THREAD_ID
            + ") AS " + KEY_MSG_COUNT;

    private static final String KEY_COLUMN_NAME_LASTTIME = "max(" + SuntekMessageData.KEY_TIME + ") AS "
            + KEY_LAST_TIME;

    public static final String[] SESSION_PROJECTION = {
        SuntekMessageData.KEY_ID, SuntekMessageData.KEY_THREAD_ID, SuntekMessageData.KEY_CONTACT,
        SuntekMessageData.KEY_DATA, SuntekMessageData.KEY_TIME, SuntekMessageData.KEY_SEND_RECEIVE,
        SuntekMessageData.KEY_CHAT_TYPE,
        KEY_COLUMN_NAME_COUNT, KEY_COLUMN_NAME_LASTTIME
    };

    public MessageSessionModel(){
    }

    public MessageSessionModel(Parcel in) {
        readFromParcel(in);
    }

    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("MessageSessionModel{")
            .append("messageId:").append(messageId)
            .append(",threadId:").append(threadId)
            .append(",contact:").append(contact)
            .append(",data:").append(data)
            .append(",time:").append(time)
            .append(",sendReceive:").append(sendReceive)
            .append(",messageCount:").append(messageCount)
            .append(",lastTime:").append(lastTime)
            .append(",chatType:").append(chatType)
            .append(",receiversOfOne2Many:").append(receiversOfOne2Many)
            .append("}");
        return buf.toString();
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getSendReceive() {
        return sendReceive;
    }

    public void setSendReceive(int sendReceive) {
        this.sendReceive = sendReceive;
    }

    public int getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(int messageCount) {
        this.messageCount = messageCount;
    }

    public long getLastTime() {
        return lastTime;
    }

    public void setLastTime(long lastTime) {
        this.lastTime = lastTime;
    }

    public int getChatType() {
        return chatType;
    }

    public void setChatType(int chatType) {
        this.chatType = chatType;
    }

    public String getReceiversOfOne2Many() {
        return receiversOfOne2Many;
    }

    public void setReceiversOfOne2Many(String receiversOfOne2Many) {
        this.receiversOfOne2Many = receiversOfOne2Many;
    }

    public GroupChatModel getGroupChatModel() {
        return groupChatModel;
    }

    public void setGroupChatModel(GroupChatModel groupChatModel) {
        this.groupChatModel = groupChatModel;
    }

    public PublicAccounts getPublicAccountModel() {
        return publicAccountModel;
    }

    public void setPublicAccountModel(PublicAccounts publicAccountModel) {
        this.publicAccountModel = publicAccountModel;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel arg0, int arg1) {
        arg0.writeInt(messageId);
        arg0.writeLong(threadId);
        arg0.writeString(contact);
        arg0.writeString(data);
        arg0.writeLong(time);
        arg0.writeInt(sendReceive);
        arg0.writeInt(messageCount);
        arg0.writeLong(lastTime);
        arg0.writeInt(chatType);
        arg0.writeString(receiversOfOne2Many);
        arg0.writeValue(groupChatModel);
        arg0.writeValue(publicAccountModel);
    }

    public void readFromParcel(Parcel source) {
        messageId = source.readInt();
        threadId = source.readLong();
        contact = source.readString();
        data = source.readString();
        time = source.readLong();
        sendReceive = source.readInt();
        messageCount = source.readInt();
        lastTime = source.readLong();
        chatType = source.readInt();
        receiversOfOne2Many = source.readString();
        groupChatModel = (GroupChatModel) source.readValue(this.getClass().getClassLoader());
        publicAccountModel = (PublicAccounts) source.readValue(this.getClass().getClassLoader());
    }

    public static final Parcelable.Creator<MessageSessionModel> CREATOR = new Parcelable.Creator<MessageSessionModel>() {
        public MessageSessionModel createFromParcel(Parcel in) {
            return new MessageSessionModel(in);
        }

        @Override
        public MessageSessionModel[] newArray(int arg0) {
            return new MessageSessionModel[arg0];
        }

    };

    @Override
    public int compareTo(MessageSessionModel msgSession) {
        // TODO Auto-generated method stub
//        return (int) (time - msgSession.getTime());
        if (time - msgSession.getTime()>0) {
            return 1;
        }else if (time - msgSession.getTime()==0) {
            return 0;
        } else {
            return -1;
        }
    }
}
