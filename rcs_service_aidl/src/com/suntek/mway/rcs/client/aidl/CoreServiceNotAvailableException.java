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
 * <p>Title: CoreServiceNotAvailableException base class</p>
 * <p>
 * Description: The class <code>CoreServiceNotAvailableException</code> and its subclasses are a form of
 * {@link ClientInterfaceException} that indicates conditions that a reasonable application
 * might want to catch.
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
public class CoreServiceNotAvailableException extends ClientInterfaceException {
    private static final long serialVersionUID = 8574566864861749638L;
    /**
     * Constant of CORE_SERVICE_NOT_AVAILABLE whose value is Core service not available;
     */
    private static final String CORE_SERVICE_NOT_AVAILABLE = "Core service not available";
    /**
     * Constructs a new exception with the pre-defined constant message {@code CORE_SERVICE_NOT_AVAILABLE} .
     * @param message the detail message.
     */
    public CoreServiceNotAvailableException() {
        super(CORE_SERVICE_NOT_AVAILABLE);
    }
}
