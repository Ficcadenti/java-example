package it.raffo.mybatis.ex1.model.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import it.raffo.mybatis.ex1.model.pojo.Persona;

public interface TestMapper
{

	static final String	SELECT_PERSONA_BY_ID	= "SELECT * FROM PERSONA WHERE id = #{id}";
	static final String	SELECT_ALL_PERSONA		= "SELECT * FROM PERSONA";
	static final String	SELECT_COUNT_PERSONA	= "SELECT COUNT(0) FROM PERSONA";
	static final String	MODIFICA_NOME_PERSONA	= "update PERSONA set NOME=#{nome} where COGNOME=#{cognome}";

	@Select(SELECT_COUNT_PERSONA)
	public int countPersone();

	@Update(MODIFICA_NOME_PERSONA)
	public boolean modificaNomePersona(@Param("nome") String nome, @Param("cognome") String cognome);

	@Select(SELECT_ALL_PERSONA)
	@ResultType(Persona.class)
	public List<Persona> selectAllPersona();

	@Select(SELECT_PERSONA_BY_ID)
	@ResultType(Persona.class)
	public Persona selectPersonaByID(int id);
}
