/*
 * Copyright (c) 2014, The Linux Foundation. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 *       copyright notice, this list of conditions and the following
 *       disclaimer in the documentation and/or other materials provided
 *       with the distribution.
 *     * Neither the name of The Linux Foundation nor the names of its
 *       contributors may be used to endorse or promote products derived
 *       from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.suntek.mway.rcs.client.aidl.provider.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * <p>Title: ChatMessage class</p>
 * <p>
 * Description: The class <code>ChatMessage</code> represents a chat message information
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
public class ChatMessage implements Parcelable, Comparable<ChatMessage> {
    /**
     * The chat message record id.
     */
    private int id = -1;

    /**
     * The chat message contact.
     */
    private String contact;

    /**
     * The chat message id.
     */
    private String messageId;

    /**
     * The chat message data.
     */
    private String data;
    /**
     * The chat message time.
     */
    private long time;

    /**
     * The filename of chat message.
     */
    private String filename;
    /**
     * The file size of file name.
     */
    private long filesize;

    /**
     * The chat message mine type.
     */
    private String mimeType;

    /**
     * The chat message type.
     */
    private int msgType;
    /**
     * Whether send or receive of chat message.
     */
    private int sendReceive;

    /**
     * The chat message is read.
     */
    private int isRead;

    /**
     * The state of chat message.
     */
    private int msgState;

    /**
     * The chat type of chat message.
     */
    private int chatType;

    /**
     * The thread id of chat message.
     */
    private long threadId;

    /**
     * conversation id of chat message.
     */
    private String conversationId;

    /**
     * contribution id of chat message.
     */
    private String contributionId;

    /** The file selector. */
    private String fileSelector;

    /** The file transfer ext. */
    private String fileTransferExt;

    /** The file transfer id. */
    private String fileTransferId;

    /** The file icon. */
    private String fileIcon;

    /**
     * Mark message that is burn after reading message.
     */
    private int msgBurnAfterReadFlag = 0;

    /**
     * Read the message after N seconds then burn it.
     */
    private int barCycle = 0;

    /** Header of message, when receive message then set the header. */
    private String header;

    /** Body of message, when receive message then set the body. */
    private String body ;

    /** public account message. */
    private PublicMessage publicMessage;

    /** cloud file message. */
    private CloudFileMessage cloudFileMessage;

    /**
     * Mark message that is blacklist message.
     */
    private int msgBlackFlag = 0;

    private int continueFlag;

    private int duration;

    private String filepath;

    private String thumbpath;

    /**
     * Instantiates a new Chat Messages.
     */
    public ChatMessage()
    {
    }

    /**
     * Instantiates a new Chat Messages.
     *
     * @param source
     *            the source
     */
    public ChatMessage( Parcel source )
    {
        readFromParcel( source );
    }
    /**
     * Get the record id.
     * @return the record id
     */
    public int getId() {
        return id;
    }
    /**
     * set the record id.
     * @param id the record id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get contact.
     *
     * @return contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * Set contact.
     *
     * @param contact contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }
    /**
     * Get message id.
     * @return message id
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Set message id.
     *
     * @param messageId the new message id
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    /**
     * Get message content.
     * @return If message type is RichMessageData.MSG_TYPE_FILE, then return file path;
     * If message type is RichMessageData.MSG_TYPE_LOCATION, then return a formatted string in the form of "longitude,latitude,information of geographical location";
     * If message type is RichMessageData.MSG_TYPE_CONTACT, the return data of Vcard.
     */
    public String getData() {
        return data;
    }

    /**
     * Set the message content.
     *
     * @param data the new data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Get message time.
     *
     * @return the time
     */
    public long getTime() {
        return time;
    }

    /**
     * Set message time.
     *
     * @param time the new time
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * Get file name.
     *
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Set file name.
     *
     * @param filename the new filename
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * Get file size.
     *
     * @return the filesize
     */
    public long getFilesize() {
        return filesize;
    }

    /**
     * Set file size.
     *
     * @param filesize the new filesize
     */
    public void setFilesize(long filesize) {
        this.filesize = filesize;
    }

    /**
     * Get mine type.
     *
     * @return the mime type
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Set mini type.
     *
     * @param mimeType the new mime type
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
    /**
     * Get the message type.
     * @return The possible value can be<br/>
     * RichMessageData.MSG_TYPE_TEXT,<br/>
     * RichMessageData.MSG_TYPE_FILE,<br/>
     * RichMessageData.MSG_TYPE_LOCATION,<br/>
     * RichMessageData.MSG_TYPE_CONTACT,<br/>
     * RichMessageData.MSG_TYPE_GROUP_INFO
     */
    public int getMsgType() {
        return msgType;
    }
    /**
     * Set the message type.
     * @param msgType  The possible value can be<br/>
     * RichMessageData.MSG_TYPE_TEXT,<br/>
     * RichMessageData.MSG_TYPE_FILE,<br/>
     * RichMessageData.MSG_TYPE_LOCATION,<br/>
     * RichMessageData.MSG_TYPE_CONTACT,<br/>
     * RichMessageData.MSG_TYPE_GROUP_INFO
     */
    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }

    /**
     * Get whether send or receive.
     *
     * @return  The possible value can be<br/>
     * RichMessageData.MSG_SEND,<br/>
     * RichMessageData.MSG_RECEIVE
     */
    public int getSendReceive() {
        return sendReceive;
    }

    /**
     * Set send or receive.
     *
     * @param sendReceive  The possible value can be<br/>
     * RichMessageData.MSG_SEND,<br/>
     * RichMessageData.MSG_RECEIVE
     */
    public void setSendReceive(int sendReceive) {
        this.sendReceive = sendReceive;
    }

    /**
     * Get whether the message id read or not.
     *
     * @return the checks if is read
     */
    public int getIsRead() {
        return isRead;
    }

    /**
     * Set whether the message id read or not.
     *
     * @param isRead the new checks if is read
     */
    public void setIsRead(int isRead) {
        this.isRead = isRead;
    }
    /**
     * Get status of message.
     * @return  The possible value can be<br/>
     * RichMessageData.MSG_STATE_SEND_OK,<br/>
     * RichMessageData.MSG_STATE_SEND_REC,<br/>
     * RichMessageData.MSG_STATE_SENDED,<br/>
     * RichMessageData.MSG_STATE_SEND_ING,<br/>
     * RichMessageData.MSG_STATE_SEND_FAIL
     */
    public int getMsgState() {
        return msgState;
    }

    /**
     * Set status of message.
     *
     * @param msgState the new msg state
     */
    public void setMsgState(int msgState) {
        this.msgState = msgState;
    }

    /**
     * Get the thread id.
     *
     * @return the thread id
     */
    public long getThreadId() {
        return threadId;
    }

    /**
     * Set the thread id.
     *
     * @param threadId the thread id
     */
    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }
    /**
     * Get the chat type.
     * @return  The possible value can be<br/>
     * SuntekMessageData.CHAT_TYPE_ONE2ONE,<br/>
     * SuntekMessageData.CHAT_TYPE_GROUPCHAT,<br/>
     * SuntekMessageData.CHAT_TYPE_MULTICHAT
     */
    public int getChatType() {
        return chatType;
    }

    /**
     * Set the chat type.
     *
     * @param chatType the new chat type
     */
    public void setChatType(int chatType) {
        this.chatType = chatType;
    }

    /**
     * Get message conversation id.
     *
     * @return chat message conversation id
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * Set message conversation id.
     *
     * @param conversationId the new conversation id
     * @return conversationId
     */
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * Get message contribution id.
     *
     * @return chat message contribution id
     */
    public String getContributionId() {
        return contributionId;
    }

    /**
     * Set message contribution id.
     *
     * @param contributionId the new contribution id
     * @return contributionId
     */
    public void setContributionId(String contributionId) {
        this.contributionId = contributionId;
    }

    /**
     * Get file selector.
     *
     * @return the file selector
     */
    public String getFileSelector() {
        return fileSelector;
    }

    /**
     * Set file selector .
     *
     * @param fileSelector the new file selector
     */
    public void setFileSelector(String fileSelector) {
        this.fileSelector = fileSelector;
    }

    /**
     * Get file transfer extend info.
     *
     * @return the file transfer ext
     */
    public String getFileTransferExt() {
        return fileTransferExt;
    }

    /**
     * Set file transfer extend info.
     *
     * @param fileTransferExt the new file transfer ext
     */
    public void setFileTransferExt(String fileTransferExt) {
        this.fileTransferExt = fileTransferExt;
    }

    /**
     * Get file transfer extend info id.
     *
     * @return the file transfer id
     */
    public String getFileTransferId() {
        return fileTransferId;
    }

    /**
     * Set file transfer extend info id.
     *
     * @param fileTransferId the new file transfer id
     */
    public void setFileTransferId(String fileTransferId) {
        this.fileTransferId = fileTransferId;
    }

    /**
     * Get transfer file icon.
     *
     * @return the file icon
     */
    public String getFileIcon() {
        return fileIcon;
    }

    /**
     * Set transfer file icon.
     *
     * @param fileIcon the new file icon
     */
    public void setFileIcon(String fileIcon) {
        this.fileIcon = fileIcon;
    }

    /**
     * Get message burn after reading flag.
     *
     * @return the msg burn after read flag
     */
    public int getMsgBurnAfterReadFlag() {
        return msgBurnAfterReadFlag;
    }

    /**
     * Set message burn after reading flag.
     *
     * @param msgBurnAfterReadFlag the new msg burn after read flag
     */
    public void setMsgBurnAfterReadFlag(int msgBurnAfterReadFlag) {
        this.msgBurnAfterReadFlag = msgBurnAfterReadFlag;
    }

    /**
     * Get barCycle of burn after reading message.
     *
     * @return the bar cycle
     */
    public int getBarCycle() {
        return barCycle;
    }

    /**
     * Set barCycle of burn after reading message.
     *
     * @param barCycle the new bar cycle
     */
    public void setBarCycle(int barCycle) {
        this.barCycle = barCycle;
    }

    /**
     * Gets the public message.
     *
     * @return the public message
     */
    public PublicMessage getPublicMessage() {
        return publicMessage;
    }

    /**
     * Sets the public message.
     *
     * @param publicMessage the new public message
     */
    public void setPublicMessage(PublicMessage publicMessage) {
        this.publicMessage = publicMessage;
    }

    /**
     * Gets the cloud file message.
     *
     * @return the cloud file message
     */
    public CloudFileMessage getCloudFileMessage() {
        return cloudFileMessage;
    }

    /**
     * Sets the cloud file message.
     *
     * @param cloudFileMessage the new cloud file message
     */
    public void setCloudFileMessage(CloudFileMessage cloudFileMessage) {
        this.cloudFileMessage = cloudFileMessage;
    }

    /**
     * Get the message body.
     *
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * Set the message body.
     *
     * @param body the new body
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Get the message header.
     *
     * @return the header
     */
    public String getHeader() {
        return header;
    }

    /**
     * Set the message header.
     *
     * @param header the new header
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * Gets the msg black flag.
     *
     * @return the msg black flag
     */
    public int getMsgBlackFlag() {
        return msgBlackFlag;
    }

    /**
     * Sets the msg black flag.
     *
     * @param msgBlackFlag the new msg black flag
     */
    public void setMsgBlackFlag(int msgBlackFlag) {
        this.msgBlackFlag = msgBlackFlag;
    }

    /**
     * Get the continue flag.
     *
     * @return the continue flag
     */
    public int getContinueFlag() {
        return continueFlag;
    }

    /**
     * Set the continue flag.
     *
     * @param continueFlag
     */
    public void setContinueFlag(int continueFlag) {
        this.continueFlag = continueFlag;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getThumbpath() {
        return thumbpath;
    }

    public void setThumbpath(String thumbpath) {
        this.thumbpath = thumbpath;
    }

    /* (non-Javadoc)
     * @see android.os.Parcelable#describeContents()
     */
    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see android.os.Parcelable#writeToParcel(android.os.Parcel, int)
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO Auto-generated method stub
        dest.writeInt( id );
        dest.writeString( contact );
        dest.writeString( messageId );
        dest.writeString( data );
        dest.writeLong( time );
        dest.writeString( filename );
        dest.writeLong( filesize );
        dest.writeString( mimeType );
        dest.writeInt( msgType );
        dest.writeInt( sendReceive );
        dest.writeInt( isRead );
        dest.writeInt( msgState );
        dest.writeInt( chatType );
        dest.writeLong( threadId );
        dest.writeString( conversationId );
        dest.writeString( contributionId );
        dest.writeString( fileSelector );

        dest.writeString( fileTransferExt );
        dest.writeString( fileTransferId );
        dest.writeString( fileIcon );
        dest.writeInt( msgBurnAfterReadFlag );
        dest.writeInt( barCycle );
        dest.writeString( header );
        dest.writeString( body );
        dest.writeValue( publicMessage );
        dest.writeInt( msgBlackFlag );
        dest.writeInt( continueFlag );
        dest.writeValue( cloudFileMessage );

        dest.writeInt(duration);
        dest.writeString(filepath);
        dest.writeString(thumbpath);

    }

    /**
     * Read from parcel.
     *
     * @param source the source
     */
    public void readFromParcel( Parcel source )
    {
        id = source.readInt();
        contact = source.readString();
        messageId = source.readString();
        data = source.readString();
        time = source.readLong();
        filename = source.readString();
        filesize = source.readLong();
        mimeType = source.readString();
        msgType = source.readInt();
        sendReceive = source.readInt();
        isRead = source.readInt();
        msgState = source.readInt();
        chatType = source.readInt();
        threadId = source.readLong();

        conversationId = source.readString();
        contributionId = source.readString();
        fileSelector = source.readString();

        fileTransferExt = source.readString();
        fileTransferId = source.readString();
        fileIcon = source.readString();

        msgBurnAfterReadFlag = source.readInt();
        barCycle = source.readInt();

        header = source.readString();
        body = source.readString();
        publicMessage = (PublicMessage) source.readValue(PublicMessage.class.getClassLoader());
        msgBlackFlag = source.readInt();
        continueFlag = source.readInt();
        cloudFileMessage = (CloudFileMessage) source.readValue(CloudFileMessage.class.getClassLoader());

        duration = source.readInt();
        filepath = source.readString();
        thumbpath = source.readString();
    }

    /** The Constant CREATOR. */
    public static final Parcelable.Creator<ChatMessage> CREATOR = new Parcelable.Creator<ChatMessage>() {
        public ChatMessage createFromParcel(Parcel in) {
            return new ChatMessage(in);
        }

        @Override
        public ChatMessage[] newArray(int size) {
            // TODO Auto-generated method stub
            return new ChatMessage[ size ];
        }

    };

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("ChatMessage [id=").append(id).append(", contact=")
            .append(contact).append(", messageId=").append(messageId)
            .append(", data=").append(data).append(", time=").append(time)
            .append(", filename=").append(filename).append(", filesize=").append(filesize)
            .append(", mimeType=").append(mimeType).append(", msgType=").append(msgType)
            .append(", sendReceive=").append(sendReceive).append(", isRead=").append(isRead)
            .append(", msgState=").append(msgState).append(", chatType=").append(chatType)
            .append(", threadId=").append(threadId)
            .append(", conversationId=").append(conversationId)
            .append(", contributionId=").append(contributionId)
            .append(", fileSelector=").append(fileSelector)
            .append(", fileTransferExt=").append(fileTransferExt)
            .append(", fileTransferId=").append(fileTransferId)
            .append(", fileIcon=").append(fileIcon)
            .append(", msgBurnAfterReadFlag=").append(msgBurnAfterReadFlag)
            .append(", barCycle=").append(barCycle
//                + ", header=" + header + ", body=" + body
                    )
            .append(", publicMessage=").append(publicMessage)
            .append("], msgBlackFlag = ").append(msgBlackFlag)
            .append(", continueFlag = ").append(continueFlag)
            .append(", duration=").append(duration)
            .append(", filepath=").append(filepath)
            .append(", thumbpath=").append(thumbpath);

        return buf.toString();
    }

    public String print() {
        return super.toString();
    }

    @Override
    public int compareTo(ChatMessage message) {
        // TODO Auto-generated method stub
        if (time - message.getTime()>0) {
            return 1;
        }else if (time - message.getTime()==0) {
            return 0;
        } else {
            return -1;
        }
//        return (int) (time - message.getTime());
    }

}
