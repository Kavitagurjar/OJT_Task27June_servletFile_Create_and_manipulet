package com.ddn;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class KavitaC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) {
		String a = req.getParameter("fname");
		String b = req.getParameter("pass");
		System.out.println(a+" "+b);
	}

}
