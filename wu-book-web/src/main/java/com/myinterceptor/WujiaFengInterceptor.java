package com.myinterceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/9/30.
 */
public class WujiaFengInterceptor implements HandlerInterceptor {
    private long begin;
    private long end;
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        begin=System.currentTimeMillis();
        System.out.println("吴佳峰开发的拦截器拦截了一个请求，拦截了："+o);
        System.out.println("访问者："+httpServletRequest.getRemoteHost());
        HttpSession session=httpServletRequest.getSession();
        if(session.getAttribute("user")==null){
            httpServletResponse.sendRedirect("../login.html");
            return false;
        }

        return true;


    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("方法已经执行完毕");
        end=System.currentTimeMillis();
        long time=end-begin;
        System.out.println("执行该方法共耗时："+time+"毫秒");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("控制器执行完毕！");
    }
}
