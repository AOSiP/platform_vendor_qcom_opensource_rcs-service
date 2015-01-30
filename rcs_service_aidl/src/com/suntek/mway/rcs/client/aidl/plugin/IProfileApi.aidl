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
package com.suntek.mway.rcs.client.aidl.plugin;

import com.suntek.mway.rcs.client.aidl.plugin.callback.IProfileListener;
import com.suntek.mway.rcs.client.aidl.plugin.entity.profile.Profile;
import com.suntek.mway.rcs.client.aidl.plugin.entity.profile.Avatar;

interface IProfileApi
{
    void setMyProfile(in Profile profile, IProfileListener listener);
    
    void setMyHeadPic(in Avatar avatar, IProfileListener listener);
    
    void getMyProfile(IProfileListener listener);
    
    void getMyHeadPic(IProfileListener listener);
    
    void getHeadPicByContact(long contactId, IProfileListener listener);

    void getHeadPicByNumber(String number, int pixel, IProfileListener listener);

    void refreshMyQRImg(in Profile profile, boolean includeEInfo, IProfileListener listener);
    
    void updateContactsHeadPicAtFixedRateEveryDay(String hhmm,IProfileListener listener);
    
    String getUpdateTimeOfContactsHeadPic();
    
}
