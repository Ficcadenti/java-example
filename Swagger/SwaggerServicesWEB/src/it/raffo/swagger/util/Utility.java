package it.raffo.swagger.util;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class Utility
{
	public static Response generateResponse(String mediaType, Object entity)
	{
		String entityStr = "";
		if (entity != null)
		{
			try
			{
				if (entity instanceof byte[])
				{
					entityStr = new String((byte[]) entity, "UTF-8");
				}
				else
				{
					entityStr = entity.toString();
				}
			}
			catch (Exception e)
			{

				e.printStackTrace();
				return Response.status(Status.INTERNAL_SERVER_ERROR).type(MediaType.APPLICATION_JSON)
						.entity("Impossibile generare la risposta in formato UTF-8").build();
			}
		}
		return Response.status(200).type(mediaType).entity(entityStr).build();
	}
}
