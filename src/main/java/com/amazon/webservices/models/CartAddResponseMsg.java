/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CartAddResponseMsg 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4932305318365384935L;
    private CartAddResponse body;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("body")
    public CartAddResponse getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("body")
    public void setBody (CartAddResponse value) { 
        this.body = value;
    }
 
}
 