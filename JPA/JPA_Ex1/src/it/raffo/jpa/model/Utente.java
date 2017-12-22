package it.raffo.jpa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the utente database table.
 * 
 */
@Entity
@Table(name="utente")
@NamedQuery(name="Utente.findAll", query="SELECT u FROM Utente u")
public class Utente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="UTENTE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UTENTE_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=45)
	private String nome;

	public Utente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}