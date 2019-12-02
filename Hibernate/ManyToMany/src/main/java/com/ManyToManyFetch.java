package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.DiagnosisTest;
import com.cts.product.entity.Patient;

public class ManyToManyFetch {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionbFactory().openSession();
		Patient pat = ses.get(Patient.class, 1025);

		System.out.println("PatientId: " + pat.getPatientId());
		System.out.println("Patient Name: " + pat.getPatientName());

		for (DiagnosisTest test : pat.getTests()) {
			System.out.println("TestId: " + test.getTestId());
			System.out.println("Test Name: " + test.getTestName());
			System.out.println("Price: " + test.getPrice());
			System.out.println("----------------------------------------");
		}

	}

}
