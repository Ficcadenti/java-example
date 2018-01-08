package it.raffo.jndi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@RequestScoped
@Path("/")
public class SimpleRestService {

	@Resource(lookup = "java:/test1")
	DataSource datasource;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test() {
		
		StringBuilder sb=new StringBuilder();
		
		try {
			Connection conn=datasource.getConnection();
			Statement stm=conn.createStatement();
			ResultSet rs=stm.executeQuery("SELECT * FROM libro");
			
			while (rs.next())
			{
				int id=rs.getInt("ID");
				String autore=rs.getString("AUTORE");
				String titolo=rs.getString("TITOLO");
				sb.append("id=");
				sb.append(id);
				sb.append(", autore=");
				sb.append(autore);
				sb.append(", titolo=");
				sb.append(titolo);
				sb.append("\n");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb.toString();
	}
}
