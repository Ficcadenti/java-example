package com.angulartests.model;

import java.io.Serializable;

public class Hero implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8054500404783751169L;
	private int id;
	private String name;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Hero [id=");
		builder.append(this.id);
		builder.append(", name=");
		builder.append(this.name);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Hero)) {
			return false;
		}
		final Hero other = (Hero) obj;
		if (this.id != other.id) {
			return false;
		}
		return true;
	}
}
