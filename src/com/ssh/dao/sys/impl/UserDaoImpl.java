package com.ssh.dao.sys.impl;

import com.ssh.dao.sys.UserDao;
import com.ssh.model.User;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("userDao")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
//    @Autowired
//    private SessionFactory sessionFactory;
//    private Session session;
//    private String sql_login = "SELECT * FROM user WHERE username=?";
//
//    @Override
//    public User login(String name) {
//        session=sessionFactory.getCurrentSession();
//        SQLQuery sqlQuery = session.createSQLQuery(sql_login).addEntity(User.class);
//        sqlQuery.setString(0,name);
//        User user = (User) sqlQuery.uniqueResult();
//        return user;
//    }


    @Override
    public User findByUser(User user) {
        String hql="from User where username = ? and password = ?";

        List<User> list = this.getHibernateTemplate().find(hql,user.getUsername(),user.getPassword());

        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
