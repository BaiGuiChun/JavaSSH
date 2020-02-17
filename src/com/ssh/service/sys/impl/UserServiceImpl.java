package com.ssh.service.sys.impl;

import com.ssh.dao.sys.UserDao;
import com.ssh.model.User;
import com.ssh.service.sys.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {
//    注入dao
    @Autowired
    private UserDao userDao;

//    public User login(String name){
//        return userDao.login(name);
//    }


    @Override
    public User login(User user) {
        User user1 = userDao.findByUser(user);
        return user1;
    }
}
