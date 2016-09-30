package com.wuwenjie.web.controller;

import com.hzit.services.impl.HuangKangLuanServiceImpl;
import com.myinterceptor.Hkl_UserInterceptor;
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
@RequestMapping("/HuangKangLuan")
public class HuangKangLuanController extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //利用拦截器注册对象。给请求添加一个拦截器对象,并指定要拦截的路径
        Hkl_UserInterceptor hkl_userInterceptor=new Hkl_UserInterceptor();
        registry.addInterceptor(hkl_userInterceptor).addPathPatterns("/HuangKangLuan/**");
        super.addInterceptors(registry);
    }
    @Autowired
    private HuangKangLuanServiceImpl huangKangLuanService;
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password,HttpSession session){
        if(username.equals(password)){
            //把信息存储到session
            session.setAttribute("user",username);
        }
        return "huangkangluan";
    }
    @RequestMapping("/time")
    @ResponseBody
    public Object time(){
        return new Date();
    }


}
