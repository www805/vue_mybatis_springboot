package com.zhuang.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SessionHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

//        Object user = request.getSession().getAttribute("user");
//        if (user == null) {
//            try {
//                response.sendRedirect("/login");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return false;
//
//        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        //controller方法处理完毕后，调用此方法
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //页面渲染完毕后调用此方法
    }
}