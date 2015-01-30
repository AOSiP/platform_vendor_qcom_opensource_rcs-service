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

import java.io.Closeable;
import java.io.IOException;

/**
 * <p>Title: CloseableUtils class</p>
 * <p>
 * Description: The class <code>CloseFileUtils</code> is a utility that
 * closes properly objects implementing CloseFileUtils (input stream, output stream...)
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
public abstract class CloseFileUtils {

    /**
     * Closes properly objects implementing CloseFileUtils (input stream, output stream...)
     *
     * @param c
     *            object to close or null
     * @return IOException or null
     */
    public static IOException close(Closeable c) {
        if (c != null) {
            try {
                c.close();
            } catch (IOException e) {
                return e;
            }
        }
        return null;
    }
}
