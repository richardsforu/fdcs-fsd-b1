package com;

public class Bank extends UseClass implements Cleark,Customer,Manager,BankEmployee {

	public void clearOperations() {
		System.out.println("--- Clearkal operatiosn intialted");
	}
	
	public void withDraw() {
		System.out.println("Withdrawing");
	}

	public void deposit() {
		System.out.println("Depositing");
	}

	public void openAccount() {
		System.out.println("Opening Account");
	}

	public void closeAccount() {
		System.out.println("CLosing Account");
	}

	public void lockerAccess() {
		System.out.println("Giving locker access");
	}

}
