package com.micro.service.impl;

import com.micro.dao.UserMapper;
import com.micro.model.User;
import com.micro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper<User> userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public User getById(int id) {
        return userMapper.getById(id);
    }
}
