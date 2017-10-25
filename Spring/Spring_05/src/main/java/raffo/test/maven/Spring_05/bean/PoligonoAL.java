package raffo.test.maven.Spring_05.bean;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PoligonoAL {
	private String tipo;
	private ArrayList<Punto> punti;

	public PoligonoAL() {
	}
	
	public PoligonoAL(String tipo, ArrayList<Punto> punti) {
		this.tipo = tipo;
		this.punti = punti;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Punto> getPunti() {
		return punti;
	}

	public void setPunti(ArrayList<Punto> punti) {
		this.punti = punti;
	}
	
	@Override
	public String toString()
	{
		String str = "";
		int cont   = 0;
		str=String.format("\nPoligono: %s",this.tipo);
		for(Punto p: this.punti)
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
