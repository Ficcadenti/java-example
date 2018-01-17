package com.raffo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;



public class Hibernate_01 
{

	final static Logger logger = Logger.getLogger(Hibernate_01.class);
	
	
    public static void main(String[] args) 
    {
    	InputStream in = null;
		String jsonData = "";
		BufferedReader br = null;
		String line = "";
		
		try 
		{
			in = Hibernate_01.class.getResourceAsStream("/resources/log4j.properties");
			System.out.println("log4j properties file: " + in);
			PropertyConfigurator.configure(in);
			
			in = Hibernate_01.class.getResourceAsStream("/resources/credenziali.json"); 
			br = new BufferedReader(new InputStreamReader(in));
						
			while ((line = br.readLine()) != null) 
			{
				jsonData += line + "\n";
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				if (br != null)
				{
					br.close();
				}
			} 
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
		
		
		System.out.println("File Content: \n" + jsonData);
		
    	JSONObject obj = new JSONObject(jsonData);

        /*obj.put("db_name", "hibernate_test");
        obj.put("login", "root");
        obj.put("password", "raffo");*/

        System.out.println("db_name="+obj.getString("db_name"));
        System.out.println("login="+obj.getString("login"));
        System.out.println("password="+obj.getString("password"));
        


        System.out.println(obj);
        
        
    	String classpath = System.getProperty("java.class.path");
    	System.out.println("classpath="+classpath);
    			
    	
    	logger.info("Logger su file : ");
    	
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