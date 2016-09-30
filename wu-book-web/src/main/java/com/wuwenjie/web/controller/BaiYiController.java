package com.wuwenjie.web.controller;

import com.hzit.services.BaiYiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/bai")
public class BaiYiController {
    @Autowired
    private BaiYiService baiYiService;
    @RequestMapping("/baiyi")
    public String bai(){
        System.out.println("这是控制中心");
        return "baiyi";
    }
}
