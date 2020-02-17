package com.ssh.service.comm.impl;

import com.ssh.dao.comm.CommDao;
import com.ssh.model.Commodity;
import com.ssh.service.comm.CommService;
import com.ssh.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("commService")
public class CommServiceImpl implements CommService {
    @Autowired
    private CommDao commDao;

    @Override
    public PageBean<Commodity> findByPage(Integer currPage) {
        PageBean<Commodity> pageBean = new PageBean<>();
        //        封装当前页数
        pageBean.setCurrPage(currPage);
//        每页显示记录数
        int pageSize =  10;
        pageBean.setPageSize(pageSize);
//        数据库总记录数
        int totalCount = commDao.findCount();
        pageBean.setTotalCount(totalCount);
//        总页数
        double tc = totalCount;
        Double num = Math.ceil(tc/pageSize);
        pageBean.setCurrPage(num.intValue());
//        每页显示的数据
        int begin=(currPage-1)*pageSize;
        List<Commodity> list =commDao.findByPage(begin,pageSize);
        pageBean.setList(list);
        return pageBean;
    }

    @Override
    public void save(Commodity commodity) {
        commDao.save(commodity);
    }

    @Override
    public Commodity findById(int commid) {
        return commDao.findById(commid);
    }

    @Override
    public void update(Commodity commodity) {
        commDao.update(commodity);
    }

    @Override
    public void delete(Commodity commodity) {
        commDao.delete(commodity);
    }
}
