package pattern.creazione.abstractfactory.ex1;

public class B1 extends AstrattaB
{

	private int val;

	B1(int i)
	{
		this.val = i;
	}

	@Override
	public void info()
	{
		System.out.println("############# B1.info() val=" + this.val);
	}

}
