package com.raffo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/CreateUser.do")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher view;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		out.println("Stiamo lavorando per voi!!!");
		System.out.println("Stiamo lavorando per voi!!!");
		
		/*out.println(request.getParameter("email"));
		out.println(request.getParameter("pwd"));*/
		view = request.getRequestDispatcher("useradd.jsp");
		view.forward(request, response);
		
		
	}

}
