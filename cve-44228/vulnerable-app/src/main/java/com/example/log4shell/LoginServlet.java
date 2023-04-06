package com.example.log4shell;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;


@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = req.getParameter("uname");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");

        if(userName.equals("admin") && password.equals("password")){
            out.println("Welcome Back Admin");
        }
        else{

            // vulnerable code
            Logger logger = LogManager.getLogger(com.example.log4shell.log4j.class);
            logger.info("Log4j version: " + org.apache.logging.log4j.util.PropertiesUtil.class.getPackage().getImplementationVersion());
            ThreadContext.put("myContext", userName);
            logger.error("Username set");
            //logger.error(userName);

            out.println("<code> the password you entered was invalid, <u> we will log your information </u> </code>");
        }
    }

    public void destroy() {
    }
}