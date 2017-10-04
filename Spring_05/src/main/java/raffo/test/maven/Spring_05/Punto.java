package raffo.test.maven.Spring_05;

public class Punto {
	private int x;
	private int y;
	private int z;
	
	public void draw()
	{
		System.out.println("(x,y,z)=("+x+","+y+","+z+")");
	}
	
	public Punto() {
		super();
	}
	
	public Punto(int x, int y,int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
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
}
