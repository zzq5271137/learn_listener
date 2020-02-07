package com.mycomp.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // HttpSession session = request.getSession();
        // session.invalidate();
        // session.setMaxInactiveInterval(10); // 秒
        // System.out.println(session.getId());

        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("username", "zzq1");
        servletContext.setAttribute("username", "zzq2");
        servletContext.removeAttribute("username");
    }

}
