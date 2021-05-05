package com.zc.login;

import java.io.IOException;

import com.zc.login.bean.LoginBean;
import com.zc.login.database.LoginDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	String username = request.getParameter("Username");
    	String password = request.getParameter("Password");
    	
    	LoginBean lb = new LoginBean();
    	lb.setUsername(username);
    	lb.setPassword(password);
    	
    	LoginDao ldao = new LoginDao();
    	
    	if(ldao.validate(lb)) {
    		response.sendRedirect("home.jsp");
    	}
    	else {
    		response.sendRedirect("register.jsp");
    	}
    	
//    	doGet(request, response);
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());}
}
