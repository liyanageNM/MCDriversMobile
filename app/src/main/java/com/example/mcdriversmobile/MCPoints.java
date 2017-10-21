package com.example.mcdriversmobile;

/**
 * Created by Galileo on 10/18/2017.
 */

public class MCPoints {
    @com.google.gson.annotations.SerializedName("id")
    private String cId;

    @com.google.gson.annotations.SerializedName("TableID")
    private String mtableidu;

    @com.google.gson.annotations.SerializedName("RouteNo")
    private String mrouteno;

    @com.google.gson.annotations.SerializedName("PointLat")
    private String mpointlat;

    @com.google.gson.annotations.SerializedName("PointLon")
    private String mpointlon;

    public MCPoints() {
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof MCPoints && ((MCPoints) o).cId == cId;
    }

    public MCPoints(String mtableidu, String mrouteno, String mpointlat, String mpointlon) {
        this.mtableidu = mtableidu;
        this.mrouteno = mrouteno;
        this.mpointlat = mpointlat;
        this.mpointlon = mpointlon;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getMtableidu() {
        return mtableidu;
    }

    public void setMtableidu(String mtableidu) {
        this.mtableidu = mtableidu;
    }

    public String getMrouteno() {
        return mrouteno;
    }

    public void setMrouteno(String mrouteno) {
        this.mrouteno = mrouteno;
    }

    public String getMpointlat() {
        return mpointlat;
    }

    public void setMpointlat(String mpointlat) {
        this.mpointlat = mpointlat;
    }

    public String getMpointlon() {
        return mpointlon;
    }

    public void setMpointlon(String mpointlon) {
        this.mpointlon = mpointlon;
    }
}
