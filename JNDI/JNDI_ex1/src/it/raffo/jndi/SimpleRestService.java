package it.raffo.jndi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("/")
public class SimpleRestService {


	@Resource(lookup = "java:global/mystring")
	String miaString;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		return miaString;
	}
}
