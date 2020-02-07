package com.mycomp.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        // 当session创建时调用此方法
        // HttpSession session = (HttpSession) httpSessionEvent.getSource();
        HttpSession session = httpSessionEvent.getSession();
        System.out.println("监听到session创建: " + session.getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        // 当session销毁时调用此方法
        HttpSession session = httpSessionEvent.getSession();
        System.out.println("监听到session销毁: " + session.getId());
    }
}
