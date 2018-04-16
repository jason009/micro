package com.micro.dao;

public interface BasicDao<T> {
     T getById(int id);
     int insert(T entity);
     int delete(int id);
     int update(T entity);
}
