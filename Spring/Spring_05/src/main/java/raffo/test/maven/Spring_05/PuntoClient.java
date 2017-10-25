package raffo.test.maven.Spring_05;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import raffo.test.maven.Spring_05.bean.PoligonoAL;
import raffo.test.maven.Spring_05.bean.PoligonoHM;
import raffo.test.maven.Spring_05.bean.PoligonoHS;
import raffo.test.maven.Spring_05.bean.Punto;
import raffo.test.maven.Spring_05.bean.Triangolo;
import raffo.test.maven.Spring_05.bean.TriangoloAnnotation;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class PuntoClient 
{
	static Logger _log;

	public static void main( String[] args )
	{
		_log = org.apache.log4j.Logger.getLogger(PuntoClient.class);
		String log4jConfPath = "/resources/log4j.properties";
		PropertyConfigurator.configure(PuntoClient.class.getResource(log4jConfPath));

		_log.info( "Spring - Tutorial IoC & Bean!" );

		String[] resources={"classpath:/resources/beans.xml","classpath:/resources/beansAnnotation.xml"};

		ApplicationContext context=new ClassPathXmlApplicationContext(resources);
		BeanFactory factory=context;
		Punto p1=(Punto)factory.getBean("p1");
		System.out.println(p1);

		Punto p2=(Punto)factory.getBean("p2");
		System.out.println(p2);

		Punto p3=(Punto)factory.getBean("p3");
		System.out.println(p3);

		Triangolo tr1=(Triangolo) factory.getBean("triangolo1",Triangolo.class);
		System.out.println(tr1);

		Triangolo tr2=(Triangolo) factory.getBean("triangolo2",Triangolo.class);
		System.out.println(tr2);

		Triangolo tr3=(Triangolo) factory.getBean("triangolo3",Triangolo.class);
		System.out.println(tr3);

		Triangolo tr4=(Triangolo) factory.getBean("triangolo4",Triangolo.class);
		System.out.println(tr4);

		//       Inner bean 
		Triangolo tr5=(Triangolo) factory.getBean("triangolo5",Triangolo.class);
		System.out.println(tr5);

		//      Alias bean 
		Triangolo tr5_alias=(Triangolo) factory.getBean("T-triangle",Triangolo.class);
		System.out.println(tr5_alias);

		//      Bean con ArrayList 
		PoligonoAL pl1=(PoligonoAL) factory.getBean("pentagono",PoligonoAL.class);
		System.out.println(pl1);

		//      Bean con ArrayList 
		PoligonoAL pl2=(PoligonoAL) factory.getBean("quadrato",PoligonoAL.class);
		System.out.println(pl2);

		//      Bean con HashMap 
		PoligonoHM s=(PoligonoHM) factory.getBean("segmento",PoligonoHM.class);
		System.out.println(s);

		//      Bean con HashSet 
		PoligonoHS tr6=(PoligonoHS) factory.getBean("triangolo6",PoligonoHS.class);
		System.out.println(tr6);

		//      Bean con Autowired - byName
		Triangolo tr7=(Triangolo) factory.getBean("triangolo7",Triangolo.class);
		System.out.println(tr7);

		//      Bean con Autowired - constructor
		Triangolo tr8=(Triangolo) factory.getBean("triangolo8",Triangolo.class);
		System.out.println(tr8);
		
//      Bean con annotation Autowired 
		TriangoloAnnotation ta1=(TriangoloAnnotation) factory.getBean("ta1",TriangoloAnnotation.class);
		System.out.println(ta1);

		((ClassPathXmlApplicationContext) context).close();

	}
}
