package pattern.creazione.singleton;

public class ASingleton
{
	private static ASingleton istanza = null;

	public static ASingleton getInstance()
	{
		if (istanza == null)
		{
			istanza = new ASingleton();
		}

		return istanza;
	}

	private int val;

	private ASingleton()
	{
	}

	@Override
	public void finalize()
	{
		// questo è dal garbagge collector quando
		// l'oggetto non è piú usato
		istanza = null;
	}

	public int getVal()
	{
		return this.val;
	}

	public void info()
	{
		System.out.println("############# info() -> val=" + this.val);
	}

	public void setVal(int val)
	{
		this.val = val;
	}
}
