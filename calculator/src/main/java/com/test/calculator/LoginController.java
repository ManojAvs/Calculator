package com.test.calculator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String UserName = req.getParameter("username");
		String Password = req.getParameter("Password");

		if (UserName.equals("admin") && Password.equals("admin")) {
			resp.sendRedirect("success.html");
			return;
		} else {
			resp.sendRedirect("error.html");
			return;
		}
	}

}
