package it.raffo.restfull;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import it.raffo.restfull.bean.User;


@Path("/")
public class testRESTService {
	
	private Map<String, List<String>> getQueryParams(String url) {
		try {
			Map<String, List<String>> params = new HashMap<String, List<String>>();
			String[] urlParts = url.split("\\?");
			if ((urlParts.length > 1) || (!url.isEmpty()) ) 
			{
				String query = "";

				if(urlParts.length > 1)
				{
					query=urlParts[1];
				}else
				{
					query=url;
				}

				for (String param : query.split("&"))
				{
					String[] pair = param.split("=");
					String key = URLDecoder.decode(pair[0], "UTF-8");
					String value = "";
					if (pair.length > 1) 
					{
						value = URLDecoder.decode(pair[1], "UTF-8");
					}

					List<String> values = params.get(key);

					if (values == null) 
					{
						values = new ArrayList<String>();
						params.put(key, values);
					}
					values.add(value);
				}
			}

			return params;
		} catch (UnsupportedEncodingException ex) {
			throw new AssertionError(ex);
		}
	}
	
	
	@POST
	@Path("/test_post")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test_post(InputStream incomingData) {
		StringBuilder crunchifyBuilder = new StringBuilder();
		try {
			

			BufferedReader br = new BufferedReader(new InputStreamReader(incomingData));
			String line="";
			StringBuffer result = new StringBuffer();
			while ((line = br.readLine()) != null) {
				result.append(line);
			}
			
			String queryParam=result.toString();
			Map<String, List<String>> p= getQueryParams(queryParam);

			for (Map.Entry<String,  List<String>> entry : p.entrySet()) {
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}

			
			
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
			crunchifyBuilder.append(usersJson);


		} catch (Exception e) {
			System.out.println("Error Parsing: - ");
		}

		// return HTTP response 200 in case of success
		return Response.status(200).entity(crunchifyBuilder.toString())
				.header("Access-Control-Allow-Origin", "*")
	            .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD")
				.build();
	}

	@GET
	@Path("/test_get/{name: .*}/{cognome: .*}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response test_get(@PathParam("name") String name,@PathParam("cognome") String cognome) {
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 

		User user1 = new User();
		user1.setId(1);
		user1.setName(name);
		user1.setSurname(cognome);
		try {
			user1.setBirtday(ft.parse("1976-11-13"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Gson gson = new Gson();     
		String usersJson = gson.toJson(user1);  
		System.out.println(usersJson);

		// return HTTP response 200 in case of success
		return Response.status(200).entity(usersJson)
				.header("Access-Control-Allow-Origin", "*")
	            .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD")
				.build();
	}

}
