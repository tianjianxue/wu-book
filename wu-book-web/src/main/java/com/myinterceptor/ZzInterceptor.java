package com.myinterceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/9/30.
 */
public class ZzInterceptor implements HandlerInterceptor {
    private long time;
    private long starttime;
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("进入控制器之前的拦截");
            long starttime=System.currentTimeMillis();
        HttpSession session=httpServletRequest.getSession();
        if (session.getAttribute("user")==null){
            httpServletResponse.sendRedirect("../index.jsp");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("zz说：这是控制器进入页面之前执行的方法");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("zz说：这是表示整个控制器执行完毕了");
        long endtime=System.currentTimeMillis();
        time=endtime-starttime;
        System.out.println(time);
    }
}
