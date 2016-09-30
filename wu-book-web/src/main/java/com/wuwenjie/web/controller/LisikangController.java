package com.wuwenjie.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/9/30.
 */   @Controller
      @RequestMapping("/lisikang")
public class LisikangController {

   public void LisikangController(){
       System.out.println("控制器创建");
   }
    @RequestMapping("/delete")
    public String delect(){
        System.out.println("删除");
        return "lisikang";
    }
}
