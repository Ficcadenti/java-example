package it.raffo.userapp.model.pojo;

public class Esito
{
	private int		codice;
	private String	msg;
	private String	token;

	public int getCodice()
	{
		return this.codice;
	}

	public void setCodice(int codice)
	{
		this.codice = codice;
	}

	public String getMsg()
	{
		return this.msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public String getToken()
	{
		return this.token;
	}

	public void setToken(String token)
	{
		this.token = token;
	}

}
