/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.office365.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.office365.odata.interfaces.*;
import com.microsoft.office365.outlook.services.*;
import static com.microsoft.office365.odata.Helpers.serializeToJsonByteArray;

public class UserOperations extends ODataOperations {

	 public UserOperations(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent);
    }
			
	public ListenableFuture<Integer> sendMail(Message message, Boolean saveToSentItems) {
        final SettableFuture<Integer> result = SettableFuture.create();

		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("Message", message);
		map.put("SaveToSentItems", saveToSentItems);
		

        ListenableFuture<byte[]> future = oDataExecute("SendMail", serializeToJsonByteArray(map, getResolver()), HttpVerb.POST);
		EntityFetcherHelper.addEntityResultCallback(result,future,getResolver(),Integer.class);

        return result;
    }
}