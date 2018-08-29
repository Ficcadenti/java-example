package it.raffo.jaxrs;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("/info")
public class InfoResource
{

	@Inject
	private ApplicationData	appData;

	@Inject
	private SessionData		sessData;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getInfo()
	{
		String str = "";

		int appCounter = this.appData.incCounter();
		int sessCounter = this.sessData.incCounter();
		str = "\nappcounter = " + appCounter + ", sessCounter = " + sessCounter + "\n";
		return str;
	}

}
