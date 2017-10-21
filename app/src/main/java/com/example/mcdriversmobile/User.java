package com.example.mcdriversmobile;

/**
 * Created by Galileo on 9/12/2017.
 */

public class User {
    @com.google.gson.annotations.SerializedName("id")
    private String cId;

    @com.google.gson.annotations.SerializedName("UserName")
    private String musername;

    @com.google.gson.annotations.SerializedName("Password")
    private String mpassword;

    @com.google.gson.annotations.SerializedName("Email")
    private String memail;

    @com.google.gson.annotations.SerializedName("Name")
    private String mname;

    @com.google.gson.annotations.SerializedName("Contact")
    private String mcontact;

    @com.google.gson.annotations.SerializedName("Phone1")
    private String mphone1;

    @com.google.gson.annotations.SerializedName("Phone2")
    private String mphone2;

    @com.google.gson.annotations.SerializedName("Phone3")
    private String mphone3;

    public User() {

    }

    public String getId() {
        return cId;
    }

    public final void setId(String id) {
        cId = id;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof User && ((User) o).cId == cId;
    }



    public String getMusername() {
        return musername;
    }

    public void setMusername(String musername) {
        this.musername = musername;
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword;
    }

    public String getMemail() {
        return memail;
    }

    public void setMemail(String memail) {
        this.memail = memail;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMcontact() {
        return mcontact;
    }

    public void setMcontact(String mcontact) {
        this.mcontact = mcontact;
    }

    public String getMphone1() {
        return mphone1;
    }

    public void setMphone1(String mphone1) {
        this.mphone1 = mphone1;
    }

    public String getMphone2() {
        return mphone2;
    }

    public void setMphone2(String mphone2) {
        this.mphone2 = mphone2;
    }

    public String getMphone3() {
        return mphone3;
    }

    public void setMphone3(String mphone3) {
        this.mphone3 = mphone3;
    }

    public User(String musername, String mpassword, String memail, String mname, String mcontact, String mphone1, String mphone2, String mphone3) {
        this.setMusername(musername);
        this.setMpassword(mpassword);
        this.setMemail(memail);
        this.setMname(mname);
        this.setMcontact(mcontact);
        this.setMphone1(mphone1);
        this.setMphone2(mphone2);
        this.setMphone3(mphone3);
    }

    public User(String musername, String mpassword, String memail, String mname, String mcontact) {
        this.musername = musername;
        this.mpassword = mpassword;
        this.memail = memail;
        this.mname = mname;
        this.mcontact = mcontact;
    }

}
