package it.raffo.jaxrs;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
@Path("/info")
public class InfoResource {

	@Inject
	private ApplicationData appData;
	
//	@Inject
//	private SessionData sessData;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getInfo() {
//		int appCounter=appData.incCounter();
//		int sessCounter=sessData.incCounter();
//		String str="\nappcounter = "+appCounter+", sessCounter = "+sessCounter+"\n";
//        return str;	
		return appData.getInfo();
	}

}
