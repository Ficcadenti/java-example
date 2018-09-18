package it.raffo.mybatis.ex1.view.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.apache.log4j.Logger;

import it.raffo.mybatis.ex1.model.dao.TestDAO;
import it.raffo.mybatis.ex1.model.pojo.Persona;
import it.raffo.mybatis.ex1.util.Constants;

@Named
@SessionScoped
public class MenuBean implements Serializable {
	private static final long	serialVersionUID	= 2958135620185606357L;
	private int					currentView			= Constants.MENU_HOME;
	private static final Logger	log					= Logger.getLogger(MenuBean.class);

	public int getCurrentView() {
		log.info("Reading current view");

		// prendo persona dal db
		Persona p = TestDAO.selectPersonaByID(2);
		log.info(p);

		List<Persona> pList = TestDAO.selectAllPersona();

		for (Persona e : pList) {
			log.info(e);
		}
		return this.currentView;
	}

	public void setCurrentView(int currentView) {
		log.info("Setting current view: " + currentView);
		this.currentView = currentView;
	}

	public boolean isLogged() {
		final FacesContext context = FacesContext.getCurrentInstance();
		final String userLogged = (String) context.getExternalContext().getSessionMap().get("utente");
		return userLogged != null && !userLogged.isEmpty();
	}
}
