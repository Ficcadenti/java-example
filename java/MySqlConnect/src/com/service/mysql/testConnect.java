package com.service.mysql;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class testConnect {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test Connect");
		int nCol=0;
		int nRow=0;
		ResultSetMetaData rsmd = null;

		MySQLConnection connect=new MySQLConnection("root","raffo","localhost","3306","phpexample");
		ResultSet rs=connect.Query_rs("SELECT * from tab_01");
		
		System.out.println(connect.getSID());
		try 
		{
			rsmd = rs.getMetaData();
			nCol=rsmd.getColumnCount();
			nRow=connect.getRowCount(rs);
			System.out.println("Numero colonne="+nCol);
			System.out.println("Numero righe="+nRow);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(rs!=null)
		{
			try {
				while(rs.next())
				{
					for(int i=1;i<=nCol;i++)
					{
						System.out.print(rsmd.getColumnName(i)+"("+rsmd.getColumnTypeName(i)+")="+rs.getString(i)+"   ");
					}
					System.out.println("");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		connect.close();
		
	}

}
