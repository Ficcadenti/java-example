package com.service.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;


public class MySQLConnection
{
 
    
    private Connection  con         = null;
    private Statement   st          = null;
    private String      user        = "";
    private String      pswd        = "";
    private String      host        = "";
    private String      port        = "3306";
    private String      schema      = "";
    private boolean     connOK      = false;
    private String      conn_sid    = "";
    /** Creates a new instance of MySQLConnection */
    

    public MySQLConnection(String user,String pswd,String host,String schema)
    {

        this.user=user;
        this.pswd=pswd;
        this.host=host;
        this.schema=schema;
        connOK=LoadDriver();
        if(connOK)
        {
            System.out.println("MySQLConnection(): Connesione to MySQL OK.");
        }
    }
    
    public MySQLConnection(String user,String pswd,String host,String port,String schema)
    {

        this.user=user;
        this.pswd=pswd;
        this.host=host;
        this.port=port;
        this.schema=schema;
        connOK=LoadDriver();
        if(connOK)
        {
            System.out.println("MySQLConnection(): Connesione to MySQL OK.");
        }
    }
    
    
    public String getSID()
    {
        return conn_sid;
    }
    
    public boolean LoadDriver ()
    {
        conn_sid="jdbc:mysql://"+this.host+":"+this.port+"/"+this.schema;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(conn_sid,this.user,this.pswd);
            
            return true;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            
            System.out.println("LoadDriver(): "+ex.toString());
            return false;
        }catch(ClassNotFoundException ex1)
        {
            System.out.println("ClassNotFoundException: " + ex1.getMessage());
            return false;
        }
    }
    
    public void close()
    {
    	try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public synchronized ResultSet Query_rs(String sqlstm)
    {
        if(connOK==false)
        {
            System.out.println("Query_rs(): NO CONNECTED.");
            return null;
        }
        
        ResultSet rsQuery = null;
        try
        {
            st = con.createStatement();
            rsQuery = st.executeQuery(sqlstm);
        }
        catch(java.sql.SQLException ex)
        {
            System.out.println("Query_rs(): "+ex.toString());
            rsQuery=null;
        }
        return (ResultSet)rsQuery;
    }
    
    public synchronized int QueryUpdate_rs(String sqlstm)
    {
        if(connOK==false)
        {
            System.out.println("QueryUpdate_rs(): NO CONNECTED.");
            return -1;
        }
        
        int rsQuery;
        try
        {
            st = con.createStatement();
            rsQuery = st.executeUpdate(sqlstm);
        }
        catch(java.sql.SQLException ex)
        {
            System.out.println("QueryUpdate_rs(): "+ex.toString());
            rsQuery=-1;
        }
        return (int)rsQuery;
    }
    
    public int getRowCount(ResultSet resultSet) {
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
    
}

