/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CustomerReviews 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5463701254984546017L;
    private String iFrameURL;
    private Boolean hasReviews;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IFrameURL")
    public String getIFrameURL ( ) { 
        return this.iFrameURL;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IFrameURL")
    public void setIFrameURL (String value) { 
        this.iFrameURL = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("HasReviews")
    public Boolean getHasReviews ( ) { 
        return this.hasReviews;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("HasReviews")
    public void setHasReviews (Boolean value) { 
        this.hasReviews = value;
    }
 
}
 