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
package com.suntek.mway.rcs.client.aidl.plugin;

import com.suntek.mway.rcs.client.aidl.plugin.callback.IPublicAccountCallbackAPI;
import com.suntek.mway.rcs.client.aidl.plugin.entity.pubacct.MsgContent;
import com.suntek.mway.rcs.client.aidl.plugin.entity.pubacct.PublicAccountReqEntity;
import com.suntek.mway.rcs.client.aidl.plugin.entity.pubacct.PublicAccountsDetail;
import com.suntek.mway.rcs.client.aidl.plugin.entity.pubacct.PublicAccounts;

/**
 * <p>Title: Public account api</p>
 * <p>Description: The public account api implemented by the plugin center, The client app will invoke the plugin center by this interface</p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: pci-suntek</p>
 * 
 * @author zrq
 * @version 1.0
 * 
 */
interface IPublicAccountAPI
{
    
    /**
     * follow some public account.
     *
     * @param uuid            the public account uuid
     * @return the account info will return by asynchronous callback, here only
     *         return invoke result if it has exception
     */
    boolean addSubscribe( String uuid );

    /**
     * cancel some followed public account.
     *
     * @param uuid            the public account uuid
     * @return the account info will return by asynchronous callback, here only
     *         return invoke result if it has exception
     */
    boolean cancelSubscribe( String uuid );

    /**
     * complain one public account.
     *
     * @param uuid            the public account uuid
     * @param reason            the reason of complaint
     * @param description            the description of complaint
     * @return the result of complaint will return by asynchronous callback,
     *         here only return invoke result if it has exception
     */
    boolean complainPublic( String uuid, String reason, String description, int type, String data );

    /**
     * query the public account history message.
     *
     * @param uuid            the public account uuid
     * @param timestamp            the begin query time
     * @param order            the query order, default is 0, 0 is asc, 1 is desc
     * @param pageSize            the query result page size
     * @param pageNum            the query result page number
     * @return the query result will return by asynchronous callback, here only
     *         return invoke result if it has exception
     */
    boolean getPreMessage( String uuid, String timestamp, int order, int pageSize, int pageNum );
    
    /**
     * query the public account detail info.
     *
     * @param uuid            the public account uuid
     * @return the query result will return by asynchronous callback, here only
     *         return invoke result if it has exception
     */
    boolean getPublicDetail( String uuid );

    /**
     * search the public account by keyword.
     *
     * @param keywords            the search keyword
     * @param pageSize            the query result page size
     * @param pageNum            the query result page number
     * @param order            the query result order, default is 0, 0 is desc order by the
     *            follow time; 1 is order by the public account name
     * @return the query result will return by asynchronous callback, here only
     *         return invoke result if it has exception
     */
    boolean getPublicList( String keywords, int pageSize, int pageNum, int order );
    
    /**
     * query the public account's menu info.
     *
     * @param uuid            the public account uuid
     * @return the query result will return by asynchronous callback, here only
     *         return invoke result if it has exception
     */
    boolean getPublicMenuInfo( String uuid );

    /**
     * query the user had follow public account.
     */
    boolean getUserSubscribePublicList();

    /**
     * parse response message to message content entity json string.
     *
     * @param xml            the response message body, content format is xml
     * @return the parse result, message content entity json string
     */
    MsgContent parseContentMessage( String xml );

    
    /**
     * register the public account callback handler
     * @param callback the public account callback handler
     */
    void registerCallback( IPublicAccountCallbackAPI callback );
    
    /**
     * unregister the registered public account callback handler
     * @param callback the public account callback handler
     */
    void unregisterCallback( IPublicAccountCallbackAPI callback );   
    
    /**
     * get recommend public account.
     *
     * @param type                the type
     * @param pageSize          the query result page size
     * @param pageNum           the query result page number
     * @return the query result of recommend public account
     */
    boolean getRecommendPublic(int type, int pagesize, int pagenum);
    
     /**
     * query the public account detail info from database cache.
     *
     * @param uuid            the public account uuid
     * @return the public accounts detail entity
     */
    PublicAccountsDetail getPublicDetailCache( String uuid );
    
    /**
     * query the user had follow public account.
     *
     * @param order            the query result order, default is 0, 0 is desc order by the
     *            follow time; 1 is order by the public account name
     * @param pageSize            the query result page size
     * @param pageNum            the query result page number
     * @return the list of public accounts entity
     */
    List<PublicAccounts> getUserSubscribePublicListCache( int order, int pageSize, int pageNum );
    
    /**
     * set accept status.
     *
     * @param uuid            the public account uuid
     * @param acceptStatus    the accept status  1:accept, 0:do not accept
     * @return the query result of recommend public account
     */
    boolean setAcceptStatus(String uuid, int acceptStatus);
}
