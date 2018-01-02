package it.raffo.jaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;


@XmlRootElement(name="root")
public class Utente {
	private Long id;
	private String name;
	private String email;
	
	
	private List<Libro> libri;
	
	public Utente() {
		super();
		libri=new ArrayList<Libro>();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElementWrapper
	@XmlElement(name="libro")
	public List<Libro> getLibri() {
		return libri;
	}
	public void setLibri(List<Libro> libri) {
		this.libri = libri;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
