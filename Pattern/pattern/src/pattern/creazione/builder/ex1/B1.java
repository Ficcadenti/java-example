package pattern.creazione.builder.ex1;

public class B1 extends B
{
	private B b;

	public B1(B b, C c)
	{
		super(c);
		this.b = b;
	}

	@Override
	public void info()
	{
		System.out.println("############# B1.info()");
	}

}
