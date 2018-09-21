package it.raffo.mybatis.ex1.view.bean;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Future;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

import it.raffo.ejb.view.CarrelloBeanLocal;
import it.raffo.ejb.view.ConverterBeanLocal;
import it.raffo.mybatis.ex1.model.dao.TestDAO;
import it.raffo.mybatis.ex1.model.pojo.Persona;
import it.raffo.mybatis.ex1.util.Constants;

@Named
@SessionScoped
public class TestEJBBean implements Serializable
{

	/**
	 *
	 */
	private static final long			serialVersionUID	= -3892871722989773209L;
	private static final Logger			log					= Logger.getLogger(TestEJBBean.class);

	private ConverterBeanLocal			ejbConverter		= null;
	private Future<String>				f					= null;

	@EJB
	private ConverterBeanLocal			converterBeanLocal;

	@EJB
	private CarrelloBeanLocal<String>	carrello;

	public TestEJBBean()
	{
		// TODO Auto-generated constructor stub
	}

	public void addMessage(String summary)
	{
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null));
	}

	public void testEJBStateless()
	{
		log.info("testEJBStateless()");
		this.addMessage("testEJBStateless");

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

	}

	public void testEJBStatfull()
	{
		log.info("testEJBStatfull()");
		this.addMessage("testEJBStatfull");
		this.carrello.addItem("Libro");
		this.carrello.addItem("Penna");

		log.info("Lista prodotti:");
		for (String item : this.carrello.getItems())
		{
			log.info(item);
		}
	}

	public void testMyBatis()
	{
		log.info("testMyBatis()");
		this.addMessage("testMyBatis");

		// prendo persona dal db
		Persona p = TestDAO.selectPersonaByID(2);
		log.info(p);
		List<Persona> pList = TestDAO.selectAllPersona();
		for (Persona e : pList)
		{
			log.info(e);
		}
		log.info("Ci sono " + TestDAO.countPersone() + " persone.");

	}

}
