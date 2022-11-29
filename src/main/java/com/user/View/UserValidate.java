package com.user.View;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;


import com.user.Model.User;
import com.user.crud.UserData;

public class UserValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String username=request.getParameter("uname");
		String password=request.getParameter("password");
		String type=request.getParameter("type");
		User Data=new User(username,password,type);
		try {
			if(UserData.validate(Data,request)) {
			    if(type.equals("admin")) {
			    	response.sendRedirect("Admin.jsp");
			    }
			    else {
			    	response.sendRedirect("User.jsp");
			    }
			    
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rs=request.getRequestDispatcher("Error.jsp");
		rs.include(request, response);
	}
	

}