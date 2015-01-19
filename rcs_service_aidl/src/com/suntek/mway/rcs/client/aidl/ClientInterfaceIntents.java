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
package com.suntek.mway.rcs.client.aidl;

/**
 * <p>Title: ClientInterfaceIntents interface</p>
 * <p>
 * Description: The interface <code>ClientInterfaceIntents</code> defines a series of
 * broadcast messages which are indicated by the field definition in this class.
 * </p>
 * <p>
 * Copyright: Copyright (c) 2014
 * </p>
 * <p>
 * Company: pci-suntek
 * </p>
 * @author YE JIE MING
 * @version 1.0
 *
 */
public interface ClientInterfaceIntents {
    /**
     * the broadcast message of login or logout.
     * The android.content.Intent associated with
     * the broadcast message carries three arguments
     * that are described as the following table:
     * <table border="1">
     * <tr>
     *     <th>extra variable name</th><th>type</th><th>description</th>
     * </tr>
     * <tr>
     *     <td>status</td><td>int</td><td>{@link ClientInterfaceIntents#REGISTER_SUCCESS}<br/>{@link ClientInterfaceIntents#REGISTER_FAILED}<br/>{@link ClientInterfaceIntents#REGISTER_TERMINATED}<br/>{@link ClientInterfaceIntents#REGISTER_IN_PROGRESS}</td>
     * </tr>
     * <tr>
     *     <td>errorCode</td><td>int</td><td>the error code related to register failure</td>
     * </tr>
     * <tr>
     *     <td>message</td><td>String</td><td>the message related to register failure</td>
     * </tr>
     * </table>
     */
    public final static String ACTION_REGISTER_STATUS_CHANGED = "com.suntek.mway.rcs.ACTION_REGISTER_STATUS_CHANGED";

    /**
     * register successfully.
     */
    public static final int REGISTER_SUCCESS = 200;

    /**
     * register fail.
     */
    public static final int REGISTER_FAILED = -1;

    /**
     * unregister successfully.
     */
    public static final int REGISTER_TERMINATED = -3;

    /**
     * In the register progress.
     */
    public static final int REGISTER_IN_PROGRESS = 202;

    /** The Constant DMS_USER_STATUS_OK. */
    public static final int DMS_USER_STATUS_OK = 0;

    /** The Constant DMS_USER_STATUS_TEMP_PASSIVE_DISABLED. */
    public static final int DMS_USER_STATUS_TEMP_PASSIVE_DISABLED = 1;

    /** The Constant DMS_USER_STATUS_PERMANENT_DISABLED. */
    public static final int DMS_USER_STATUS_PERMANENT_DISABLED = 2;

    /** The Constant DMS_USER_STATUS_TEMP_ACTIVE_DISABLED. */
    public static final int DMS_USER_STATUS_TEMP_ACTIVE_DISABLED = 3;

    /** The Constant DMS_USER_STATUS_DORMANT. */
    public static final int DMS_USER_STATUS_DORMANT = 4;

    /**
     * the broadcast message of audio or video call.
     * The android.content.Intent associated with
     * the broadcast message carries three arguments
     * that are described as the following table:
     * <table border="1">
     * <tr>
     *     <th>extra variable name</th><th>type</th><th>description</th>
     * </tr>
     * <tr>
     *     <td>callRecordId</td><td>int</td><td>long</td><td>call record id</td>
     * </tr>
     * <tr>
     *     <td>sessionId</td><td>long</td><td>session id</td>
     * </tr>
     * <tr>
     *     <td>contact</td><td>String</td><td>phone number</td>
     * </tr>
     * </table>
     */
    public final static String ACTION_INCOMING_AV_CALL = "com.suntek.mway.rcs.ACTION_INCOMING_AV_CALL";

    /**
     * the broadcast message of the status changed of message to be send.
     * The android.content.Intent associated with
     * the broadcast message carries two arguments
     * that are described as the following table:
     * <table border="1">
     * <tr>
     *     <th>extra variable name</th><th>type</th><th>description</th>
     * </tr>
     * <tr>
     *     <td>status</td><td>int</td><td>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_STATE_SEND_OK}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_STATE_SEND_REC}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_STATE_SENDED}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_STATE_SEND_ING}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_STATE_SEND_FAIL}</td>
     * </tr>
     * <tr>
     *     <td>messageId</td><td>String</td><td>message id</td>
     * </tr>
     * </table>
     */
    public final static String ACTION_MESSAGE_STATUS_CHANGED = "com.suntek.mway.rcs.ACTION_MESSAGE_STATUS_CHANGED";

    /**
     * the broadcast message of the new arrival message.
     * The android.content.Intent associated with
     * the broadcast message carries four arguments
     * that are described as the following table:
     * <table border="1">
     * <tr>
     *     <th>extra variable name</th><th>type</th><th>description</th>
     * </tr>
     * <tr>
     *     <td>msgType</td><td>int</td><td>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_TYPE_TEXT}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_TYPE_FILE}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_TYPE_LOCATION}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_TYPE_CONTACT}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_TYPE_GROUP_INFO}</td>
     * </tr>
     * <tr>
     *     <td>contact</td><td>String</td><td>phone number</td>
     * </tr>
     * <tr>
     *     <td>message</td><td>String</td><td>message content</td>
     * </tr>
     * <tr>
     *     <td>receivedAt</td><td>Date</td><td>received date</td>
     * </tr>
     * </table>
     */
    public final static String ACTION_INCOMING_MESSAGE = "com.suntek.mway.rcs.message.ACTION_INCOMING_MESSAGE";

    /**
     * the broadcast message of the file transfer progress changed.
     * The android.content.Intent associated with
     * the broadcast message carries four arguments
     * that are described as the following table:
     * <table border="1">
     * <tr>
     *     <th>name</th><th>type</th><th>description</th>
     * </tr>
     * <tr>
     *     <td>messageId</td><td>String</td><td>message id</td>
     * </tr>
     * <tr>
     *     <td>file</td><td>String</td><td>the path of file being transfered</td>
     * </tr>
     * <tr>
     *     <td>current</td><td>long</td><td>current bytes being sent</td>
     * </tr>
     * <tr>
     *     <td>total</td><td>long</td><td>total bytes of file</td>
     * </tr>
     * </table>
     */
    public final static String ACTION_FILE_TRANSFER_PROGRESS_CHANGED = "com.suntek.mway.rcs.ACTION_FILE_TRANSFER_PROGRESS_CHANGED";

    /**
     * the broadcast message of request before incoming file transfer is established.
     * The android.content.Intent associated with
     * the broadcast message carries five arguments
     * that are described as the following table:
     * <table border="1">
     * <tr>
     *     <th>name</th><th>type</th><th>description</th>
     * </tr>
     * <tr>
     *     <td>contact</td><td>String</td><td>phone number</td>
     * </tr>
     * <tr>
     *     <td>sessionId</td><td>long</td><td>session id</td>
     * </tr>
     * <tr>
     *     <td>filename</td><td>String</td><td>file name</td>
     * </tr>
     * <tr>
     *     <td>fileSize</td><td>long</td><td>bytes of file</td>
     * </tr>
     * <tr>
     *     <td>fileType</td><td>String</td><td>file type</td>
     * </tr>
     * </table>
     */
    public final static String ACTION_INCOMING_FILE_TRANSFER = "com.suntek.mway.rcs.message.ACTION_INCOMING_FILE_TRANSFER";

    /**
     * the broadcast message of incoming geographical location.
     */
    //public final static String ACTION_INCOMING_LOCATION = "com.suntek.mway.rcs.message.ACTION_INCOMING_LOCATION";

    /**
     * the broadcast message of incoming contacts.
     */
    //public final static String ACTION_INCOMING_CONTACT = "com.suntek.mway.rcs.message.ACTION_INCOMING_CONTACT";

    /**
     * the broadcast message of request before one to one chat invitation is agreed.
     * The android.content.Intent associated with
     * the broadcast message carries three arguments
     * that are described as the following table:
     * <table border="1">
     * <tr>
     *     <th>name</th><th>type</th><th>description</th>
     * </tr>
     * <tr>
     *     <td>contact</td><td>String</td><td>phone number</td>
     * </tr>
     * <tr>
     *     <td>subject</td><td>String</td><td>chat topic</td>
     * </tr>
     * <tr>
     *     <td>sessionId</td><td>long</td><td>session id</td>
     * </tr>
     * </table>
     */
    public final static String ACTION_ONE_2_ONE_CHAT_INVITATION = "com.suntek.mway.rcs.message.ACTION_ONE_2_ONE_CHAT_INVITATION";

    /**
     * the broadcast message of request before group chat invitation is agreed.
     * The android.content.Intent associated with
     * the broadcast message carries three arguments
     * that are described as the following table:
     * <table border="1">
     * <tr>
     *     <th>name</th><th>type</th><th>description</th>
     * </tr>
     * <tr>
     *     <td>contact</td><td>String</td><td>chat room uri</td>
     * </tr>
     * <tr>
     *     <td>subject</td><td>String</td><td>chat topic</td>
     * </tr>
     * <tr>
     *     <td>sessionId</td><td>long</td><td>session id</td>
     * </tr>
     * </table>
     */
    public final static String ACTION_GROUP_CHAT_INVITATION = "com.suntek.mway.rcs.message.ACTION_GROUP_CHAT_INVITATION";

    /**
     * the broadcast message of incoming group message.
     * The android.content.Intent associated with
     * the broadcast message carries four arguments
     * that are described as the following table:
     * <table border="1">
     * <tr>
     *     <th>name</th><th>type</th><th>description</th>
     * </tr>
     * <tr>
     *     <td>sessionId</td><td>long</td><td>session id of group chat</td>
     * </tr>
     * <tr>
     *     <td>msgType</td><td>int</td><td>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_TYPE_TEXT}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_TYPE_FILE}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_TYPE_LOCATION}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_TYPE_CONTACT}<br/>{@link com.suntek.mway.rcs.client.aidl.provider.SuntekMessageData#MSG_TYPE_GROUP_INFO}</td>
     * </tr>
     * <tr>
     *     <td>contact</td><td>String</td><td>phone number</td>
     * </tr>
     * <tr>
     *     <td>message</td><td>String</td><td>message content</td>
     * </tr>
     * </table>
     */
    public final static String ACTION_INCOMING_GROUP_MESSAGE = "com.suntek.mway.rcs.message.ACTION_INCOMING_GROUP_MESSAGE";

    /**
     * the broadcast message of the capability of contacts changed.
     * The android.content.Intent associated with
     * the broadcast message carries one argument
     * that is described as the following table:
     * <table border="1">
     * <tr>
     *     <td>contact</td><td>String</td><td>phone number</td>
     * </tr>
     * </table>
     */
    public final static String ACTION_CAPABILITY_STATUS_CHANGED = "com.suntek.mway.rcs.message.ACTION_CAPABILITY_STATUS_CHANGED";

}
