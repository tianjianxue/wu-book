package com.wuwenjie.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/9/30.
 */

@SpringBootApplication
@ComponentScan({"com.hzit.services","com.wuwenjie.web.controller"})
public class StartWebApp extends SpringBootServletInitializer {


}
