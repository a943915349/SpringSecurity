package com.wisdom.demo.springbootsecurity.mapper;

import com.wisdom.demo.springbootsecurity.entity.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MenuMapper {
    List<Menu> getMenusByUserId(Integer userId);
}
