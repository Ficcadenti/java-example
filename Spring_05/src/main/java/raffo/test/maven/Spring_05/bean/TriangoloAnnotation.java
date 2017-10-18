package raffo.test.maven.Spring_05.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class TriangoloAnnotation {
	private String tipo;
	private int altezza;
	private Punto pa1,pa2,pa3;
	
	public TriangoloAnnotation() {
		// TODO Auto-generated constructor stub
	}
	
	
	public TriangoloAnnotation(String tipo, int altezza, Punto pa1, Punto pa2, Punto pa3) {
		super();
		this.tipo = tipo;
		this.altezza = altezza;
		this.pa1 = pa1;
		this.pa2 = pa2;
		this.pa3 = pa3;
	}


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

	public Punto getPA1() {
		return pa1;
	}

	@Autowired
	public void setPA1(Punto pa1) {
		this.pa1 = pa1;
	}

	public Punto getPA2() {
		return pa2;
	}

	@Autowired
	public void setPA2(Punto pa2) {
		this.pa2 = pa2;
	}

	public Punto getPA3() {
		return pa3;
	}

	@Autowired
	public void setPA3(Punto pa3) {
		this.pa3 = pa3;
	}
	
	@Override
	public String toString()
	{
		String str;
		str = String.format("\nTringolo: %s"
				+ "\n Altezza: %d"
				+ "\n p1: (%d,%d)"
				+ "\n p2: (%d,%d)"
				+ "\n p3: (%d,%d)",this.tipo,this.altezza,pa1.getX(),pa1.getY(),pa2.getX(),pa2.getY(),pa3.getX(),pa3.getY());
		return str;
		
	}

	

}
