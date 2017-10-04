package raffo.test.maven.Spring_04;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class BookClient 
{
	static Logger log;

	public static void main( String[] args )
	{
		//log4j
		log = org.apache.log4j.Logger.getLogger(BookClient.class);
		String log4jConfPath = "/resources/log4j.properties";
		PropertyConfigurator.configure(BookClient.class.getResource(log4jConfPath));

		// ...  reperimento dati
		log.info("Spring_04-JDBC Tutorial starting...");

		ApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"resources/beans.xml"});
		BeanFactory factory=context;
		BookDao bookDAO=(BookDao)factory.getBean("bookDao");
		
		//Insert Promessi Sposi
//	    Book book = new Book();
//	    book.setIsbn("12345678");
//	    book.setAuthor("Manzoni");
//	    book.setTitle("I Promessi Sposi");	    
//	    bookDAO.insert(book);
//	    log.info("Inserito:\t" + book);
		
		
	    List<Book> lista=bookDAO.findAllBooks();
	    for (Book b : lista)
	    	System.out.println("\t\t"+b.show());	    	    	

		((ClassPathXmlApplicationContext) context).close();

	}
}
