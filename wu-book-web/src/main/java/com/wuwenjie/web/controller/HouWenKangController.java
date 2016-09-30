package com.wuwenjie.web.controller;

import com.hzit.services.HouWenKangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.xml.ws.RequestWrapper;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/HouWenKang")
public class HouWenKangController {
    @Autowired
    HouWenKangService houWenKangService;

    @RequestMapping("/queryAll")
    public Object selectALLController(ModelMap modelMap) {
        houWenKangService.selectALL();
        return null;
    }

    @RequestMapping("/qureyA")
    public Object selectAController(@RequestParam("name") Map map, ModelMap modelMap) {

        return null;
    }

    @RequestMapping("/del")
    @ResponseBody
    public Integer deleteAController() {
        try{
            Integer i=houWenKangService.deleteA();
            return i;
        }catch(Exception ex){
            ex.printStackTrace();
            return -1;
        }
    }

    @RequestMapping("/up")
    @ResponseBody
    public Integer updateAController() {
        try{
            Integer i=houWenKangService.updateA();
            return i;
        }catch(Exception ex){
            ex.printStackTrace();
            return -1;
        }
    }

    @RequestMapping("/ince")
    @ResponseBody
    public Integer increaseAController() {
        try{
           Integer i=houWenKangService.increaseA();
           return i;
        }catch(Exception ex){
           ex.printStackTrace();
           return -1;
        }
    }

}
