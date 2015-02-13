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
package com.suntek.mway.rcs.client.aidl.im;

import com.suntek.mway.rcs.client.aidl.contacts.RCSContact;

interface IPaMessageApi{
    
    void sendTextMessage(long thread_id, long sms_id, String uuid, String text);
    
    void sendImageFile(long thread_id, long sms_id, String uuid , String filepath, int quality);
    
    void sendAudioFile(long thread_id, long sms_id, String uuid, String filepath, int recordTime);
    
    void sendVideoFile(long thread_id, long sms_id, String uuid, String filepath, int length);
    
    void sendLocation(long thread_id, long sms_id, String uuid, double lat, double lng, String text);
    
    void sendVCard(long thread_id, long sms_id, String uuid, in RCSContact rcsContact);
    
    void sendVCardByPath(long thread_id, long sms_id, String uuid, in String vcardFilePath);
    
    void sendVCardList(long thread_id, long sms_id, String uuid, in List<RCSContact> contactList);
    
    void sendMenuMessage(String uuid, String text);
    
    void deleteMessage(String messageId);
    
    void deleteMessageByThreadId(long thread_id);
    
    void deleteMessageByUuid(String uuid);

    long getImageFtMaxSize();

    long getAudioMaxTime();

    long getVideoMaxTime();

    long getVideoFtMaxSize();
    
    
    long sendTextMessageSync(long thread_id, long sms_id, String uuid, String text);
        
    long sendImageFileSync(long thread_id, long sms_id, String uuid , String filepath, int quality);
    
    long sendAudioFileSync(long thread_id, long sms_id, String uuid, String filepath, int recordTime);
    
    long sendVideoFileSync(long thread_id, long sms_id, String uuid, String filepath, int length);
}
