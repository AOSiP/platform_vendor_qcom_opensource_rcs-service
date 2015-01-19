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
import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;

public class SimpleMsg implements Parcelable {
    private String rowId;

    private String messageId;

    private int storeType;

    public SimpleMsg(){
    }

    public SimpleMsg(Parcel in) {
        readFromParcel(in);
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public int getStoreType() {
        return storeType;
    }

    public void setStoreType(int storeType) {
        this.storeType = storeType;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(rowId);
        dest.writeString(messageId);
        dest.writeInt(storeType);
    }

    public void readFromParcel(Parcel source) {
        rowId = source.readString();
        messageId = source.readString();
        storeType = source.readInt();
    }

    public static final Parcelable.Creator<SimpleMsg> CREATOR = new Parcelable.Creator<SimpleMsg>() {
        public SimpleMsg createFromParcel(Parcel in) {
            return new SimpleMsg(in);
        }

        @Override
        public SimpleMsg[] newArray(int size) {
            return new SimpleMsg[size];
        }
    };

    @Override
    public String toString() {
        List<String> list = new ArrayList<String>();
        list.add("rowId=" + rowId);
        list.add("messageId=" + messageId);
        list.add("storeType=" + storeType);
        return list.toString();
    }

}
