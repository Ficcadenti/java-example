package pattern.creazione.builder;

public class A
{
	private B b;

	A(B b)
	{
		this.b = b;
	}

	public void info()
	{
		System.out.println("############# A.info()");
	}
}
