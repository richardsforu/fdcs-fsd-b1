package com;

public class NoSuchCityFoundException extends Exception {

	// Checked -> extends Exception
	// UnChecked -> extends RuntimeException

	public NoSuchCityFoundException(String msg) {

		super(msg);
	}

}
