package com.ssh.service.cust.impl;

import com.ssh.dao.cust.CustDao;
import com.ssh.model.Customer;
import com.ssh.service.cust.CustService;
import com.ssh.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//客户信息
@Transactional
@Service("custService")
public class CustServiceImpl implements CustService {
    @Autowired
    private CustDao custDao;

    @Override
    public PageBean<Customer> findByPage(Integer currPage) {
        PageBean<Customer> pageBean = new PageBean<>();
        pageBean.setCurrPage(currPage);
        int pageSize =10;
        pageBean.setPageSize(pageSize);
        int totalCount = custDao.findCount();
        pageBean.setTotalCount(totalCount);
        double tc =totalCount;
        Double num = Math.ceil(tc/pageSize);
        pageBean.setCurrPage(num.intValue());
        int begin=(currPage-1)*pageSize;
        List<Customer> list = custDao.findByPage(begin,pageSize);
        pageBean.setList(list);
        return pageBean;
    }

//    新增
    @Override
    public void save(Customer customer) {
        custDao.save(customer);
    }

    @Override
    public Customer findById(int custId) {
        return custDao.findById(custId);
    }

    @Override
    public void update(Customer customer) {
        custDao.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        custDao.delete(customer);
    }
}
