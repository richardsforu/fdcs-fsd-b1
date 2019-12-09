package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bill.BillingImpl;
import com.config.AppConfig;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item4", "Item5" };

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		// PriceMatrixImpl price=new PriceMatrixImpl(); // Dependency

		// BillingImpl biller = new BillingImpl(); // Dependent

		// biller.setPrice(price); // DI

		BillingImpl biller = ac.getBean(BillingImpl.class);

		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);

	}

}
