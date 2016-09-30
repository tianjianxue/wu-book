package com.wuwenjie.web.controller;


import com.hzit.services.WgjSerivce;
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
    private WgjSerivce wgjSerivce;

     @RequestMapping("/show")
     public String show(){
               wgjSerivce.find();
                return "wangguangjun";
    }

}
