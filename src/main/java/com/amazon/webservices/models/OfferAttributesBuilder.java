/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class OfferAttributesBuilder {
    //the instance to build
    private OfferAttributes offerAttributes;

    /**
     * Default constructor to initialize the instance
     */
    public OfferAttributesBuilder() {
        offerAttributes = new OfferAttributes();
    }

    public OfferAttributesBuilder condition(String condition) {
        offerAttributes.setCondition(condition);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public OfferAttributes build() {
        return offerAttributes;
    }
}