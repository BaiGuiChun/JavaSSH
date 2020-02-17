package com.ssh.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sys_dictionaries", schema = "ssh", catalog = "")
public class SysDictionaries {
    private int dictId;
    private String name;
    private String bz;
    private String parentId;

    @Id
    @Column(name = "DICT_ID")
    public int getDictId() {
        return dictId;
    }

    public void setDictId(int dictId) {
        this.dictId = dictId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "BZ")
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Basic
    @Column(name = "PARENT_ID")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysDictionaries that = (SysDictionaries) o;
        return dictId == that.dictId &&
                Objects.equals(name, that.name) &&
                Objects.equals(bz, that.bz) &&
                Objects.equals(parentId, that.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictId, name, bz, parentId);
    }
}
