package com.wuwenjie.web.controller;

import com.hzit.services.impl.HuangKangLuanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String login(){
        return "huangkangluan";
    }
    @RequestMapping("/time")
    @ResponseBody
    public Object time(){
        return new Date();
    }
}
