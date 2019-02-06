package it.raffo.code.views.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

import it.raffo.code.TestProducer;

@ManagedBean
@javax.faces.bean.ApplicationScoped
public class CodeBean implements Serializable
{

	/**
	 *
	 */
	private static final long	serialVersionUID	= -7483870296607162673L;
	private static final Logger	log					= Logger.getLogger(CodeBean.class);
	private String				msg					= null;

	@EJB
	private TestProducer		testProducer;

	public void addMessage(String summary)
	{
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", summary);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public String getMsg()
	{
		return this.msg;
	}

	@PostConstruct
	public void init()
	{
	}

	public void sendMsg()
	{
		if (this.testProducer != null)
		{
			log.info("-----------------> sendMsg()");
			this.testProducer.putOnQueue(this.getMsg());
			this.addMessage("Messaggio inviato alla coda!!!!");
			this.setMsg(null);
		}
		else
		{
			log.info("EJB Injection is null");
		}
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

}
