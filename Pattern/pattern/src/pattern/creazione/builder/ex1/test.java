package pattern.creazione.builder.ex1;

public class test
{

	public static void main(String[] args)
	{
		Builder b = new Builder();
		A a = b.get(1);
		a.info();
	}

}
