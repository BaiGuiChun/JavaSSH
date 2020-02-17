package com.ssh.dao.comm;

import com.ssh.model.Commodity;

import java.util.List;

public interface CommDao {
    int findCount();

    List<Commodity> findByPage(int begin, int pageSize);

    void save(Commodity commodity);

    Commodity findById(int commid);

    void update(Commodity commodity);

    void delete(Commodity commodity);

}
