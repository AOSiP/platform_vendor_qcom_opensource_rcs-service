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

/**
 * The Class PublicAccount.
 */
public class PublicAccount {

    /** The pa uuid. */
    private String paUuid = null;

    /** The name. */
    private String name = null;

    /** The logo. */
    private String logo = null;

    /** The recommend level. */
    private int recommendLevel = 0;

    /** The sip uri. */
    private String sipUri = null;

    /** The followed. */
    private boolean followed = false;

    /** The accept. */
    private boolean accept = true;

    /** The followed time. */
    private String followedTime;

    /** The company. */
    private String company;

    /** The intro. */
    private String intro;

    /** The type. */
    private String type;

    /** The update time. */
    private String updateTime;

    /** The menu type. */
    private int    menuType;

    /** The menu timestamp. */
    private String menuTimestamp;

    /** The subscribe status. */
    private int    subscribeStatus;

    /** The qr code. */
    private String qrCode;

    /** The active status. */
    private int activeStatus;

    /** The tel. */
    private String tel;

    /** The email. */
    private String email;

    /** The zip. */
    private String zip;

    /** The addr. */
    private String addr;

    /** The field. */
    private String field;
    
    /** The logoType. */
    private String logoType;
    
    /** The menuString. */
    private String menuString;

    /**
     * Gets the pa uuid.
     *
     * @return the pa uuid
     */
    public String getPaUuid() {
        return paUuid;
    }

    /**
     * Sets the pa uuid.
     *
     * @param paUuid the new pa uuid
     */
    public void setPaUuid(String paUuid) {
        this.paUuid = paUuid;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the logo.
     *
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the logo.
     *
     * @param logo the new logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * Gets the recommend level.
     *
     * @return the recommend level
     */
    public int getRecommendLevel() {
        return recommendLevel;
    }

    /**
     * Sets the recommend level.
     *
     * @param recommendLevel the new recommend level
     */
    public void setRecommendLevel(int recommendLevel) {
        this.recommendLevel = recommendLevel;
    }

    /**
     * Gets the sip uri.
     *
     * @return the sip uri
     */
    public String getSipUri() {
        return sipUri;
    }

    /**
     * Sets the sip uri.
     *
     * @param sipUri the new sip uri
     */
    public void setSipUri(String sipUri) {
        this.sipUri = sipUri;
    }

    /**
     * Checks if is followed.
     *
     * @return true, if is followed
     */
    public boolean isFollowed() {
        return followed;
    }

    /**
     * Sets the followed.
     *
     * @param followed the new followed
     */
    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

    /**
     * Checks if is accept.
     *
     * @return true, if is accept
     */
    public boolean isAccept() {
        return accept;
    }

    /**
     * Sets the accept.
     *
     * @param accept the new accept
     */
    public void setAccept(boolean accept) {
        this.accept = accept;
    }

    /**
     * Gets the followed time.
     *
     * @return the followed time
     */
    public String getFollowedTime() {
        return followedTime;
    }

    /**
     * Sets the followed time.
     *
     * @param followedTime the new followed time
     */
    public void setFollowedTime(String followedTime) {
        this.followedTime = followedTime;
    }

    /**
     * Gets the company.
     *
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the company.
     *
     * @param company the new company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Gets the intro.
     *
     * @return the intro
     */
    public String getIntro() {
        return intro;
    }

    /**
     * Sets the intro.
     *
     * @param intro the new intro
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the update time.
     *
     * @return the update time
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the update time.
     *
     * @param updateTime the new update time
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Gets the menu type.
     *
     * @return the menu type
     */
    public int getMenuType() {
        return menuType;
    }

    /**
     * Sets the menu type.
     *
     * @param menuType the new menu type
     */
    public void setMenuType(int menuType) {
        this.menuType = menuType;
    }

    /**
     * Gets the menu timestamp.
     *
     * @return the menu timestamp
     */
    public String getMenuTimestamp() {
        return menuTimestamp;
    }

    /**
     * Sets the menu timestamp.
     *
     * @param menuTimestamp the new menu timestamp
     */
    public void setMenuTimestamp(String menuTimestamp) {
        this.menuTimestamp = menuTimestamp;
    }

    /**
     * Gets the subscribe status.
     *
     * @return the subscribe status
     */
    public int getSubscribeStatus() {
        return subscribeStatus;
    }

    /**
     * Sets the subscribe status.
     *
     * @param subscribeStatus the new subscribe status
     */
    public void setSubscribeStatus(int subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
    }

    /**
     * Gets the qr code.
     *
     * @return the qr code
     */
    public String getQrCode() {
        return qrCode;
    }

    /**
     * Sets the qr code.
     *
     * @param qrCode the new qr code
     */
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    /**
     * Gets the active status.
     *
     * @return the active status
     */
    public int getActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the active status.
     *
     * @param activeStatus the new active status
     */
    public void setActiveStatus(int activeStatus) {
        this.activeStatus = activeStatus;
    }

    /**
     * Gets the tel.
     *
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the tel.
     *
     * @param tel the new tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the zip.
     *
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the zip.
     *
     * @param zip the new zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Gets the addr.
     *
     * @return the addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Sets the addr.
     *
     * @param addr the new addr
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * Gets the field.
     *
     * @return the field
     */
    public String getField() {
        return field;
    }

    /**
     * Sets the field.
     *
     * @param field the new field
     */
    public void setField(String field) {
        this.field = field;
    }
    
    /**
     * Gets the logo type.
     *
     * @return the logo type
     */
    public String getLogoType() {
        return logoType;
    }

    /**
     * Sets the logo type.
     *
     * @param logoType the new logo type
     */
    public void setLogoType(String logoType) {
        this.logoType = logoType;
    }

    /**
     * Gets the menu string.
     *
     * @return the menu string
     */
    public String getMenuString() {
        return menuString;
    }

    /**
     * Sets the menu string.
     *
     * @param menuString the new menu string
     */
    public void setMenuString(String menuString) {
        this.menuString = menuString;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuffer sbuffer = new StringBuffer();
        sbuffer.append("paUuid=").append(this.paUuid)
               .append(",name=").append(this.name)
               .append(",logo=").append(this.logo)
               .append(",recommendLevel=").append(this.recommendLevel)
               .append(",sipUri=").append(this.sipUri)
               .append(",followed=").append(this.followed)
               .append(",accept=").append(this.accept)
               .append(",followedTime=").append(this.followedTime)
               .append(",company=").append(this.company)
               .append(",intro=").append(this.intro)
               .append(",type=").append(this.type)
               .append(",updateTime=").append(this.updateTime)
               .append(",menuType=").append(this.menuType)
               .append(",menuTimestamp=").append(this.menuTimestamp)
               .append(",subscribeStatus=").append(this.subscribeStatus)
               .append(",qrCode=").append(this.qrCode)
               .append(",activeStatus=").append(this.activeStatus)
               .append(",tel=").append(this.tel)
               .append(",email=").append(this.email)
               .append(",zip=").append(this.zip)
               .append(",addr=").append(this.addr)
               .append(",field=").append(this.field)
               .append(",logoType=").append(this.logoType)
               .append(",menuString=").append(this.menuString)
        ;

        return sbuffer.toString();
    }
}
