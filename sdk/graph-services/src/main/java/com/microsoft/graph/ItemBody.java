/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.graph;

/**
 * The type Item Body.
*/
public class ItemBody extends ODataBaseEntity {

    public ItemBody(){
        setODataType("#Microsoft.Graph.ItemBody");
    }

    private String ContentType;

    /**
    * Gets the Content Type.
    *
    * @return the String
    */
    public String getContentType() {
        return this.ContentType; 
    }

    /**
    * Sets the Content Type.
    *
    * @param value the String
    */
    public void setContentType(String value) { 
        this.ContentType = value; 
    }

    private String Content;

    /**
    * Gets the Content.
    *
    * @return the String
    */
    public String getContent() {
        return this.Content; 
    }

    /**
    * Sets the Content.
    *
    * @param value the String
    */
    public void setContent(String value) { 
        this.Content = value; 
    }
}
