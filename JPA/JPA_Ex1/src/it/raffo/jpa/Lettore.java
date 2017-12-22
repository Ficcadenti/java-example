package it.raffo.jpa;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import it.raffo.jpa.model.Libro;

/**
 * Entity implementation class for Entity: lettore
 *
 */
@Entity
@Table(name="lettore")
@NamedQueries({
@NamedQuery(name="Lettore.findAll", query="SELECT b FROM Lettore b")
})
public class Lettore implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	@OneToMany
	private List<Libro> libri;


	private static final long serialVersionUID = 1L;

	
	public Lettore() {
		super();
		libri=new ArrayList<Libro>();
	}   
	
	public List<Libro> getLibri() {
		return libri;
	}
	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
   
}
