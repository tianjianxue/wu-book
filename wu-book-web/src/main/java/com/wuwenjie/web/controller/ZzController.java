package com.wuwenjie.web.controller;

import com.hzit.services.ZzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/zz")
public class ZzController {
    @Autowired
private ZzService zzService;

    public ZzController(){
        System.out.println("zz的控制器被创建");
    }
    @RequestMapping("/login")
    public String login(){
        System.out.println("zzzzzz");
        return "zz";
    }
    @RequestMapping("/zzadd")
    @ResponseBody
    public Object add(){
        zzService.getzz();
        System.out.println("zz加");
        return new Date();
    }
}
