package raffo.test.maven.Spring_05.bean;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PoligonoHM {
	
	private String tipo;
	private HashMap<Integer,Punto> punti;
	
	public PoligonoHM() {
		// TODO Auto-generated constructor stub
	}
	
	public PoligonoHM(String tipo, HashMap<Integer, Punto> punti) {
		super();
		this.tipo = tipo;
		this.punti = punti;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public HashMap<Integer, Punto> getPunti() {
		return punti;
	}

	public void setPunti(HashMap<Integer, Punto> punti) {
		this.punti = punti;
	}
	
	@Override
	public String toString()
	{
		String str = "";
		str=String.format("\nPoligono: %s",this.tipo);
		
		for (Entry<Integer, Punto>  entry : this.punti.entrySet()) 
		{
		    Integer key = entry.getKey();
		    Punto p     = entry.getValue();
		    str += String.format("\n p%d: (%d,%d)",key,p.getX(),p.getY());
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
