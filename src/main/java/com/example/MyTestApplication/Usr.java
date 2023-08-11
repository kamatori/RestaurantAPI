package com.example.MyTestApplication;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Usr {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "UNIQUEDISPLAYNAME")
    private String uniqueDisplayName;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "ZIPCODE")
    private Integer zipCode;

    @Column(name = "INTERESTINPEANUTALLERGY")
    private Boolean interestedInPeanutAllergies;

    @Column(name = "INTERESTINEGGALLERGY")
    private Boolean interestedInEggAllergies;

    @Column(name = "INTERESTINDAIRYALLERGY")
    private Boolean interestedInDairyAllergies;

    @Column(name = "REVIEW_STATUS")
    private ReviewStatus reviewStatus;

//    public String getUniqueDisplayName() {
//        return uniqueDisplayName;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public Integer getZipCode() {
//        return zipCode;
//    }
//
//    public Boolean getInterestedInPeanutAllergies() {
//        return interestedInPeanutAllergies;
//    }
//
//    public Boolean getInterestedInEggAllergies() {
//        return interestedInEggAllergies;
//    }
//
//    public Boolean getInterestedInDairyAllergies() {
//        return interestedInDairyAllergies;
//    }
//
//    public ReviewStatus getReviewStatus() {
//        return reviewStatus;
//    }
//
//    public void setUniqueDisplayName(String uniqueDisplayName) {
//        this.uniqueDisplayName = uniqueDisplayName;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public void setZipCode(Integer zipCode) {
//        this.zipCode = zipCode;
//    }
//
//    public void setInterestedInPeanutAllergies(Boolean interestedInPeanutAllergies) {
//        this.interestedInPeanutAllergies = interestedInPeanutAllergies;
//    }
//
//    public void setInterestedInEggAllergies(Boolean interestedInEggAllergies) {
//        this.interestedInEggAllergies = interestedInEggAllergies;
//    }
//
//    public void setInterestedInDairyAllergies(Boolean interestedInDairyAllergies) {
//        this.interestedInDairyAllergies = interestedInDairyAllergies;
//    }
//
//    public void setReviewStatus(ReviewStatus reviewStatus) {
//        this.reviewStatus = reviewStatus;
//    }
//
//    public Usr() {
//        this.uniqueDisplayName = uniqueDisplayName;
//        this.city = city;
//        this.state = state;
//        this.zipCode = zipCode;
//        this.interestedInPeanutAllergies = interestedInPeanutAllergies;
//        this.interestedInEggAllergies = interestedInEggAllergies;
//        this.interestedInDairyAllergies = interestedInDairyAllergies;
//        this.reviewStatus = reviewStatus;
//    }




}

