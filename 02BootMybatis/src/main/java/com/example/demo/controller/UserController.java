package com.example.demo.controller;

import com.example.demo.module.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName UserController
 * @Description: TODO
 * @Author https://github.com/HiJie
 * @Date 2020/6/10
 * @Version V1.0
 **/
@RequestMapping("user")
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
