package pattern.creazione.abstractfactory;

public class A1 extends AstrattaA
{

	private String val;

	A1(String str)
	{
		this.val = str;
	}

	@Override
	public void info()
	{
		System.out.println("############# A1.info() val=" + this.val);
	}
}
