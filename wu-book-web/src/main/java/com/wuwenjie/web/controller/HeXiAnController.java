package com.wuwenjie.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/hexian")
public class HeXiAnController {
    @RequestMapping("/first")
    public String he(){
        System.out.println("进了控制器");
        return "hexian1";
    }
}
