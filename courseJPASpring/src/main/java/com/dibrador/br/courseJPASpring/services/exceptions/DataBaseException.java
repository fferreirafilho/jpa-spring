package com.dibrador.br.courseJPASpring.services.exceptions;

public class DataBaseException extends RuntimeException  {

	private static final long serialVersionUID = 1L;

	public DataBaseException(String e) {
		super(e);
	}
}
