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
package com.suntek.mway.rcs.client.aidl.mcloud;

import com.suntek.mway.rcs.client.aidl.plugin.callback.IMcloudOperationCtrl;

interface IMcloudFileApi {
    IMcloudOperationCtrl putFile(String localPath, String remotePath, int transOper);
    void shareFile(String fullPathInID, String shareDesc);
    void shareFileAndSend(String fullPathInID, String shareDesc, String contact, long threadId, String smsContentTemp);
    void getShareFileList(int beginIndex, int endIndex);
    IMcloudOperationCtrl downloadFileFromUrl(String remoteUrl, String fileName, int transOper, int chatMessageId);

    void shareFileAndSendGroup(String fullPathInID, String shareDesc, long threadId, String conversationId, String groupId);
    void shareFileAndSendOne2Many(String fullPathInID, String shareDesc, in List<String> contacts, long threadId, String smsContentTemp);

    void getRemoteFileList(String remotePath, int beginIndex, int endIndex, int fileNodeOrder);
	String getLocalRootPath();
}

