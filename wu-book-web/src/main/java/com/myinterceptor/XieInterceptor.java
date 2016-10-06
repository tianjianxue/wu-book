package com.myinterceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/9/30.
 */
public class XieInterceptor implements HandlerInterceptor{
    private long startTime;
    private long endTime;
    private long allTime;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //页面进控制器前执行的方法
        HttpSession session=request.getSession();
        if(session.getAttribute("user")==null){
            response.sendRedirect("../index.jsp");
            return false;
        }
        return true;
    }
        /*startTime=System.currentTimeMillis();*/

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
