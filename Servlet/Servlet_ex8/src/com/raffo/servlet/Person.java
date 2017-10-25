/* Bean Person */
package com.raffo.servlet;

public class Person 
{
	//proprieta semplice
	private String firstName;
	private String lastName;
	private String telephone;
	private String email;
	
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String s) 
	{
		firstName = s;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String s) 
	{
		lastName = s;
	}
	public String getTelephone() 
	{
		return telephone;
	}
	public void setTelephone(String s) 
	{
		telephone = s;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String s) 
	{
		email = s;
	}
}
