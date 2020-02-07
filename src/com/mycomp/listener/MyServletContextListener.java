package com.mycomp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // 当服务器启动时调用此方法
        System.out.println("监听到服务器启动");

        // 获取当前监听的对象
        // ServletContext servletContext = servletContextEvent.getServletContext();
        // ServletContext servletContext = (ServletContext) servletContextEvent.getSource();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        // 当服务器关闭时调用此方法
        System.out.println("监听到服务器关闭");
    }
}
