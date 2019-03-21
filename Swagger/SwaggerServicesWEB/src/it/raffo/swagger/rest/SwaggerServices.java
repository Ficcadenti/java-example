package it.raffo.swagger.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import it.raffo.swagger.pojo.Centro;
import it.raffo.swagger.util.Constants;
import it.raffo.swagger.util.Utility;

@RequestScoped
@Path("/SwaggerServices")
@Produces({ MediaType.APPLICATION_JSON })
@Api(value = "SwaggerServices")
@SwaggerDefinition(tags = { @Tag(description = "Servizi utilizzati da SwaggerServices", name = "SwaggerServices") })
public class SwaggerServices
{
	private final String mediaType = MediaType.APPLICATION_JSON;

	@GET
	@Path("/DatiGenerali")
	@ApiOperation(value = "Test Swagger", response = Centro.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = Constants.MESSAGE_200),
			@ApiResponse(code = 403, message = Constants.MESSAGE_403),
			@ApiResponse(code = 404, message = Constants.MESSAGE_404),
			@ApiResponse(code = 406, message = Constants.MESSAGE_406),
			@ApiResponse(code = 500, message = Constants.MESSAGE_500) })
	public Response getDatiGenerali()
	{
		Gson gson = new Gson();

		Centro c = new Centro(20, 30);
		String ret = gson.toJson(c);

		Response response = Utility.generateResponse(this.mediaType, ret);

		return response;
	}
}
