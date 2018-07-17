/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class PackageDimensionsBuilder {
    //the instance to build
    private PackageDimensions packageDimensions;

    /**
     * Default constructor to initialize the instance
     */
    public PackageDimensionsBuilder() {
        packageDimensions = new PackageDimensions();
    }

    public PackageDimensionsBuilder height(DecimalWithUnits height) {
        packageDimensions.setHeight(height);
        return this;
    }

    public PackageDimensionsBuilder length(DecimalWithUnits length) {
        packageDimensions.setLength(length);
        return this;
    }

    public PackageDimensionsBuilder weight(DecimalWithUnits weight) {
        packageDimensions.setWeight(weight);
        return this;
    }

    public PackageDimensionsBuilder width(DecimalWithUnits width) {
        packageDimensions.setWidth(width);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PackageDimensions build() {
        return packageDimensions;
    }
}