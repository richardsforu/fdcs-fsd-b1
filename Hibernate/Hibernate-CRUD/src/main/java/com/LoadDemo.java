package com;

import org.hibernate.Session;
import com.cts.product.config.DBConfig;
import com.cts.product.entity.Customer;
import com.cts.product.entity.Student;

public class LoadDemo {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		Student s = ses.load(Student.class, "S002"); // lazy
		System.out.println(s.getStudentId());
		System.out.println(s.getStudentName());
		System.out.println(s.getMarks());

		System.out.println("--- Done");

	}

}
