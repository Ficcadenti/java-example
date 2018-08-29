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

import com.exolab.dao.AutoreDao;
import com.exolab.dto.DtoAutori;

@Named
@SessionScoped
public class BeanAutore implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	private List<DtoAutori> autori;
	private AutoreDao dao;
	
	@PostConstruct
	public void init() {
	dao = new AutoreDao();
	}

	public List<DtoAutori> getAutori() {
		return autori;
	}

	public void setAutori(List<DtoAutori> autori) {
		this.autori = autori;
	}
	
	public void populateAutori() {
		try {
			autori = dao.selectAll();
		} catch (SQLException e) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Lista non inizializzata",null));
			e.printStackTrace();
		}
	}
	
	public void deleteAutori(DragDropEvent ddEvent) {
		
		DtoAutori autore = (DtoAutori) ddEvent.getData();
		try {
			dao.delete(autore.getId());
			populateAutori();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}