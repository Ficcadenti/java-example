package com.raffo.servlet;

import java.io.IOException;

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
	private String nome;

	/**
	 * Metodi getter and setter
	 */
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setNome(String value){
		this.nome = value;
	}

	public String getNome(){
		return(nome);
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
		BodyContent bc = getBodyContent();
		MySQLConnection connect=new MySQLConnection("root","raffo");
		
		if(bc!=null)
		{
			query = bc.getString();
			/* esegui query */
			bc.clearBody();
		}
		printMessage(connect.getSID());
		printMessage("<table class=\"table table-sm\">                  "
				+"  <thead>                                       "
				+"    <tr id=\"riga\" bgcolor=\"#ffffd6\">        "
				+"      <th>#</th>                                "
				+"      <th>First Name</th>                       "
				+"      <th>Last Name</th>                        "
				+"      <th>Username</th>                         "
				+"    </tr>                                       "
				+"  </thead>                                      "
				+"  <tbody>                                       "
				+"    <tr id=\"riga\" bgcolor=\"#ffffd6\">                                        "
				+"      <th scope=\"row\">1</th>                    "
				+"      <td>Mark</td>                             "
				+"      <td>Otto</td>                             "
				+"      <td>@mdo</td>                             "
				+"    </tr>                                       "
				+"    <tr id=\"riga\" bgcolor=\"#ffffd6\">                                        "
				+"      <th scope=\"row\">2</th>                    "
				+"      <td>Jacob</td>                            "
				+"      <td>Thornton</td>                         "
				+"      <td>@fat</td>                             "
				+"    </tr>                                       "
				+"    <tr id=\"riga\" bgcolor=\"#ffffd6\">                                        "
				+"      <th scope=\"row\">3</th>                    "
				+"      <td>Larry </td>"
				+ "		<td> Bird</td>       "
				+"      <td>@twitter</td>                         "
				+"    </tr>                                       "
				+"  </tbody>                                      "
				+"</table>                                        ");
		
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
}
