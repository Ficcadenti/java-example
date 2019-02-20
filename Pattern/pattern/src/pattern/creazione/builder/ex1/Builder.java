package pattern.creazione.builder.ex1;

public class Builder
{
	public static final int	NORMAL	= 0;
	public static final int	EXTRA	= 1;

	public Builder()
	{
	}

	A get(int type)
	{
		switch (type)
		{
			case NORMAL:
				return new A(new B(new C()));
			case EXTRA:
				return new A(new B1(new B(new C()), new C()));
			default:
				return null;
		}
	}

}
