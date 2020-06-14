package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName TestController
 * @Description: test
 * @Author jie
 * @Date 2020/6/10
 * @Version V1.0
 **/
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("hello")
    @ResponseBody
    public String  getTest(){
        return "Hello World ,This is  Test";
    }
}
