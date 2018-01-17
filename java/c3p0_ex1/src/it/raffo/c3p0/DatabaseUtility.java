package it.raffo.c3p0;
import java.beans.PropertyVetoException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DatabaseUtility {

	public DatabaseUtility() {
		// TODO Auto-generated constructor stub
	}

	public static ComboPooledDataSource getDataSource() throws PropertyVetoException
	{

		ComboPooledDataSource cpds = new ComboPooledDataSource(); 
		try {
			cpds.setDriverClass( "com.mysql.jdbc.Driver" );
			cpds.setJdbcUrl( "jdbc:mysql://localhost:3306/adplify_scheduler?autoReconnect=true&useSSL=false" ); 
			cpds.setUser("root"); 
			cpds.setPassword("root");
			// the settings below are optional -- c3p0 can work with defaults
			cpds.setMinPoolSize(5);
			cpds.setAcquireIncrement(5);
			cpds.setMaxPoolSize(20);
			cpds.setMaxStatements(180);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //loads the jdbc driver 

		return cpds;
	}
}
