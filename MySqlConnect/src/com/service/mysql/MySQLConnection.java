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
    private boolean     connOK      = false;
    private String      conn_sid    = "";
    /** Creates a new instance of MySQLConnection */
    

    public MySQLConnection(String user,String pswd)
    {

        this.user=user;
        this.pswd=pswd;
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
        conn_sid="jdbc:mysql://10.10.10.151:3306/phpexample"+";"+this.user+";"+this.pswd;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://10.10.10.151:3306/phpexample",this.user,this.pswd);
            
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
    
}

