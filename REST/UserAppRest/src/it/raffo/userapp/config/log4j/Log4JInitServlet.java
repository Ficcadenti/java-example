package it.raffo.userapp.config.log4j;

import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import it.raffo.userapp.util.Constants;

public class Log4JInitServlet extends HttpServlet
{
	@Override
	public void init() throws ServletException
	{
		ClassLoader loader = Log4JInitServlet.class.getClassLoader();
		URL log4jConfPath = loader.getResource(Constants.LOG4J_FILE_PROPERTIES);

		PropertyConfigurator.configure(log4jConfPath);

		Logger log = Logger.getLogger(this.getClass());
		log.info("Inizializzazione Log4J effettuata in UserAppService.");
		log.info("Log4j property path: " + log4jConfPath);
	}

}
