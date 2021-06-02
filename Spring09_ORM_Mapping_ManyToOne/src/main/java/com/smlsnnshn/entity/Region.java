package com.smlsnnshn.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Region extends BaseEntity{

    private String region;
    private String country;

    @OneToOne(mappedBy = "region")
    private Employee employee;

    public Region() {
    }

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
