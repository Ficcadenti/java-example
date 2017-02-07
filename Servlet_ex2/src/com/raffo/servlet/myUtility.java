package com.raffo.servlet;

import java.util.Enumeration;
import java.util.Locale;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class myUtility 
{
	static Logger log;
	
	myUtility()
	{
		// Costruttore
		log = org.apache.log4j.Logger.getLogger(myUtility.class);
		PropertyConfigurator.configure("./webapps/Servlet_ex2/WEB-INF/classes/resources/log4j.properties");
		
		log.info("myUtility()");
	}
	
	public void info()
	{
		log.info("info()");
	}
	
	public void showInitParams(ServletConfig config)
	{
		log.info("----- Init param -----");
		
		for (Enumeration<String> en = config.getInitParameterNames(); en.hasMoreElements();) 
		{
	        String param_name = (String) en.nextElement();
	        String param_value = (String) config.getInitParameter(param_name);
	        log.info(param_name+": "+param_value);
		}
		log.info("----- END Init param -----");
	}
	
	public void showParams(HttpServletRequest request)
	{
		log.info("----- Param -----");
		for (Enumeration<String> en = request.getParameterNames(); en.hasMoreElements();) 
		{
	        String param_name = (String) en.nextElement();
	        String param_value = (String) request.getParameter(param_name);
	        log.info(param_name+": "+param_value);
		}
		log.info("----- END Param -----");
	}
	
	public void showHeaders(HttpServletRequest request)
	{
		log.info("----- Headers -----");
		for (Enumeration<String> en = request.getHeaderNames(); en.hasMoreElements();) 
		{
	        String header_name = (String) en.nextElement();
	        String header_value = (String) request.getHeader(header_name);
	        log.info("Header ("+header_name+"): "+header_value);
		}
		log.info("----- END Headers -----");
	}
	
	public void showLocale(HttpServletRequest request)
	{
		log.info("----- Locale -----");
		Locale locale=request.getLocale();
		log.info("Linquaggio: "+locale.getLanguage());
		log.info("----- END Locale -----");
	}
	
	public void showInfo(ServletConfig cfg,HttpServletRequest request)
	{
		String name = cfg.getServletName();
		String URI=request.getRequestURI();
		String URL=request.getRequestURL().toString();
		String queryString=request.getQueryString();
		
		log.info("Nome servlets: "+name);
		log.info("URI          : "+URI);
		log.info("URL          : "+URL);
		log.info("queryString  : "+queryString);
	}

}
