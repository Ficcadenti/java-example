package it.raffo.gson.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5224130771324051176L;
	private Integer id;
	private String name;
	private String surname;
	private Date birtday;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirtday() {
		return birtday;
	}

	public void setBirtday(Date birtday) {
		this.birtday = birtday;
	}

	public User(Integer id, String name, String surname, Date birtday) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.birtday = birtday;
	}

	public User()
	{}

}
