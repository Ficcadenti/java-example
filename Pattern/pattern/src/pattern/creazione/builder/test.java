package pattern.creazione.builder;

public class test
{

	public static void main(String[] args)
	{
		Builder b = new Builder();
		A a = b.get(1);
		a.info();
	}

}
