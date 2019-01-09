package pattern.creazione.builder;

public class B
{
	private C c;

	B(C c)
	{
		this.c = c;
	}

	public void info()
	{
		System.out.println("############# B.info()");
	}
}
