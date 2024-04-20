package com.anirudhhanda;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int result = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + result);
		try(PrintWriter out = res.getWriter()){
			out.println(num1 + " + "+num2+" = "+result);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
