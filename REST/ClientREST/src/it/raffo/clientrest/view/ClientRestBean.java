package it.raffo.clientrest.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import it.raffo.clientrest.util.HTTPSender;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class ClientRestBean implements Serializable
{

	/**
	 *
	 */
	private static final long	serialVersionUID	= -8157276713438474502L;
	// Logger
	private static final Logger	log					= LogManager.getLogger();
	private String				token				= null;

	public ClientRestBean()
	{

	}

	public String getToken()
	{
		return this.token;
	}

	@PostConstruct
	public void init()
	{
		if (this.token == null)
		{
			this.token = new String("da definire");
		}

		HTTPSender httpSender = new HTTPSender();
		try
		{
			httpSender.login("http://localhost:8080/REST_ex2/rest/jwt/login", "raffo");
			log.info("###################### CODE = " + httpSender.getStatusCode());
			log.info("###################### MSG  = " + httpSender.getResponseBody());
			if (httpSender.getStatusCode() == (Response.Status.OK.getStatusCode()))
			{
				this.token = httpSender.getToken();
			}

			log.info("###################### validate token");
			httpSender.validateToken("http://localhost:8080/REST_ex2/rest/jwt/validateToken");
			log.info("###################### CODE = " + httpSender.getStatusCode());
			log.info("###################### MSG  = " + httpSender.getResponseBody());
		}
		catch (Exception e)
		{
			log.error(e.getMessage(), e);
		}

	}

	public void setToken(String token)
	{
		this.token = token;
	}

}
