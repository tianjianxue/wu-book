package com.wuwenjie.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/wanlun")
public class WanlunContriller {

        @RequestMapping("/login")
        public String update(){
            System.out.println("这是控制器的更新方法");
            return "wanlun";
        }

         @RequestMapping("/updeda")
         @ResponseBody
        public Object add(){
             System.out.println("这是控制器的增加方法");
             return new Date();
         }
}
