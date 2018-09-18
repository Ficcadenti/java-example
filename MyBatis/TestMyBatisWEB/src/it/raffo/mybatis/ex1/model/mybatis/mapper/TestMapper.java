package it.raffo.mybatis.ex1.model.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import it.raffo.mybatis.ex1.model.pojo.Persona;

public interface TestMapper {
	static final String	SELECT_PERSONA_BY_ID	= "SELECT * FROM PERSONA WHERE id = #{id}";
	static final String	SELECT_ALL_PERSONA		= "SELECT * FROM PERSONA";

	@Select(SELECT_PERSONA_BY_ID)
	@ResultType(Persona.class)
	public Persona selectPersonaByID(int id);

	@Select(SELECT_ALL_PERSONA)
	@ResultType(Persona.class)
	public List<Persona> selectAllPersona();
}