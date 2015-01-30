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

/**
 * <p>Title: ChatThread class</p>
 * <p>
 * Description: The class <code>ChatThread</code> represents a chat thread information
 * which is indicated by the field definition in this class.
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
public class ChatThread implements Parcelable {

    /**
     * The chat thread record id.
     */
    private long threadId;

    /**
     * The contact.
     */
    private String contact;

    /**
     * The chat type.
     */
    private int chatType;

    /**
     * The message type.
     */
    private int msgType;

    /**
     * The last message.
     */
    private String lastMsg;

    /**
     * The last time of message.
     */
    private long lastTime;

    /**
     * The last message identity
     */
    private int lastMsgId;

    /**
     * The count of thread
     */
    private int count;

    /**
     * The unread count of thread
     */
    private int unreadCount;

    /**
     * The message conversation id
     */
    private String conversationId;

    /**
     * The group identity
     */
    private String groupId;

    /**
     * Get the thread id.
     * @return
     */
    public long getThreadId() {
        return threadId;
    }
    /**
     * Set the thread id.
     * @param threadId
     */
    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }
    /**
     * Get the chat type.
     * @return  The possible value can be<br/>
     */
    public int getChatType() {
        return chatType;
    }
    /**
     * Set the chat type.
     * @param chatType
     */
    public void setChatType(int chatType) {
        this.chatType = chatType;
    }
    /**
     * Get the last message content.
     * @return the last message content
     */
    public String getLastMsg() {
        return lastMsg;
    }
    /**
     * Set the last message content.
     * @param lastMsg  the last message content
     */
    public void setLastMsg(String lastMsg) {
        this.lastMsg = lastMsg;
    }
    /**
     * Get the last time of the message.
     * @return the last time of the message.
     */
    public long getLastTime() {
        return lastTime;
    }
    /**
     * Set the last time of the message.
     * @param lastTime
     */
    public void setLastTime(long lastTime) {
        this.lastTime = lastTime;
    }
    /**
     * Get the message type.
     * @return The possible value can be<br/>
     */
    public int getMsgType() {
        return msgType;
    }
    /**
     * Set the message type.
     * @param msgType  The possible value can be<br/>
     */
    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }
    /**
     * Get contact
     * @return contact
     */
    public String getContact() {
        return contact;
    }
    /**
     * Set contact
     * @param contact contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
    /**
     * Get last message identity
     * @return
     */
    public int getLastMsgId() {
        return lastMsgId;
    }
    /**
     * Set last message identity
     * @param lastMsgId
     */
    public void setLastMsgId(int lastMsgId) {
        this.lastMsgId = lastMsgId;
    }
    /**
     * Get Count of message
     * @return
     */
    public int getCount() {
        return count;
    }
    /**
     * Set Count of message
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Get count of unread message
     * @return
     */
    public int getUnreadCount() {
        return unreadCount;
    }

    /**
     * Set count of unread message
     * @param unreadCount
     */
    public void setUnreadCount(int unreadCount) {
        this.unreadCount = unreadCount;
    }

    /**
     * Get group identity
     * @return
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Set group identity
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * Get message conversation id
     * @return
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * Set message conversation id
     * @param conversationId
     */
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO Auto-generated method stub
        dest.writeLong(threadId);
        dest.writeString(contact);
        dest.writeInt(lastMsgId);
        dest.writeLong(lastTime);
        dest.writeString(lastMsg);
        dest.writeInt(count);
        dest.writeInt(unreadCount);
        dest.writeInt(chatType);
        dest.writeInt(msgType);
        dest.writeString(conversationId);
        dest.writeString(groupId);
    }

    public void readFromParcel( Parcel source ) {
        threadId = source.readLong();
        contact = source.readString();
        lastMsgId = source.readInt();
        lastTime = source.readLong();
        lastMsg = source.readString();
        count = source.readInt();
        unreadCount = source.readInt();
        chatType = source.readInt();
        msgType = source.readInt();
        conversationId = source.readString();
        groupId = source.readString();
    }

    @Override
    public String toString() {
        return "ChatThread [threadId=" + threadId + ", contact=" + contact
                + ", lastMsgId=" + lastMsgId + ", lastTime=" + lastTime + ", lastMsg="
                + lastMsg + ", count=" + count + ", unreadCount=" + unreadCount
                + ", chatType=" + chatType + ", msgType=" + msgType
                + ", conversationId=" + conversationId + ", groupId=" + groupId;
    }

}
