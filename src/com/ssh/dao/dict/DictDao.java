package com.ssh.dao.dict;

import com.ssh.model.SysDictionaries;

import java.util.List;

public interface DictDao {
    int findCount();

    List<SysDictionaries> findByPage(int begin, int pageSize);

    void save(SysDictionaries sysDictionaries);

    SysDictionaries findById(int dictId);

    void update(SysDictionaries sysDictionaries);

    void delete(SysDictionaries sysDictionaries);
}
