package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet { 
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public FirstServlet() {

		System.out.println("FirstServlet Instance is created..");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {

		System.out.println("init() is called..");

	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("service() is called..");
		response.setContentType("text/html");
		PrintWriter  out =	response.getWriter();
		
		out.print("<h1 style='color:red'>Welcome to Servlet</h1>"); // html inside java is servlet
		
		

	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {

		System.out.println("Destroy() is called..");

	}

}
