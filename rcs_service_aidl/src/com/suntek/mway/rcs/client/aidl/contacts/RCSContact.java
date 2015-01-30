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
package com.suntek.mway.rcs.client.aidl.contacts;

import java.util.ArrayList;
import java.util.List;

import android.os.Parcel;
import android.os.Parcelable;

import com.suntek.mway.rcs.client.aidl.plugin.entity.profile.Profile;

/**
 * <p>Title: RCSContact class</p>
 * <p>
 * Description: The class <code>RCSContact</code> represents the informations
 * of RCS contact.
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
public class RCSContact extends Profile implements Parcelable {

    /** The id. */
    private long id = -1;

    /** The is rcs contact. */
    private boolean isRcsContact = false;

    /** The pinyin. */
    private String pinyin;

    /** The photo. */
    private byte[] photo;

    private String photoBase64;

    /**
     * Checks if is rcs contact.
     *
     * @return true, if is rcs contact
     */
    public boolean isRcsContact() {
        return isRcsContact;
    }

    /**
     * Sets the rcs contact.
     *
     * @param isRcsContact the new rcs contact
     */
    public void setRcsContact(boolean isRcsContact) {
        this.isRcsContact = isRcsContact;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the pinyin.
     *
     * @return the pinyin
     */
    public String getPinyin() {
        return pinyin;
    }

    /**
     * Sets the pinyin.
     *
     * @param pinyin the new pinyin
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    /**
     * Get photo
     * @return
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * Set photo
     * @param photo
     */
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    /**
     * Get photo base64 code
     * @return
     */
    public String getPhotoBase64() {
        return photoBase64;
    }

    /**
     * Set photo base64 code
     * @param photoBase64
     */
    public void setPhotoBase64(String photoBase64) {
        this.photoBase64 = photoBase64;
    }

    /**
       * Instantiates a new RCSContact.
       */
      public RCSContact()
      {}

      /**
       * Instantiates a new RCSContact.
       *
       * @param source the source
       */
      public RCSContact( Parcel source )
      {
          readFromParcel( source );
      }

      /**
     * The parcel describe contents, defaul is 0.
     *
     * @return the int
     */
    @Override
    public int describeContents()
    {
        return 0;
    }

    /**
     * Write the RCSContact entity to parcel stream. Pay attention to read and
     * write variables variables sequence should be consistent or not the
     * correct results
     *
     * @param dest the dest
     * @param flags the flags
     */
    @Override
    public void writeToParcel( Parcel dest, int flags )
    {
        super.writeToParcel( dest,flags );
        dest.writeLong( id );
        dest.writeInt( isRcsContact ? 1 : 0);
        dest.writeString( pinyin );

        dest.writeString(photoBase64);

        if( photo != null ) {
            dest.writeByteArray(photo);
        }
    }

    /**
     * Create the RCSContact entity from parcel stream. Pay attention to read and
     * write variables variables sequence should be consistent or not the
     * correct results
     *
     * @param source
     *            The parcel stream
     */
    public void readFromParcel( Parcel source )
    {
        super.readFromParcel( source );
        id = source.readLong();
        isRcsContact = source.readInt() == 1 ? true : false;
        pinyin = source.readString();

        photoBase64 = source.readString();

        if( photo != null ) {
            source.readByteArray(photo);
        }

    }

    /** The parcel creator. */
    public static final Parcelable.Creator<RCSContact>    CREATOR    = new Parcelable.Creator<RCSContact>() {
        @Override
        public RCSContact createFromParcel( Parcel source )
        {
            return new RCSContact( source );
        }

        @Override
        public RCSContact[] newArray( int size )
        {
            return new RCSContact[ size ];
        }
    };


    @Override
    public String toString() {
        int photoLen = 0;
        if( photo != null ) {
            photoLen = photo.length;
        }
        List<String> list = new ArrayList<String>();
        list.add("id="+id);
        list.add("isRcsContact="+isRcsContact);
        list.add("pinyin="+pinyin);
        list.add("photo.length="+photoLen);
        list.add("profile="+super.toString());
        return list.toString();
    }


}
