package com.exolab.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.exolab.dto.DtoAutori;
import com.exolab.model.Autore;
import com.exolab.utility.Connessione;

public class AutoreDao {

	public boolean insert(Autore autore) throws SQLException {

		String query;
		PreparedStatement st;

		query = "INSERT INTO autore(nome, cognome,anno_nascita,nazionalita) VALUE( ?, ?, ?, ?);";
		st = Connessione.getConnection().prepareStatement(query);
		st.setString(1, autore.getNome());
		st.setString(2, autore.getCognome());
		st.setInt(3, autore.getAnnoDiNascita());
		st.setString(4, autore.getNazionalita());
		System.out.println("-----------");
		System.out.println(autore.toString());
		System.out.println("-----------");
		return st.execute();
	}

	public boolean delete(int id) throws SQLException {

		String query;
		Statement st;

		query = "DELETE FROM autore WHERE id = " + id + ";";
		st = Connessione.getConnection().prepareStatement(query);
		return st.executeUpdate(query) > 0;
	}

	public DtoAutori findByParams(String campo, Object valore) throws SQLException {

		DtoAutori autore = new DtoAutori();

		PreparedStatement st;
		ResultSet rs;

		String query = "SELECT a.nome,a.cognome, a.nazionalita , a.anno_nascita,a.id " + "FROM autore a  " + "WHERE ? = '?';";

		st = Connessione.getConnection().prepareStatement(query);
		rs = st.executeQuery(query);
		st.setString(1, campo);
		st.setString(2, valore.toString());

		autore = new DtoAutori();
		autore.setNome(rs.getString("nome"));
		autore.setCognome(rs.getString("cognome"));
		autore.setEta(rs.getInt("anno_nascita"));
		autore.setNazionalita(rs.getString("nazionalita"));
		autore.setId(rs.getInt("id"));

		return autore;
	}

	public boolean update(String nome, String cognome, int anno, String nazionalita, long id) throws SQLException {

		String query = "UPDATE autore SET nome = '?', cognome = '?', anno_nascita ='?',nazionalita =' ?' WHERE id = ?;";
		PreparedStatement st = Connessione.getConnection().prepareStatement(query);
		st.setString(1, nome);
		st.setString(2, cognome);
		st.setInt(3, anno);
		st.setString(4, nazionalita);
		@SuppressWarnings("unused")
		ResultSet rs = st.executeQuery(query);

		return st.execute(query);
	}

	public List<DtoAutori> selectAll() throws SQLException {

		List<DtoAutori> autori = new ArrayList<>();

		String query = "SELECT * FROM autore;";

		Statement st = Connessione.getConnection().createStatement();
		ResultSet rs = st.executeQuery(query);

		DtoAutori autore;

		while (rs.next()) {

			autore = new DtoAutori();
			autore.setCognome(rs.getString("cognome"));
			autore.setEta(rs.getInt("anno_nascita"));
			autore.setNazionalita(rs.getString("nazionalita"));
			autore.setNome(rs.getString("nome"));
			autore.setId(rs.getInt("id"));
			autori.add(autore);
		}
		return autori;
	}
}
