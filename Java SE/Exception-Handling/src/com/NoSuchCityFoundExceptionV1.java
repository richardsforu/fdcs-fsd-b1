package com;

public class NoSuchCityFoundExceptionV1 extends RuntimeException {

	// Checked -> extends Exception
	// UnChecked -> extends RuntimeException

	public NoSuchCityFoundExceptionV1(String msg) {

		super(msg);
	}

}
