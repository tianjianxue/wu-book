package com.wuwenjie.web.controller;

import com.myinterceptor.CheckUserInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/wuwenjie")
public class WuWenJieController extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //利用拦截器注册对象。给请求添加一个拦截器对象,并指定要拦截的路径
        registry.addInterceptor(new CheckUserInterceptor()).addPathPatterns("/wuwenjie/**");
        super.addInterceptors(registry);
    }

    public WuWenJieController(){
        System.out.println("控制器对象被创建");
    }

    @RequestMapping("/login")
    public String login(ModelMap modelMap){
        System.out.println("用户登录");
        modelMap.put("a","111111111111");
        return "wuwenjie";
    }
    @RequestMapping("/add")
    @ResponseBody
    public Object add(){
        System.out.println("处理用户增加");
        return new Date();
    }
     @RequestMapping("/delete")
        public String delete(){
            return "";
        }
}
