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
 * <p>Title: ClientInterfaceNotify class</p>
 * <p>
 * Description: The class <code>ClientInterfaceNotify</code> is a singleton that
 * represents the notification when local is connecting to the service.
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
public class ClientInterfaceNotify {
    /**
     * the singleton instance.
     */
    private static ClientInterfaceNotify instance;

    /**
     * the only one static method to be invoked to get a singleton instance.
     * @return singleton instance of ClientInterfaceNotify
     */
    public static ClientInterfaceNotify getInstance() {
        if(instance == null) {
            synchronized(ClientInterfaceNotify.class){
                if(instance == null){
                    instance = new ClientInterfaceNotify();
                }
            }
        }
        return instance;
    }

    /**
     * private constructor to avoid new a instance from outer environment.
     */
    private ClientInterfaceNotify() {}

    /**
     * This is a blocking method.
     * When invoked, the caller will be blocked until the local is connected to the service.
     */
    public void waitConnected() {
        try {
            synchronized(this) {
                wait();
            }
        } catch(java.lang.InterruptedException e) {

        }
    }

    /**
     * when invoked, wakes up the caller which invoked the method <code>waitConnected()</code> before.
     */
    public void notifyConnected() {
        synchronized(this) {
            notifyAll();
        }
    }

}
