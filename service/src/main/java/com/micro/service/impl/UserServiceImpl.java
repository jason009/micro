package com.micro.service.impl;

import com.micro.dao.UserMapper;
import com.micro.model.User;
import com.micro.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
