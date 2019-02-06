package it.raffo.code.views.beans;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

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

	@EJB
	private TestProducer		testProducer;

	@PostConstruct
	public void init()
	{
	}

	public void sendMsg()
	{
		if (this.testProducer != null)
		{
			log.info("-----------------> sendMsg()");
			this.testProducer.putOnQueue("ciaone");
		}
		else
		{
			log.info("EJB Injection is null");
		}
	}

}
