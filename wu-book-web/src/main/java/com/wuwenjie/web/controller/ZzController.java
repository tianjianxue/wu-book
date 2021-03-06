package com.wuwenjie.web.controller;

import com.hzit.services.ZzService;
import com.myinterceptor.ZzInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/zz")
public class ZzController extends WebMvcConfigurerAdapter{
    @Autowired
private ZzService zzService;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ZzInterceptor()).addPathPatterns("/zz/**");

        super.addInterceptors(registry);
    }

    public ZzController(){
        System.out.println("zz的控制器被创建");
    }
    @RequestMapping("/login")
    public String login(){
        System.out.println("这是我的登录页面");

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
