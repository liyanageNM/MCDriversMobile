package com.example.mcdriversmobile;

/**
 * Created by Galileo on 10/18/2017.
 */

public class MCVehicles {
    @com.google.gson.annotations.SerializedName("id")
    private String cId;

    @com.google.gson.annotations.SerializedName("TableID")
    private String mtableid;

    @com.google.gson.annotations.SerializedName("VehicleNo")
    private String mvehicleno;

    @com.google.gson.annotations.SerializedName("Capacity")
    private String mcapacity;

    @com.google.gson.annotations.SerializedName("Type")
    private String mtype;

    @com.google.gson.annotations.SerializedName("VehicleStatus")
    private String mstatus;

    public MCVehicles() {
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof MCDrivers && ((MCVehicles) o).cId == cId;
    }

    public MCVehicles(String mtableid, String mvehicleno, String mcapacity, String mtype, String mstatus) {
        this.mtableid = mtableid;
        this.mvehicleno = mvehicleno;
        this.mcapacity = mcapacity;
        this.mtype = mtype;
        this.mstatus = mstatus;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getMtableid() {
        return mtableid;
    }

    public void setMtableid(String mtableid) {
        this.mtableid = mtableid;
    }

    public String getMvehicleno() {
        return mvehicleno;
    }

    public void setMvehicleno(String mvehicleno) {
        this.mvehicleno = mvehicleno;
    }

    public String getMcapacity() {
        return mcapacity;
    }

    public void setMcapacity(String mcapacity) {
        this.mcapacity = mcapacity;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public String getMstatus() {
        return mstatus;
    }

    public void setMstatus(String mstatus) {
        this.mstatus = mstatus;
    }
}
