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

import android.os.Parcel;
import android.os.Parcelable;

public class SystemInfo implements Parcelable {

    private int networkType;
    private int networkFastType;
    private String ssid;
    private String apn;
    private boolean isSimCardExist;
    private String ipAddress;

    public SystemInfo() {
        // TODO Auto-generated constructor stub
    }
    public SystemInfo(Parcel source) {
        // TODO Auto-generated constructor stub
        networkType = source.readInt();
        networkFastType = source.readInt();
        ssid = source.readString();
        apn = source.readString();

        boolean[] value = new boolean[ 1 ];
        source.readBooleanArray( value );
        isSimCardExist = value[ 0 ];

        ipAddress = source.readString();
    }

    public int getNetworkType() {
        return networkType;
    }
    public void setNetworkType(int networkType) {
        this.networkType = networkType;
    }
    public int getNetworkFastType() {
        return networkFastType;
    }
    public void setNetworkFastType(int networkFastType) {
        this.networkFastType = networkFastType;
    }
    public String getSsid() {
        return ssid;
    }
    public void setSsid(String ssid) {
        this.ssid = ssid;
    }
    public String getApn() {
        return apn;
    }
    public void setApn(String apn) {
        this.apn = apn;
    }
    public boolean isSimCardExist() {
        return isSimCardExist;
    }
    public void setSimCardExist(boolean isSimCardExist) {
        this.isSimCardExist = isSimCardExist;
    }
    public String getIpAddress() {
        return ipAddress;
    }
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    /**
     * a fast way to get a Parcelable creator.
     */
    public static final Parcelable.Creator<SystemInfo> CREATOR = new Parcelable.Creator<SystemInfo>() {
        public SystemInfo createFromParcel(Parcel source) {
            return new SystemInfo(source);
        }

        public SystemInfo[] newArray(int size) {
            return new SystemInfo[size];
        }
    };

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO Auto-generated method stub
        dest.writeInt(networkType);
        dest.writeInt(networkFastType);
        dest.writeString(ssid);
        dest.writeString(apn);
        dest.writeBooleanArray( new boolean[] { isSimCardExist } );
        dest.writeString(ipAddress);
    }

    @Override
    public String toString() {
        return "SystemInfo [networkType=" + networkType + ", networkFastType="
                + networkFastType + ", ssid=" + ssid + ", apn=" + apn
                + ", isSimCardExist=" + isSimCardExist + ", ipAddress="
                + ipAddress + "]";
    }

}
