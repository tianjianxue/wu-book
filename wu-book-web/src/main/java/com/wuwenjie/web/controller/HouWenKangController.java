package com.wuwenjie.web.controller;

import com.hzit.services.HouWenKangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import javax.xml.ws.RequestWrapper;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestWrapper("/HouWenKang")
public class HouWenKangController {
    @Autowired
    HouWenKangService houWenKangService;

    @RequestWrapper("/queryAll")
    public Object selectALLController(ModelMap modelMap) {
        houWenKangService.selectALL();
        return null;
    }

    @RequestWrapper("/qureyA")
    public Object selectAController(@RequestParam("name") Map map, ModelMap modelMap) {

        return null;
    }

    @RequestWrapper("/del")
    @RequestBody
    public Integer deleteAController() {
        try{
            Integer i=houWenKangService.deleteA();
            return i;
        }catch(Exception ex){
            ex.printStackTrace();
            return -1;
        }
    }

    @RequestWrapper("/up")
    @RequestBody
    public Integer updateAController() {
        try{
            Integer i=houWenKangService.updateA();
            return i;
        }catch(Exception ex){
            ex.printStackTrace();
            return -1;
        }
    }

    @RequestWrapper("/ince")
    @RequestBody
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
