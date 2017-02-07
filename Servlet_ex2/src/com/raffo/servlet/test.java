package com.raffo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Servlet implementation class test
 */
@WebServlet(
		urlPatterns = { "/test" }, 
		initParams = { 
				@WebInitParam(name = "versione", value = "1.0", description = "prova")
		})
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private myUtility raffo = new myUtility();
	
	static Logger log;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        // TODO Auto-generated constructor stub
        
        log = org.apache.log4j.Logger.getLogger(test.class);
		PropertyConfigurator.configure("./webapps/Servlet_ex2/WEB-INF/classes/resources/log4j.properties");
		
    }

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		raffo.showParams(request);
		
		String dbname=(String)request.getAttribute("dbname");
		
		out.append("doGet() Served at: ").append(request.getContextPath());
		out.append("\n dbname="+dbname);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
