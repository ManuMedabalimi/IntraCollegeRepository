package com.vits.ica.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/admin")
public class AdminController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try{
			System.out.println("In doGet Method in Admin Servlet");

			String username = req.getParameter("userName");
			String password = req.getParameter("passWord");
			
			if (username.equals("manoj")) {
				resp.sendRedirect("adminhome.jsp");
			} else {
				resp.sendRedirect("adminlogin.jsp");
			}
		}catch(Exception e){e.printStackTrace();}
	}
}
