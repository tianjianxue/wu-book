package com.wuwenjie.web.controller;

import com.hzit.services.impl.WangSaiJunServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/wangsaijun1")
public class WangSaiJunController {
    @Autowired
    private WangSaiJunServiceImpl wangSaiJunService;
    @RequestMapping("/updateW")
    public String update(){
       boolean b = wangSaiJunService.updateW();
        return "wangsaijun";
    }
    public void login(){
        System.out.println("登录！！");
    }
}

