package it.raffo.restfull;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import it.raffo.restfull.bean.User;


@Path("/")
public class testRESTService {
	@POST
	@Path("/test_post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crunchifyREST(InputStream incomingData) {
		StringBuilder crunchifyBuilder = new StringBuilder();
		try {

			SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 

			User user1 = new User();
			user1.setId(1);
			user1.setName("Raffaele");
			user1.setSurname("Ficcadenti");
			try {
				user1.setBirtday(ft.parse("1976-08-14"));
			} catch (ParseException e) {
				e.printStackTrace();
			}

			Gson gson = new Gson();     
			String usersJson = gson.toJson(user1);        
			System.out.println(usersJson);
			crunchifyBuilder.append(usersJson);


		} catch (Exception e) {
			System.out.println("Error Parsing: - ");
		}
		System.out.println("Data Received: " + crunchifyBuilder.toString());

		// return HTTP response 200 in case of success
		return Response.status(200).entity(crunchifyBuilder.toString()).build();
	}

	@GET
	@Path("/test_get")
	@Produces(MediaType.APPLICATION_JSON)
	public Response verifyRESTService(InputStream incomingData) {
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 

		User user1 = new User();
		user1.setId(1);
		user1.setName("Luca");
		user1.setSurname("Ficcadenti");
		try {
			user1.setBirtday(ft.parse("1976-11-13"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Gson gson = new Gson();     
		String usersJson = gson.toJson(user1);  
		System.out.println(usersJson);

		// return HTTP response 200 in case of success
		return Response.status(200).entity(usersJson).build();
	}

}
