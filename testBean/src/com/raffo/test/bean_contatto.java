package com.raffo.test;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class bean_contatto
{
	
	private PropertyChangeSupport changes = new PropertyChangeSupport(this);
	
	//proprieta semplice
	private String nome      = "";
	private String cognome   = "";
	private String cellulare = "";
	
	//proprieta bound
	private String email     = "";
	
	public String getNome()
	{
		return nome;
	}

	public void setNome(String n)
	{
		nome=n;
	}
	
	public String getCognome()
	{
		return cognome;
	}

	public void setCognome(String c)
	{
		cognome=c;
	}
	
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String e)
	{
		String old_email=email;
		email=e;
		changes.firePropertyChange("email", old_email,e);
	}
	
	public String getcellulare()
	{
		return cellulare;
	}

	public void setcellulare(String c)
	{
		cellulare=c;
	}
	
	public void addPropertyChangeListener(PropertyChangeListener l)
	  {
	   changes.addPropertyChangeListener(l);
	  }
	
	  public void removePropertyChangeListener(PropertyChangeListener l)
	  {
	   changes.removePropertyChangeListener(l);
	  }
}
