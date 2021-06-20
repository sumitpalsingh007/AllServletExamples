package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo
 */
public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =	response.getWriter();
		
		response.setContentType("text/html");
		
		
		out.print("<h2>Get Request Processed </h2>");
		
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		System.out.println(username +"  "+password);
		
		if(username.equals("sps") && password.equals("tech")) {
			
			out.print("<h1>Welcome "+username+" </h1>");
		}
		else
		{
			
			out.print("invalid username or password");
		}			
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out =	response.getWriter();
		
		out.print("<h2>POST Request Processed </h2>");
		response.setContentType("text/html");
		
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		
		System.out.println(username +"  "+password);
		
		if(username.equals("sps") && password.equals("tech")) {
			
			out.print("<h1>Welcome "+username+" </h1>");
		}
		else
		{
			
			out.print("invalid username or password");
		}		
		}	
	}

