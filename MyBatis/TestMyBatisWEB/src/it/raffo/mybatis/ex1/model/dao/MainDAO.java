package it.raffo.mybatis.ex1.model.dao;

import it.raffo.mybatis.ex1.model.mybatis.SqlMapFactory;
import it.raffo.mybatis.ex1.model.mybatis.mapper.TestMapper;

public class MainDAO {

	protected static TestMapper getMapper() {
		return SqlMapFactory.instance().getMapper(TestMapper.class);
	}

	public static void beginTransaction() {
		SqlMapFactory.instance().openSession();
	}

	public static void commitTransaction() {
		SqlMapFactory.instance().commitSession();
	}

	public static void closeTransaction() {
		SqlMapFactory.instance().closeSession();
	}

}
