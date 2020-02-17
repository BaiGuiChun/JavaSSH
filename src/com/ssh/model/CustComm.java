package com.ssh.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cust_comm", schema = "ssh", catalog = "")
public class CustComm {
    private int ccId;
    private Integer custId;
    private Integer commId;
    private Integer state;

    @Id
    @Column(name = "CC_ID")
    public int getCcId() {
        return ccId;
    }

    public void setCcId(int ccId) {
        this.ccId = ccId;
    }

    @Basic
    @Column(name = "CUST_ID")
    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    @Basic
    @Column(name = "COMM_ID")
    public Integer getCommId() {
        return commId;
    }

    public void setCommId(Integer commId) {
        this.commId = commId;
    }

    @Basic
    @Column(name = "STATE")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustComm custComm = (CustComm) o;
        return ccId == custComm.ccId &&
                Objects.equals(custId, custComm.custId) &&
                Objects.equals(commId, custComm.commId) &&
                Objects.equals(state, custComm.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ccId, custId, commId, state);
    }
}
