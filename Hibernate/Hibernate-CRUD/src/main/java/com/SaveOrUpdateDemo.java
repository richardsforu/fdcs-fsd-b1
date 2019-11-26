package com;


import org.hibernate.Session;
import com.cts.product.config.DBConfig;
import com.cts.product.entity.Customer;
import com.cts.product.entity.Student;

public class SaveOrUpdateDemo {

	public static void main(String[] args){

		Session ses1 = DBConfig.getSessionbFactory().openSession();
		

		
		Student s1=new Student();
		s1.setStudentId("S0010");
		s1.setStudentName("Laptop");
		s1.setMarks(2333);
		
		Student s2=new Student();
		s2.setStudentId("S009");
		s2.setStudentName("Xyz");
		s2.setMarks(645);
		
		Student s3=new Student();
		s3.setStudentId("S005");
		s3.setStudentName("ruth");
		s3.setMarks(533);
		
		ses1.saveOrUpdate(s1);
		

		
		ses1.beginTransaction().commit();
		//ses2.beginTransaction().commit();
		//ses3.beginTransaction().commit();
		
		
		System.out.println("--- Done");

	}

}
