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

import com.suntek.mway.rcs.client.aidl.plugin.callback.IMcloudOperationCtrl;
import com.suntek.mway.rcs.client.aidl.plugin.callback.IMcloudAuthListener;
import com.suntek.mway.rcs.client.aidl.plugin.callback.IMcloudSdkListener;
import com.suntek.mway.rcs.client.aidl.plugin.callback.IMcloudConfListener;
import com.suntek.mway.rcs.client.aidl.plugin.callback.IMcloudFileListener;
import com.suntek.mway.rcs.client.aidl.plugin.callback.IMcloudMsgListener;
import com.suntek.mway.rcs.client.aidl.plugin.callback.IMcloudShareListener;
import com.suntek.mway.rcs.client.aidl.plugin.callback.IMcloudTransListener;

import com.suntek.mway.rcs.client.aidl.plugin.entity.mcloudfile.MsgNode;

interface IMcloudFileApi
{
    void init( IMcloudSdkListener sdkListener );
    boolean checkParam( String key, String value );
    String getParam( String name );
    void setParam(String name, String value);
    
    IMcloudOperationCtrl checkUpdate( IMcloudAuthListener authListener, String userAccount );
    IMcloudOperationCtrl login( IMcloudAuthListener authListener, String userName, String userPass, String verifyCode, int passType, boolean isAuto, in Map extInfo );
    IMcloudOperationCtrl logout( IMcloudAuthListener authListener, boolean waitTag );
    IMcloudOperationCtrl refresh( IMcloudAuthListener authListener, boolean forceTag );
    IMcloudOperationCtrl ssoLogin( IMcloudAuthListener authListener, String account, String ssoToken, String ssoKey, String verifyCode, String clientType, String cpid, String version, String channel, in Map extInfo );
    IMcloudOperationCtrl modifyPwd( IMcloudAuthListener authListener, String msisdn, String dycPwd, String passPwd );
    IMcloudOperationCtrl prepairRegister( IMcloudAuthListener authListener, String userName, int type );
    IMcloudOperationCtrl prepairResetPwd( IMcloudAuthListener authListener, String userName, int type );
    IMcloudOperationCtrl register( IMcloudAuthListener authListener, String msisdn, String dycPwd, String userPass, String clientType );
    IMcloudOperationCtrl resetPwd( IMcloudAuthListener authListener, String userName, String userPass, int type, String verifyCode );
    
    IMcloudOperationCtrl getServerConfig( IMcloudConfListener confListener, boolean reset );

    IMcloudOperationCtrl copy( IMcloudFileListener callback, in String[] sourcePath, String destPath );
    IMcloudOperationCtrl delete( IMcloudFileListener callback, in String[] path );
    IMcloudOperationCtrl getDiskSize( IMcloudFileListener callback );
    IMcloudOperationCtrl getFileInfo( IMcloudFileListener callback, in String[] path, boolean isFromCache );
    IMcloudOperationCtrl listDir( IMcloudFileListener callback, String path, int startIndex, int endIndex, int order, in int syncType );
    IMcloudOperationCtrl mkdir( IMcloudFileListener callback, in String[] dirPath );
    IMcloudOperationCtrl move( IMcloudFileListener callback, in String[] sourcePath, String destPath );
    IMcloudOperationCtrl rename( IMcloudFileListener callback, in String[] originalPaths, in String[] newNames );
    IMcloudOperationCtrl search( IMcloudFileListener callback, String path, String query, int startIndex, int endIndex, int type, int order );
    void emptyCache( );

    IMcloudOperationCtrl backupMsg( IMcloudMsgListener listener, in MsgNode[] nodes, in String[] sessionIDs );
    IMcloudOperationCtrl deleteMsg( IMcloudMsgListener listener, in MsgNode[] nodes, in String[] msgContacts, boolean recyFlag );
    IMcloudOperationCtrl listMsg( IMcloudMsgListener listener, int beginIndex, int endIndex, int order, String msgContact );
    IMcloudOperationCtrl listMsgSession( IMcloudMsgListener listener, int beginIndex, int endIndex );
    IMcloudOperationCtrl restoreMsg( IMcloudMsgListener listener, in MsgNode[] nodes, in String[] msgContacts );
    IMcloudOperationCtrl sumMsg( IMcloudMsgListener listener, int type );
    
    IMcloudOperationCtrl addLink( IMcloudShareListener listener, in String[] paths, String desc);
    IMcloudOperationCtrl delLink( IMcloudShareListener listener, in String[] shareIDs);
    IMcloudOperationCtrl listLink( IMcloudShareListener listener, int beginIndex, int endIndex, int order);
    
    IMcloudOperationCtrl getFile( IMcloudTransListener callback, String remotePath, String localPath, int oper );
    IMcloudOperationCtrl getFileFromURL( IMcloudTransListener callback, String url, String localPath, int oper );
    IMcloudOperationCtrl getThumb( IMcloudTransListener callback, String remotePath, String localPath, int oper, int thumbType );
    IMcloudOperationCtrl putFile( IMcloudTransListener callback, String remotePath, String localPath, int oper );
}
