package pattern.creazione.builder.ex1;

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
