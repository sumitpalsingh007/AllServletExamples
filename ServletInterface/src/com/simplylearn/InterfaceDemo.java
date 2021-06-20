package com.simplylearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InterfaceDemo
 */
//@WebServlet("/InterfaceDemo")
public class InterfaceDemo extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    private ServletConfig config =null;
    public InterfaceDemo() {
        super();
       
    }

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Initializtion Completed");
	}

	
	public void destroy() {
		System.out.println("in the destory method");
	}

	
	@Override
	public ServletConfig getServletConfig() {
		
		return config;
	}

	
	@Override
	public String getServletInfo() {
		
		return "this is the sample service info"; 
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pwriter = res.getWriter();
		pwriter.print("<html>");
		pwriter.print("<body>");
		pwriter.print("in the service() method<br>");
		pwriter.print("</body>");
		pwriter.print("</html>");
	}

}
