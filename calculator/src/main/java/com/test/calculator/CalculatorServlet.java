package com.test.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	double res;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		int n1 = Integer.parseInt(req.getParameter("no1"));
		int n2 = Integer.parseInt(req.getParameter("no2"));
		String opt = req.getParameter("opt");

		if (opt.equals("add")) {
			res = new Calculator().doAdd(n1, n2);
			out.println(res);
		} else if (opt.equals("sub")) {
			res = new Calculator().doSub(n1, n2);
			out.println(res);
		} else if (opt.equals("mul")) {
			res = new Calculator().doMul(n1, n2);
			out.println(res);
		} else if (opt.equals("div")) {
			res = new Calculator().doDiv(n1, n2);
			out.println(res);
		}

	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}

}
