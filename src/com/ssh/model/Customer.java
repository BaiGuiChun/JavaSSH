package com.ssh.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Customer {
    private int custId;
    private String cuname;
    private String phone;
    private String cardid;
    private String address;
    private String gender;

    @Id
    @Column(name = "CUST_ID")
    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    @Basic
    @Column(name = "CUNAME")
    public String getCuname() {
        return cuname;
    }

    public void setCuname(String cuname) {
        this.cuname = cuname;
    }

    @Basic
    @Column(name = "PHONE")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "CARDID")
    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    @Basic
    @Column(name = "ADDRESS")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "GENDER")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return custId == customer.custId &&
                Objects.equals(cuname, customer.cuname) &&
                Objects.equals(phone, customer.phone) &&
                Objects.equals(cardid, customer.cardid) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(gender, customer.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, cuname, phone, cardid, address, gender);
    }
}
