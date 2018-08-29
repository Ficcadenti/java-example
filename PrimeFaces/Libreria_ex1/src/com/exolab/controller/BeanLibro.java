package com.exolab.controller;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.DragDropEvent;

import com.exolab.dao.LibroDao;
import com.exolab.dto.DtoLibri;

@Named
@SessionScoped
public class BeanLibro implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	private List<DtoLibri> libri;
	private LibroDao dao;
	
	@PostConstruct
	public void init() {
	dao = new LibroDao();
	}

	public List<DtoLibri> getLibri() {
		return libri;
	}

	public void setLibri(List<DtoLibri> libri) {
		this.libri = libri;
	}
	
	public void populateLibri() {
		try {
			libri = dao.selectAll();
		} catch (SQLException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Lista non inizializzata",null));
			e.printStackTrace();
		}
	}
	
	public void deleteLibro(DragDropEvent ddEvent) {
		try {
			DtoLibri libro = (DtoLibri) ddEvent.getData();
			dao.delete(libro.getIsbn());
			populateLibri();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
