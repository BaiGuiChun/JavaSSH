package com.ssh.dao.comm.impl;

import com.ssh.dao.comm.CommDao;
import com.ssh.model.Commodity;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("commDao")
public class CommDaoImpl extends HibernateDaoSupport implements CommDao {
    @Override
    public int findCount() {
        String hql="select count(*) from Commodity";
        List<Long> list = this.getHibernateTemplate().find(hql);
        if (list.size()>0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
    public List<Commodity> findByPage(int begin, int pageSize) {
        DetachedCriteria criteria = DetachedCriteria.forClass(Commodity.class);
        List<Commodity> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
        return list;
    }

    @Override
    public void save(Commodity commodity) {
        this.getHibernateTemplate().save(commodity);
    }

    @Override
    public Commodity findById(int commid) {
        return this.getHibernateTemplate().get(Commodity.class,commid);
    }

    @Override
    public void update(Commodity commodity) {
        this.getHibernateTemplate().update(commodity);
    }

    @Override
    public void delete(Commodity commodity) {
        this.getHibernateTemplate().delete(commodity);
    }
}
