package com.ddn;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class calcC  extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) {
		int x = Integer.parseInt(req.getParameter("k1"));
		int y = Integer.parseInt(req.getParameter("k2"));
		int z = x+x*y-x*y;
		System.out.println(z);
		
	}

}