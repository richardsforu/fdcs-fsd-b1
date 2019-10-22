package com;

import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) {
		
		
		Date d=new Date();
		System.out.println(d);
		
		System.out.println(d.getDate());
		System.out.println((d.getMonth())+1);
		System.out.println((d.getYear())+1900);
		
		
		
	}

}
