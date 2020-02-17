package com.ssh.dao.cust.impl;

import com.ssh.dao.cust.CustDao;
import com.ssh.model.Customer;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("custDao")
public class CustDaoImpl extends HibernateDaoSupport implements CustDao {
    @Override
    public int findCount() {
        String hql="select count(*) from Customer ";
        List<Long> list = this.getHibernateTemplate().find(hql);
        if (list.size()>0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
    public List<Customer> findByPage(int begin, int pageSize) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
        List<Customer> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
        return list;
    }

    @Override
    public void save(Customer customer) {
        this.getHibernateTemplate().save(customer);
    }

    @Override
    public Customer findById(int custId) {
        return this.getHibernateTemplate().get(Customer.class,custId);
    }

    @Override
    public void update(Customer customer) {
        this.getHibernateTemplate().update(customer);
    }

    @Override
    public void delete(Customer customer) {
        this.getHibernateTemplate().delete(customer);
    }
}
