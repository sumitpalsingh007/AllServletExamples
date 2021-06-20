package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Flipkart
 */
@WebServlet("/Flipkart")
public class Flipkart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Flipkart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter out =	response.getWriter();
	
	String   pname = request.getParameter("pname");
	
	String  amount  =  request.getParameter("amount");
	
	
	out.print("<h1  style='color:red'>  Thanks for shopping "+pname +" </h1> ");
	out.print("Redirecting to Payment Gateway...");
	
	
		HttpSession  session  = request.getSession();
		
		session.setAttribute("amount", amount);
	
	
		 RequestDispatcher rd =	request.getRequestDispatcher("/PaymentServlet");
	
		 	rd.include(request, response);
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
