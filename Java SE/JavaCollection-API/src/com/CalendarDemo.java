package com;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar cl=Calendar.getInstance();
		
		System.out.println(cl.get(Calendar.YEAR));
		System.out.println(cl.get((Calendar.MONTH))+1);
		System.out.println(cl.get(Calendar.DATE));
		
		System.out.println(cl.get(Calendar.HOUR));
		System.out.println(cl.get(Calendar.MINUTE));
		System.out.println(cl.get(Calendar.SECOND));
		System.out.println(cl.get(Calendar.MILLISECOND));
		
		
		
		

	}

}
