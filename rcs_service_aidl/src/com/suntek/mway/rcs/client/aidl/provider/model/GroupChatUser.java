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

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: ChatGroupUser class</p>
 * <p>
 * Description: The class <code>ChatGroupUser</code> represents a chat group user information
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
public class GroupChatUser implements Parcelable {

    public static final int AWAIT_TO_JOIN = 0;
    public static final int AGREE_TO_JOIN = 1;
    public static final int REFUSE_TO_JOIN = 2;

    /**
     * User identity of group
     */
    private String id;

    private String uri;

    /**
     * Group identity
     */
    private String groupId;

    /**
     * Display name of user
     */
    private String displayName = "";

    /**
     * Phone number
     */
    private String number = "";

    /**
     * Disconnection method
     */
    private String disconnectionMethod = "";

    /**
     * Role of user
     */
    private String role = "";

    /**
     * State of user
     */
    private String state = "";

    /**
     * Etype of user
     */
    private String etype = "unknow";

    /**
     * The alias of member in group
     */
    private String alias;

    /**
     * Status of user
     */
    private String status;

    /**
     * Time of join the group
     */
    private long time;

    /**
     * Agree to jion a group chat
     */
    private int agreeToJoin;

    /**
     * invite user's number
     */
    private String inviteNumber;

    /**
     * The administrator of group
     */
    public static final String ROLE_ADMIN = "chairman";

    /**
     * Member of group
     */
    public static final String ROLE_MEMBER = "participant";

    /**
     * Etype of user
     */
    public static final String ETYPE_CAN_ASSIGN_AS_CHAIRMAN = "gpmanage";

    public GroupChatUser(){
    }

    public GroupChatUser(Parcel in) {
        readFromParcel(in);
    }

    /**
     * Get user uri
     * @return
     */
    public String getUri() {
        return uri;
    }

    /**
     * Set user uri
     * @param uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Get the display name
     * @return the display name
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Get the display name
     * @return the display name
     */
    public String getDisplayName(Context context) {
        // alias>contact>phone number
        if (!TextUtils.isEmpty(alias)) {
            return alias;
        }

        if (!TextUtils.isEmpty(number)) {
            String displayName = getDisplayNameOnContactsProviderByNumber(context, number); // TODO Add country code support.
            if (!TextUtils.isEmpty(displayName)) {
                return displayName;
            }

            return number;
        }

        return "";
    }

    private static String getDisplayNameOnContactsProviderByNumber(Context context, String number) {
        Cursor cursor = context.getContentResolver().query(Phone.CONTENT_URI, new String[] {
            Phone.DISPLAY_NAME
        }, Phone.NUMBER + "=?", new String[] {
            number
        }, null);

        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    String displayName = cursor.getString(0);
                    if (!TextUtils.isEmpty(displayName)) {
                        return displayName;
                    }
                }
            } finally {
                cursor.close();
            }
        }
        return null;
    }

    /**
     * Set the display name
     * @param displayName the display name
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    /**
     * Get the phone number
     * @return the phone number
     */
    public String getNumber() {
        return number;
    }
    /**
     * Set the phone number
     * @param number the phone number
     */
    public void setNumber(String number) {
        this.number = number;
    }
    /**
     * Get role(ordinary member or administrator)
     * @return
     */
    public String getRole() {
        return role;
    }

    /**
     * Whether user is group administrator
     * @return if true then user is group administrator
     */
    public boolean isAdminRole() {
        return ROLE_ADMIN.equals(role);
    }

    /**
     * Set role
     * @param role role
     */
    public void setRole(String role) {
        this.role = role;
    }
    /**
     * Get the formatted string which format is "number, displayName, status, role"
     * @return
     */
    public String toFormatString() {
        StringBuffer sb = new StringBuffer();
        sb.append(TextUtils.isEmpty(number)?" ":number).append(",");
        sb.append(TextUtils.isEmpty(displayName)?" ":displayName).append(",");
        sb.append(TextUtils.isEmpty(status)?" ":status).append(",");
        sb.append(TextUtils.isEmpty(role)? " " : role);
        return sb.toString();
    }
    /**
     * Create an instance of the ChatGroupUser from formatted string which format is "number, displayName, status, role"
     * @param data the formatted string which format is "number, displayName, status, role"
     * @return an instance of the ChatGroupUser or null if the data is format error
     */
    public static GroupChatUser fromFormatString(String data) {
        String[] strs = data.split(",");
        if(strs.length == 4) {
            GroupChatUser user = new GroupChatUser();
            user.setNumber(strs[0].trim());
            user.setDisplayName(strs[1].trim());
            user.setRole(strs[3].trim());
            return user;
        }
        return null;
    }

    /**
     * Get disconnection method
     * @return disconnection method
     */
    public String getDisconnectionMethod() {
        return disconnectionMethod;
    }

    /**
     * Set disconnection method
     * @param disconnectionMethod disconnection method
     */
    public void setDisconnectionMethod(String disconnectionMethod) {
        this.disconnectionMethod = disconnectionMethod;
    }

    /**
     * Get state
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * Set state
     * @param state state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Get status
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set status
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Get time of join the group
     * @return
     */
    public long getTime() {
        return time;
    }

    /**
     * Get user identity of group
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Set user identity of group
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get group id
     * @return
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Set group id
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * Set time of join the group
     * @param time
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * Get agree to join
     * @return
     */
    public int getAgreeToJoin() {
        return agreeToJoin;
    }

    /**
     * Set agree to join
     * @param agreeToJoin
     */
    public void setAgreeToJoin(int agreeToJoin) {
        this.agreeToJoin = agreeToJoin;
    }

    /**
     * Get invite number
     * @return
     */
    public String getInviteNumber() {
        return inviteNumber;
    }

    /**
     * Set invite number
     * @param inviteNumber
     */
    public void setInviteNumber(String inviteNumber) {
        this.inviteNumber = inviteNumber;
    }

    /**
     * Set etype
     * @return
     */
    public String getEtype() {
        return etype;
    }

    /**
     * Get etype
     * @param etype
     */
    public void setEtype(String etype) {
        this.etype = etype;
    }

    /**
     * Get alias
     * @return
     */
    public String getAlias() {
        return alias == null ? "" : alias;
    }

    /**
     * Set alias
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel arg0, int arg1) {
        arg0.writeString(id);
        arg0.writeString(uri);
        arg0.writeString(groupId);
        arg0.writeString(displayName);
        arg0.writeString(number);
        arg0.writeString(disconnectionMethod);
        arg0.writeString(role);
        arg0.writeString(state);
        arg0.writeString(etype);
        arg0.writeString(alias);
        arg0.writeString(status);
        arg0.writeLong(time);
        arg0.writeInt(agreeToJoin);
        arg0.writeString(inviteNumber);
    }

    public void readFromParcel(Parcel source) {
        id = source.readString();
        uri = source.readString();
        groupId = source.readString();
        displayName = source.readString();
        number = source.readString();
        disconnectionMethod = source.readString();
        role = source.readString();
        state = source.readString();
        etype = source.readString();
        alias = source.readString();
        status = source.readString();
        time = source.readLong();
        agreeToJoin = source.readInt();
        inviteNumber = source.readString();
    }


    @Override
    public String toString() {
        List<String> list = new ArrayList<String>();
        list.add("id=" + id);
        list.add("uri=" + uri);
        list.add("groupId=" + groupId);
        list.add("displayName=" + displayName);
        list.add("number=" + number);
        list.add("disconnectionMethod=" + disconnectionMethod);
        list.add("role=" + role);
        list.add("state=" + state);
        list.add("etype=" + etype);
        list.add("alias=" + alias);
        list.add("status=" + status);
        list.add("time=" + time);
        list.add("agreeToJoin=" + agreeToJoin);
        list.add("inviteNumber=" + inviteNumber);
        return list.toString();
    }


    public static final Parcelable.Creator<GroupChatUser> CREATOR = new Parcelable.Creator<GroupChatUser>() {
        public GroupChatUser createFromParcel(Parcel in) {
            return new GroupChatUser(in);
        }

        @Override
        public GroupChatUser[] newArray(int arg0) {
            return new GroupChatUser[arg0];
        }

    };
}
