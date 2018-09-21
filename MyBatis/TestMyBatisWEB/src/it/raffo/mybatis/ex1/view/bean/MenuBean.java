package it.raffo.mybatis.ex1.view.bean;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Future;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

import it.raffo.ejb.view.ConverterBeanLocal;
import it.raffo.mybatis.ex1.model.dao.TestDAO;
import it.raffo.mybatis.ex1.model.pojo.Persona;
import it.raffo.mybatis.ex1.util.Constants;

@Named
@SessionScoped
public class MenuBean implements Serializable
{
	private static final long	serialVersionUID	= 2958135620185606357L;
	private static final Logger	log					= Logger.getLogger(MenuBean.class);
	private int					currentView			= Constants.MENU_HOME;

	private ConverterBeanLocal	ejbConverter		= null;
	private Future<String>		f					= null;

	@EJB
	private ConverterBeanLocal	converterBeanLocal;

	public int getCurrentView()
	{

		log.info("Reading current view");

		// prendo persona dal db
		Persona p = TestDAO.selectPersonaByID(2);
		log.info(p);

		List<Persona> pList = TestDAO.selectAllPersona();

		for (Persona e : pList)
		{
			log.info(e);
		}

		log.info("Ci sono " + TestDAO.countPersone() + " persone.");

		log.info(
				"Chiamata all'EJB (con injection): Conversion test:" + this.converterBeanLocal.celsiusToFahrenheit(30));

		if (this.ejbConverter == null)
		{
			try
			{

				InitialContext context = new InitialContext();

				this.ejbConverter = (ConverterBeanLocal) context.lookup(Constants.EJB_CONVERTER_JNDI);
				if (this.ejbConverter != null)
				{
					if (this.f == null)
					{
						this.f = this.ejbConverter.processoAsincrono();
					}
					log.info("Chiamata all'EJB (con lookup): f.isDone()=" + this.f.isDone());
				}
			}
			catch (NamingException e1)
			{
				log.error(e1.getMessage(), e1);
			}
		}
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
