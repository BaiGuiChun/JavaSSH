package com.ssh.util;

import java.io.Serializable;

public class Commodity implements Serializable {
    private int commid;
    private String name;
    private String company;
    private String plaofo;
    private String price;

    public int getCommid() {
        return commid;
    }

    public void setCommid(int commid) {
        this.commid = commid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPlaofo() {
        return plaofo;
    }

    public void setPlaofo(String plaofo) {
        this.plaofo = plaofo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
