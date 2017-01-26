package com.raffo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Hibernate_01 
{

	final static Logger logger = Logger.getLogger(Hibernate_01.class);
	
	
    public static void main(String[] args) 
    {
    	//PropertyConfigurator.configure("log4j.properties");
    	String classpath = System.getProperty("java.class.path");
    	System.out.println("classpath="+classpath);
    			
    	
    	logger.info("Log su file : ");
    	
    	System.out.println("Persona Unit Test");
    	
    	// Recupero la sessione: attenzione, questa operazione
        // può essere gestita come un Singleton lungo tutta l’applicazione
         
        Session session=new Configuration().configure("/resources/hibernate.cfg.xml").buildSessionFactory().getCurrentSession();
        
         
        //Creo una nuova persona
        Persona p=new Persona();
        p.setId(101);
        p.setNome("Valeria");
        p.setCognome("Greco");
        p.setEmail("valeria5.gr@gmail.com");
        
        //Utilizziamo un modello transazionale dichiarativo
        session.beginTransaction();
         
        //Chiedo al middleware di salvare questo oggetto nel database
        session.save(p);
         
        //fine della transazione: salviamo tramite commit()
        session.getTransaction().commit();
        
        
        System.out.println("successfully saved");  
        session.close();
    }


}