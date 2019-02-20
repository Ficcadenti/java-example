package pattern.creazione.abstractfactory.ex1;

public class B2 extends AstrattaB
{

	private int val;

	B2(int i)
	{
		this.val = i;
	}

	@Override
	public void info()
	{
		System.out.println("############# B2.info() val=" + this.val);
	}

}
