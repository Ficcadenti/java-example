package com.raffo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Servlet implementation class myController
 */
@WebServlet(
		description = "Servlet esempio 4", 
		urlPatterns = { "/myController" }, 
		initParams = { 
				@WebInitParam(name = "versione", value = "1.0", description = "numero di versione"),
				@WebInitParam(name = "autore", value = "Raffaele Ficcadenti", description = ""),
				@WebInitParam(name = "email", value = "raffaele.ficcadenti@gmail.it", description = "")
		})
public class myController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int serviceCounter = 0;
	private boolean shuttingDown = false;
	private HashMap<String,String> map;
	private myUtility raffo = new myUtility();
	private HttpSession session = null;
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
		PropertyConfigurator.configure("./webapps/Servlet_ex5/WEB-INF/classes/resources/log4j.properties");

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
			if(session!=null)
			{
				session.invalidate();
			}
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
				log.info("Si � verificata una eccezione");
			}
		}
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Servlet_ex5 � Un servlet personalizzato � V 1.0";
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
			boolean sessionUserName=false;
			
			session = request.getSession(true);
			session.setMaxInactiveInterval(1000);; //espresso in secondi
			String idSessione=session.getId();
			if(session.isNew()==true)
			{
				log.info("Creata nuova sessione con di=["+idSessione+"] !!!!");
			}
			else
			{
				log.info("Caricata sessione esistente con di=["+idSessione+"] !!!!");
			}
			
			
			// si prova a ricavare dalla sessione
			// il valore di sessiontest.counter
			Integer ival = (Integer) session.getAttribute("sessiontest.counter");
			// se la sessione non esiste il valore restituito sarà null
			if (ival==null)
			{
				// ival non è definito
				ival = new Integer(1);
			}
			else 
			{
				// il valore di ival è definito
				// si incrementa di 1
				ival = new Integer(ival.intValue() + 1);
			}
			// si memorizza nella sessione il nuovo valore
			session.setAttribute("sessiontest.counter", ival);
			
			
			String sessionUserId=(String) session.getAttribute("sessiontest.user_id");
			
			if (sessionUserId==null)
			{
				// sessionUserId non è definito
				sessionUserId = username;
				sessionUserName=true;
			}
			else
			{
				username=sessionUserId;
			}
			
			// si memorizza nella sessione il nuovo valore
			session.setAttribute("sessiontest.user_id", sessionUserId);
			
			log.info("sessiontest.counter="+ival);
			log.info("sessiontest.user_id="+sessionUserId);

			

			if( (username==null) && (sessionUserName==false) ) 
			{
				String msg="Errore nei parametri manca 'user'!!!";
				response.sendError(HttpServletResponse.SC_BAD_REQUEST,msg);
				response.flushBuffer();
			}
			else
			{
				out.println(myUtility.PAGE_TOP);
				out.println("<h1>Serlvet - Esempio 5 - Il mantenimento dello stato: le sessioni()</h1>");
				out.println("<h2> SessionID="+idSessione+"</h2><br>");
				out.println("<h3> Session counter="+ival+"</h3><br>");
				out.println("<FORM METHOD=\"POST\" ACTION=\"myController\">");
				out.println("Quali articoli vuoi comprare '"+username+"'? <INPUT TYPE=\"text\" NAME=\"data\"><BR>");
				out.println("<input type=\"submit\" name=\"articolo\" value=\"ok\">");
				out.println("</FORM>");
				out.println(myUtility.PAGE_BOTTOM);
			}

		}
	}

	// metodo per l'incremento del numero di thread attivi
	// � sincronizzato per garantire la coerenza
	protected synchronized void addRequest () 
	{
		serviceCounter++;
		log.info("addRequest(): serviceCounter="+serviceCounter);
	}
	// metodo per il decremento del numero di thread attivi
	// � sincronizzato per garantire la coerenza
	protected synchronized void removeRequest () 
	{
		serviceCounter--;
		log.info("removeRequest(): serviceCounter="+serviceCounter);
	}
	// metodo per ottenere il numero di thread attivi
	// � sincronizzato per permettere di ricavare un valore coerente
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
