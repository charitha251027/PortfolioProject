
package com.portfolio.app.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String Userid;
    private String name;
    private String email;

    private List<Holding> holdings;

    public User(String Userid, String name, String email) {

        this.Userid = Userid;
        this.name = name;
        this.email = email;

        holdings = new ArrayList<>();
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

    public void addHolding(Holding holding) {
        holdings.add(holding);
    }

    public List<Holding> getHoldings() {
        return holdings;
    }

    public void display() {
        System.out.println("User ID: " + Userid);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
 