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

import com.exolab.dao.EditoreDao;
import com.exolab.dto.DtoEditori;

@Named
@SessionScoped
public class BeanEditore implements Serializable{


	private static final long serialVersionUID = 1L;

	private List<DtoEditori> editori;
	private EditoreDao dao;
	
	@PostConstruct
	public void init() {
		
		dao = new  EditoreDao();
	}

	public List<DtoEditori> getEditori() {
		return editori;
	}

	public void setEditori(List<DtoEditori> editori) {
		this.editori = editori;
	}
	
	public void populateEditori() {
		
		try {
			editori = dao.selectAll();
		} catch (SQLException e) {
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"lista non inizializzata",null));
			e.printStackTrace();
		}
	}
	
	public void deleteEditori(DragDropEvent ddEvent) {
		
		DtoEditori editore = (DtoEditori) ddEvent.getData();
		try {
			dao.delete(editore.getId());
			populateEditori();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
