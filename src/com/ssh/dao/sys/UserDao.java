package com.ssh.dao.sys;

import com.ssh.model.User;

public interface UserDao {
    User findByUser(User user);
//    User login(String name);
}
