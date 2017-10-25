package raffo.test.maven.Spring_03;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReportClient {
	static Logger log;
	
	public static void main(String[] args) {

		String data = null;
		
		
		//log4j
		log = org.apache.log4j.Logger.getLogger(ReportClient.class);
		String log4jConfPath = "/resources/log4j.properties";
		PropertyConfigurator.configure(ReportClient.class.getResource(log4jConfPath));
	     
	    // ...  reperimento dati
		log.info("Spring_03 starting...");
	    ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"resources/beans.xml"});
	    BeanFactory factory=context;
	    ReportGenerator gen=(ReportGenerator)factory.getBean("reportGeneratorPDF");
	    gen.generate(data);
	    
	    ((ClassPathXmlApplicationContext) context).close();
	}
}