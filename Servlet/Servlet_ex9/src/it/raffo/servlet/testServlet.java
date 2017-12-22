package it.raffo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Impostata la servlet con le ansnotation o vedere il descrittore web.xml
//@WebServlet(urlPatterns="/ciao")
public class testServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/plain");
		resp.getWriter().write("QueryString : "+req.getQueryString()+"\n");
		resp.getWriter().write("username    : "+req.getParameter("username")+"\n");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("destroy()");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("init()");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("text/plain");
//		resp.getWriter().write("QueryString : "+req.getQueryString()+"\n");
//		resp.getWriter().write("username    : "+req.getParameter("username")+"\n");
//		resp.sendRedirect("requestDispatcher");
		System.out.println("doGet()....."+req.getHeader("User-Agent"));
		req.getRequestDispatcher("requestDispatcher").forward(req, resp);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
