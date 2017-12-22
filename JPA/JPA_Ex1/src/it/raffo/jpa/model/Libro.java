package it.raffo.jpa.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Libro
 *
 */
@Entity
@Table(name="libro")
@NamedQueries({
@NamedQuery(name="Libro.findAll", query="SELECT b FROM Libro b")
})
public class Libro implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String autore;
	private String titolo;
	private static final long serialVersionUID = 1L;

	public Libro() {
		super();
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash=0;
		hash+=(id !=null ? id.hashCode() : 0);
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getAutore() {
		return this.autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}   
	public String getTitolo() {
		return this.titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
   
}
