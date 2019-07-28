package com.example.madridopen.model;

public class Organization {
    private String accesibility;
    private String services;
    private String schedule;
    private String organizationname;
    private String organizationdesc;


    // Getter Methods

    public String getAccesibility() {
        return accesibility;
    }

    public String getServices() {
        return services;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getOrganizationname() {
        return organizationname;
    }

    public String getOrganizationdesc() {
        return organizationdesc;
    }

    // Setter Methods

    public void setAccesibility(String accesibility) {
        this.accesibility = accesibility;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setOrganizationname(String organizationname) {
        this.organizationname = organizationname;
    }

    public void setOrganizationdesc(String organizationdesc) {
        this.organizationdesc = organizationdesc;
    }
}
