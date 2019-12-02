package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.DiagnosisTest;
import com.cts.product.entity.Patient;

public class Test {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		/*
		 * DiagnosisTest t1 = new DiagnosisTest(10, "Blood Test", 1500); DiagnosisTest
		 * t2 = new DiagnosisTest(11, "ECG", 6500); DiagnosisTest t3 = new
		 * DiagnosisTest(12, "Sugar", 1200); DiagnosisTest t4 = new DiagnosisTest(13,
		 * "Body Checkup", 10500); DiagnosisTest t5 = new DiagnosisTest(14, "CBT",
		 * 8500);
		 * 
		 * Patient p1 = new Patient(1024, "Praveen"); Patient p2 = new Patient(1025,
		 * "James"); Patient p3 = new Patient(1026, "Ruth"); Patient p4 = new
		 * Patient(1027, "Bucky"); Patient p5 = new Patient(1028, "Jacky");
		 */

		Patient p1 = ses.get(Patient.class, 1024);
		Patient p2 = ses.get(Patient.class, 1025);
		Patient p3 = ses.get(Patient.class, 1026);
		Patient p4 = ses.get(Patient.class, 1027);
		Patient p5 = ses.get(Patient.class, 1028);
		
		p1.getTests().add(ses.get(DiagnosisTest.class, 10));
		p1.getTests().add(ses.get(DiagnosisTest.class, 11));
		p1.getTests().add(ses.get(DiagnosisTest.class, 12));
		
		p2.getTests().add(ses.get(DiagnosisTest.class, 10));
		p2.getTests().add(ses.get(DiagnosisTest.class, 11));
		p2.getTests().add(ses.get(DiagnosisTest.class, 12));
		p2.getTests().add(ses.get(DiagnosisTest.class, 13));
		p2.getTests().add(ses.get(DiagnosisTest.class, 14));

		ses.update(p1);

		ses.beginTransaction().commit();

	}

}
