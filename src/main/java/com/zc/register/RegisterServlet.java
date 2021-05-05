package com.zc.register;

import java.io.IOException;
import java.io.PrintWriter;

import com.zc.register.bean.RegisterBean;
import com.zc.register.database.RegisterDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegisterServlet() {}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	String uname = request.getParameter("username");
    	String upass = request.getParameter("password");
    	String uemail = request.getParameter("email");
    	int uphone = Integer.parseInt(request.getParameter("phone"));
    	
    	RegisterBean rb = new RegisterBean(uname, upass, uemail, uphone);
    	RegisterDao rdao = new RegisterDao();
    	
    	boolean result = rdao.insert(rb);
    	
    	if(result) {
    		response.sendRedirect("login.jsp");
    	}
    	else {
    		response.sendRedirect("register.jsp");
    	}
    	
//    	doGet(request, response);
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());}

}
