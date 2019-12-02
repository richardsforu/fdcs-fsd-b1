package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.DiagnosisTest;
import com.cts.product.entity.Patient;

public class Test {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();

		DiagnosisTest t1 = new DiagnosisTest(10, "Blood Test", 1500);
		DiagnosisTest t2 = new DiagnosisTest(11, "ECG", 6500);
		DiagnosisTest t3 = new DiagnosisTest(12, "Sugar", 1200);
		DiagnosisTest t4 = new DiagnosisTest(13, "Body Checkup", 10500);
		DiagnosisTest t5 = new DiagnosisTest(14, "CBT", 8500);

		Patient p1 = new Patient(1024, "Praveen");
		Patient p2 = new Patient(1025, "James");
		Patient p3 = new Patient(1026, "Ruth");
		Patient p4 = new Patient(1027, "Bucky");
		Patient p5 = new Patient(1028, "Jacky");

		p1.getTests().add(t1);
		p1.getTests().add(t2);
		p1.getTests().add(t3);
		p1.getTests().add(t4);
		p1.getTests().add(t5);

		p2.getTests().add(t1);
		p2.getTests().add(t3);
		p3.getTests().add(t5);

		p3.getTests().add(t2);
		p3.getTests().add(t4);

		p4.getTests().add(t1);
		p4.getTests().add(t2);
		p4.getTests().add(t4);
		p4.getTests().add(t5);

		p5.getTests().add(t1);
		p5.getTests().add(t3);
		p5.getTests().add(t4);

		ses.save(p1);
		ses.save(p2);
		ses.save(p3);
		ses.save(p4);
		ses.save(p5);

		ses.beginTransaction().commit();

	}

}
