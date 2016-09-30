package com.myinterceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/9/30.
 */
public class ZengInterceptor implements HandlerInterceptor {
    private long startTime;
    private long endTime;
    private long useTime;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.out.println("进入Controller之前执行");
        System.out.println(o);
        startTime = System.currentTimeMillis();
        System.out.println(startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("执行Controller完毕执行");
        System.out.println(o);
        endTime = System.currentTimeMillis();
        System.out.println(endTime);
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("当整个页面执行完执行完");
        HandlerMethod method = (HandlerMethod)o;
        System.out.println("执行完"+method.getMethod().getName()+"方法总共耗时了"+(endTime-startTime)+"毫秒");
    }
}
