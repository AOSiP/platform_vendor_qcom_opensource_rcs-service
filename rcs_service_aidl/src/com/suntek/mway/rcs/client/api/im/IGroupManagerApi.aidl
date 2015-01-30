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
 
package com.suntek.mway.rcs.client.api.im;

import java.util.List;

import com.suntek.mway.rcs.client.api.provider.model.GroupChatUser;
import com.suntek.mway.rcs.client.api.plugin.callback.IConferenceCallback;
import com.suntek.mway.rcs.client.api.provider.model.GroupChatModel;

interface IGroupManagerApi {

    String createGroupChat(String subject, in List<String> users);

    void agreeToJoinGroup(String conversationId, String contributionId,
            String chatUri, String subject, String numberData, long inviteTime);

    void refuseToJoinGroup(String conversationId);

    void updateGroupSubject(String groupId, String newSubject);

    void modifyGroupMemo(String groupId, String memo);

    void disbandGroupChat(String groupId);

    void kickedOutOfGroupChat(String groupId, String number);

    void assignGroupChairman(String groupId, String number);

    void quitGroupChat(String groupId, String number);
    void quitGroupChatEx(String groupId, String oldChairman, String newChairman);
    void setMyAlias(String groupId, String alias);

    String getGroupChatMemberDisplayName(String groupId, String number);

    void refreshMemberHeadPic(String groupId,String number,int pixel,in IConferenceCallback confCallback);

    void queryMemberHeadPic(String groupId,String number,int pixel,in IConferenceCallback confCallback);




    GroupChatUser getGroupChairman(String groupId);

    void inviteOneMemberToGroupChat(String groupId, String number);

    void inviteToJoinGroupChat(String groupId, in List<String> numbers);
    
    GroupChatModel getLastGroupModel();
    
    GroupChatModel getGroupChatByGroupId(String groupId);
    
    void updateGroupPolicy(String groupId,int policy);
    
    List<GroupChatUser> getGroupChatUsersAllowChairman(String groupId);
    List<GroupChatUser> getGroupChatUsersByGroupId(String groupId);
    
    GroupChatModel getGroupChatByThreadId(String threadId);
       GroupChatModel getGroupChatByChatUri(String chatUri);

    String getGroupChatDomainName();

    String getPublicAccountDomainName();

    void refuseAssigedAsChairman(String chatUri, long inviteTime, String conversationId, String contributionId);

    void acceptAssignedAsChairman(String chatUri, long inviteTime, String conversationId, String contributionId);
}
