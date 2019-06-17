package com.wisdom.demo.springbootsecurity.mapper;

import com.wisdom.demo.springbootsecurity.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where username=#{username} and password=#{password}")
    User getUserInfo(User user);

    @Select("select * from user where username=#{username}")
    User loadUserByUsername(String s);

    @Select("select * from user")
    List<User> getAllUsers();
}
