package com.bill;

import com.pricematrix.PriceMatricImpl;

//Dependent
public class BillingImpl {
	
	/*
	 *  Issues
	 *  -------------
	 *  
	 *  -> Too many dependency classes object creations
	 *  	-> Per of appli goes down
	 *  
	 *  Why this issue happened?
	 *  ----------------------------
	 * -> Dependent class itself creating dependency class object
	 * 
	 *  What is the solution?
	 *  ----------------------
	 *  -> Do not create dependency class object in the dependent class.
	 *  
	 *  How can we get dependency objects in dependenct class?
	 *  --------------------------------------------------------
	 *  -> Use JNDI (Java Naming Directory interface)
	 *  	-> JNDI location is tightly binded with dependent class.
	 *  
	 *  What is the best solution?
	 * 
	 * 	-> Do Not create, or find object. instead ask some one (container) -> IOC
	 * 
	 *  -> Inject Dependency object to the Dependent object -> DI (Dependency Injection)
	 *  
	 *  How to Implement DI?
	 *  2 ways
	 *  1. using setter based injection
	 *  2. using constructor based injection
	 *  
	 * 
	 * 
	 * 
	 */
	
	PriceMatricImpl price;
	

	public void setPrice(PriceMatricImpl price) {
		this.price = price;
	}


	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatricImpl price = new PriceMatricImpl();

		for (String itemCode : cart) {
			total = price.getItemPrice(itemCode) + total;

		}

		return total;

	}

}
