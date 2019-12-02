package com.cts.product.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "tests")
public class DiagnosisTest {

	@Id
	private int testId;
	private String testName;
	private double price;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "patientinfo", joinColumns = { @JoinColumn(name = "testId") }, inverseJoinColumns = {
			@JoinColumn(name = "patientId") })
	private List<Patient> patients = new ArrayList<Patient>();

	public DiagnosisTest() {
		// TODO Auto-generated constructor stub
	}

	public DiagnosisTest(int testId, String testName, double price) {

		this.testId = testId;
		this.testName = testName;
		this.price = price;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
