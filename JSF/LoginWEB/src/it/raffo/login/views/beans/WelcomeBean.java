package it.raffo.login.views.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.apache.log4j.Logger;

@Named
@SessionScoped
public class WelcomeBean implements Serializable
{

	/**
	 *
	 */
	private static final long	serialVersionUID	= -3999966691675475335L;
	private static final Logger	log					= Logger.getLogger(WelcomeBean.class);
	private String				infoBean;
	private boolean				isLogged;
	private String				username;
	private String				passwrd;

	public void addMessage(String summary)
	{
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", summary);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public String getInfoBean()
	{
		return this.infoBean;
	}

	public String getPasswrd()
	{
		return this.passwrd;
	}

	public String getUsername()
	{
		return this.username;
	}

	@PostConstruct
	public void initBean()
	{
		log.info("initBean()");
		this.setLogged(false);
		this.setInfoBean("WelcomeBean");
	}

	public boolean isLogged()
	{
		return this.isLogged;
	}

	public String login()
	{
		log.info("login()");
		if (this.getUsername().equals("raffo") && this.getPasswrd().equals("1234"))
		{
			this.addMessage(this.getUsername());
			return "/pages/index?faces-redirect=true";
		}
		else
		{
			return "/pages_error/error?faces-redirect=true";
		}
	}

	public void setInfoBean(String infoBean)
	{
		this.infoBean = infoBean;
	}

	public void setLogged(boolean isLogged)
	{
		this.isLogged = isLogged;
	}

	public void setPasswrd(String passwrd)
	{
		this.passwrd = passwrd;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

}
