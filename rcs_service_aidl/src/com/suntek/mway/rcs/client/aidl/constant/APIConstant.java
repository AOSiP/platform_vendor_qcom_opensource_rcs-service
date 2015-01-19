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
package com.suntek.mway.rcs.client.aidl.constant;

/**
 * <p>Title: APIConstant class</p>
 * <p>
 * Description: The class <code>APIConstant</code> represents a series of
 * constants of SDK API, which is indicated by the field definition in this class.
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
public abstract class APIConstant {
    /**
     * The kind of special object contained in this Parcelable's
     * marshalled representation
     */
    public static final int PARCEL_OBJECT_TYPE = 0;

    /**
     * Class name for CoreService.
     */
    public static final String CORE_SERVICE_CLASSNAME = "com.suntek.mway.rcs.app.service.core.CoreService";
    public static final String MAIN_SERVICE_NAME = "com.suntek.mway.rcs.app.service.service.ServiceManager";
    /** The Constant IM_STATUS_OFFLINE. */
    public static final int IM_STATUS_OFFLINE = 0;

    /** The Constant IM_STATUS_ONLINE. */
    public static final int IM_STATUS_ONLINE = 1;

    public static final int BUTTON_HIDDEN = 0;

    public static final int BUTTON_DISPLAY = 1;


    /** The Constant LOGIN_SUCCESS. */
    public static final int LOGIN_SUCCESS = 0;

    /** The Constant LOGIN_FAIL. */
    public static final int LOGIN_FAIL = 1;

    /** The Constant SIM_CARD_NOT_EXIST. */
    public static final int SIM_CARD_NOT_EXIST = 2;

    /** The Constant NETWORK_NOT_AVAILABLE. */
    public static final int NETWORK_NOT_AVAILABLE = 3;

    /** current account has not open RCS business **/
    public static final int ACCOUNT_NOT_OPEN_BUSS_ERR_CODE = -999;
    /** current network is not PS network, must change to PS network. **/
    public static final int MUST_OPEN_PS_ERR_CODE = -998;
    /** current account's status is invalid.**/
    public static final int ACCOUNT_STATUS_INVALID_ERR_CODE = -997;

    /** Send message auto select system sms or im */
    public static final int MSG_SEND_POLICY_AUTO = 1;

    /** Send message auto select system sms */
    public static final int MSG_SEND_POLICY_SMS = 2;

    /** Send message auto select im */
    public static final int MSG_SEND_POLICY_IM = 3;

    /** Remind me when message sent by SMS  */
    public static final int SMS_SEND_REMIND = 1;

    /** Not need remind me when message sent by SMS  */
    public static final int SMS_SEND_NOT_REMIND = 0;


}
