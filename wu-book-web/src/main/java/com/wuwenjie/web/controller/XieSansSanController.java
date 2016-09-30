package com.wuwenjie.web.controller;

import com.hzit.services.impl.XieSanSanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/xss")
public class XieSansSanController {
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
