package com.raffo.servlet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

import com.service.mysql.MySQLConnection;


public class MyTagBody extends BodyTagSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8699072287719518440L;

	private String query;
	
	/**
	 * L'attributo viene utilizzato per definire uno stile
	 */
	private String className;

	/**
	 * L'attributo viene utilizzato per definire il nome utente
	 */
	private String user = "root";
	
	/**
	 * L'attributo viene utilizzato per definire il nome utente
	 */
	private String password = "raffo";
	
	/**
	 * L'attributo viene utilizzato per definire il nome utente
	 */
	private String schema;
	
	/**
	 * L'attributo viene utilizzato per definire il nome utente
	 */
	private String host;
	
	/**
	 * L'attributo viene utilizzato per definire il nome utente
	 */
	private String port;

	/**
	 * Metodi getter and setter
	 */
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public String getSchema() {
		return schema;
	}

	public void setSchema(String s) {
		this.schema = s;
	}

	
	public String getHost() {
		return host;
	}

	public void setHost(String h) {
		this.host = h;
	}
	
	public String getPort() {
		return port;
	}

	public void setPort(String p) {
		this.port = p;
	}

	public void setUser(String u){
		this.user = u;
	}

	public String getUser(){
		return this.user;
	}
	
	public void setPassword(String p){
		this.password = p;
	}

	public String getPassword(){
		return this.password;
	}


	public int doStartTag() throws JspException 
	{
		try 
		{
			//Recupero lo stream di output e scrivo il contenuto personalizzato
			JspWriter out = pageContext.getOut();

			//L'attributo className � definito obbligatorio nel tld
			out.println("<div class=\""+className+"\">");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return EVAL_BODY_BUFFERED;
	}

	public int doAfterBody() throws JspException 
	{
		
		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException 
	{
		int nCol=0;
		ResultSetMetaData rsmd = null;
		
		BodyContent bc = getBodyContent();
		MySQLConnection connect=new MySQLConnection(this.user,this.password,this.host,this.schema);
		
		if(bc!=null)
		{
			query = bc.getString();
			printMessage(connect.getSID());
			printMessage(query);
			
			ResultSet rs=connect.Query_rs(query);

			try 
			{
				rsmd = rs.getMetaData();
				nCol=rsmd.getColumnCount();
			} 
			catch (SQLException e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			if(rs!=null)
			{
				try 
				{
					printTable("<table class=\""+this.className+"\">");
					printTable("<thead>");
					printTable("<tr>");
					for(int i=1;i<=nCol;i++)
					{
						printTable("<th><b>"+rsmd.getColumnName(i)+"</b></th>");
					}
					printTable("</tr>");
					printTable("</thead>");
					printTable("<tbody>");
					while(rs.next())
					{
						printTable("<tr id=\"riga\" bgcolor=\"#ffffd6\">");
						for(int i=1;i<=nCol;i++)
						{
							printTable("<td>"+rs.getString(i)+"</td>");
						}
						printTable("</tr>");
					}
					printTable("</tbody>");
					printTable("</table>");
				} 
				catch (SQLException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			bc.clearBody();
		}
		
		try {
			JspWriter out = pageContext.getOut();
			out.println("</div>");
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return EVAL_PAGE;
	}

	private void printMessage(String message) throws JspException  
	{
		try {
			pageContext.getOut().println(message + "<br>");
		}
		catch(IOException ioe) 
		{
			throw new JspException(ioe.toString());
		}
	}
	
	private void printTable(String message) throws JspException  
	{
		try {
			pageContext.getOut().println(message);
		}
		catch(IOException ioe) 
		{
			throw new JspException(ioe.toString());
		}
	}

}
