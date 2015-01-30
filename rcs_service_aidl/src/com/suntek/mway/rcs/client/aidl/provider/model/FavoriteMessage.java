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

public class FavoriteMessage implements Parcelable {

    private int id;

    private String contact;

    private String messageId;

    private String data;

    private long time;

    private String fileName;

    private long fileSize;

    private String mimeType;

    private int msgType;

    private int sendReceive;

    private int chatType;

    private String fileIcon;

    private long favoriteTime;

    private String mmsSub;

    private String type;

    private String mmsBody;

    private String smsPerson;

    private String smsProtocol;

    private String smsServiceCenter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    public int getSendReceive() {
        return sendReceive;
    }

    public void setSendReceive(int sendReceive) {
        this.sendReceive = sendReceive;
    }

    public int getChatType() {
        return chatType;
    }

    public void setChatType(int chatType) {
        this.chatType = chatType;
    }

    public String getFileIcon() {
        return fileIcon;
    }

    public void setFileIcon(String fileIcon) {
        this.fileIcon = fileIcon;
    }

    public long getFavoriteTime() {
        return favoriteTime;
    }

    public void setFavoriteTime(long favoriteTime) {
        this.favoriteTime = favoriteTime;
    }

    public String getMmsSub() {
        return mmsSub;
    }

    public void setMmsSub(String mmsSub) {
        this.mmsSub = mmsSub;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMmsBody() {
        return mmsBody;
    }

    public void setMmsBody(String mmsBody) {
        this.mmsBody = mmsBody;
    }

    public String getSmsPerson() {
        return smsPerson;
    }

    public void setSmsPerson(String smsPerson) {
        this.smsPerson = smsPerson;
    }

    public String getSmsProtocol() {
        return smsProtocol;
    }

    public void setSmsProtocol(String smsProtocol) {
        this.smsProtocol = smsProtocol;
    }

    public String getSmsServiceCenter() {
        return smsServiceCenter;
    }

    public void setSmsServiceCenter(String smsServiceCenter) {
        this.smsServiceCenter = smsServiceCenter;
    }

    public FavoriteMessage() {
    }

    public FavoriteMessage(Parcel source) {
        readFromParcel(source);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(contact);
        dest.writeString(messageId);
        dest.writeString(data);
        dest.writeLong(time);
        dest.writeString(fileName);
        dest.writeLong(fileSize);
        dest.writeString(mimeType);
        dest.writeInt(msgType);
        dest.writeInt(sendReceive);
        dest.writeInt(chatType);
        dest.writeString(fileIcon);
        dest.writeLong(favoriteTime);
        dest.writeString(mmsSub);
        dest.writeString(type);
        dest.writeString(mmsBody);
        dest.writeString(smsPerson);
        dest.writeString(smsProtocol);
        dest.writeString(smsServiceCenter);
    }

    public void readFromParcel(Parcel source) {
        id = source.readInt();
        contact = source.readString();
        messageId = source.readString();
        data = source.readString();
        time = source.readLong();
        fileName = source.readString();
        fileSize = source.readLong();
        mimeType = source.readString();
        msgType = source.readInt();
        sendReceive = source.readInt();
        chatType = source.readInt();
        fileIcon = source.readString();
        favoriteTime = source.readLong();
        mmsSub = source.readString();
        type = source.readString();
        mmsBody = source.readString();
        smsPerson = source.readString();
        smsProtocol = source.readString();
        smsServiceCenter = source.readString();
    }

    /** The Constant CREATOR. */
    public static final Parcelable.Creator<FavoriteMessage> CREATOR = new Parcelable.Creator<FavoriteMessage>() {
        public FavoriteMessage createFromParcel(Parcel in) {
            return new FavoriteMessage(in);
        }

        @Override
        public FavoriteMessage[] newArray(int size) {
            // TODO Auto-generated method stub
            return new FavoriteMessage[size];
        }

    };

    @Override
    public String toString() {
        return "FavoriteMessage [id=" + id + ", contact=" + contact
                + ", messageId=" + messageId + ", data=" + data + ", time="
                + time + ", fileName=" + fileName + ", fileSize=" + fileSize
                + ", mimeType=" + mimeType + ", msgType=" + msgType
                + ", sendReceive=" + sendReceive + ", chatType=" + chatType
                + ", fileIcon=" + fileIcon + ", favoriteTime=" + favoriteTime
                + ", mmsSub=" + mmsSub + ", type=" + type + ", mmsBody="
                + mmsBody + ", smsPerson=" + smsPerson + ", smsProtocol="
                + smsProtocol + ", smsServiceCenter=" + smsServiceCenter + "]";
    }

}
