package raffo.test.maven.Spring_05.bean;


public class Punto {
	private int x;
	private int y;
	
	
	public void draw()
	{
		System.out.println("\n(x,y)=("+x+","+y+")");
	}
	
	@Override
	public String toString()
	{
		String str;
		str = String.format("\n(x,y)=(%d,%d)",x,y);
		return str;
		
	}
	
	public Punto() {
		super();
	}
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void initIt() throws Exception {
		System.out.println("initIt("+Punto.class+")");
	}
	
	public void cleanUp() throws Exception {
		System.out.println("cleanUp("+Punto.class+")");
	}
}
