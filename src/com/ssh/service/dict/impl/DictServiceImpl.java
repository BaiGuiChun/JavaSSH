package com.ssh.service.dict.impl;

import com.ssh.dao.dict.DictDao;
import com.ssh.model.SysDictionaries;
import com.ssh.service.dict.DictService;
import com.ssh.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("dictService")
public class DictServiceImpl implements DictService {
    @Autowired
    private DictDao dictDao;

    @Override
//    分页查询
    public PageBean<SysDictionaries> findByPage(Integer currPage) {
        PageBean<SysDictionaries> pageBean = new PageBean<SysDictionaries>();
//        封装当前页数
        pageBean.setCurrPage(currPage);
//        每页显示记录数
        int pageSize =  10;
        pageBean.setPageSize(pageSize);
//        数据库总记录数
        int totalCount = dictDao.findCount();
        pageBean.setTotalCount(totalCount);
//        总页数
        double tc = totalCount;
        Double num = Math.ceil(tc/pageSize);
        pageBean.setCurrPage(num.intValue());
//        每页显示的数据
        int begin=(currPage-1)*pageSize;
        List<SysDictionaries> list = dictDao.findByPage(begin,pageSize);
        pageBean.setList(list);
        return pageBean;
    }

//    新增
    @Override
    public void save(SysDictionaries sysDictionaries) {
        dictDao.save(sysDictionaries);
    }

    @Override
    public SysDictionaries findById(int dictId) {
        return dictDao.findById(dictId);
    }

    @Override
    public void update(SysDictionaries sysDictionaries) {
        dictDao.update(sysDictionaries);
    }

    @Override
    public void delete(SysDictionaries sysDictionaries) {
        dictDao.delete(sysDictionaries);
    }
}
