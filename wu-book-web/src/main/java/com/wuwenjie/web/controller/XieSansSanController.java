package com.wuwenjie.web.controller;

import com.hzit.services.impl.XieSanSanServiceImpl;
import com.myinterceptor.CheckUserInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/xss")
public class XieSansSanController extends WebMvcConfigurerAdapter{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //利用拦截器注册对象。给请求添加一个拦截器对象,并指定要拦截的路径
        registry.addInterceptor(new CheckUserInterceptor()).addPathPatterns("/xss/**");
        super.addInterceptors(registry);
    }
    @Autowired
    private XieSanSanServiceImpl xieSanSanService;

    @RequestMapping("/login")
    public String login(){
        return "xiesansan";
    }

    @RequestMapping("/cTime")
    @ResponseBody
    public Object cTime(){
        return new Date();
    }


}
