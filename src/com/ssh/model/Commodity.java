package com.ssh.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Commodity {
    private int commid;
    private String coname;
    private String company;
    private String plaofo;
    private String price;

    @Id
    @Column(name = "COMMID")
    public int getCommid() {
        return commid;
    }

    public void setCommid(int commid) {
        this.commid = commid;
    }

    @Basic
    @Column(name = "CONAME")
    public String getConame() {
        return coname;
    }

    public void setConame(String coname) {
        this.coname = coname;
    }

    @Basic
    @Column(name = "COMPANY")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "PLAOFO")
    public String getPlaofo() {
        return plaofo;
    }

    public void setPlaofo(String plaofo) {
        this.plaofo = plaofo;
    }

    @Basic
    @Column(name = "PRICE")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return commid == commodity.commid &&
                Objects.equals(coname, commodity.coname) &&
                Objects.equals(company, commodity.company) &&
                Objects.equals(plaofo, commodity.plaofo) &&
                Objects.equals(price, commodity.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commid, coname, company, plaofo, price);
    }
}
