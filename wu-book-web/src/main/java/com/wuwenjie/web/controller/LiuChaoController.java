package com.wuwenjie.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/liuchao")
public class LiuChaoController {
    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        System.out.println("liuchao的控制器被创建了");
        return "这是一个网页咯";
    }
}
