package it.raffo.view.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LoginBean
{

	private String	username;
	private String	password;

	public void forgotPassword()
	{
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Default user name: BootsFaces");
		FacesContext.getCurrentInstance().addMessage("loginForm:username", msg);
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Default password: rocks!");
		FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
	}

	public String getPassword()
	{
		return this.password;
	}

	public String getUsername()
	{
		return this.username;
	}

	public void login()
	{
		if ("raffo".equalsIgnoreCase(this.username) && "raffo".equalsIgnoreCase(this.password))
		{
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "",
					"Congratulations! You've successfully logged in.");
			FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
			System.out.println("login ok!!!!!");
			System.out.println("login=" + this.username);
			System.out.println("password=" + this.password);
		}
		else
		{
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "",
					"That's the wrong password. Hint: raffo/raffo");
			FacesContext.getCurrentInstance().addMessage("loginForm:password", msg);
			System.out.println("login error!!!!!");
			System.out.println("login=" + this.username);
			System.out.println("password=" + this.password);
		}
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public void setUsername(String name)
	{
		this.username = name;
	}
}