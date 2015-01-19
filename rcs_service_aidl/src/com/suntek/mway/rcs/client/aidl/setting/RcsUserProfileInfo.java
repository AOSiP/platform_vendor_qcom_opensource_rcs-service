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
package com.suntek.mway.rcs.client.aidl.setting;

import com.suntek.mway.rcs.client.aidl.constant.APIConstant;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * <p>Title: RcsUserProfileInfo class</p>
 * <p>
 * Description: The class <code>RcsUserProfileInfo</code> represents a information of
 * RCS user profile, which is indicated by the field definition in this class.
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
public class RcsUserProfileInfo implements Parcelable {

    /**
     * SIP private URI with "sip:+86" prefix.
     */
    private String sipPrivateUri;

    /**
     * only telephone number
     */
    private String userName;
    private int imStatus;
    private boolean isLocalUser;
    private int terminalType;
    private String IMSI;
    private String MCC;
    private String MNC;
    private String version;

    /**
     * Create a new instance of UserProfileInfo
     */
    public RcsUserProfileInfo() {

    }

    /**
     * Create a new instance of UserProfileInfo with another Parcelable object.
     * @param source Parcelable source
     */
    public RcsUserProfileInfo(Parcel source) {

        sipPrivateUri = source.readString();
        userName = source.readString();
        imStatus = source.readInt();

        boolean[] value = new boolean[ 1 ];
        source.readBooleanArray( value );
        isLocalUser = value[ 0 ];

        terminalType = source.readInt();
        IMSI = source.readString();
        MCC = source.readString();
        MNC = source.readString();
        version = source.readString();
    }

    /**
     * Get SIP private uri
     * @return SIP private uri
     */
    public String getSipPrivateUri() {
        return sipPrivateUri;
    }

    /**
     * Set SIP private uri
     * @param sipPrivateUri SIP private uri
     */
    public void setSipPrivateUri(String sipPrivateUri) {
        this.sipPrivateUri = sipPrivateUri;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getImStatus() {
        return imStatus;
    }

    public void setImStatus(int imStatus) {
        this.imStatus = imStatus;
    }

    public boolean isLocalUser() {
        return isLocalUser;
    }

    public void setLocalUser(boolean isLocalUser) {
        this.isLocalUser = isLocalUser;
    }

    public int getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(int terminalType) {
        this.terminalType = terminalType;
    }

    public String getIMSI() {
        return IMSI;
    }

    public void setIMSI(String iMSI) {
        IMSI = iMSI;
    }

    public String getMCC() {
        return MCC;
    }

    public void setMCC(String mCC) {
        MCC = mCC;
    }

    public String getMNC() {
        return MNC;
    }

    public void setMNC(String mNC) {
        MNC = mNC;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Describe the kinds of special objects contained in this Parcelable's
     * marshalled representation
     *
     * @return Integer
     */
    @Override
    public int describeContents() {
        return APIConstant.PARCEL_OBJECT_TYPE;
    }

    /**
     * Write parcelable object
     *
     * @param dest The Parcel in which the object should be written
     * @param flags Additional flags about how the object should be written
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(sipPrivateUri);
        dest.writeString(userName);
        dest.writeInt(imStatus);

        dest.writeBooleanArray( new boolean[] { isLocalUser } );

        dest.writeInt(terminalType);

        dest.writeString(IMSI);
        dest.writeString(MCC);
        dest.writeString(MNC);
        dest.writeString(version);
    }

    /**
     * a fast way to get a Parcelable creator.
     */
    public static final Parcelable.Creator<RcsUserProfileInfo> CREATOR = new Parcelable.Creator<RcsUserProfileInfo>() {
        public RcsUserProfileInfo createFromParcel(Parcel source) {
            return new RcsUserProfileInfo(source);
        }

        public RcsUserProfileInfo[] newArray(int size) {
            return new RcsUserProfileInfo[size];
        }
    };

    @Override
    public String toString() {
        return "RcsUserProfileInfo [sipPrivateUri=" + sipPrivateUri
                + ", userName=" + userName + ", imStatus=" + imStatus
                + ", isLocalUser=" + isLocalUser + ", terminalType="
                + terminalType + ", IMSI=" + IMSI + ", MCC=" + MCC + ", MNC="
                + MNC + ", version=" + version + "]";
    }
}
