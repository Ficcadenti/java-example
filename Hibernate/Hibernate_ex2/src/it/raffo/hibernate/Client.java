package it.raffo.hibernate;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Client
{
	private static final Logger log = Logger.getLogger(Client.class);

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String log4jConfPath = "/resources/log4j.properties";
		PropertyConfigurator.configure(Client.class.getResourceAsStream(log4jConfPath));
		String classpath = System.getProperty("java.class.path");
		System.out.println("classpath=" + classpath);

		log.info("Hibernate: esercicio_02");
		log.info("classpath = " + classpath);

	}

}
