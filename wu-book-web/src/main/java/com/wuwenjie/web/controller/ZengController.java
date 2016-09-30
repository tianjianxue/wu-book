package com.wuwenjie.web.controller;

import com.hzit.services.ZengService;
import com.hzit.services.impl.ZengServiceImpl;
import com.myinterceptor.ZengInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/zeng")
public class ZengController extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ZengInterceptor()).addPathPatterns("/zeng/**");
        super.addInterceptors(registry);
    }

    @Autowired
    private ZengService zengService;

    @RequestMapping("/login")
    public String login() {
        zengService.add();
        System.out.println("欢迎    ");
        return "zengchao";
    }

    @RequestMapping("/add")
    public String add() {
        zengService.add();
        System.out.println("我要增加了");
        return "zengchao";
    }

    @RequestMapping("/delete")
    public String delete() {
        zengService.add();
        System.out.println("我要删除了");
        return "zengchao";
    }

}
