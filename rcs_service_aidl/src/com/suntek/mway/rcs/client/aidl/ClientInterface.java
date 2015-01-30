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

import java.util.List;
import java.util.Vector;

import com.suntek.mway.rcs.client.aidl.constant.APIConstant;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;

/**
 * <p>Title: ClientInterface base class</p>
 * <p>
 * Description: The abstract class <code>ClientInterface</code> represents a bridge of
 * communication between local and service. Any object that wants to communicate to
 * the service must extends <code>com.suntek.mway.rcs.api.client.ClientInterface</code>.
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
public abstract class ClientInterface {
    /**
     * a vertor of {@link ClientInterfaceListener}
     */
    private Vector<ClientInterfaceListener> listeners = new Vector<ClientInterfaceListener>();

    /**
     * Constructs an ClientInterface with zero ClientInterfaceListener.
     */
    public ClientInterface() {
    }

    /**
     * add a {@link ClientInterfaceListener}
     * @param listener a implementation of ClientInterfaceListener
     */
    public void addInterfaceEventListener(ClientInterfaceListener listener) {
        listeners.addElement(listener);
    }

    /**
     * remove a {@link ClientInterfaceListener}
     *
     * @param listener a implementation of ClientInterfaceListener
     */
    public void removeInterfaceEventListener(ClientInterfaceListener listener) {
        listeners.removeElement(listener);
    }

    /**
     * remove all {@link ClientInterfaceListener}
     */
    public void removeAllInterfaceEventListeners() {
        listeners.removeAllElements();
    }

    /**
     * when the local connect to service, then notify all of its {@link ClientInterfaceListener}
     */
    public void notifyEventInterfaceConnected() {
        for(int i=0; i < listeners.size(); i++) {
            ClientInterfaceListener listener = (ClientInterfaceListener)listeners.elementAt(i);
            listener.handleInterfaceConnected();
        }
    }

    /**
     * when disconnect between local and service, then notify all of its {@link ClientInterfaceListener}
     */
    public void notifyEventInterfaceDisconnected() {
        for(int i=0; i < listeners.size(); i++) {
            ClientInterfaceListener listener = (ClientInterfaceListener)listeners.elementAt(i);
            listener.handleInterfaceDisconnected();
        }
    }

    /**
     * check the service is start or not.
     * @param ctx android.content.Context
     * @return true if the service is started , false otherwise.
     */
    public static boolean isServiceStarted(Context ctx) {
        ActivityManager activityManager = (ActivityManager)ctx.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningServiceInfo> serviceList = activityManager.getRunningServices(Integer.MAX_VALUE);
         for(int i = 0; i < serviceList.size(); i++) {
               ActivityManager.RunningServiceInfo serviceInfo = serviceList.get(i);
               ComponentName serviceName = serviceInfo.service;
               if (serviceName.getClassName().equals(APIConstant.CORE_SERVICE_CLASSNAME)) {
                     if (serviceInfo.pid != 0) {
                          return true;
                     } else {
                          return false;
                     }
               }
         }
         return false;
    }

    /**
     * subclass must override this method  for connect operation
     */
    protected abstract void connectInterface();

    /**
     * subclass must override this method  for disconnect operation
     */
    protected abstract void disconnectInterface();
}
