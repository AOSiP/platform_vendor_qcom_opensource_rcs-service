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
package com.suntek.mway.rcs.client.api.publicaccount.callback;

import com.suntek.mway.rcs.client.aidl.plugin.entity.pubacct.MenuInfoMode;
import com.suntek.mway.rcs.client.aidl.plugin.entity.pubacct.MsgContent;
import com.suntek.mway.rcs.client.aidl.plugin.entity.pubacct.PublicAccounts;
import com.suntek.mway.rcs.client.aidl.plugin.entity.pubacct.PublicAccountsDetail;

import android.os.RemoteException;

import java.util.List;

public class PublicAccountCallbackImpl extends PublicAccountCallback {

    public PublicAccountCallbackImpl() {
        // TODO Auto-generated constructor stub
    }

//    @Override
//    public void respAddSubscribe(boolean arg0) throws RemoteException {
//        // TODO Auto-generated method stub
//
//    }

    @Override
    public void respAddSubscribeAccount(boolean arg0, PublicAccounts arg1)
            throws RemoteException {
        // TODO Auto-generated method stub

    }

//    @Override
//    public void respCancelSubscribe(boolean arg0) throws RemoteException {
//        // TODO Auto-generated method stub
//
//    }

    @Override
    public void respCancelSubscribeAccount(boolean arg0, PublicAccounts arg1)
            throws RemoteException {
        // TODO Auto-generated method stub

    }

//    @Override
//    public void respComplainPublic(boolean arg0) throws RemoteException {
//        // TODO Auto-generated method stub
//
//    }

    @Override
    public void respComplainPublicAccount(boolean arg0, PublicAccounts arg1)
            throws RemoteException {
        // TODO Auto-generated method stub

    }

    @Override
    public void respGetPreMessage(boolean arg0, List<MsgContent> arg1)
            throws RemoteException {
        // TODO Auto-generated method stub

    }

//    @Override
//    public void respGetPreMessageAccount(boolean arg0, PublicAccounts arg1)
//            throws RemoteException {
//        // TODO Auto-generated method stub
//
//    }

    @Override
    public void respGetPublicDetail(boolean arg0, PublicAccountsDetail arg1)
            throws RemoteException {
        // TODO Auto-generated method stub

    }

    @Override
    public void respGetPublicList(boolean arg0, List<PublicAccounts> arg1)
            throws RemoteException {
        // TODO Auto-generated method stub

    }

    @Override
    public void respGetPublicMenuInfo(boolean arg0, MenuInfoMode menuInfoMode)
            throws RemoteException {
        // TODO Auto-generated method stub

    }

//    @Override
//    public void respGetPublicMenuInfoAccount(boolean arg0, PublicAccounts arg1)
//            throws RemoteException {
//        // TODO Auto-generated method stub
//
//    }

//    @Override
//    public void respGetPublicMenuInfoString(boolean arg0, String arg1)
//            throws RemoteException {
//        // TODO Auto-generated method stub
//
//    }

    @Override
    public void respGetUserSubscribePublicList(boolean arg0,
            List<PublicAccounts> arg1) throws RemoteException {
        // TODO Auto-generated method stub

    }

    @Override
    public void respGetPublicRecommend(boolean arg0, List<PublicAccounts> arg1)
            throws RemoteException {
        // TODO Auto-generated method stub

    }

    @Override
    public void respSetAcceptStatus(boolean result, String uuid)
            throws RemoteException {
        // TODO Auto-generated method stub

    }

}
