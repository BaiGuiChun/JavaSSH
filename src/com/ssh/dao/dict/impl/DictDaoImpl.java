package com.ssh.dao.dict.impl;

import com.ssh.dao.dict.DictDao;
import com.ssh.model.SysDictionaries;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("dictDao")
public class DictDaoImpl extends HibernateDaoSupport implements DictDao {
    @Override
    public int findCount() {
        String hql="select count(*) from SysDictionaries";
        List<Long> list = this.getHibernateTemplate().find(hql);
        if (list.size()>0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
//    分页查询字典
    public List<SysDictionaries> findByPage(int begin, int pageSize) {
        DetachedCriteria criteria = DetachedCriteria.forClass(SysDictionaries.class);
        List<SysDictionaries> list = this.getHibernateTemplate().findByCriteria(criteria,begin,pageSize);
        return list;
    }

//    新增
    @Override
    public void save(SysDictionaries sysDictionaries) {
        this.getHibernateTemplate().save(sysDictionaries);
    }

    @Override
    public SysDictionaries findById(int dictId) {
        return this.getHibernateTemplate().get(SysDictionaries.class,dictId);
    }

    @Override
    public void update(SysDictionaries sysDictionaries) {
        this.getHibernateTemplate().update(sysDictionaries);
    }

    @Override
    public void delete(SysDictionaries sysDictionaries) {
        this.getHibernateTemplate().delete(sysDictionaries);
    }
}
