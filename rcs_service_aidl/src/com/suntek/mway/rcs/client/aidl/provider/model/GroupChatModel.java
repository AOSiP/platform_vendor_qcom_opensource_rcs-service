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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/**
 * <p>Title: ChatGroupModel class</p>
 * <p>
 * Description: The class <code>ChatGroupModel</code> represents a chat group information
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
public class GroupChatModel implements Parcelable {

    /**
     * waiting others to join the group
     */
    public static final int GROUP_STATUS_AWAIT = 0;

    /**
     * group has created
     */
    public static final int GROUP_STATUS_COMPETE = 1;

    /**
     * group has deleted
     */
    public static final int GROUP_STATUS_DELETED = -1;

    /**
     * Receive message and reminding
     */
    public static final int POLICY_RCV_REMIND = 0;

    /**
     * Receive message but don't remind
     */
    public static final int POLICY_RCV = 1;

    /**
     * Don't Receive message
     */
    public static final int POLICY_NOT_RCV = 2;

    /**
     * The chat group record id.
     */
    private int id = -1;

    /**
     * The group chat uri.
     */
    private String chatUri;

    /**
     * The group chat subject.
     */
    private String subject;

    /**
     * Time of creating chat group
     */
    private long time;

    /**
     * The group status
     */
    private int status;

    /**
     * The group chat thread id.
     */
    private long threadId;

    /**
     * The group chat data members which are semicolon-separated.
     */
    private String dataMembers;

    /**
     * The group chat contribution id.
     */
    private String contributionId;

    /**
     * The group chat contact group id.
     */
    private String contactGroupId;

    /**
     * The list of chat group user represented by class {@link com.suntek.mway.rcs.client.api.provider.model.ChatGroupUser}
     */
    private List<GroupChatUser> userList = new ArrayList<GroupChatUser>();

    /**
     * The max count of members
     */
    private int maxCount;

    /**
     * The conversationId
     */
    private String conversationId;

    /**
     * The remark of group
     */
    private String remark;

    /**
     * The message reminding policy of group
     */
    private int remindPolicy;

    public GroupChatModel(){
    }

    public GroupChatModel(Parcel in) {
        readFromParcel(in);
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
     * Get the chat group uri.
     * @return the chat group uri
     */
    public String getChatUri() {
        return chatUri;
    }
    /**
     * Set the chat group uri
     * @param chatUri the chat group uri
     */
    public void setChatUri(String chatUri) {
        this.chatUri = chatUri;
    }
    /**
     * Get the chat group name for display. Return 'subject' if the 'remark' is empry.
     */
    public String getDisplayName() {
        if (!TextUtils.isEmpty(remark)) {
            return remark;
        } else {
            return subject;
        }
    }
    /**
     * Get the chat group subject.
     * @return the chat group subject
     */
    public String getSubject() {
        return subject;
    }
    /**
     * Set the chat group subject.
     * @param subject the chat group subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    /**
     * Get the chat group thread id.
     * @return the chat group thread id
     */
    public long getThreadId() {
        return threadId;
    }
    /**
     * Set the chat group thread id.
     * @param threadId the chat group thread id
     */
    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }
    /**
     * Get the chat group contribution id.
     * @return the chat group contribution id
     */
    public String getContributionId() {
        return contributionId;
    }
    /**
     * Set the chat group contribution id.
     * @param contributionId the chat group contribution id
     */
    public void setContributionId(String contributionId) {
        this.contributionId = contributionId;
    }
    /**
     * Get the contact group id.
     * @return If the group chat is created by contact group, the id here is the contact group id.
     */
    public String getContactGroupId() {
        return contactGroupId;
    }
    /**
     * Set the contact group id.
     * @param contactGroupId  the contact group id.
     */
    public void setContactGroupId(String contactGroupId) {
        this.contactGroupId = contactGroupId;
    }
    /**
     * Get a formatted string of Group chat contacts which are semicolon-separated.
     * The every separated part is separated by commas, and each part separated by commas is
     * phone number, display name, status and role of contact. The four parts is represented by class
     * {@link com.suntek.mway.rcs.client.api.provider.model.ChatGroupUser}
     * @return a formatted string of Group chat contacts which are semicolon-separated.
     */
    public String getDataMembers() {
        return dataMembers;
    }
    /**
     * Set a formatted string of Group chat contacts which are semicolon-separated.
     * @param dataMembers a formatted string of Group chat contacts which are semicolon-separated.
     * The every separated part is separated by commas, and each part separated by commas is
     * phone number, display name, status and role of contact. The four parts is represented by class
     * {@link com.suntek.mway.rcs.client.api.provider.model.ChatGroupUser}
     */
    public void setDataMembers(String dataMembers) {
        this.dataMembers = dataMembers;
        userList.clear();
        if(this.dataMembers != null) {
            String[] dataList = dataMembers.split(";");
            for(int i = 0; i < dataList.length; i++) {
                GroupChatUser groupUser = GroupChatUser.fromFormatString(dataMembers);
                if(groupUser != null) {
                    userList.add(groupUser);
                }
            }
        }
    }
    /**
     * Set phone numbers of chat group contacts.
     * @param members phone numbers
     */
    public void setDataMemberList(List<String> members) {
        List<GroupChatUser> users = new ArrayList<GroupChatUser>();
        for(int i = 0; i < members.size(); i++) {
            GroupChatUser user = new GroupChatUser();
            user.setNumber(members.get(i));
            users.add(user);
        }
        String str = formatToSaveNumberData(users);
        setDataMembers(str);
    }

    /**
     * Format a list chat group contact phone number to a string which are semicolon-separated.
     * @param users
     * @return
     */
    private String formatToSaveNumberData(List<GroupChatUser> users) {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < users.size(); i++) {
            GroupChatUser user = users.get(i);
            sb.append(user.toFormatString());
            if(i != users.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /**
     * Get a list of chat group user.
     * @return
     */
    public List<GroupChatUser> getUserList() {
        return userList;
    }

    /**
     * Get time of creating group
     * @return
     */
    public long getTime() {
        return time;
    }

    /**
     * Set time of creating group
     * @param time
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * Set group member
     * @param userList
     */
    public void setUserList(List<GroupChatUser> userList) {
        this.userList = userList;
    }

    /**
     * Get group status
     * @return
     */
    public int getStatus() {
        return status;
    }

    /**
     * Set group status
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * Get max count of members
     * @return
     */
    public int getMaxCount() {
        return maxCount;
    }

    /**
     * Set max count of members
     * @param maxCount
     */
    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    /**
     * Get conversationId
     * @return
     */
    public String getConversationId() {
        return conversationId;
    }

    /**
     * Set conversationId
     * @param conversationId
     */
    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * Get remark
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Set remark
     * @param remark the remark of group
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Get message reminding policy
     * @return remindPolicy
     */
    public int getRemindPolicy() {
        return remindPolicy;
    }

    /**
     * Set message reminding policy
     * @param remindPolicy
     */
    public void setRemindPolicy(int remindPolicy) {
        this.remindPolicy = remindPolicy;
    }

    /**
     * Find GroupChatUser from this group. May return null if not found.
     */
    public GroupChatUser getUserByNumber(String number) {
        if (TextUtils.isEmpty(number)) {
            return null;
        }

        for (GroupChatUser user : userList) {
            if (number.equals(user.getNumber())) {
                return user;
            }
        }

        return null;
    }

    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel arg0, int arg1) {
        arg0.writeInt(id);
        arg0.writeString(chatUri);
        arg0.writeString(subject);
        arg0.writeLong(time);
        arg0.writeInt(status);
        arg0.writeLong(threadId);
        arg0.writeString(dataMembers);
        arg0.writeString(contributionId);
        arg0.writeString(contactGroupId);
        arg0.writeList(userList);
        arg0.writeInt(maxCount);
        arg0.writeString(conversationId);
        arg0.writeString(remark);
        arg0.writeInt(remindPolicy);
    }

    @Override
    public String toString() {
        return "GroupChatModel [id=" + id + ", chatUri=" + chatUri
                + ", subject=" + subject + ", time=" + time + ", status="
                + status + ", threadId=" + threadId + ", dataMembers="
                + dataMembers + ", contributionId=" + contributionId
                + ", contactGroupId=" + contactGroupId + ", userList="
                + userList + ", maxCount=" + maxCount + ", conversationId="
                + conversationId + ", remark=" + remark + ", remindPolicy="
                + remindPolicy + "]";
    }

    public void readFromParcel(Parcel source) {
        id = source.readInt();
        chatUri = source.readString();
        subject = source.readString();
        time = source.readLong();
        status = source.readInt();
        threadId = source.readLong();
        dataMembers = source.readString();
        contributionId = source.readString();
        contactGroupId = source.readString();
        userList = new LinkedList<GroupChatUser>();
        source.readList(userList, this.getClass().getClassLoader());
        maxCount = source.readInt();
        conversationId = source.readString();
        remark = source.readString();
        remindPolicy = source.readInt();
    }

    public static final Parcelable.Creator<GroupChatModel> CREATOR = new Parcelable.Creator<GroupChatModel>() {
        public GroupChatModel createFromParcel(Parcel in) {
            return new GroupChatModel(in);
        }

        @Override
        public GroupChatModel[] newArray(int arg0) {
            return new GroupChatModel[arg0];
        }

    };

}
