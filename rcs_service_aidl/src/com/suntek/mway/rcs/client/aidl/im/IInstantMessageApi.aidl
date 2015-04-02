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
import com.suntek.mway.rcs.client.aidl.provider.model.ChatMessage;
import com.suntek.mway.rcs.client.aidl.provider.model.MessageSessionModel;
import com.suntek.mway.rcs.client.aidl.provider.model.GroupChatModel;
import com.suntek.mway.rcs.client.aidl.provider.model.GroupChatUser;
import com.suntek.mway.rcs.client.aidl.provider.model.TopMessageData;
import com.suntek.mway.rcs.client.aidl.provider.model.SimpleMsg;
import com.suntek.mway.rcs.client.aidl.provider.model.FavoriteMessage;

interface IInstantMessageApi {
    void sendTextMessage(long thread_id,String number, String text,
            int burnFlag, int barCycle);
    
    void sendImageFile(long thread_id,long sms_id,String number, String filePath,
            int burnFlag, int barCycle,int quality);
    
    void sendAudioFile(long thread_id,long sms_id,String number, String filePath,
            int recordTime,int burnFlag, int barCycle) ;
    void sendVideoFile(long thread_id,long sms_id,String number, String filePath,
            int length,int burnFlag, int barCycle);
    void sendLocation(long thread_id,long sms_id,String number, double lat,
            double lng,String text);
    void sendPaidEmo(long thread_id,long sms_id,String number, String emoid,
            String emoName);
    void sendVCard(long thread_id,long sms_id,String number, in RCSContact rcsContact);
    void sendVCardByPath(long thread_id,long sms_id,String number, String vcardFilePath);


    void sendOne2ManyTextMessage(long thread_id,in List<String> numbers, String text,
            int burnFlag, int barCycle);
    
    void sendOne2ManyImageFile(long thread_id,long sms_id, in List<String> numbers, String filePath,
            int burnFlag, int barCycle,int quality);
    
    void sendOne2ManyAudioFile(long thread_id,long sms_id,in List<String> numbers, String filePath,
            int recordTime,int burnFlag, int barCycle);
    void sendOne2ManyVideoFile(long thread_id,long sms_id,in List<String> numbers, String filePath,
            int length,int burnFlag, int barCycle);
    void sendOne2ManyLocation(long thread_id,long sms_id,in List<String> numbers, double lat,
            double lng,String text);
    
    
    void sendGroupMessage(long thread_id, String conversationId,long sms_id,String msg,
            String groupId);
    void sendGroupImageFile(long thread_id, String conversationId,long sms_id,String filepath,
            String groupId, int quality);
    long sendGroupImageFileSync(long thread_id, String conversationId,long sms_id,String filepath,
            String groupId, int quality);
    void sendGroupAudioFile(long thread_id, String conversationId,long sms_id,String filepath,
            int recordTime ,String groupId);
    long sendGroupAudioFileSync(long thread_id, String conversationId,long sms_id,String filepath,
            int recordTime ,String groupId);
    void sendGroupVideoFile(long thread_id, String conversationId,long sms_id,String filepath,
            int  length ,String groupId);
    long sendGroupVideoFileSync(long thread_id, String conversationId,long sms_id,String filepath,
            int  length ,String groupId);
    void sendGroupLocation(long thread_id,String conversationId,long sms_id, double lat,
            double lng,String text,String groupId);
    void sendGroupVCard(long thread_id,String conversationId,long sms_id,
            in RCSContact rcsContact,String groupId);
    void sendGroupVCardByPath(long thread_id,String conversationId,long sms_id,
            String vcardFilePath,String groupId);
    long sendGroupVCardByPathSync(long thread_id,String conversationId,long sms_id,
            String vcardFilePath,String groupId);
            
    void acceptFile(in ChatMessage chatMessage);
    boolean interruptFile(in ChatMessage chatMessage);
            
    GroupChatModel getGroupChatById(String groupId);
    GroupChatModel getGroupChatByThreadId(long threadId);
    GroupChatUser getGroupChairman(String groupId);
    
    long getNewThreadId();
    List<MessageSessionModel> getMessageSessionList(int offset, int number);
    List<ChatMessage> getChatMessageList(long threadId, boolean less, int specifiedMsgId, int count);    
    List<ChatMessage> searchMessageByText(String text, int offset, int number, boolean timaAsc);
    ChatMessage getMessageById(String rowId);
    ChatMessage getMessageByMessageId(String messageId);
    
    void removeMessageByThreadId(long threadId);
    void removeOneMessage(String id);
    void removeAllMessage();
    
    void topMessage(long threadId);
    void cancelTopMessage(long threadId);
    
    ChatMessage getTheLastMessage(long threadId);
    String  getThreadIdByNumber(in List<String> numbers);    
    MessageSessionModel getMessageSessionByThreadId(long threadId);
    String getFilepath(in ChatMessage message);
    String getThumbFilepath(in ChatMessage message);
    
    List<TopMessageData> getTopMsgsInOrder(boolean asc);
    void backupAllMessage();
    void restoreAllMessage();
    void collectMessage(in List<SimpleMsg> simpleMsgList);
    void accuseMessage(long thread_id, String id);
    
    List<ChatMessage> getMessageOfSpecialService();
    List<ChatMessage> getMessageOfStrangeNumber();
    
    List<MessageSessionModel> qryNotifyArchiveMsgSessionList();
    List<MessageSessionModel> qryNonFriendMsgSessionList();
    
    void sendOne2ManyPaidEmoMessage(long thread_id, long sms_id, in List<String> numbers,
            String emoid, String emoName);
    void sendGroupPaidEmo(long thread_id, String conversationId, long sms_id, 
            String emoid, String emoName, String groupId);
            
    List<ChatMessage> getMsgListGreatOrLessThanSpecifiedForBlack(long threadId, boolean less, int specifiedId, int number);
    MessageSessionModel getMessageSessionByThreadIdForBlack(String threadId);
    List<MessageSessionModel> getMessageSessionListForBlack(int offset, int number);
    ChatMessage getTheLastMsgOfThreadForBlack(long threadId);
    
    void sendOne2ManyVCard(long thread_id, long sms_id, 
            in List<String> numbers, in RCSContact rcsContact);
    void sendOne2ManyVCardByPath(long thread_id, long sms_id, 
            in List<String> numbers, String vcardFilePath);
            
    int recoveBlackMsgByMessageId(String messageId);
    int recoveBlackMsgByThreadId(long threadId);
    int recoveBlackMsgAll();
    
    void retransmitMessageById(String id);
    void sendDisplayNotification(String conversationId, String number, String messageId);
    
    List<GroupChatModel> getAllGroupChat();
    void burnMessage(String id);
    
    void cancelCollectSimpleMsg(in List<SimpleMsg> simpleMsgList);
    List<FavoriteMessage> getFavouriteMessageList();
    void burnMessageAtOnce(String id);
    
    String getAccuseNumber();
    byte[] getImageThumbnails(String filepath);
    byte[] getVideoThumbnails(String filepath);
    
    int getUnreadMsgCountByThreadId(String threadId);
    int getAllUnreadCount();
    void removeUnreadMessageByThreadId(String threadId);
    
    int getMsgSendPolicy();
    
    void setMsgSendPolicy(int policy);
    
    int updateMessageRead(String id);
    void uploadFile(in ChatMessage chatMessage);
    
    int getPlayTime(int msgType, String data);

    GroupChatModel getGroupChatByConversationId(String conversationId);

    void setSMSSentRemind(int policy);

    int getSMSSentRemind();

    void burnAllMsgAtOnce();

    void sendComposingMsg(long threadId, String contact, String contentType, int seconds);

    void sendCancelComposingMsg(long threadId, String contact, String contentType, long lastActive);

    void sendComposingMsgToGroup(long threadId, int id, String contentType, int seconds);

    void sendCancelComposingMsgToGroup(long threadId, int id, String contentType, long lastActive);

    void sendVCardList(long thread_id, long sms_id, String number, in List<RCSContact> contactList, int chatType);

    void sendOne2ManyVCardList(long thread_id, long sms_id, in List<String> numbers, in List<RCSContact> contactList);

    void sendGroupVCardList(long thread_id, String conversationId, long sms_id, in List<RCSContact> contactList, String groupId);

    long getImageFtMaxSize();

    long getAudioMaxTime();

    long getVideoMaxTime();

    long getVideoFtMaxSize();

    void removeMsgWithNotificationByThread(long threadId);

    void backupMessageList(in List<SimpleMsg> simpleMsgList);

	ChatMessage getMessageByTransferId(String transferId);
	
	void cancelBackup();
	
	long sendTextMessageSync(long thread_id,String number, String text,
            int burnFlag, int barCycle);
	
	long sendImageFileSync(long thread_id,long sms_id,String number, String filePath,
            int burnFlag, int barCycle,int quality);
    
    long sendAudioFileSync(long thread_id,long sms_id,String number, String filePath,
            int recordTime,int burnFlag, int barCycle) ;
    long sendVideoFileSync(long thread_id,long sms_id,String number, String filePath,
            int length,int burnFlag, int barCycle);
            
    long sendOne2ManyTextMessageSync(long thread_id,in List<String> numbers, String text,
            int burnFlag, int barCycle);  
          
    long sendOne2ManyImageFileSync(long thread_id,long sms_id, in List<String> numbers, String filePath,
            int burnFlag, int barCycle,int quality);
    
    long sendOne2ManyAudioFileSync(long thread_id,long sms_id,in List<String> numbers, String filePath,
            int recordTime,int burnFlag, int barCycle);
    long sendOne2ManyVideoFileSync(long thread_id,long sms_id,in List<String> numbers, String filePath,
            int length,int burnFlag, int barCycle);
            
    long sendGroupMessageSync(long thread_id, String conversationId,long sms_id,String msg,
            String groupId);
          
    long sendOne2ManyVCardByPathSync(long thread_id, long sms_id, 
            in List<String> numbers, String vcardFilePath);
    long sendVCardByPathSync(long thread_id,long sms_id,String number, String vcardFilePath);
    
    
    void forwardImageFile(long thread_id,long sms_id,String number, String id,
            int burnFlag, int barCycle);
    void forwardVideoFile(long thread_id,long sms_id,String number, String id,
            int length,int burnFlag, int barCycle);
    void forwardOne2ManyImageFile(long thread_id,long sms_id, in List<String> numbers, String id,
            int burnFlag, int barCycle);
    void forwardOne2ManyVideoFile(long thread_id,long sms_id,in List<String> numbers, String id,
            int length,int burnFlag, int barCycle);
    void forwardGroupImageFile(long thread_id, String conversationId,long sms_id,String id,
            String groupId);
    void forwardGroupVideoFile(long thread_id, String conversationId,long sms_id,String id,
            int  length ,String groupId);
}
