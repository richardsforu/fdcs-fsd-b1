package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.DiagnosisTest;
import com.cts.product.entity.Patient;

public class TestToPatientSave {

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

		t1.getPatients().add(p1);
		t1.getPatients().add(p2);
		t1.getPatients().add(p3);
		t1.getPatients().add(p4);
		t1.getPatients().add(p5);

		t2.getPatients().add(p1);
		t2.getPatients().add(p3);
		t2.getPatients().add(p5);

		t3.getPatients().add(p2);
		t3.getPatients().add(p4);

		t4.getPatients().add(p5);
		t4.getPatients().add(p2);
		t4.getPatients().add(p3);
		t4.getPatients().add(p4);

		t5.getPatients().add(p3);

		ses.save(t1);
		ses.save(t2);
		ses.save(t3);
		ses.save(t4);
		ses.save(t5);

		ses.beginTransaction().commit();

	}

}
