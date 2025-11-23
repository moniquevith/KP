package com.mvith.KP.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name = "organisation")
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; 
    private String description; 
    private String email; 
    private String phone_number; 
    private String location; 
    private String website; 

    public Organisation() {}

    public Organisation(String name, String description, String email, String phone_number, String location, String website) {
        this.name = name; 
        this.description = description; 
        this.email = email; 
        this.phone_number = phone_number; 
        this.location = location;
        this.website = website; 
    }

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
