package it.raffo.swagger.pojo;

public class Centro
{
	private int	x;
	private int	y;

	public Centro(int x, int y)
	{
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null)
		{
			return false;
		}
		if (this.getClass() != obj.getClass())
		{
			return false;
		}
		Centro other = (Centro) obj;
		if (this.x != other.x)
		{
			return false;
		}
		if (this.y != other.y)
		{
			return false;
		}
		return true;
	}

	private int getY()
	{
		return this.y;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = (prime * result) + this.x;
		result = (prime * result) + this.y;
		return result;
	}

	private void setY(int y)
	{
		this.y = y;
	}

	@Override
	public String toString()
	{
		return "Centro [x=" + this.x + ", y=" + this.y + "]";
	}

}
