package pattern.creazione.abstractfactory;

public class FattoriaAstratta2 extends FattoriaAstratta
{

	@Override
	public AstrattaA getA(String str)
	{
		// TODO Auto-generated method stub
		return new A2(str);
	}

	@Override
	public AstrattaB getb(int i)
	{
		// TODO Auto-generated method stub
		return new B2(i);
	}

}
