package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;

		int a = i * j;

		int b = i - j;

		int c = i / j;

		PrintWriter out = res.getWriter();

		out.println("Additon result is " + k);
		out.println("Multiplication result is " + a);
		out.println("Subraction result is " + b);
		out.println("Division result is " + c);
	}

}
