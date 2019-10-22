package com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar cl = Calendar.getInstance();

		Date dateOfBirDate=null;
		
		System.out.println(sdf.format(cl.getTime()));
		
		String dob="13/12/1987";
		
		try {
			dateOfBirDate= sdf.parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(dateOfBirDate);
		
		

	}

}
