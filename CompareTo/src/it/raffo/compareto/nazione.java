package it.raffo.compareto;

public class nazione implements Comparable<nazione>{
	private String nome;
	private int codice;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public nazione(String nome, int codice) {
		super();
		this.nome = nome;
		this.codice = codice;
	}

	public nazione() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(nazione o) {
		int ret=0;
		ret = this.codice - o.getCodice();
		return ret;
	}

}
