/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;

public class RelatedItems145Builder {
    //the instance to build
    private RelatedItems145 relatedItems145;

    /**
     * Default constructor to initialize the instance
     */
    public RelatedItems145Builder() {
        relatedItems145 = new RelatedItems145();
    }

    public RelatedItems145Builder relationship(RelationshipEnum relationship) {
        relatedItems145.setRelationship(relationship);
        return this;
    }

    public RelatedItems145Builder relationshipType(String relationshipType) {
        relatedItems145.setRelationshipType(relationshipType);
        return this;
    }

    public RelatedItems145Builder relatedItemCount(Integer relatedItemCount) {
        relatedItems145.setRelatedItemCount(relatedItemCount);
        return this;
    }

    public RelatedItems145Builder relatedItemPageCount(Integer relatedItemPageCount) {
        relatedItems145.setRelatedItemPageCount(relatedItemPageCount);
        return this;
    }

    public RelatedItems145Builder relatedItemPage(Integer relatedItemPage) {
        relatedItems145.setRelatedItemPage(relatedItemPage);
        return this;
    }

    public RelatedItems145Builder relatedItem(List<RelatedItem144> relatedItem) {
        relatedItems145.setRelatedItem(relatedItem);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RelatedItems145 build() {
        return relatedItems145;
    }
}