package it.raffo.jpa;

import java.util.List;

import it.raffo.jpa.model.Libro;


public class testJPA {

	public static void main(String[] args) {
		System.out.println("Test JPA!!!");
		
		Controller c=new Controller();
		
		Lettore l=new Lettore();
		
		l.setNome("Valeria");
		
		c.addLettore(l);
		
		Libro lib=new Libro();
		lib.setAutore("Charles Bukowski");
		lib.setTitolo("Musica per organi caldi.");
		c.addLibro(l, lib);
		
		
		List<Lettore> lettori=c.getAllLettori();
		System.out.println("Trovati "+lettori.size()+" lettori !!!!!");
		for(Lettore l1: lettori)
		{
			System.out.println("Lettore: "+l1.getNome()+" ("+l1.getId()+")");
		}
	}

		
}
