package com.wuwenjie.web.controller;

import com.hzit.services.impl.LaiShiYingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/jason")
public class LaiShiYingController {
    @Autowired
    private LaiShiYingServiceImpl laiShiYingService;

    public LaiShiYingController(){
        System.out.println("LaiShiYingController构造方法");
    }

    @RequestMapping("/login")
    public String login(){
        laiShiYingService.into();
        System.out.println("用户登录");
        return "laishiying";
    }

    @RequestMapping("/add")
    @ResponseBody
    public Object add(){
        System.out.println("显示时间");
        return new Date();
    }

}
