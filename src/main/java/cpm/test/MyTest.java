package cpm.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/pqr")
public class MyTest extends HttpServlet {
	public void init() {
	}

	public void service(ServletRequest req, ServletResponse res) throws IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("tex/html");
		pw.println("-------My name is Kamesh---------");

	}

	public void destroy() {
	}

}
