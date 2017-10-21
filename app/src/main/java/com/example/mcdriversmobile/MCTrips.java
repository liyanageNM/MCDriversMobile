package com.example.mcdriversmobile;

/**
 * Created by Galileo on 10/18/2017.
 */

public class MCTrips {
    @com.google.gson.annotations.SerializedName("id")
    private String cId;

    @com.google.gson.annotations.SerializedName("TripID")
    private String mtripid;

    @com.google.gson.annotations.SerializedName("RouteNo")
    private String mrouteno;

    @com.google.gson.annotations.SerializedName("DriverNo")
    private String mdriverno;

    @com.google.gson.annotations.SerializedName("Polythene")
    private String mpolythene;

    @com.google.gson.annotations.SerializedName("Plastic")
    private String mplastic;

    @com.google.gson.annotations.SerializedName("Paper")
    private String mpaper;

    @com.google.gson.annotations.SerializedName("Cardboard")
    private String mcardboard;

    @com.google.gson.annotations.SerializedName("Food")
    private int mfood;

    @com.google.gson.annotations.SerializedName("Other")
    private String mother;

    @com.google.gson.annotations.SerializedName("Status")
    private int mstatus;

    public MCTrips() {
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof MCTrips && ((MCTrips) o).cId == cId;
    }

    public MCTrips(String mtripid, String mrouteno, String mdriverno, String mpolythene, String mplastic, String mpaper, String mcardboard, int mfood, String mother, int mstatus) {
        this.mtripid = mtripid;
        this.mrouteno = mrouteno;
        this.mdriverno = mdriverno;
        this.mpolythene = mpolythene;
        this.mplastic = mplastic;
        this.mpaper = mpaper;
        this.mcardboard = mcardboard;
        this.mfood = mfood;
        this.mother = mother;
        this.mstatus = mstatus;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getMtripid() {
        return mtripid;
    }

    public void setMtripid(String mtripid) {
        this.mtripid = mtripid;
    }

    public String getMrouteno() {
        return mrouteno;
    }

    public void setMrouteno(String mrouteno) {
        this.mrouteno = mrouteno;
    }

    public String getMdriverno() {
        return mdriverno;
    }

    public void setMdriverno(String mdriverno) {
        this.mdriverno = mdriverno;
    }

    public String getMpolythene() {
        return mpolythene;
    }

    public void setMpolythene(String mpolythene) {
        this.mpolythene = mpolythene;
    }

    public String getMplastic() {
        return mplastic;
    }

    public void setMplastic(String mplastic) {
        this.mplastic = mplastic;
    }

    public String getMpaper() {
        return mpaper;
    }

    public void setMpaper(String mpaper) {
        this.mpaper = mpaper;
    }

    public String getMcardboard() {
        return mcardboard;
    }

    public void setMcardboard(String mcardboard) {
        this.mcardboard = mcardboard;
    }

    public int getMfood() {
        return mfood;
    }

    public void setMfood(int mfood) {
        this.mfood = mfood;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public int getMstatus() {
        return mstatus;
    }

    public void setMstatus(int mstatus) {
        this.mstatus = mstatus;
    }
}
