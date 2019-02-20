package pattern.creazione.abstractfactory.ex1;

public class FattoriaAstratta1 extends FattoriaAstratta
{

	@Override
	public AstrattaA getA(String str)
	{
		// TODO Auto-generated method stub
		return new A1(str);
	}

	@Override
	public AstrattaB getb(int i)
	{
		// TODO Auto-generated method stub
		return new B1(i);
	}

}
