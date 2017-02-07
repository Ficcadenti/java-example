package com.raffo.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Servlet implementation class myController
 */
@WebServlet(
		description = "Controller dell'applicazione", 
		urlPatterns = { "/myController" },
		initParams = { 
				@WebInitParam(name = "versione", value = "1.0", description = "numero di versione"),
				@WebInitParam(name = "autore", value = "Raffaele Ficcadenti", description = ""),
				@WebInitParam(name = "email", value = "raffaele.ficcadenti@gmail.it", description = "")
		})
public class myController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private RequestDispatcher view;
	private HashMap<String,String> map;
	private myUtility raffo = new myUtility();

	private int serviceCounter = 0;
	private boolean shuttingDown = false;

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
	 * @see Servlet#destroy()
	 */
	public void destroy() 
	{
		// TODO Auto-generated method stub
		// controlla se vi sono ancora servizi in esecuzione
		// e in tal caso invia un messaggio di terminazione
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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
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
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
		super.init(config);
		map = new HashMap<String,String>();
		log = org.apache.log4j.Logger.getLogger(myController.class);
		PropertyConfigurator.configure("./webapps/Servlet_ex2/WEB-INF/classes/resources/log4j.properties");

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(!isShuttingDown())
		{
			PrintWriter out=response.getWriter();
			out.println("<h1>Serlvet - Esempio 2 - doGet()</h1>");
			log.info("Servlet doGet()");

			ServletConfig cfg=getServletConfig();

			raffo.showInitParams(cfg);
			raffo.showParams(request);
			raffo.showHeaders(request);
			raffo.showLocale(request);
			raffo.showInfo(cfg,request);

			RequestDispatcher rd = request.getRequestDispatcher("test");
			ServletContext context = cfg.getServletContext();

			int vMajor=context.getMajorVersion();
			int vMinor=context.getMinorVersion();

			out.println("Servlet API Version:"+vMajor+"."+vMinor);
			out.println("<br>");

			if(rd==null)
			{
				log.info("Servlet_ex2/test is null!!!!");
			}
			else
			{
				request.setAttribute("dbname", "Raffaele");
				rd.include(request,response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		if(!isShuttingDown())
		{
			PrintWriter out=response.getWriter();

			response.setBufferSize(8*1024);
			response.setContentType("text/html");

			out.println("<h1>Serlvet - Esempio 2 - doPost()</h1>");
			response.reset();

			log.info("Servlet doPost()");


			// Getting a Set of Key-value pairs
			Set<Entry<String, String>> entrySet = map.entrySet();

			// Obtaining an iterator for the entry set
			Iterator<Entry<String, String>> it = entrySet.iterator();

			// Iterate through HashMap entries(Key-Value pairs)
			log.info("HashMap Key-Value Pairs : ");
			while(it.hasNext())
			{
				@SuppressWarnings("rawtypes")
				Map.Entry me = (Map.Entry)it.next();
				log.info("Key is: "+me.getKey() + " & " + " value is: "+me.getValue());
			}


			ServletContext context = getServletContext();
			// ricava un attributo generico del servlet
			Object value = context.getAttribute("javax.servlet.context.tempdir");
			File dir= (File) value;

			log.info("Attribute: "+dir);

			ServletConfig cfg=getServletConfig();


			raffo.showInitParams(cfg);
			raffo.showParams(request);
			raffo.showHeaders(request);
			raffo.showLocale(request);
			raffo.showInfo(cfg,request);


			if(request.getParameter("user")==null)
			{
				String msg="Errore nei parametri manca 'user'!!!";
				response.sendError(HttpServletResponse.SC_BAD_REQUEST,msg);
				response.flushBuffer();
			}
			else
			{
				//view = request.getRequestDispatcher("myShow.jsp");
				//view.forward(request, response);
			}

			out.println("<h1>Serlvet - Esempio 2 - END doPost()</h1>");
			response.flushBuffer();
		}
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "Servlet_ex2 – Un servlet personalizzato – V 1.0";
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
