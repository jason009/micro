package com.micro.model.impl;

import com.micro.model.User;
import com.micro.model.UserMapper;
import com.micro.model.UserServic;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserServic {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
