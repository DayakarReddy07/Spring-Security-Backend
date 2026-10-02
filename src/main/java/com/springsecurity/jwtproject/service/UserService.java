package com.springsecurity.jwtproject.service;

import com.springsecurity.jwtproject.dao.UserDao;
import com.springsecurity.jwtproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User registerNewUser(User user){
        return userDao.save(user);
    }

}
