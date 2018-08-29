package com.exolab.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.primefaces.event.FlowEvent;

import com.exolab.dao.AutoreDao;
import com.exolab.dao.EditoreDao;
import com.exolab.dao.LibroDao;
import com.exolab.model.Autore;
import com.exolab.model.Editore;
import com.exolab.model.Libro;

@Named
@SessionScoped
public class BeanWizard implements Serializable {

	private static final long	serialVersionUID	= 1L;

	private Libro				libro;
	private Autore				autore;
	private Editore				editore;
	private LibroDao			libroDao;
	private EditoreDao			editoreDao;
	private AutoreDao			autoreDao;
	private Libro				libro2;
	private String				genere;

	private boolean				skip;

	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Autore getAutore() {
		return this.autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public Editore getEditore() {
		return this.editore;
	}

	public void setEditore(Editore editore) {
		this.editore = editore;
	}

	public LibroDao getLibroDao() {
		return this.libroDao;
	}

	public void setLibroDao(LibroDao libroDao) {
		this.libroDao = libroDao;
	}

	public EditoreDao getEditoreDao() {
		return this.editoreDao;
	}

	public void setEditoreDao(EditoreDao editoreDao) {
		this.editoreDao = editoreDao;
	}

	public AutoreDao getAutoreDao() {
		return this.autoreDao;
	}

	public void setAutoreDao(AutoreDao autoreDao) {
		this.autoreDao = autoreDao;
	}

	public String getGenere() {
		return this.genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public Libro getLibro2() {
		return this.libro2;
	}

	public void setLibro2(Libro libro2) {
		this.libro2 = libro2;
	}

	@PostConstruct
	private void init() {

		this.libro = new Libro();
		this.libro2 = new Libro();
		this.autore = new Autore();
		this.editore = new Editore();
		this.libroDao = new LibroDao();
		this.autoreDao = new AutoreDao();
		this.editoreDao = new EditoreDao();
	}

	public void save() {
		System.out.println(this.editore);
		System.out.println(this.autore);

		// try {
		//
		// this.libroDao.insert(this.libro);
		// this.autoreDao.insert(this.autore);
		// this.editoreDao.insert(this.editore);
		// this.libroDao.insert(this.libro2);
		// FacesMessage msg = new FacesMessage("Successful", "é stato inserito : " + this.libro.getTitolo());
		// FacesContext.getCurrentInstance().addMessage(null, msg);
		// }
		// catch (SQLException e) {
		// FacesMessage msg = new FacesMessage("Successless", "Inserimento fallito ");
		// FacesContext.getCurrentInstance().addMessage(null, msg);
		// e.printStackTrace();
		// }
	}

	public boolean isSkip() {
		return this.skip;
	}

	public void setSkip(boolean skip) {
		this.skip = skip;
	}

	public String onFlowProcess(FlowEvent event) {
		if (this.skip) {
			this.skip = false;
			return "confirm";
		}
		else {
			return event.getNewStep();
		}
	}
}
