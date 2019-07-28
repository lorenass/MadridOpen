package com.example.madridopen.model;

public class Address {
    private String area;
    private String locality;
    private String district;
    private String streetaddress;
    private String postalcode;


    // Getter Methods

    public String getArea() {
        return area;
    }

    public String getLocality() {
        return locality;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreetaddress() {
        return streetaddress;
    }

    public String getPostalcode() {
        return postalcode;
    }

    // Setter Methods

    public void setArea(String area) {
        this.area = area;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }
}