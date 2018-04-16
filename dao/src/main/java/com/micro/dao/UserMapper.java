package com.micro.dao;

import java.util.List;

public interface UserMapper<User> extends BasicDao<User> {
    List<User> findAll();
}
