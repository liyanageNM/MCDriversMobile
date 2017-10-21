package com.example.mcdriversmobile;

/**
 * Created by Galileo on 10/18/2017.
 */

public class MCDrivers {
    @com.google.gson.annotations.SerializedName("id")
    private String cId;

    @com.google.gson.annotations.SerializedName("DriverId")
    private String mdriverid;

    @com.google.gson.annotations.SerializedName("NIC")
    private String mnic;

    @com.google.gson.annotations.SerializedName("DrivingLicenceID")
    private String mlicence;

    @com.google.gson.annotations.SerializedName("DriverName")
    private String mdrivername;

    @com.google.gson.annotations.SerializedName("DriverAge")
    private int mdriverage;

    @com.google.gson.annotations.SerializedName("ContactNo")
    private String mcontact;

    @com.google.gson.annotations.SerializedName("DriverStatus")
    private String mstatus;

    public MCDrivers() {
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof MCDrivers && ((MCDrivers) o).cId == cId;
    }

    public MCDrivers(String mdriverid, String mnic, String mlicence, String mdrivername, int mdriverage, String mcontact, String mstatus) {
        this.mdriverid = mdriverid;
        this.mnic = mnic;
        this.mlicence = mlicence;
        this.mdrivername = mdrivername;
        this.mdriverage = mdriverage;
        this.mcontact = mcontact;
        this.mstatus = mstatus;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getMdriverid() {
        return mdriverid;
    }

    public void setMdriverid(String mdriverid) {
        this.mdriverid = mdriverid;
    }

    public String getMnic() {
        return mnic;
    }

    public void setMnic(String mnic) {
        this.mnic = mnic;
    }

    public String getMlicence() {
        return mlicence;
    }

    public void setMlicence(String mlicence) {
        this.mlicence = mlicence;
    }

    public String getMdrivername() {
        return mdrivername;
    }

    public void setMdrivername(String mdrivername) {
        this.mdrivername = mdrivername;
    }

    public int getMdriverage() {
        return mdriverage;
    }

    public void setMdriverage(int mdriverage) {
        this.mdriverage = mdriverage;
    }

    public String getMcontact() {
        return mcontact;
    }

    public void setMcontact(String mcontact) {
        this.mcontact = mcontact;
    }

    public String getMstatus() {
        return mstatus;
    }

    public void setMstatus(String mstatus) {
        this.mstatus = mstatus;
    }
}
