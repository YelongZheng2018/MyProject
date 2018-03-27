package com.myproject.service.user.impl;

import com.myproject.bean.user.User;
import com.myproject.dao.user.UserDAO;
import com.myproject.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public User queryUserById(int id) {
        return userDAO.queryUserById(id);
    }
}
