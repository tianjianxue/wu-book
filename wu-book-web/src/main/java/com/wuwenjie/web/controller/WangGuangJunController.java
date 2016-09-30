package com.wuwenjie.web.controller;

import com.hzit.services.WangGuangJunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/wangguangjun")
public class WangGuangJunController {
    @Autowired
    private WangGuangJunService wangGuangJunService;

     @RequestMapping("/show")
     public String show(){
                wangGuangJunService.find();
                return "wangguangjun";
    }

}
