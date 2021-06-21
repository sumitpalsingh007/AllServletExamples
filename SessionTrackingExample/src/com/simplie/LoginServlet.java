package com.simplie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SendCookies
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ServletConfig config =null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("Initializtion Completed");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		
		HttpSession  session  = request.getSession();
		session.setAttribute("name", name);
	    
		if(config.getInitParameter("premiumUserName").equals(name)) {
			session.setAttribute("profile", "premium");
	    }else {
	    	session.setAttribute("profile", "basic");
	    }
	    
	    out.print("Welcome to login servlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
