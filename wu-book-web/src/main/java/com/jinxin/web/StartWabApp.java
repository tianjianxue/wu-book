package com.jinxin.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/9/30.
 */

@SpringBootApplication
@ComponentScan({"com.jinxin"})
public class StartWabApp extends SpringBootServletInitializer {
}
