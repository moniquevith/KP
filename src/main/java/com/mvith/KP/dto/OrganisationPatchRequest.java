package com.mvith.KP.dto;

public class OrganisationPatchRequest {

    private String name; 
    private String description; 
    private String email; 
    private String phone_number; 
    private String location; 
    private String website;

    public String getName() {
        return name; 
    }

    public void setName(String name) {
        this.name = name; 
    }

    public String getDescription() {
        return description; 
    }

    public void setDescription(String description) {
        this.description = description; 
    }

    public String getEmail() {
        return email; 
    }

    public void setEmail(String email) {
        this.email = email; 
    }

    public String getPhone_number() {
        return phone_number; 
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
