package it.raffo.mybatis.ex1.model.dao;

import java.util.List;

import org.eclipse.persistence.exceptions.DatabaseException;

import it.raffo.mybatis.ex1.model.pojo.Persona;

public class TestDAO extends MainDAO {
	public static Persona selectPersonaByID(int id) throws DatabaseException {
		beginTransaction();
		Persona p = getMapper().selectPersonaByID(id);
		commitTransaction();
		closeTransaction();
		return p;
	}

	public static List<Persona> selectAllPersona() {
		beginTransaction();
		List<Persona> p = getMapper().selectAllPersona();
		commitTransaction();
		closeTransaction();
		return p;
	}
}
