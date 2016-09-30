package com.wuwenjie.web.controller;

import com.hzit.services.WuJiaFengServices;
import com.myinterceptor.WujiaFengInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/wujiafeng")
public class WuJiaFengController extends WebMvcConfigurerAdapter{
    @Autowired
    private WuJiaFengServices wuJiaFengServices;
    public WuJiaFengController(){
        System.out.println("吴佳峰的控制器对象被创建");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new WujiaFengInterceptor()).addPathPatterns("/wujiafeng/**");
        super.addInterceptors(registry);
    }

    @RequestMapping("/currenttime")
    @ResponseBody
    public Object time(){
        System.out.println("查询当前时间的Controller");

        return wuJiaFengServices.time();
    }
    @RequestMapping("/login")
    public String login(ModelMap modelMap){
        System.out.println("处理用户登录的Controller");
        modelMap.put("user","张无忌");
        return "wujiafeng";
    }
}
