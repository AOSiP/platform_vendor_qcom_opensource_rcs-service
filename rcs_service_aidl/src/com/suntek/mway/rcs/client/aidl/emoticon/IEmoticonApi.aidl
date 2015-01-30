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
package com.suntek.mway.rcs.client.aidl.emoticon;
import com.suntek.mway.rcs.client.aidl.plugin.entity.emoticon.EmojiPackageBO;
import com.suntek.mway.rcs.client.aidl.plugin.entity.emoticon.ResultBO;
import com.suntek.mway.rcs.client.aidl.plugin.entity.emoticon.EmoticonBO;
import com.suntek.mway.rcs.client.aidl.plugin.entity.emoticon.UserBO;
import com.suntek.mway.rcs.client.aidl.plugin.callback.IEmoticonCallbackApi;
import com.suntek.mway.rcs.client.aidl.plugin.callback.IEmoticonCanSendCallback;
import com.suntek.mway.rcs.client.aidl.plugin.callback.IEmoticonPackagesNetCallbackApi;
import com.suntek.mway.rcs.client.aidl.plugin.callback.IEmoticonSetSuccessDownListener;
interface IEmoticonApi {
//    boolean doRegister();
    
        /**
     * Gets the user entity by user phone number.
     * 
     * @param userPhone
     *            the user phone number
     * @return the user entity
    UserBO getUser( String userPhone );
     */

    /**
     * Gets the current login user entity.
     * 
     * @return the current user entity
     */
    UserBO getCurrentUser();

    /**
     * Gets the user login state by the user phone number
     * 
     * @param userPhone
     *            the user phone number
     * @return the user login state, true is had logined, false is haddn't
     *         logined
    boolean getUserState( String userPhone );
     */

    /**
     * Gets the current user login state.
     * 
     * @return the current user login state, true is had logined, false is
     *         haddn't logined
     */
    boolean getCurrentUserState();

    /**
     * Query user emoticon packages by user phone number.
     * 
     * @return the list of user emoticon package
     */
    List<EmojiPackageBO> queryEmojiPackages();
    
    /**
     * Gets the emoticon entity by the emoticon id.
     * 
     * @param emoticonId
     *            the emoticon id
     * @return the emoticon entity
     */
    EmoticonBO getEmoticon( String emoticonId );

    /**
     * Gets the emoticon package info by the user phone number and the user
     * emoticon package id.
     * 
     * @param packageId
     *            the emoticon package id
     * @return the emoticon package
     */
    EmojiPackageBO getEmojiPackage( String packageId);

    /**
     * Gets the emoticon package with detail by the user phone number and the
     * emoticon package id.
     * 
     * @param packageId
     *            the emoticon package id
     * @return the emoticon package entity
     */
    EmojiPackageBO getEmojiPackageWithDetail( String packageId);
    
    /**
     * Query emoticons by the user phone number and package id.
     * 
     * @param packageId
     *            the emoticon package id
     * @return the list of emoticon entity
     */
    List<EmoticonBO> queryEmoticons( String packageId);

    /**
     * Judge if the package exist by the emoticon package id and is free
     * condition.
     * 
     * @param packageId
     *            the emoticon package id
     * @return true, if exist
     */
    boolean emojiPackageExist( String packageId);

    /**
     * Do accept emoticon.
     * 
     * @param emoticonId
     *            the emoticonId, such as the emoticon id 
     * @param callback
     *            the accept emoticon event callback handler
     */
    void doAcceptEmoticon( String emoticonId, IEmoticonCallbackApi callback );

    /**
     * Do download emoticon package.
     * 
     * @param zipPath
     *            the zip path
     * @param packageId
     *            the package id
     * @param userPhone
     *            the user phone
     * @return the result entity
    
    ResultBO doDownEmojiPackage( String zipPath, String packageId);
 */
    /**
     * Do buy emoticon package.
     * 
     * @param params
     *            the params, such as the package id , the package name and so
     *            on
     * @return the result entity
    
    ResultBO doBuyEmojiPackage( in Map params );
 */
    /**
     * Query emoticon packages with detail by user phone number.
     * 
     * @return the list of emoticon package
     */
    List<EmojiPackageBO> queryEmojiPackagesWithDetail();

    /**
     * Query users info.
     * 
     * @return the list of user entity
    List<UserBO> queryUsers();
     */

    /**
     * Authenticate user emoticon right.
     * 
     * @param paramMap
     *            the param map
     * @param callback
     *            the authenticate use emoticon right event callback handler
     */
    //void authUseEmoticon( in Map paramMap, IEmoticonCallbackApi callback );
    
    void isCanSend(String emoticonId, String phone, IEmoticonCanSendCallback cansendCallback);
    
    /**
     * Gets the storage root path.
     *
     * @return the storage root path
     */
    String getStorageRootPath();
    /**
     *Get a list of the specified user's face - Network
     *
     *@param callback
     *            the authenticate use emoticon right event callback handler
     */
    void queryEmojiPackagesNet(IEmoticonPackagesNetCallbackApi callback);
    /**
     *
     *Text automatically retrieve expression
     *@param emoticonName
     *            the expression name
     */
    List<EmoticonBO> queryEmoticonName(String emoticonName);
    
    void setSuccessDownListener(IEmoticonSetSuccessDownListener downListener);
    
    void unreSuccessListenter();
    
    String encodeEmoticon(String emoticonId);
    
    EmoticonBO decodeEmoticon(String eid);
    
    String getEmoticonId(String eid);
    
    byte[] decrypt2Bytes(String emoticonId, int emoFileType);
/*
    void decrypt2Temp(String key,String fileStr);
*/

//    ResultBO doLogout(String userPhone, String date);
}
