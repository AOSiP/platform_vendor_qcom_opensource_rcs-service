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

import java.util.ArrayList;
import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;

public class LoginUser implements Parcelable {

    private String loginAccout;
    private String password;
    private boolean isSupportVoLTE;

    public LoginUser(String account,String pwd) {
        // TODO Auto-generated constructor stub
        this.loginAccout = account;
        this.password = pwd;
    }

    public LoginUser(Parcel source) {
        // TODO Auto-generated constructor stub
        readFromParcel( source );
    }

    public String getLoginAccout() {
        return loginAccout;
    }

    public void setLoginAccout(String loginAccout) {
        this.loginAccout = loginAccout;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isSupportVoLTE() {
        return isSupportVoLTE;
    }

    public void setSupportVoLTE(boolean isSupportVoLTE) {
        this.isSupportVoLTE = isSupportVoLTE;
    }

    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO Auto-generated method stub
        dest.writeString(loginAccout);
        dest.writeString(password);
        dest.writeBooleanArray( new boolean[]{ isSupportVoLTE } );
    }

    public void readFromParcel( Parcel source )
    {
        loginAccout = source.readString();
        password = source.readString();

        boolean[] val = new boolean[ 1 ];
        source.readBooleanArray( val );
        isSupportVoLTE = val[ 0 ];
    }

    /**
     * a fast way to get a Parcelable creator.
     */
    public static final Parcelable.Creator<LoginUser> CREATOR = new Parcelable.Creator<LoginUser>() {
        public LoginUser createFromParcel(Parcel source) {
            return new LoginUser(source);
        }

        public LoginUser[] newArray(int size) {
            return new LoginUser[size];
        }
    };

    @Override
    public String toString() {
        List<String> list = new ArrayList<String>();
        list.add("loginAccount=" + this.loginAccout);
        list.add("password=" + this.password);
        list.add("isSupportVoLTE=" + this.isSupportVoLTE);
        return list.toString();
    }


}
