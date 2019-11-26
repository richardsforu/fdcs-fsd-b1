package com;


import org.hibernate.Session;
import com.cts.product.config.DBConfig;
import com.cts.product.entity.Customer;
import com.cts.product.entity.Student;

public class DeleteDemo {

	public static void main(String[] args){

		Session ses1 = DBConfig.getSessionbFactory().openSession();
		

		
		Student s1=new Student();
		s1.setStudentId("S0010");
	
		
		
		ses1.delete(s1);
		
		

		
		ses1.beginTransaction().commit();
		//ses2.beginTransaction().commit();
		//ses3.beginTransaction().commit();
		
		
		System.out.println("--- Done");

	}

}
