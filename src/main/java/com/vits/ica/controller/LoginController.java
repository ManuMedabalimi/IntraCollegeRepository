package com.vits.ica.controller;

	import java.io.IOException;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

import com.vits.ica.service.LoginService;
import com.vits.ica.service.LoginServiceImpl;


	@WebServlet("/login")
	public class LoginController extends HttpServlet {
		private static final long serialVersionUID = 1L;

		LoginService loginService = new LoginServiceImpl();

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			boolean status = false;
			try {
				System.out.println("In doPOst Method in Login Servlet");

				String username = request.getParameter("username");

				String password = request.getParameter("password");

				status = loginService.loginValidate(username, password);
				System.out.println("@@ status:::" + status);
				if (status) {
					HttpSession session = request.getSession();
					session.setAttribute("username", username);
					response.sendRedirect("home.jsp");
				} else {
					response.sendRedirect("login.jsp");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
