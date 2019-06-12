package com.wisdom.demo.springbootsecurity.service;

import com.wisdom.demo.springbootsecurity.entity.User;

import java.util.List;

public interface UserService  {
     User getUserInfo(User user);

     User loadUserByUsername(String s);

     List<User> getAllUsers();
}
