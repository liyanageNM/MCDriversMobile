package com.example.mcdriversmobile;

/**
 * Created by Galileo on 10/18/2017.
 */

public class MCRoutes {
    @com.google.gson.annotations.SerializedName("id")
    private String cId;

    @com.google.gson.annotations.SerializedName("RouteNo")
    private int mrouteno;

    @com.google.gson.annotations.SerializedName("VehicleNo")
    private String mvegicleno;

    public MCRoutes() {
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof MCRoutes && ((MCRoutes) o).cId == cId;
    }

    public MCRoutes(int mrouteno, String mvegicleno) {
        this.mrouteno = mrouteno;
        this.mvegicleno = mvegicleno;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public int getMrouteno() {
        return mrouteno;
    }

    public void setMrouteno(int mrouteno) {
        this.mrouteno = mrouteno;
    }

    public String getMvegicleno() {
        return mvegicleno;
    }

    public void setMvegicleno(String mvegicleno) {
        this.mvegicleno = mvegicleno;
    }
}
