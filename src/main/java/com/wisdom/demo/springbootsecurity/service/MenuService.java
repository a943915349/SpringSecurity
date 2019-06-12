package com.wisdom.demo.springbootsecurity.service;

import com.wisdom.demo.springbootsecurity.entity.Menu;

import java.util.List;


public interface MenuService {

    List<Menu> getMenusByUserId(Integer userId);
}
