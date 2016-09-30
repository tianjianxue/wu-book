package com.wuwenjie.web.controller;

import com.hzit.services.ZhongHuiGuiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/zhonghuigui")
public class ZhongHuiGuiController {
    @Autowired
    private ZhongHuiGuiService zhongHuiGuiService;
    @RequestMapping("/denglu")
    public String denglu(){
        System.out.println("登录成功sss");
        return "zhonghuigui";
    }

    @RequestMapping("/addsubject")
    @ResponseBody
    public Object addsubject(){
        System.out.println("增加科目");
        return new Date();
    }
}
