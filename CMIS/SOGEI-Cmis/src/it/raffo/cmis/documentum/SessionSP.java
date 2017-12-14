package it.raffo.cmis.documentum;

import org.apache.chemistry.opencmis.client.api.Session;

public class SessionSP {
	private Integer id = 0;
	private boolean active = false;
	private Session session = null;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}

	
}
