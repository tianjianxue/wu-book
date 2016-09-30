package com.myinterceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2016/9/30.
 */
public class WanlunInterceptor  implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("每当页面进入控制器之前都会被执行的代码");
        System.out.println("这个o是拦截的那个方法");
        System.out.println("访问者："+httpServletRequest.getRemoteHost());
        HttpSession session=httpServletRequest.getSession();
        if(session.getAttribute("user")==null)
           return false;
          else return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("这个是控制器执行完毕，但是还没有进入到下一个页面");
        System.out.println("方法名字："+o);
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("整个控制器执行完毕了");
    }
}
