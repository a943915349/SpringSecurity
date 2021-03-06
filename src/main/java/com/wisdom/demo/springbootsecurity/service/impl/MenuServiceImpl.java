package com.wisdom.demo.springbootsecurity.service.impl;

import com.wisdom.demo.springbootsecurity.entity.Menu;
import com.wisdom.demo.springbootsecurity.mapper.MenuMapper;
import com.wisdom.demo.springbootsecurity.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;


    @Override
    public List<Menu> getMenusByUserId(String userId) {
        return menuMapper.getMenusByUserId(userId);
    }
}
