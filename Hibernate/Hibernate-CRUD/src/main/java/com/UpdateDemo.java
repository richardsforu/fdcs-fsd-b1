package com;


import org.hibernate.Session;
import com.cts.product.config.DBConfig;
import com.cts.product.entity.Customer;
import com.cts.product.entity.Student;

public class UpdateDemo {

	public static void main(String[] args){

		Session ses1 = DBConfig.getSessionbFactory().openSession();
		

		
		Student s1=new Student();
		s1.setStudentId("S001");
		s1.setStudentName("Praveen Reddy S");
		s1.setMarks(121212);
		
		Student s2=new Student();
		s2.setStudentId("S009");
		s2.setStudentName("Xyz");
		s2.setMarks(645);
		
		Student s3=new Student();
		s3.setStudentId("S005");
		s3.setStudentName("ruth");
		s3.setMarks(533);
		
		ses1.update(s1);
		

		
		ses1.beginTransaction().commit();
		//ses2.beginTransaction().commit();
		//ses3.beginTransaction().commit();
		
		
		System.out.println("--- Done");

	}

}
