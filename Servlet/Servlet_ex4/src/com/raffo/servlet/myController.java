package com.raffo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Servlet implementation class myController
 */
@WebServlet(
		description = "Servlet esempio 3", 
		urlPatterns = { "/myController" }, 
		initParams = { 
				@WebInitParam(name = "versione", value = "1.0", description = "numero di versione"),
				@WebInitParam(name = "autore", value = "Raffaele Ficcadenti", description = ""),
				@WebInitParam(name = "email", value = "raffaele.ficcadenti@gmail.it", description = "")
		})
public class myController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private int serviceCounter = 0;
	private boolean shuttingDown = false;
	private HashMap<String,String> map;
	private myUtility raffo = new myUtility();

	static Logger log;
	static final int TIME_TO_SLEEP=1*1000; //in millisecondi

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
		map = new HashMap<String,String>();
		log = org.apache.log4j.Logger.getLogger(myController.class);
		PropertyConfigurator.configure("./webapps/Servlet_ex4/WEB-INF/classes/resources/log4j.properties");

		log.info("Servlet init()");

		raffo.showInitParams(config);
		raffo.info();

		for (Enumeration<String> en = config.getInitParameterNames(); en.hasMoreElements();) 
		{
			String param_name = (String) en.nextElement();
			String param_value = (String) config.getInitParameter(param_name);
			log.info(param_name+": "+param_value);
			map.put(param_name, param_value);
		}
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		if (getTotRequest() > 0) 
		{
			setShuttingDown(true);
		}
		else
		{
			log.info("destroy OK");
		}
		// Attende lo stop dei vari servizi
		while(getTotRequest() > 0) 
		{
			try 
			{
				Thread.sleep(TIME_TO_SLEEP);
			}
			catch (InterruptedException e) 
			{
				log.info("Si è verificata una eccezione");
			}
		}
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Servlet_ex4 – Un servlet personalizzato – V 1.0";
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubaddRequest();
		addRequest();
		try 
		{
			super.service(request, response);
		}
		finally 
		{
			removeRequest();
		}	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(!isShuttingDown())
		{
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(!isShuttingDown())
		{
			PrintWriter out=response.getWriter();
			ServletConfig cfg=getServletConfig();

			raffo.showInitParams(cfg);
			raffo.showParams(request);
			raffo.showHeaders(request);
			raffo.showLocale(request);
			raffo.showInfo(cfg,request);

			String username=request.getParameter("user_id");
			boolean cookieUserName=false;
			
			Cookie[] cookies = request.getCookies();
			
			if(cookies!=null)
			{
				for(int i=0; i < cookies.length; i++)
				{
					Cookie thisCookie = cookies[i];
					if (thisCookie.getName().equals("user_id")) 
					{
						username=thisCookie.getValue();
						// rimuove il cookie impostando l'età massima a 0
						thisCookie.setMaxAge(0);
						cookieUserName=true;
						break;
					}
				}
			}
			
			if( (username==null) && (cookieUserName==false) )
			{
					String msg="Errore nei parametri manca 'user'!!!";
					response.sendError(HttpServletResponse.SC_BAD_REQUEST,msg);
					response.flushBuffer();
			}
			else
			{
				Cookie C = new Cookie("user_id",username);
				C.setComment("Il mio promo cookie");
				C.setMaxAge(100000); // espresso in secondi
				response.addCookie(C);
				log.info("Il cookie è stato creato!!!!");
				
				out.println(myUtility.PAGE_TOP);
				out.println("<h1>Serlvet - Esempio 4 - Il mantenimento dello stato: i cookie()</h1>");
				out.println("<FORM METHOD=\"POST\" ACTION=\"myController\">");
				out.println("Quali articoli vuoi comprare '"+username+"'? <INPUT TYPE=\"text\" NAME=\"data\"><BR>");
				out.println("<input type=\"submit\" name=\"articolo\" value=\"ok\">");
				out.println("</FORM>");
				out.println(myUtility.PAGE_BOTTOM);
				
			}
		}
	}

	// metodo per l'incremento del numero di thread attivi
	// è sincronizzato per garantire la coerenza
	protected synchronized void addRequest () 
	{
		serviceCounter++;
		log.info("addRequest(): serviceCounter="+serviceCounter);
	}
	// metodo per il decremento del numero di thread attivi
	// è sincronizzato per garantire la coerenza
	protected synchronized void removeRequest () 
	{
		serviceCounter--;
		log.info("removeRequest(): serviceCounter="+serviceCounter);
	}
	// metodo per ottenere il numero di thread attivi
	// è sincronizzato per permettere di ricavare un valore coerente
	protected synchronized int getTotRequest() 
	{
		log.info("getTotRequest(): serviceCounter="+serviceCounter);
		return serviceCounter;
	}

	// Metodo di modifica per l'attivazione
	// o disattivazione dello shutdown
	protected void setShuttingDown(boolean flag) 
	{
		shuttingDown = flag;
	}
	// metodo per la lettura dello stato dello shutdown
	protected boolean isShuttingDown() 
	{
		return shuttingDown;
	}

}