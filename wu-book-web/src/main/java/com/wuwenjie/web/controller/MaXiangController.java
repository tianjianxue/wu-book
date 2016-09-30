package com.wuwenjie.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/maxiang")
public class MaXiangController {

    @RequestMapping("currenttime")
    @ResponseBody
    public Date time(){

        return new Date();
    }
    @RequestMapping("/login")
    public String login(){
        return "maxiang";

    }
    @RequestMapping("/add")
    @ResponseBody
    public  int add(){
        System.out.println("我是添加数据哦");
        return 1;
    }

}
