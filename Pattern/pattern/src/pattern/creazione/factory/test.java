package pattern.creazione.factory;

//http://www-sop.inria.fr/marelle/Laurent.Thery/lsp/pattern.html

abstract class Astratta
{
	public abstract String getVal();

	public abstract void info();
}

class B extends Astratta
{
	private String val;

	B(String val)
	{
		this.val = val;
	}

	@Override
	public String getVal()
	{
		return "B: " + this.val;
	}

	@Override
	public void info()
	{
		System.out.println(this.getVal());
	}
}

class C extends Astratta
{
	private String val;

	C(String val)
	{
		this.val = val;
	}

	@Override
	public String getVal()
	{
		return "C: " + this.val;
	}

	@Override
	public void info()
	{
		System.out.println(this.getVal());
	}
}

class Factory
{
	public static final int MAX_LENGTH = 3;

	public static Astratta get(String s)
	{
		if (test(s))
		{
			return new B(s);
		}
		return new C(s);
	}

	public static boolean test(String s)
	{
		return s.length() < MAX_LENGTH;
	}

	public Factory()
	{
	}
}

public class test
{

	public static void main(String[] args)
	{
		Astratta b = new B("TEST classe B");
		Astratta c = new C("TEST classe C");

		b.info();
		c.info();

		Astratta d = Factory.get("12");
		d.info();
	}

}
