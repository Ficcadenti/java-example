package it.raffo.c3p0;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;


import com.mchange.v2.c3p0.ComboPooledDataSource;

public class test_ex1 {

	public test_ex1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ComboPooledDataSource cpds = null;
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;

		System.out.println("C3P0 - Esempio 01");
		try {
			cpds = DatabaseUtility.getDataSource();
			System.out.println("Ok connessione");
			
			connection = cpds.getConnection();
			pstmt = connection.prepareStatement("select * from batch_lib");

			System.out.println("The Connection Object is of Class: " + connection.getClass());
			resultSet = pstmt.executeQuery();

			while (resultSet.next())
			{

				System.out.println(resultSet.getString(1) + "," + resultSet.getString(2) + "," + resultSet.getString(3));
			}

			cpds.close();
			
		}catch (PropertyVetoException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("errore 2");
		}
		
	}

}
