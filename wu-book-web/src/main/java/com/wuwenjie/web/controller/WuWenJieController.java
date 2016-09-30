package com.wuwenjie.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/wuwenjie")
public class WuWenJieController {

    public WuWenJieController(){
        System.out.println("控制器对象被创建");
    }

    @RequestMapping("/login")
    public String login(){
        System.out.println("用户登录");
            return "wuwenjie";
    }
    @RequestMapping("/add")
    @ResponseBody
    public Object add(){
        System.out.println("处理用户增加");
        return new Date();
    }
}
