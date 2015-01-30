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
package com.suntek.mway.rcs.client.aidl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

/**
 * <p>Title: SettingUtils class</p>
 * <p>
 * Description: The class <code>SettingUtils</code> is a utility for setting used by android.content.SharedPreferences
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
public abstract class SettingUtils {

    /**
     * Get a string value from SharedPreferences.
     * @param context android.content.Context
     * @param name setting name
     * @param defaultValue the default value of setting name
     * @return return value of setting name if it exists, or return a specified default value otherwise.
     */
    public static String getSetting(Context context, String name,
            String defaultValue) {
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        String value = prefs.getString(name, defaultValue);
        return value;
    }

    /**
     * Set a string value into SharedPreferences
     * @param context android.content.Context
     * @param name setting name
     * @param value setting value
     * @return true if setting successfully, false otherwise
     */
    public static boolean setSetting(Context context, String name, String value) {
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        Editor editor = prefs.edit();
        editor.putString(name, value);
        return editor.commit();
    }

    /**
     * Get a boolean value from SharedPreferences.
     * @param context android.content.Context
     * @param name setting name
     * @param defaultValue the default value of setting name
     * @return return value of setting name if it exists, or return a specified default value otherwise.
     */
    public static boolean getSetting(Context context, String name,
            boolean defaultValue) {
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        boolean value = prefs.getBoolean(name, defaultValue);
        return value;
    }

    /**
     * Set a boolean value into SharedPreferences
     * @param context android.content.Context
     * @param name setting name
     * @param value setting value
     * @return true if setting successfully, false otherwise
     */
    public static boolean setSetting(Context context, String name, boolean value) {
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        Editor editor = prefs.edit();
        editor.putBoolean(name, value);
        return editor.commit();
    }

    /**
     * Get a integer value from SharedPreferences.
     * @param context android.content.Context
     * @param name setting name
     * @param defaultValue the default value of setting name
     * @return return value of setting name if it exists, or return a specified default value otherwise.
     */
    public static int getSetting(Context context, String name, int defaultValue) {
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        int value = prefs.getInt(name, defaultValue);
        return value;
    }

    /**
     * Get a long value from SharedPreferences.
     * @param context android.content.Context
     * @param name setting name
     * @param defaultValue the default value of setting name
     * @return return value of setting name if it exists, or return a specified default value otherwise.
     */
    public static long getSetting(Context context, String name, long defaultValue) {
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        long value = prefs.getLong(name, defaultValue);
        return value;
    }

    /**
     * Set a integer value into SharedPreferences
     * @param context android.content.Context
     * @param name setting name
     * @param value setting value
     * @return true if setting successfully, false otherwise
     */
    public static boolean setSetting(Context context, String name, int value) {
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        Editor editor = prefs.edit();
        editor.putInt(name, value);
        return editor.commit();
    }

    /**
     * Set a long value into SharedPreferences
     * @param context android.content.Context
     * @param name setting name
     * @param value setting value
     * @return true if setting successfully, false otherwise
     */
    public static boolean setSetting(Context context, String name, long value) {
        final SharedPreferences prefs = PreferenceManager
                .getDefaultSharedPreferences(context);
        Editor editor = prefs.edit();
        editor.putLong(name, value);
        return editor.commit();
    }

}
