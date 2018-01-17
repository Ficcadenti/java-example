package it.raffo.cmis.documentum;

import org.apache.chemistry.opencmis.client.api.Session;

public class SessionSP
{
	private Integer	id		= 0;
	private boolean	active	= false;
	private Session	session	= null;

	public Integer getId()
	{
		return this.id;
	}

	public Session getSession()
	{
		return this.session;
	}

	public boolean isActive()
	{
		return this.active;
	}

	public void setActive(boolean active)
	{
		this.active = active;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public void setSession(Session session)
	{
		this.session = session;
	}

}
