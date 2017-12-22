package it.raffo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import it.raffo.jpa.model.Libro;

public class Controller {
	
	private final EntityManagerFactory emf;

	public Controller() {
		emf=Persistence.createEntityManagerFactory("JPA_Ex1"); 
	}
	
	
	public void addLettore(Lettore u)
	{
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		em.close();
	}
	
	public List<Lettore> getAllLettori()
	{
		EntityManager em= emf.createEntityManager();
		List<Lettore> ret=em.createNamedQuery("Lettore.findAll", Lettore.class).getResultList();
		em.close();
		return ret;
	}
	
	public void addLibro(Lettore u,Libro l)
	{
		System.out.println("ADD: "+l.getTitolo());
		EntityManager em= emf.createEntityManager();
		u.getLibri().add(l);
		em.getTransaction().begin();
		em.merge(u);
		em.getTransaction().commit();
		em.close();
	}
	

}
