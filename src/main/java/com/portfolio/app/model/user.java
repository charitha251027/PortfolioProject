package com.portfolio.app.model;

public class User {

    private String Userid;
    private String name;
    private String email;

    public User(String Userid, String name, String email) {
        this.Userid = Userid;
        this.name = name;
        this.email = email;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String userid) {
        this.Userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}