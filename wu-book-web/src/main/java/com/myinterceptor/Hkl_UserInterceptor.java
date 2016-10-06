package com.myinterceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/9/30.
 */
public class Hkl_UserInterceptor implements HandlerInterceptor {
    private long nowTime;
    private long endTime;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.out.println("我是拦截器,"+o+"发送了一个请求过来");
        HttpSession session=request.getSession();
        if (session.getAttribute("user")==null){
            response.sendRedirect("login.html");
        }
        nowTime=System.currentTimeMillis();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("执行完控制器中的方法");
        endTime=System.currentTimeMillis();
        long haoshi=(endTime-nowTime);
        System.out.println("运行控制器的方法用了："+haoshi+"毫秒");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
        System.out.println("整个控制器已经执行完毕！");
    }
}
