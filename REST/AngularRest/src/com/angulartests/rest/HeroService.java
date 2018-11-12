package com.angulartests.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.angulartests.model.Hero;

@ApplicationScoped
@Path("/heroes")
@Produces({ "application/json" })
@Consumes({ "application/json" })
public class HeroService {

	final List<Hero> heroList = new ArrayList<>();

	{
		final String name = "Hero ";

		for (int i = 0; i < 20; i++) {
			final Hero hero = new Hero();
			hero.setId(i);
			hero.setName(name + (i + 1));
			this.heroList.add(hero);
		}
	}

	@GET
	public Response listHeroes(@QueryParam(value = "name") String term) {

		System.out.println("Name: " + term);

		if (term == null || term.isEmpty()) {
			System.out.println("listing");
			return buildDefaultOkResponse(this.heroList)
			        .build();
		} else {
			System.out.println("Searching");
			final String sTerm = term.toLowerCase();
			final List<Hero> heroRes = this.heroList.stream().filter(h -> h.getName().toLowerCase().contains(sTerm)).collect(Collectors.toList());
			System.out.println("Found: " + heroRes.size());
			return buildDefaultOkResponse(heroRes)
			        .build();
		}

	}

	@GET
	@Path("/{id}")
	public Response getHero(@PathParam(value = "id") int id) {
		final Hero hero = this.heroList.stream().filter(h -> h.getId() == id).findFirst().orElse(null);
		return buildDefaultOkResponse(hero).build();
	}

	@DELETE
	@Path("/{id}")
	public Response removeHero(@PathParam(value = "id") int id) {

		System.out.println("Hero id to remove: " + id);

		final Hero hero = this.heroList.stream().filter(h -> h.getId() == id).findFirst().orElse(null);
		this.heroList.remove(hero);
		return buildDefaultOkResponse(null).header("Access-Control-Allow-Headers", "content-type")
		        .header("Access-Control-Allow-Methods", "DELETE").build();
	}

	@POST
	public Response addHero(Hero hero) {
		final Hero last = this.heroList.get(this.heroList.size() - 1);
		hero.setId(last.getId() + 1);
		this.heroList.add(hero);
		return buildDefaultOkResponse(hero).build();
	}

	@PUT
	public Response updateHero(Hero hero) {

		System.out.println("Hero to upd: " + hero);
		final int index = this.heroList.indexOf(hero);
		this.heroList.remove(index);
		this.heroList.add(index, hero);

		return buildDefaultOkResponse(hero).build();
	}

	@OPTIONS
	public Response preflight() {
		System.out.println("preflight");

		return buildDefaultOkResponse(null)
		        .header("Access-Control-Allow-Headers", "content-type")
		        .header("Access-Control-Allow-Methods", "POST, PUT, DELETE")
		        .build();
	}

	@OPTIONS
	@Path("/{id}")
	public Response preflight2() {
		System.out.println("preflight");

		return buildDefaultOkResponse(null)
		        .header("Access-Control-Allow-Headers", "content-type")
		        .header("Access-Control-Allow-Methods", "POST, PUT, DELETE")
		        .build();
	}

	private ResponseBuilder buildDefaultOkResponse(Object entity) {
		return Response.ok(entity)
		        .header("Access-Control-Allow-Origin", "*");
	}

}
