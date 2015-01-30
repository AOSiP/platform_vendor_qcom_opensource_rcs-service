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
package com.suntek.mway.rcs.client.aidl.provider.model;

public class ImdnNotification {

    private String messageId;
    private String datetime;
    private String recipientUri;
    private String originalRecipientUri;
    private String displayNotificationStatus;
    private String deliveryNotificationStatus;
    private int status;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getRecipientUri() {
        return recipientUri;
    }

    public void setRecipientUri(String recipientUri) {
        this.recipientUri = recipientUri;
    }

    public String getOriginalRecipientUri() {
        return originalRecipientUri;
    }

    public void setOriginalRecipientUri(String originalRecipientUri) {
        this.originalRecipientUri = originalRecipientUri;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDisplayNotificationStatus() {
        return displayNotificationStatus;
    }

    public void setDisplayNotificationStatus(String displayNotificationStatus) {
        this.displayNotificationStatus = displayNotificationStatus;
    }

    public String getDeliveryNotificationStatus() {
        return deliveryNotificationStatus;
    }

    public void setDeliveryNotificationStatus(String deliveryNotificationStatus) {
        this.deliveryNotificationStatus = deliveryNotificationStatus;
    }

}
