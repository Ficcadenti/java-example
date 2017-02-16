package com.service.mysql;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class testConnect {

	private static int getRowCount(ResultSet resultSet) {
	    if (resultSet == null) {
	        return 0;
	    }
	    try {
	        resultSet.last();
	        return resultSet.getRow();
	    } catch (SQLException exp) {
	        exp.printStackTrace();
	    } finally {
	        try {
	            resultSet.beforeFirst();
	        } catch (SQLException exp) {
	            exp.printStackTrace();
	        }
	    }
	    return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test Connect");
		int nCol=0;
		int nRow=0;
		ResultSetMetaData rsmd = null;

		MySQLConnection connect=new MySQLConnection("root","raffo","localhost","3306","agile3");
		ResultSet rs=connect.Query_rs("SELECT * from tab_operators_lib");
		
		System.out.println(connect.getSID());
		try 
		{
			rsmd = rs.getMetaData();
			nCol=rsmd.getColumnCount();
			nRow=getRowCount(rs);
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
	}

}
