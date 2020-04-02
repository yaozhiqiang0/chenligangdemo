package com.example.demo.mapper;


import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM CLG_USER　WHERE NAME=#{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO CLG_USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
