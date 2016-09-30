package com.wuwenjie.web.controller;

import com.hzit.services.HouWenKangService;
import com.myinterceptor.HouWenKangInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


import javax.xml.ws.RequestWrapper;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/30.
 */
@Controller
@RequestMapping("/hou")
public class HouWenKangController extends WebMvcConfigurerAdapter {
    @Autowired
    private HouWenKangService houWenKangService;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //使用拦截器注册对象 ,注册拦截器,并指定拦截器拦截的路径
        registry.addInterceptor(new HouWenKangInterceptor()).addPathPatterns("/hou/**");
        super.addInterceptors(registry);
    }

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
