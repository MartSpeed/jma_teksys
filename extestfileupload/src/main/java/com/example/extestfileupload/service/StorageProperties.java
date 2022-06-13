package com.example.extestfileupload.service;


import org.springframework.boot.context.properties.ConfigurationProperties;

// configuration and set location for properties
// just for out storage
@ConfigurationProperties
public class StorageProperties {
    //
    private String location = "upload-location";

    // getters/setters
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
