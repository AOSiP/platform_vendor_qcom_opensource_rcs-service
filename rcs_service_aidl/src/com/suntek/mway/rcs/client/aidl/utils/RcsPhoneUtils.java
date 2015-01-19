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

import android.telephony.PhoneNumberUtils;

/**
 * <p>Title: RcsPhoneUtils class</p>
 * <p>
 * Description: The class <code>RcsPhoneUtils</code> is a utility for phone number operation
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
public abstract class RcsPhoneUtils {

    private static String NATIOIN_CODE = "+86";
    private static String NATION_AREA_CODE = "0";

    /**
     * Parse phone to international
     * @param number
     *             the phone number
     * @return international phone
     */
    public static String parseNumToInternational(String number) {
        if (number == null) {
            return null;
        }

        number = number.trim();

        String phone = PhoneNumberUtils.stripSeparators(number);

        if (phone.startsWith("00" + NATIOIN_CODE.substring(1))) {
            phone = NATIOIN_CODE + phone.substring(4);
        } else if ((NATION_AREA_CODE != null) && (NATION_AREA_CODE.length() > 0) &&
                phone.startsWith(NATION_AREA_CODE)) {
            phone = NATIOIN_CODE + phone.substring(NATION_AREA_CODE.length());
        } else if (!phone.startsWith("+")) {
            phone = NATIOIN_CODE + phone;
        }
        return phone;
    }

    /**
     * Draw out phone from URI
     *
     * @param uri
     *             the URI
     * @return international phone
     */
    public static String drawNumberFromUri(String uri) {
        if (uri == null) {
            return null;
        }

        try {
            int index0 = uri.indexOf("<");
            if (index0 != -1) {
                uri = uri.substring(index0+1, uri.indexOf(">", index0));
            }

            int index1 = uri.indexOf("tel:");
            if (index1 != -1) {
                uri = uri.substring(index1+4);
            }

            index1 = uri.indexOf("sip:");
            if (index1 != -1) {
                int index2 = uri.indexOf("@", index1);
                uri = uri.substring(index1+4, index2);
            }

            int index2 = uri.indexOf(";");
            if (index2 != -1) {
                uri = uri.substring(0, index2);
            }

            return parseNumToInternational(uri);
        } catch(Exception e) {
            return null;
        }
    }
}
