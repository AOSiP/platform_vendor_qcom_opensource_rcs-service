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

import android.os.RemoteException;

/**
 * <p>Title: ServiceUnknownException base class</p>
 * <p>
 * Description: The class <code>ServiceUnknownException</code> and its subclasses are a form of
 * <code>ServiceUnknownException</code> that indicates unregister status when trying to invoke some
 * methods of the APIs
 * such as {@link com.suntek.mway.rcs.client.api.capability.CapabilityApi},
 * {@link com.suntek.mway.rcs.client.api.contacts.ContactApi},
 * {@link com.suntek.mway.rcs.client.api.im.MessageApi},
 * {@link com.suntek.mway.rcs.client.api.log.LogAPI},
 * {@link com.suntek.mway.rcs.client.api.setting.SettingApi},
 * {@link com.suntek.mway.rcs.client.api.voip.VoIpApi}
 * provided by RCS without invoke register() method
 * of {@link com.suntek.mway.rcs.client.api.registration.RegistrationApi}.
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
public class ServiceUnknownException extends RemoteException {
    static final long serialVersionUID = 10000L;

    /**
     * Constructs a new exception with the specified detail exception.
     *
     * @param ex Exception
     */
    public ServiceUnknownException(Exception ex) {
        setStackTrace(ex.getStackTrace());
    }

    /**
     * Constructs a new exception with the specified detail message.
     *
     * @param error Error message
     */
    public ServiceUnknownException(String message) {
        Exception ex = new Exception(message);
        this.setStackTrace(ex.getStackTrace());
    }
}
