package com.raffo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Servlet implementation class myController
 */
@WebServlet(description = "Controller dell'applicazione", urlPatterns = { "/myController" })
public class myController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher view;
	static Logger log;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		log = org.apache.log4j.Logger.getLogger(myController.class);
		PropertyConfigurator.configure("./webapps/Servlet_ex2/WEB-INF/classes/resources/log4j.properties");
		
		log.info("Servlet init()");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("<h1>Serlvet - Esempio 2 - doGet()</h1>");
		log.info("Servlet doGet()");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		out.println("<h1>Serlvet - Esempio 2 - doPost()</h1>");
		log.info("Servlet doPost()");
		
		RequestDispatcher dispatcher;
		view = request.getRequestDispatcher("myShow.jsp");
		view.forward(request, response);
	}

}
