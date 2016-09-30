package com.wuwenjie.web.controller;

import com.hzit.services.WuJiaFengServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/wujiafeng")
public class WuJiaFengController {
    @Autowired
    private WuJiaFengServices wuJiaFengServices;
    public WuJiaFengController(){
        System.out.println("吴佳峰的控制器对象被创建");
    }
    @RequestMapping("/currenttime")
    @ResponseBody
    public Object time(){
        System.out.println("查询当前时间的Controller");

        return wuJiaFengServices.time();
    }
    @RequestMapping("/login")
    public String login(){
        System.out.println("处理用户登录的Controller");

        return "wujiafeng";
    }
}
