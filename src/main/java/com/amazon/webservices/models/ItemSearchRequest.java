/*
 * AWSECommerceServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.amazon.webservices.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ItemSearchRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5402944561456372091L;
    private String actor;
    private String artist;
    private AvailabilityEnum availability;
    private List<AudienceRatingEnum> audienceRating;
    private String author;
    private String brand;
    private String browseNode;
    private String composer;
    private ConditionEnum condition;
    private String conductor;
    private String director;
    private Integer itemPage;
    private String keywords;
    private String manufacturer;
    private Integer maximumPrice;
    private String merchantId;
    private Integer minimumPrice;
    private Integer minPercentageOff;
    private String musicLabel;
    private String orchestra;
    private String power;
    private String publisher;
    private Object relatedItemPage;
    private List<String> relationshipType;
    private List<String> responseGroup;
    private String searchIndex;
    private String sort;
    private String title;
    private String releaseDate;
    private String includeReviewsSummary;
    private Integer truncateReviewsAt;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Actor")
    public String getActor ( ) { 
        return this.actor;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Actor")
    public void setActor (String value) { 
        this.actor = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Artist")
    public String getArtist ( ) { 
        return this.artist;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Artist")
    public void setArtist (String value) { 
        this.artist = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Availability")
    public AvailabilityEnum getAvailability ( ) { 
        return this.availability;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Availability")
    public void setAvailability (AvailabilityEnum value) { 
        this.availability = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AudienceRating")
    public List<AudienceRatingEnum> getAudienceRating ( ) { 
        return this.audienceRating;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AudienceRating")
    public void setAudienceRating (List<AudienceRatingEnum> value) { 
        this.audienceRating = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Author")
    public String getAuthor ( ) { 
        return this.author;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Author")
    public void setAuthor (String value) { 
        this.author = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Brand")
    public String getBrand ( ) { 
        return this.brand;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Brand")
    public void setBrand (String value) { 
        this.brand = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("BrowseNode")
    public String getBrowseNode ( ) { 
        return this.browseNode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("BrowseNode")
    public void setBrowseNode (String value) { 
        this.browseNode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Composer")
    public String getComposer ( ) { 
        return this.composer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Composer")
    public void setComposer (String value) { 
        this.composer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Condition")
    public ConditionEnum getCondition ( ) { 
        return this.condition;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Condition")
    public void setCondition (ConditionEnum value) { 
        this.condition = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Conductor")
    public String getConductor ( ) { 
        return this.conductor;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Conductor")
    public void setConductor (String value) { 
        this.conductor = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Director")
    public String getDirector ( ) { 
        return this.director;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Director")
    public void setDirector (String value) { 
        this.director = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ItemPage")
    public Integer getItemPage ( ) { 
        return this.itemPage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ItemPage")
    public void setItemPage (Integer value) { 
        this.itemPage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Keywords")
    public String getKeywords ( ) { 
        return this.keywords;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Keywords")
    public void setKeywords (String value) { 
        this.keywords = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Manufacturer")
    public String getManufacturer ( ) { 
        return this.manufacturer;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Manufacturer")
    public void setManufacturer (String value) { 
        this.manufacturer = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MaximumPrice")
    public Integer getMaximumPrice ( ) { 
        return this.maximumPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MaximumPrice")
    public void setMaximumPrice (Integer value) { 
        this.maximumPrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MerchantId")
    public String getMerchantId ( ) { 
        return this.merchantId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MerchantId")
    public void setMerchantId (String value) { 
        this.merchantId = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MinimumPrice")
    public Integer getMinimumPrice ( ) { 
        return this.minimumPrice;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MinimumPrice")
    public void setMinimumPrice (Integer value) { 
        this.minimumPrice = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MinPercentageOff")
    public Integer getMinPercentageOff ( ) { 
        return this.minPercentageOff;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MinPercentageOff")
    public void setMinPercentageOff (Integer value) { 
        this.minPercentageOff = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("MusicLabel")
    public String getMusicLabel ( ) { 
        return this.musicLabel;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("MusicLabel")
    public void setMusicLabel (String value) { 
        this.musicLabel = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Orchestra")
    public String getOrchestra ( ) { 
        return this.orchestra;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Orchestra")
    public void setOrchestra (String value) { 
        this.orchestra = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Power")
    public String getPower ( ) { 
        return this.power;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Power")
    public void setPower (String value) { 
        this.power = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Publisher")
    public String getPublisher ( ) { 
        return this.publisher;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Publisher")
    public void setPublisher (String value) { 
        this.publisher = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RelatedItemPage")
    public Object getRelatedItemPage ( ) { 
        return this.relatedItemPage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RelatedItemPage")
    public void setRelatedItemPage (Object value) { 
        this.relatedItemPage = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("RelationshipType")
    public List<String> getRelationshipType ( ) { 
        return this.relationshipType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("RelationshipType")
    public void setRelationshipType (List<String> value) { 
        this.relationshipType = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ResponseGroup")
    public List<String> getResponseGroup ( ) { 
        return this.responseGroup;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ResponseGroup")
    public void setResponseGroup (List<String> value) { 
        this.responseGroup = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("SearchIndex")
    public String getSearchIndex ( ) { 
        return this.searchIndex;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("SearchIndex")
    public void setSearchIndex (String value) { 
        this.searchIndex = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Sort")
    public String getSort ( ) { 
        return this.sort;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Sort")
    public void setSort (String value) { 
        this.sort = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Title")
    public void setTitle (String value) { 
        this.title = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ReleaseDate")
    public String getReleaseDate ( ) { 
        return this.releaseDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ReleaseDate")
    public void setReleaseDate (String value) { 
        this.releaseDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("IncludeReviewsSummary")
    public String getIncludeReviewsSummary ( ) { 
        return this.includeReviewsSummary;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("IncludeReviewsSummary")
    public void setIncludeReviewsSummary (String value) { 
        this.includeReviewsSummary = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("TruncateReviewsAt")
    public Integer getTruncateReviewsAt ( ) { 
        return this.truncateReviewsAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("TruncateReviewsAt")
    public void setTruncateReviewsAt (Integer value) { 
        this.truncateReviewsAt = value;
    }
 
}
 