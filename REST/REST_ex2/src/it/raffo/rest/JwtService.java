package it.raffo.rest;

import java.security.Key;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.crypto.MacProvider;

@RequestScoped
@Path("/jwt")
@Produces({ "application/json;charset=UTF-8" })
@Consumes({ "application/json" })
public class JwtService
{
	// Logger
	private static final Logger	log					= LogManager.getLogger();

	private final String		SYS_ROOT_VAR		= "jwt.secret.key";
	private String				base64SecretBytes	= "";
	private String				compactJws			= "";

	public JwtService()
	{
		// CREO LA CHIAVE SEGRETA CONOSCIUTA SOLO DAL SERVER
		Key secret = MacProvider.generateKey(SignatureAlgorithm.HS256);
		byte[] secretBytes = secret.getEncoded();
		// this.base64SecretBytes = Base64.getEncoder().encodeToString(secretBytes);
		this.base64SecretBytes = System.getProperty(this.SYS_ROOT_VAR);
		log.info("################### base64SecretBytes=" + this.base64SecretBytes);
	}

	private ResponseBuilder buildDefaultOkResponse(Object entity)
	{
		return Response.ok(entity).header("Token", this.compactJws).header("Access-Control-Allow-Origin", "*");
	}

	private ResponseBuilder buildKOTokenResponse(Object entity)
	{
		return Response.status(Response.Status.UNAUTHORIZED).entity(entity).header("Access-Control-Allow-Origin", "*");
	}

	@GET
	@Path("/{id}")
	public Response getId(@PathParam(value = "id") int id)
	{
		String ret = "test jwt id=" + id;
		return this.buildDefaultOkResponse(ret).build();
	}

	@POST
	@Path("/login")
	public Response login(@Context HttpHeaders headers)
	{
		headers.getRequestHeader("user-agent").get(0);

		Date dNow = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		Calendar c = Calendar.getInstance();
		c.setTime(dNow);
		c.add(Calendar.HOUR, 3);
		Date dExp = c.getTime();
		log.info("############### Data attuale      : " + sdf.format(dNow));
		log.info("############### Data di scadenza  : " + sdf.format(dExp));
		log.info("############### base64SecretBytes : " + this.base64SecretBytes);

		this.compactJws = Jwts.builder().setId("testuserid").setIssuedAt(dNow).setExpiration(dExp).setSubject("Joe")
				.setAudience("testAudienceId").signWith(SignatureAlgorithm.HS256, this.base64SecretBytes)
				.setHeaderParam("typ", "JWT").compact();

		return this.buildDefaultOkResponse("il token è stato generato.").build();

	}

	@GET
	@Path("/userAgent2")
	public Response userAgent(@Context HttpHeaders headers)
	{
		String userAgent = headers.getRequestHeader("user-agent").get(0);
		return Response.status(200).entity("addUser is called, userAgent : " + userAgent).build();
	}

	@GET
	@Path("/userAgent")
	public Response userAgent(@HeaderParam("user-agent") String userAgent)
	{
		return Response.status(Response.Status.OK).entity("addUser is called, userAgent : " + userAgent).build();
	}

	@POST
	@Path("/validateToken")
	public Response validateToken(@HeaderParam("Token") String token)
	{
		log.info("############### base64SecretBytes : " + this.base64SecretBytes);
		log.info("############### token=[" + token + "]");
		try
		{
			this.verificaToken(token);
			return this.buildDefaultOkResponse("il token è validoo.").build();
		}
		catch (Exception e)
		{
			return this.buildKOTokenResponse(e.getMessage()).build();
		}

	}

	private void verificaToken(String token) throws Exception
	{
		Claims claims = Jwts.parser().setSigningKey(this.base64SecretBytes).parseClaimsJws(token).getBody();
		log.info("---------------------------");
		log.info("ID         : " + claims.getId());
		log.info("Subject    : " + claims.getSubject());
		log.info("Issuer     : " + claims.getIssuer());
		log.info("Expiration : " + claims.getExpiration());
		log.info("Audience   : " + claims.getAudience());
	}

}
