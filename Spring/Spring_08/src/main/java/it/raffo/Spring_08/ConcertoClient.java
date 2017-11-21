package it.raffo.Spring_08;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import it.raffo.Spring_08.bean.Musicista;
import it.raffo.Spring_08.config.ShowConfig;


public class ConcertoClient {

	static Logger _log;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_log = org.apache.log4j.Logger.getLogger(ConcertoClient.class);
		String log4jConfPath = "/resources/log4j.properties";
		PropertyConfigurator.configure(ConcertoClient.class.getResource(log4jConfPath));

		_log.info( "Concerto2 del 18-10-2017 - Roma(Stadio Falminio)!" );

		ApplicationContext context = new AnnotationConfigApplicationContext(ShowConfig.class);
		BeanFactory factory=context;

		Musicista musicista = (Musicista) factory.getBean("roger");

		_log.info(musicista.perform());

		((AnnotationConfigApplicationContext) context).close();

	}

}
