package com.example.demo.service;

public interface UserService {
    void create(String name,Integer age);
    void deleteUserByName(String name);
    Integer getAllUser();
    void deleteAllUser();
}
