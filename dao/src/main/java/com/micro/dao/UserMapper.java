package com.micro.dao;

import com.micro.model.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
}
