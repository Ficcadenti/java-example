package it.raffo.Spring_07;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import it.raffo.Spring_07.bean.Musicista;


public class ConcertoClient {
	
	static Logger _log;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_log = org.apache.log4j.Logger.getLogger(ConcertoClient.class);
		String log4jConfPath = "/resources/log4j.properties";
		PropertyConfigurator.configure(ConcertoClient.class.getResource(log4jConfPath));

		_log.info( "Concerto del 18-10-2017 - Roma(Stadio Olimpico)!" );
		
		
		String[] resources={"classpath:/resources/beans.xml"};

		ApplicationContext context=new ClassPathXmlApplicationContext(resources);
		BeanFactory factory=(BeanFactory)context;
		
		Musicista DavidGilmour=(Musicista)factory.getBean("david");
		_log.info(DavidGilmour.perform());

		((ClassPathXmlApplicationContext) context).close();
	}

}
