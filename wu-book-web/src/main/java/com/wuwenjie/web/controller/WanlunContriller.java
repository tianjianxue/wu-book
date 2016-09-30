package com.wuwenjie.web.controller;

import com.hzit.services.WanLunServices;
import com.myinterceptor.CheckUserInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/wanlun")
public class WanlunContriller extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("利用拦截器注册对象。给请求添加一个拦截器对象,并指定要拦截的路径");
         registry.addInterceptor(new CheckUserInterceptor()).addPathPatterns("/wanlun/**") ;
        super.addInterceptors(registry);
    }

    @Autowired
               WanLunServices wanLunServices;
        @RequestMapping("/login")
        public String update(){
            System.out.println("这是控制器的更新方法");
            return "wanlun";
        }

         @RequestMapping("/updeda")
         @ResponseBody
        public Object add(){
             System.out.println("这是控制器的增加方法");
             return new Date();
         }


}
