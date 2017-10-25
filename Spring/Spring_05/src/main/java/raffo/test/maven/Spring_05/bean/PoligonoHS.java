package raffo.test.maven.Spring_05.bean;

import java.util.HashSet;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PoligonoHS {
	private String tipo;
	private HashSet<Punto> punti;
	
	public PoligonoHS(String tipo, HashSet<Punto> punti) {
		super();
		this.tipo = tipo;
		this.punti = punti;
	}

	public PoligonoHS() {
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public HashSet<Punto> getPunti() {
		return punti;
	}

	public void setPunti(HashSet<Punto> punti) {
		this.punti = punti;
	}

	@Override
	public String toString()
	{
		String str = "";
		int cont=0;
		str=String.format("\nPoligono: %s",this.tipo);
		
		for (Punto p: this.punti) 
		{
		    str += String.format("\n p%d: (%d,%d)",cont++,p.getX(),p.getY());
		}
		

		return str;
	}

	@PostConstruct
	public void initIt() throws Exception {
		System.out.println("initIt("+tipo+")");
	}
	
	@PreDestroy
	public void cleanUp() throws Exception {
		System.out.println("cleanUp("+tipo+")");
	}

}
