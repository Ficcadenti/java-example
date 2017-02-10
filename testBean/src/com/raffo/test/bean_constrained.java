package com.raffo.test;

import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.beans.VetoableChangeSupport;

public class bean_constrained 
{
	private VetoableChangeSupport vetos = new VetoableChangeSupport(this);


	//proprieta constrained
	private String email     = "";

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String e) throws PropertyVetoException 
	{
		String old_email=email;
		vetos.fireVetoableChange("email", old_email,e);
		email=e;
	}

	public void addVetoableChangeListener(VetoableChangeListener l)
	{
		vetos.addVetoableChangeListener(l);
	}

	public void removeVetoableChangeListener(VetoableChangeListener l)
	{
		vetos.removeVetoableChangeListener(l);
	}



}
