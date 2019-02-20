package pattern.creazione.abstractfactory.ex1;

public class test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		FattoriaAstratta1 f1 = new FattoriaAstratta1();
		FattoriaAstratta2 f2 = new FattoriaAstratta2();

		AstrattaA a1 = f2.getA("fattoria stringa");
		a1.info();

		AstrattaB b1 = f2.getb(1);
		b1.info();
	}

}
