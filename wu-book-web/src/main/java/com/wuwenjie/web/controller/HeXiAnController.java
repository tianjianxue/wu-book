package com.wuwenjie.web.controller;

import com.hzit.services.HeXiAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/hexian")
public class HeXiAnController {
    @Autowired
    private HeXiAnService heXiAnService;
    @RequestMapping("/first")
    public String he(){
        System.out.println("进了控制器");
        return "hexian1";
    }
}
