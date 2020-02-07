package com.mycomp.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyServletRequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        // 请求创建时调用此方法
        System.out.println("监听到请求创建");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        // 请求销毁时调用此方法
        System.out.println("监听到请求销毁");
    }
}
