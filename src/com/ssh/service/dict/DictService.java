package com.ssh.service.dict;

import com.ssh.model.SysDictionaries;
import com.ssh.util.PageBean;

public interface DictService {
    PageBean<SysDictionaries> findByPage(Integer currPage);

    void save(SysDictionaries sysDictionaries);

    SysDictionaries findById(int dictId);

    void update(SysDictionaries sysDictionaries);

    void delete(SysDictionaries sysDictionaries);
}
