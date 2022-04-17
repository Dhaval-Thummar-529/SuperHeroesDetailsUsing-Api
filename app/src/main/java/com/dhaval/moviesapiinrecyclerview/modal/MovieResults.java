package com.dhaval.moviesapiinrecyclerview.modal;

import com.google.gson.annotations.SerializedName;

public class MovieResults {

    @SerializedName("name")
    private String name;

    @SerializedName("imageurl")
    private String imageUrl;

    @SerializedName("realname")
    private String realname;

    @SerializedName("team")
    private String team;

    @SerializedName("firstappearance")
    private String firstappearance;

    @SerializedName("createdby")
    private String createdby;

    @SerializedName("publisher")
    private String publisher;

    @SerializedName("bio")
    private String bio;

    public MovieResults(String name, String imageUrl, String realname, String team, String firstappearance, String createdby, String publisher, String bio) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.realname = realname;
        this.team = team;
        this.firstappearance = firstappearance;
        this.createdby = createdby;
        this.publisher = publisher;
        this.bio = bio;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getFirstappearance() {
        return firstappearance;
    }

    public void setFirstappearance(String firstappearance) {
        this.firstappearance = firstappearance;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
