package it.raffo.login.model.pojo;

import java.io.Serializable;

public class Document implements Serializable, Comparable<Document>
{

	/**
	 *
	 */
	private static final long	serialVersionUID	= 6700100621618866114L;

	private String				name;
	private String				path;
	private String				size;
	private String				type;

	public Document(String name, String path, String size, String type)
	{
		this.name = name;
		this.size = size;
		this.type = type;
		this.path = path;
	}

	@Override
	public int compareTo(Document document)
	{
		return this.getName().compareTo(document.getName());
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
		Document other = (Document) obj;
		if (this.name == null)
		{
			if (other.name != null)
			{
				return false;
			}
		}
		else if (!this.name.equals(other.name))
		{
			return false;
		}
		if (this.path == null)
		{
			if (other.path != null)
			{
				return false;
			}
		}
		else if (!this.path.equals(other.path))
		{
			return false;
		}
		if (this.size == null)
		{
			if (other.size != null)
			{
				return false;
			}
		}
		else if (!this.size.equals(other.size))
		{
			return false;
		}
		if (this.type == null)
		{
			if (other.type != null)
			{
				return false;
			}
		}
		else if (!this.type.equals(other.type))
		{
			return false;
		}
		return true;
	}

	public String getName()
	{
		return this.name;
	}

	public String getPath()
	{
		return this.path;
	}

	public String getSize()
	{
		return this.size;
	}

	public String getType()
	{
		return this.type;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
		result = (prime * result) + ((this.path == null) ? 0 : this.path.hashCode());
		result = (prime * result) + ((this.size == null) ? 0 : this.size.hashCode());
		result = (prime * result) + ((this.type == null) ? 0 : this.type.hashCode());
		return result;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public void setSize(String size)
	{
		this.size = size;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	@Override
	public String toString()
	{
		return this.name;
	}
}