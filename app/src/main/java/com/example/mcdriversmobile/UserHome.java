package com.example.mcdriversmobile;

/**
 * Created by Galileo on 10/18/2017.
 */

public class UserHome {
    @com.google.gson.annotations.SerializedName("id")
    private String cId;

    @com.google.gson.annotations.SerializedName("Username")
    private String musername;

    @com.google.gson.annotations.SerializedName("HomeLat")
    private String mhomeLat;

    @com.google.gson.annotations.SerializedName("HomeLon")
    private String mhomeLon;

    @com.google.gson.annotations.SerializedName("Point1Lat")
    private String mp1Lat;

    @com.google.gson.annotations.SerializedName("Point1Lon")
    private String mp1Lon;

    @com.google.gson.annotations.SerializedName("Point2Lat")
    private String mp2Lat;

    @com.google.gson.annotations.SerializedName("Point2Lon")
    private String mp2Lon;

    @com.google.gson.annotations.SerializedName("RouteId")
    private int mroute;

    public UserHome(){}

    @Override
    public boolean equals(Object o) {
        return o instanceof UserHome && ((UserHome) o).cId == cId;
    }

    public UserHome(String musername, String mhomeLat, String mhomeLon, String mp1Lat, String mp1Lon, String mp2Lat, String mp2Lon, int mroute) {
        this.musername = musername;
        this.mhomeLat = mhomeLat;
        this.mhomeLon = mhomeLon;
        this.mp1Lat = mp1Lat;
        this.mp1Lon = mp1Lon;
        this.mp2Lat = mp2Lat;
        this.mp2Lon = mp2Lon;
        this.mroute = mroute;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getMusername() {
        return musername;
    }

    public void setMusername(String musername) {
        this.musername = musername;
    }

    public String getMhomeLat() {
        return mhomeLat;
    }

    public void setMhomeLat(String mhomeLat) {
        this.mhomeLat = mhomeLat;
    }

    public String getMhomeLon() {
        return mhomeLon;
    }

    public void setMhomeLon(String mhomeLon) {
        this.mhomeLon = mhomeLon;
    }

    public String getMp1Lat() {
        return mp1Lat;
    }

    public void setMp1Lat(String mp1Lat) {
        this.mp1Lat = mp1Lat;
    }

    public String getMp1Lon() {
        return mp1Lon;
    }

    public void setMp1Lon(String mp1Lon) {
        this.mp1Lon = mp1Lon;
    }

    public String getMp2Lat() {
        return mp2Lat;
    }

    public void setMp2Lat(String mp2Lat) {
        this.mp2Lat = mp2Lat;
    }

    public String getMp2Lon() {
        return mp2Lon;
    }

    public void setMp2Lon(String mp2Lon) {
        this.mp2Lon = mp2Lon;
    }

    public int getMroute() {
        return mroute;
    }

    public void setMroute(int mroute) {
        this.mroute = mroute;
    }
}
