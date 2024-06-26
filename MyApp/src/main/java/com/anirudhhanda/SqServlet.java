package com.anirudhhanda;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		// RequestDispatcher Thingy
//		int sum = (int) req.getAttribute("sum");		// cuz req.getAttribute return an object
		
		// using sendRedirect and (URL Re-writing)
		int sum = Integer.parseInt(req.getParameter("sum"));
		
		int sqResult = sum * sum;
		PrintWriter out = res.getWriter();
		out.println("Final result: "+sqResult);
	}
}
