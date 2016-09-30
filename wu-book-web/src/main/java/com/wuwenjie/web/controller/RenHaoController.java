package com.wuwenjie.web.controller;

import com.hzit.services.RenHaoService;
import com.hzit.services.impl.RenHaoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/renhao")
public class RenHaoController {
    @Autowired
    private RenHaoService renhaoservice;

    @RequestMapping("/insert")

    public String insert(){
        return "renhao";
    }


}
