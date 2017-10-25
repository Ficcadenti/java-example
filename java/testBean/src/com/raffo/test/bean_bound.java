package com.raffo.test;

import javax.swing.JComponent;

public class bean_bound extends JComponent
{
	private static final long serialVersionUID = 1L;
	
	//proprieta bound
	private String email     = "";
	
	public String getEmail()
	{
		return email;
	}

	public void setEmail(String e)
	{
		String old_email=email;
		email=e;
		firePropertyChange("email", old_email,e);
	}

}
