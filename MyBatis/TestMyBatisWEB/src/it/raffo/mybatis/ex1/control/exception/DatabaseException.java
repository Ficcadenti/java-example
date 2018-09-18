package it.raffo.mybatis.ex1.control.exception;

public class DatabaseException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = -3145578830186107928L;

	public DatabaseException(String errore) {
		super(errore);
	}

}
