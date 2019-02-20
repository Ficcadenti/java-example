package pattern.creazione.abstractfactory.ex1;

public class A2 extends AstrattaA
{
	private String val;

	A2(String str)
	{
		this.val = str;
	}

	@Override
	public void info()
	{
		System.out.println("############# A2.info() val=" + this.val);
	}

}
