package it.raffo.mybatis.ex1.view.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.apache.log4j.Logger;

import it.raffo.mybatis.ex1.util.Constants;

@Named
@SessionScoped
public class MenuBean implements Serializable
{
	private static final long	serialVersionUID	= 2958135620185606357L;
	private static final Logger	log					= Logger.getLogger(MenuBean.class);
	private int					currentView			= Constants.MENU_HOME;

	public int getCurrentView()
	{
		log.info("Reading current view");
		return this.currentView;
	}

	public boolean isLogged()
	{
		final FacesContext context = FacesContext.getCurrentInstance();
		final String userLogged = (String) context.getExternalContext().getSessionMap().get("utente");
		return (userLogged != null) && !userLogged.isEmpty();
	}

	public void setCurrentView(int currentView)
	{
		log.info("Setting current view: " + currentView);
		this.currentView = currentView;
	}
}
