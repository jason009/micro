package com.micro.service;


import com.micro.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
