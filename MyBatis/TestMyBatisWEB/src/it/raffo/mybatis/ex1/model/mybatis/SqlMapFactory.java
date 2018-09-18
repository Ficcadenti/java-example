package it.raffo.mybatis.ex1.model.mybatis;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;
import org.apache.ibatis.session.TransactionIsolationLevel;
import org.apache.log4j.Logger;

public class SqlMapFactory {

	private static Logger						log				= Logger.getLogger(SqlMapFactory.class);

	private final String						resource		= "it/raffo/mybatis/ex1/model/mybatis/sql-map-config.xml";

	private static ThreadLocal<SqlMapFactory>	THREAD_LOCAL	= new ThreadLocal<SqlMapFactory>() {
																	@Override
																	protected SqlMapFactory initialValue() {
																		return new SqlMapFactory();
																	}
																};

	private SqlSessionManager					sqlSessionManager;
	private SqlSessionFactory					sqlSessionFactory;
	private SqlSessionFactory					sqlSessionFactoryUnManaged;
	private SqlSession							sqlSession;
	private SqlSession							sqlSessionUnManaged;

	public static SqlMapFactory instance() {
		return THREAD_LOCAL.get();
	}

	private SqlMapFactory() {
	}

	private SqlSessionManager getSqlSessionManager() {
		if (instance().sqlSessionManager == null) {
			instance().sqlSessionManager = SqlSessionManager.newInstance(instance().getSqlSessionFactory());
		}

		return instance().sqlSessionManager;
	}

	private SqlSessionFactory getSqlSessionFactory() {

		if (instance().sqlSessionFactory == null) {
			try (Reader reader = Resources.getResourceAsReader(this.resource)) {
				SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
				instance().sqlSessionFactory = builder.build(reader);
			}
			catch (Exception e) {
				log.error(e, e);
				throw new RuntimeException("Errore nell'inizializzazione della classe SqlSessionFactory. Causa: " + e);
			}
		}

		return instance().sqlSessionFactory;
	}

	private SqlSessionFactory getSqlSessionFactoryUnManaged() {

		if (instance().sqlSessionFactoryUnManaged == null) {
			try (Reader reader = Resources.getResourceAsReader(this.resource)) {
				SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
				instance().sqlSessionFactoryUnManaged = builder.build(reader);
			}
			catch (Exception e) {
				log.error(e, e);
				throw new RuntimeException("Errore nell'inizializzazione della classe SqlSessionFactoryUnManaged. Causa: " + e);
			}
		}

		return instance().sqlSessionFactoryUnManaged;
	}

	public SqlSession openSession() {
		if (instance().sqlSession == null) {
			instance().sqlSession = instance().getSqlSessionFactory().openSession();
		}
		return instance().sqlSession;
	}

	public SqlSession openSessionNoAutoCommit() {
		if (instance().sqlSession == null) {
			instance().sqlSession = instance().getSqlSessionFactory().openSession(false);
		}
		return instance().sqlSession;
	}

	public void commitSession() {
		if (instance().sqlSession != null) {
			instance().sqlSession.commit();
		}
	}

	public void closeSession() {
		if (instance().sqlSession != null) {
			instance().sqlSession.close();
			instance().sqlSession = null;
		}
	}

	public void rollbackSession() {
		if (instance().sqlSession != null) {
			instance().sqlSession.rollback();
		}

	}

	public <T> T getMapper(Class<T> type) {
		if (instance().sqlSession != null) {
			return instance().sqlSession.getMapper(type);
		}
		return null;
	}

	public void openSessionLocalManaged() {
		if (instance().sqlSessionManager == null) {
			instance().getSqlSessionManager().startManagedSession(ExecutorType.SIMPLE, TransactionIsolationLevel.READ_COMMITTED);
		}
	}

	public void commitSessionLocalManaged() {
		if (instance().sqlSessionManager != null) {
			instance().sqlSessionManager.commit();
		}
	}

	public void closeSessionLocalManaged() {
		if (instance().sqlSessionManager != null) {
			instance().sqlSessionManager.close();
			instance().sqlSessionManager = null;
		}
	}

	public void rollbackSessionLocalManaged() {
		if (instance().sqlSessionManager != null) {
			instance().sqlSessionManager.rollback();
		}

	}

	public <T> T getMapperLocalManaged(Class<T> type) {
		if (instance().sqlSessionManager != null) {
			return instance().sqlSessionManager.getMapper(type);
		}
		return null;
	}

	public SqlSession openSessionUnManaged() {
		if (instance().sqlSessionUnManaged == null) {
			instance().sqlSessionUnManaged = instance().getSqlSessionFactoryUnManaged().openSession();
		}
		return instance().sqlSessionUnManaged;
	}

	public SqlSession openSessionNoAutoCommitUnManaged() {
		if (instance().sqlSessionUnManaged == null) {
			instance().sqlSessionUnManaged = instance().getSqlSessionFactoryUnManaged().openSession(false);
		}
		return instance().sqlSessionUnManaged;
	}

	public void commitSessionUnManaged() {
		if (instance().sqlSessionUnManaged != null) {
			instance().sqlSessionUnManaged.commit();
		}
	}

	public void closeSessionUnManaged() {
		if (instance().sqlSessionUnManaged != null) {
			instance().sqlSessionUnManaged.close();
			instance().sqlSessionUnManaged = null;
		}
	}

	public void rollbackSessionUnManaged() {
		if (instance().sqlSessionUnManaged != null) {
			instance().sqlSessionUnManaged.rollback();
		}

	}

	public <T> T getMapperUnManaged(Class<T> type) {
		if (instance().sqlSessionUnManaged != null) {
			return instance().sqlSessionUnManaged.getMapper(type);
		}
		return null;
	}

}
