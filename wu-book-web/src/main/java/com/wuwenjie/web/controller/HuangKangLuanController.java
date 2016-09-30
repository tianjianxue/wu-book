package com.wuwenjie.web.controller;

import com.hzit.services.impl.HuangKangLuanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/HuangKangLuan")
public class HuangKangLuanController {
    @Autowired
    private HuangKangLuanServiceImpl huangKangLuanService;
    @RequestMapping("/login")
    public String login(@RequestParam("username") String usename,@RequestParam("password") String password,HttpSession session){
        if(usename.equals(password)){
            //把信息存储到session
            session.setAttribute("user",usename);
        }
        return "huangkangluan";
    }
    @RequestMapping("/time")
    @ResponseBody
    public Object time(){
        return new Date();
    }
}
