package com.example.mcdriversmobile;

/**
 * Created by Galileo on 9/22/2017.
 */

public class Coordinates {

    private Double Lat;
    private Double Lon;
    private float Speed;

    public Coordinates() {
    }

    public Double getLat() {
        return Lat;
    }

    public Double getLon() {
        return Lon;
    }

    public void setLat(Double lat) {
        Lat = lat;
    }

    public void setLon(Double lon) {
        Lon = lon;
    }

    public void setSpeed(float speed) {
        Speed = speed;
    }

    public float getSpeed() {

        return Speed;
    }
}
