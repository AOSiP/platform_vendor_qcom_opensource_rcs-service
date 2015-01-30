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

import android.app.Application;
import android.content.Context;

/**
 * <p>Title: RCSApplication class</p>
 * <p>
 * Description: The class <code>RCSApplication</code>
 * is the root of the class hierarchy in UI project. The UI application
 * must extends <code>com.suntek.mway.rcs.api.client.RCSApplication</code>
 * and override the method onCreate() to initialize various APIs
 * (
 * such as {@link com.suntek.mway.rcs.client.api.capability.CapabilityApi},
 * {@link com.suntek.mway.rcs.client.api.contacts.ContactApi},
 * {@link com.suntek.mway.rcs.client.api.im.MessageApi},
 * {@link com.suntek.mway.rcs.client.api.log.LogAPI},
 * {@link com.suntek.mway.rcs.client.api.registration.RegistrationApi},
 * {@link com.suntek.mway.rcs.client.api.setting.SettingApi},
 * {@link com.suntek.mway.rcs.client.api.voip.VoIpApi}
 * )
 * provided by RCS
 * according to business needs.
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
public class RCSApplication extends Application {

    /**
     * instance of RCSApplication.
     */
    private static RCSApplication rcsApp;

    /**
     * handler of android.content.Context.
     */
    private static Context ctx;

    /**
     * construct a new instance of RCSApplication
     */
    public RCSApplication() {
        RCSApplication.rcsApp = this;
    }

    /**
     * init context with the specified subclass of android.content.Context
     * here is the instance of RCSApplication.
     * @param context subclass of android.content.Context, here is the instance of RCSApplication.
     */
    public static void initContext(Context context) {
        ctx = context;
    }

    /**
     * returns subclass of android.content.Context, here is the instance of RCSApplication
     * @return the instance of RCSApplication
     */
    public static Context getContext() {
        if(ctx == null) {
            ctx = RCSApplication.rcsApp;
        }
        return ctx;
    }

    /**
     * override the method to initialize various API provided by RCS
     * according to business needs.
     */
    @Override
    public void onCreate() {
        super.onCreate();
        initContext(this);
        ServiceInterface.init(this);
    }


}
