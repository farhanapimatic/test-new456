/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemSearchRequestMsg 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4690823164161988722L;
    private ItemSearch body;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("body")
    public ItemSearch getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("body")
    public void setBody (ItemSearch value) { 
        this.body = value;
    }
 
}
 