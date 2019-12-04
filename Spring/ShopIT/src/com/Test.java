package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatricImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item4", "Item5" };
		
		
		PriceMatricImpl price=new PriceMatricImpl(); // Dependency class 

		BillingImpl bill = new BillingImpl(); // Dependent class
		
		bill.setPrice(price); // DI
		
		double total = bill.getCartTotal(cart1);

		System.out.println("Cart 1 Bill: " + total);

		total = bill.getCartTotal(cart2);

		System.out.println("Cart 2 Bill: " + total);
	}

}
