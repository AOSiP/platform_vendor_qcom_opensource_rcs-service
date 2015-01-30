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
 
package com.suntek.mway.rcs.client.api.plugin.entity.mcloudfile;

import java.util.Map;

import android.os.Parcel;
import android.os.Parcelable;

public class TransNode implements Parcelable
{
    private String id;
    private long completeSize;
    private String url;
    private String localPath;
    private TransType type;
    private FileNode file;
    private Status status;
    private boolean isSuccess;
    private String uploadID;
    private String batchID;
    private int speed;
    private int percent;
    private FileNode.FileType mode;
    private String param;
    private long order;
    private Result result;
    private Map<String, String> fields;

    public TransNode()
    {}

    public TransNode( Parcel source )
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
     * Write the mcloud result entity to parcel stream. Pay attention to read and
     * write variables variables sequence should be consistent or not the
     * correct results
     *
     * @param dest
     *            the dest parcel stream
     * @param flags
     *            the flags
     */
    @Override
    public void writeToParcel( Parcel dest, int flags )
    {
        dest.writeString( id );
        dest.writeString( url );
        dest.writeString( localPath );
        dest.writeString( param );
        dest.writeString( uploadID );
        dest.writeString( batchID );

        dest.writeLong( completeSize );
        dest.writeLong( order );
        dest.writeInt( speed );
        dest.writeInt( percent );

        dest.writeBooleanArray( new boolean[]{ isSuccess } );

        dest.writeInt( type.ordinal() );
        dest.writeInt( mode.ordinal() );
        dest.writeInt( status.ordinal() );

        dest.writeValue( file );
        dest.writeValue( result );

        dest.writeMap( fields );
    }

    /**
     * Create the mcloud result entity from parcel stream. Pay attention to read and
     * write variables variables sequence should be consistent or not the
     * correct results
     *
     * @param source
     *            The parcel stream
     */
    @SuppressWarnings( "unchecked" )
    public void readFromParcel( Parcel source )
    {
        id = source.readString();
        url = source.readString();
        localPath = source.readString();
        param = source.readString();
        uploadID = source.readString();
        batchID = source.readString();

        completeSize = source.readLong();
        order = source.readLong();
        speed = source.readInt();
        percent = source.readInt();

        isSuccess = source.createBooleanArray()[ 0 ];

        type = TransType.valueOf( source.readInt() );
        mode = FileNode.FileType.valueOf( source.readInt() );
        status = Status.valueOf( source.readInt() );

        file = ( FileNode )source.readValue( this.getClass().getClassLoader() );
        result = ( Result )source.readValue( this.getClass().getClassLoader() );

        fields = source.readHashMap( this.getClass().getClassLoader() );
    }

    /** The parcel creator. */
    public static final Parcelable.Creator<TransNode>    CREATOR    = new Parcelable.Creator<TransNode>() {
        @Override
        public TransNode createFromParcel( Parcel source )
        {
            return new TransNode( source );
        }

        @Override
        public TransNode[] newArray( int size )
        {
            return new TransNode[ size ];
        }
    };

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    public long getCompleteSize()
    {
        return completeSize;
    }

    public void setCompleteSize( long completeSize )
    {
        this.completeSize = completeSize;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl( String url )
    {
        this.url = url;
    }

    public String getLocalPath()
    {
        return localPath;
    }

    public void setLocalPath( String localPath )
    {
        this.localPath = localPath;
    }

    public TransType getType()
    {
        return type;
    }

    public void setType( TransType type )
    {
        this.type = type;
    }

    public FileNode getFile()
    {
        return file;
    }

    public void setFile( FileNode file )
    {
        this.file = file;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus( Status status )
    {
        this.status = status;
    }

    public boolean isSuccess()
    {
        return isSuccess;
    }

    public void setSuccess( boolean isSuccess )
    {
        this.isSuccess = isSuccess;
    }

    public String getUploadID()
    {
        return uploadID;
    }

    public void setUploadID( String uploadID )
    {
        this.uploadID = uploadID;
    }

    public String getBatchID()
    {
        return batchID;
    }

    public void setBatchID( String batchID )
    {
        this.batchID = batchID;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed( int speed )
    {
        this.speed = speed;
    }

    public int getPercent()
    {
        return percent;
    }

    public void setPercent( int percent )
    {
        this.percent = percent;
    }

    public FileNode.FileType getMode()
    {
        return mode;
    }

    public void setMode( FileNode.FileType mode )
    {
        this.mode = mode;
    }

    public String getParam()
    {
        return param;
    }

    public void setParam( String param )
    {
        this.param = param;
    }

    public long getOrder()
    {
        return order;
    }

    public void setOrder( long order )
    {
        this.order = order;
    }

    public Result getResult()
    {
        return result;
    }

    public void setResult( Result result )
    {
        this.result = result;
    }

    public Map<String, String> getFields()
    {
        return fields;
    }

    public void setFields( Map<String, String> fields )
    {
        this.fields = fields;
    }

    public static enum TransOper
    {
        NEW,

        OVER_WRITE,

        RESUME,

        GET_INFO,

        PAUSE;

        public static TransOper valueOf( int ordinal )
        {
            if( ordinal < 0 || ordinal >= values().length )
            {
                throw new IndexOutOfBoundsException( "Invalid ordinal" );
            }

            return values()[ ordinal ];
        }
    }

    public static enum TransType
    {
        UPLOAD,

        DOWNLOAD,

        DOWNLOADTHUMBNAIL,

        DOWNLOADURL,

        BACKUP,

        RESTORE,

        SHOOT;

        public static TransType valueOf( int ordinal )
        {
            if( ordinal < 0 || ordinal >= values().length )
            {
                throw new IndexOutOfBoundsException( "Invalid ordinal" );
            }

            return values()[ ordinal ];
        }
    }
}
