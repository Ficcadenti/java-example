package pattern.creazione.singleton;

public class test
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ASingleton.getInstance().setVal(10);
		ASingleton.getInstance().setVal(12);
		ASingleton.getInstance().info();
	}

}
