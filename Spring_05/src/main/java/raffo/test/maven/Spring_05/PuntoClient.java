package raffo.test.maven.Spring_05;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class PuntoClient 
{
	static Logger log;
	
    public static void main( String[] args )
    {
    	log = org.apache.log4j.Logger.getLogger(PuntoClient.class);
		String log4jConfPath = "/resources/log4j.properties";
		PropertyConfigurator.configure(PuntoClient.class.getResource(log4jConfPath));
		
        System.out.println( "Spring - Tutorial IoC & Bean!" );
      
        
        
//        Punto p0=new Punto(1,0);
//        Punto p1=new Punto(10,0);
//        Punto p2=new Punto(5,5);
//        
//        p0.draw();
//        p1.draw();
//        p2.draw();
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"resources/beans.xml"});
		BeanFactory factory=context;
		Punto p=(Punto)factory.getBean("p0");
        p.draw();
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
