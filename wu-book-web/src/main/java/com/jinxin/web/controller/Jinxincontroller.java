package com.jinxin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */

@Controller
@RequestMapping("/jinxin")
public class Jinxincontroller {

    public Jinxincontroller() {
        System.out.println("金鑫的控制器");
    }

    @RequestMapping("/denglu")
    public String sk(){
        System.out.println("有人登陆了");
        return "gongjinxin";
    }

    @RequestMapping("/add")
    @ResponseBody
    public Object add(){
        return new Date();
    }
}
