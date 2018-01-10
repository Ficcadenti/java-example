package it.raffo.jaxb;


import java.io.StringWriter;

import javax.xml.bind.JAXB;

import it.raffo.jaxb.bean.Libro;
import it.raffo.jaxb.bean.Utente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("JAXB - Test v 1.0");
		
		Utente u=new Utente();
		u.setId((long) 10);
		u.setName("Raffaele");
		u.setEmail("raffaele.ficcadenti@gmail.com");
		
		Libro lib1=new Libro();
		lib1.setAutore("Charles Bukowski");
		lib1.setTitolo("Musica per organi caldi.");
		u.getLibri().add(lib1);
		
		Libro lib2=new Libro();
		lib2.setAutore("Charles Bukowski");
		lib2.setTitolo("Panino al prosciutto.");
		u.getLibri().add(lib2);
		
		StringWriter sw=new StringWriter();
		JAXB.marshal(u, sw);
		System.out.println(sw.toString()); 

		
	}
	
	
}