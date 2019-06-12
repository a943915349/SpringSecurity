package com.wisdom.demo.springbootsecurity.controller;

import com.wisdom.demo.springbootsecurity.entity.User;
import com.wisdom.demo.springbootsecurity.security.SecurityUtils;
import com.wisdom.demo.springbootsecurity.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * user表  admin具有所有权限   user具有查看权限不具有操作权限
 * @author Wisdom
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/list")
    @PreAuthorize("hasAuthority('/user/list')")
    @ResponseBody
    @ApiOperation(value = "Jwt登录", httpMethod = "POST", produces = "application/json;charset=UTF-8", consumes = "application/json;charset=UTF-8")
    public List login() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/update")
    @PreAuthorize("hasAuthority('/user/update')")
    @ResponseBody
    public HashMap<String, Object> update() {
        HashMap<String, Object> map = new HashMap<>(16);
        map.put("state","success");
        return map;
    }


    @RequestMapping(value = "/del")
    @PreAuthorize("hasAuthority('/user/del')")
    @ResponseBody
    public HashMap<String, Object> del() {
        HashMap<String, Object> map = new HashMap<>(16);
        map.put("state","success");
        return map;
    }
    @RequestMapping(value = "/add")
    @PreAuthorize("hasAuthority('/user/add')")
    @ResponseBody
    public HashMap<String, Object> add() {
        HashMap<String, Object> map = new HashMap<>(16);
        map.put("state","success");
        return map;
    }

    @RequestMapping(value = "/logout")
    public String logout() {
        SecurityUtils.logout();
        return "redirect:login";
    }

    @RequestMapping(value = "/info")
    @ResponseBody
    public User info() {
        return SecurityUtils.getUser();
    }
}
