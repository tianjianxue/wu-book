package com.wuwenjie.web.controller;

import com.hzit.services.impl.QinguangfengSerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/qinguangfeng")
public class QinGuangFengContro {
    @Autowired
    private QinguangfengSerImp qinguangfengSerImp;
    @RequestMapping("/denglu")
    public String denglu(){
        System.out.println("覃光峰写的登录界面");
        return "qinguangfeng";
    }


    @RequestMapping("/tianjia")
    @ResponseBody
    public Object tianjia(){
        System.out.println("覃光峰写的增加页面");
        return new Date(System.currentTimeMillis());
    }
}
