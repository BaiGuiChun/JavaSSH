package com.ssh.service.comm;

import com.ssh.model.Commodity;
import com.ssh.util.PageBean;

public interface CommService {
    PageBean<Commodity> findByPage(Integer currPage);

    void save(Commodity commodity);

    Commodity findById(int commid);

    void update(Commodity commodity);

    void delete(Commodity commodity);

}
