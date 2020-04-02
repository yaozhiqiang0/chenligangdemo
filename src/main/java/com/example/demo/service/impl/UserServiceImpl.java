package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/*@Service*/
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("primaryJdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    @Override
    public void create(String name, Integer age) {
        jdbcTemplate.update("insert into clg_user(name,age) values(?,?)",name,age);
    }

    @Override
    public void deleteUserByName(String name) {

    }

    @Override
    public Integer getAllUser() {
        return null;
    }

    @Override
    public void deleteAllUser() {

    }
}
