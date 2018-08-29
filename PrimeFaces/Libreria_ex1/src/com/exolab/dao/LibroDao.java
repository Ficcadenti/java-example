package com.exolab.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.exolab.dto.DtoLibri;
import com.exolab.model.Libro;
import com.exolab.utility.Connessione;
import com.exolab.utility.Controll;

public class LibroDao {


	public boolean insert(Libro libro) throws SQLException {

		String query;
		PreparedStatement st;
		
		query = "INSERT INTO libro(titolo, serie, collana, lingua, anno_pubblicazione, pagine, prezzo, isbn, genere, autore_id, editore_id) "+
						 "VALUE ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		st = Connessione.getConnection().prepareStatement(query);

		st.setString(1, libro.getTitolo());
		st.setString(2, libro.getSerie());		
		st.setString(3, libro.getCollana());
		st.setString(4, libro.getLingua());
		st.setInt(5, libro.getAnno());
		st.setInt(6, libro.getPagine());
		st.setDouble(7, libro.getPrezzo());
		st.setLong(8, libro.getIsbn());
		st.setString(9, libro.getGenere());
		st.setInt(10, libro.getId_autore());
		st.setInt(11, libro.getId_editore());
		
		System.out.println("-----------");
		System.out.println(libro.toString());
		System.out.println("-----------");
		return st.execute();
	}

	public boolean delete(long isbn) throws SQLException {

		String query;
		Statement st;

		query = "DELETE FROM libro WHERE isbn = '" + isbn + "';";
		st = Connessione.getConnection().createStatement();
		return st.executeUpdate(query) > 0;
	}

	public DtoLibri findByParams(String campo, Object valore) throws SQLException {

		DtoLibri libro = new DtoLibri();

		Statement stLibro;
		ResultSet rsLibro;

		
		String query = "SELECT l.titolo,CONCAT(a.nome, ' ', a.cognome) AS autore,l.anno_pubblicazione,l.lingua," + 
				  " l.serie, l.collana,l.pagine,l.prezzo, l. genere genere,e.nome editore FROM libro l JOIN " + 
				  "autore a ON l.autore_id = a.id JOIN editore ON e.id = l.editore_id" +
				  "WHERE " + campo + " = " + Controll.eliminaVirgoletteSingole(valore.toString()) + ";";
		
		stLibro = Connessione.getConnection().createStatement();
		rsLibro = stLibro.executeQuery(query);

		
		libro = new DtoLibri();
		libro.setAnno(rsLibro.getInt("anno_pubblicazione"));
		libro.setCollana(rsLibro.getString("collana"));
		libro.setIsbn(rsLibro.getInt("isbn"));
		libro.setLingua(rsLibro.getString("lingua"));
		libro.setPagine(rsLibro.getInt("pagine"));
		libro.setPrezzo(rsLibro.getDouble("prezzo"));
		libro.setSerie(rsLibro.getString("serie"));
		libro.setTitolo(rsLibro.getString("titolo"));
		libro.setAutore(rsLibro.getString("autore"));
		libro.setEditore(rsLibro.getString("editore"));
		libro.setGenere(rsLibro.getString("genere"));
		return libro;
	}

	public boolean update(String titolo, String genere, String serie, String collana, int anno, String lingua, int pagine, float prezzo, long isbn, long vecchio_isbn) throws SQLException {

		String query = "UPDATE libro SET titolo = '?', genere = '?', serie =  '?',collana = '? ',anno_pubblicazione = '?' ,lingua = '?',pagine = '?',prezzo = '?',isbn = "
									  + "'?' WHERE isbn = ?;";
		PreparedStatement st = Connessione.getConnection().prepareStatement(query);
		st.setString(1, titolo);
		st.setString(2, genere);
		st.setString(3, serie);
		st.setString(4, collana);
		st.setInt(5, anno);
		st.setString(6, lingua);
		st.setInt(7, pagine);
		st.setFloat(8, prezzo);
		st.setLong(9, isbn);
		st.setLong(10, vecchio_isbn);
		@SuppressWarnings("unused")
		ResultSet rs = st.executeQuery(query);

		return st.execute();
	}

	public List<DtoLibri> selectAll() throws SQLException {

		List<DtoLibri> libri = new ArrayList<>();
		
		String query = "SELECT l.titolo,CONCAT(a.nome, ' ', a.cognome) AS autore, l.isbn, l.anno_pubblicazione,l.lingua," + 
										  " l.serie, l.collana,l.pagine,l.prezzo, l.genere genere,e.nome editore FROM libro l JOIN " + 
										  "autore a ON a.id = l.autore_id JOIN editore e ON l.editore_id = e.id;";
		
		Statement stLibro = Connessione.getConnection().createStatement();
		ResultSet rsLibro = stLibro.executeQuery(query);
		
		DtoLibri libro = null;
		
		while(rsLibro.next()) {

			libro = new DtoLibri();
			libro.setIsbn(rsLibro.getLong("isbn"));
			libro.setAnno(rsLibro.getInt("anno_pubblicazione"));
			libro.setCollana(rsLibro.getString("collana"));
			libro.setLingua(rsLibro.getString("lingua"));
			libro.setPagine(rsLibro.getInt("pagine"));
			libro.setPrezzo(rsLibro.getDouble("prezzo"));
			libro.setSerie(rsLibro.getString("serie"));
			libro.setTitolo(rsLibro.getString("titolo"));
			libro.setAutore(rsLibro.getString("autore"));
			libro.setEditore(rsLibro.getString("editore"));
			libro.setGenere(rsLibro.getString("genere"));
			libri.add(libro);
		}
		return libri;
	}
}
