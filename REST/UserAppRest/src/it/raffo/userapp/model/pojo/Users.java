package it.raffo.userapp.model.pojo;

public class Users
{

	private Integer			id;
	private String			nome;
	private String			cognome;
	private String			cf;
	private String			mail;
	private java.util.Date	mail_verified_at;
	private Integer			eta;
	private String			telefono;
	private String			provincia;
	private String			www;
	private String			password;
	private String			remember_token;
	private java.util.Date	created_at;
	private java.util.Date	updated_at;

	public String getNome()
	{
		return this.nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCognome()
	{
		return this.cognome;
	}

	public void setCognome(String cognome)
	{
		this.cognome = cognome;
	}

	public String getCf()
	{
		return this.cf;
	}

	public void setCf(String cf)
	{
		this.cf = cf;
	}

	public String getMail()
	{
		return this.mail;
	}

	public void setMail(String mail)
	{
		this.mail = mail;
	}

	public java.util.Date getMail_verified_at()
	{
		return this.mail_verified_at;
	}

	public void setMail_verified_at(java.util.Date mail_verified_at)
	{
		this.mail_verified_at = mail_verified_at;
	}

	public String getTelefono()
	{
		return this.telefono;
	}

	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}

	public String getProvincia()
	{
		return this.provincia;
	}

	public void setProvincia(String provincia)
	{
		this.provincia = provincia;
	}

	public String getWww()
	{
		return this.www;
	}

	public void setWww(String www)
	{
		this.www = www;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getRemember_token()
	{
		return this.remember_token;
	}

	public void setRemember_token(String remember_token)
	{
		this.remember_token = remember_token;
	}

	public java.util.Date getCreated_at()
	{
		return this.created_at;
	}

	public void setCreated_at(java.util.Date created_at)
	{
		this.created_at = created_at;
	}

	public java.util.Date getUpdated_at()
	{
		return this.updated_at;
	}

	public void setUpdated_at(java.util.Date updated_at)
	{
		this.updated_at = updated_at;
	}

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	@Override
	public String toString()
	{
		return "Users [id=" + this.id + ", nome=" + this.nome + ", cognome=" + this.cognome + ", cf=" + this.cf + ", mail=" + this.mail + ", mail_verified_at=" + this.mail_verified_at + ", telefono=" + this.telefono + ", provincia=" + this.provincia
				+ ", www=" + this.www + ", password=" + this.password + ", remember_token=" + this.remember_token + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + "]";
	}

	public Integer getEta()
	{
		return eta;
	}

	public void setEta(Integer eta)
	{
		this.eta = eta;
	}
}