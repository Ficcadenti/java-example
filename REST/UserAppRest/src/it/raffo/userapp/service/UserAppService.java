package it.raffo.userapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import it.raffo.userapp.model.pojo.Esito;
import it.raffo.userapp.model.pojo.Users;
import it.raffo.userapp.util.Constants;

@ApplicationScoped
@Path("/")
@Produces({ "application/json" })
@Consumes({ "application/json" })
public class UserAppService
{
	private List<Users> uList = null;

	@PostConstruct
	public void init()
	{
		this.uList = new ArrayList<Users>();

		Users u = new Users();
		u.setId(1);
		u.setNome("Raffaele");
		u.setCognome("Ficcadenti");
		u.setCf("FCCRFL76M14H501C");
		u.setProvincia("Roma");
		u.setTelefono("3404032010");
		u.setEta(43);
		u.setWww("http://raffaeleficcadenti.it");
		u.setMail("raffaele.ficcadenti@gmail.com");
		this.uList.add(u);

		u = new Users();
		u.setId(2);
		u.setNome("Valeria");
		u.setCognome("Greco");
		u.setCf("GHJKGLYGHSJKL");
		u.setProvincia("Roma");
		u.setTelefono("3408676455");
		u.setEta(18);
		u.setWww("http://raffaeleficcadenti.it");
		u.setMail("raffaele.ficcadenti@gmail.com");
		this.uList.add(u);
	}

	@GET
	@Path("/info")
	public Response info()
	{
		System.out.println("Test");
		return this.buildDefaultOkResponse(new String("Ciao mondo!!!!")).build();
	}

	@GET
	@Path("/user")
	public Response user()
	{
		return this.buildDefaultOkResponse(this.getuList()).build();
	}

	@GET
	@Path("/user/{id}")
	public Response getUser(@PathParam(value = "id") int id)
	{
		Optional<Users> u = this.uList.stream().filter(e -> e.getId() == id).findFirst();
		if (u.isPresent())
		{
			return this.buildDefaultOkResponse(u.get()).build();
		}
		else
		{
			return Response.status(Response.Status.NOT_FOUND).entity("Id not found").build();
		}
	}

	@PUT
	@Path("/usermod")
	public Response updateUser(Users user)
	{
		Esito esito = new Esito();
		System.out.println("User to update: " + user);
		Optional<Users> u = this.uList.stream().filter(e -> e.getId() == user.getId()).findFirst();

		if (u.isPresent())
		{
			int idx = this.uList.indexOf(u.get());
			System.out.println("Utente trovato in posizione idx=" + idx);
			this.uList.remove(idx);
			this.uList.add(idx, user);
			this.uList.stream().forEach(e -> System.out.println(e));
			esito.setCodice(Constants.OK);
			esito.setMsg("Utente modificato");
			return this.buildDefaultOkResponse(esito).build();
		}
		else
		{
			esito.setCodice(Constants.KO);
			esito.setMsg("Id not found");
			return Response.status(Response.Status.NOT_FOUND).entity(esito).build();

		}

	}

	@POST
	@Path("/useradd")
	public Response userAdd(Users user)
	{
		Esito esito = new Esito();
		System.out.println("User to add: " + user);
		this.uList.add(user);
		this.uList.stream().forEach(e -> System.out.println(e));
		esito.setCodice(Constants.OK);
		esito.setMsg("Utente inserito");
		return this.buildDefaultOkResponse(esito).build();
	}

	@DELETE
	@Path("/userdel/{id}")
	public Response userDel(@PathParam(value = "id") int id)
	{
		Esito esito = new Esito();
		System.out.println("utente da cancellare: " + id);
		Optional<Users> u = this.uList.stream().filter(e -> e.getId() == id).findFirst();
		if (u.isPresent())
		{
			this.uList.remove(u.get());
			this.uList.stream().forEach(e -> System.out.println(e));
			esito.setCodice(Constants.OK);
			esito.setMsg("User removed");
			return this.buildDefaultOkResponse(esito).build();
		}
		else
		{
			System.out.println("utente non presente");
			esito.setCodice(Constants.KO);
			esito.setMsg("Id not found");
			return Response.status(Response.Status.NOT_FOUND).entity(esito).build();
		}
	}

	// @OPTIONS
	// @Path("/usermod")
	// public Response preflight()
	// {
	// System.out.println("preflight");
	//
	// return
	// this.buildDefaultOkResponse(null).header("Access-Control-Allow-Headers",
	// "content-type").header("Access-Control-Allow-Methods", "POST, PUT,
	// DELETE").build();
	// }

	// @OPTIONS
	// @Path("/useradd")
	// public Response preflight2()
	// {
	// System.out.println("preflight2");
	//
	// return
	// this.buildDefaultOkResponse(null).header("Access-Control-Allow-Headers",
	// "content-type").header("Access-Control-Allow-Methods", "POST, PUT,
	// DELETE").build();
	// }
	//
	// @OPTIONS
	// @Path("/userdel/2")
	// public Response preflight3()
	// {
	// System.out.println("preflight3");
	//
	// return
	// this.buildDefaultOkResponse(null).header("Access-Control-Allow-Headers",
	// "content-type").header("Access-Control-Allow-Methods", "POST,
	// PUT,DELETE").build();
	// }

	private ResponseBuilder buildDefaultOkResponse(Object entity)
	{
		return Response.status(Response.Status.OK).entity(entity).header("Access-Control-Allow-Origin", "*");
	}

	public List<Users> getuList()
	{
		return this.uList;
	}

	public void setuList(List<Users> uList)
	{
		this.uList = uList;
	}
}
