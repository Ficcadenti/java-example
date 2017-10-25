package raffo.test.maven.Spring_05.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Triangolo {
	private String tipo;
	private int altezza;
	private Punto p1,p2,p3;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public Punto getP3() {
		return p3;
	}

	public void setP3(Punto p3) {
		this.p3 = p3;
	}

	public Triangolo() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString()
	{
		String str;
		str = String.format("\nTringolo: %s"
				+ "\n Altezza: %d"
				+ "\n p1: (%d,%d)"
				+ "\n p2: (%d,%d)"
				+ "\n p3: (%d,%d)",this.tipo,this.altezza,p1.getX(),p1.getY(),p2.getX(),p2.getY(),p3.getX(),p3.getY());
		return str;
		
	}

	public Triangolo(String tipo, int altezza, Punto p1, Punto p2, Punto p3) {
		this.tipo = tipo;
		this.altezza = altezza;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public Triangolo(Punto p1, Punto p2, Punto p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
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
