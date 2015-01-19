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

import java.util.Vector;

/**
 * <p>Title: FirstInFirstOutBuffer class</p>
 * <p>
 * Description: The class <code>FirstInFirstOutBuffer</code> is a utility for objects read and save in synchronization.
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
public class FirstInFirstOutBuffer {
    /**
     * Lock object
     */
    private int nbObjects = 0;

    /**
     * Buffer stack
     */
    private Vector<Object> stack = new Vector<Object>();

    /**
     * Add an object in the buffer
     *
     * @param obj Object
     */
    public synchronized void addObject(Object obj) {
        stack.addElement(obj);
        nbObjects++;
        notifyAll();
    }

    /**
     * Read an object in the buffer. This is a blocking method until an object is read.
     *
     * @return Object
     */
    public synchronized Object getObject() {
        Object obj = null;
        if (nbObjects == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                // Nothing to do
            }
        }
        if (nbObjects != 0) {
            obj = stack.elementAt(0);
            stack.removeElementAt(0);
            nbObjects--;
            notifyAll();
        }
        return obj;
    }

    /**
     * Read an object in the buffer.
     *
     * @param timeout
     *             the milliseconds that thread wait
     * @return Object
     */
    public synchronized Object getObject(int timeout) {
        Object obj = null;
        if (nbObjects == 0) {
            try {
                wait(timeout);
            } catch (InterruptedException e) {
                // Nothing to do
            }
        }
        if (nbObjects != 0) {
            obj = stack.elementAt(0);
            stack.removeElementAt(0);
            nbObjects--;
            notifyAll();
        }
        return obj;
    }

    /**
     * Notify thread
     */
    public void close() {
        synchronized(this) {
            this.notifyAll();
        }
    }
}
