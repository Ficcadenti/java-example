package it.raffo.jndi;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.FormParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.MediaType;
import org.apache.log4j.Logger;

@RequestScoped
@Path("/")
public class SimpleRestService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		String str="Non impostata!!!!";
		InitialContext context;
		try {
			context = new InitialContext();
			str=(String)context.lookup("java:global/mystring_raffo");
		} catch (NamingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return str;
	}
}
