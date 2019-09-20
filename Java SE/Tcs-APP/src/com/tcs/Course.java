package com.tcs;

public class Course {

	private String courselD;
	private String name;
	private int duration;
	private int noOfLearners;
	private double fees;
	private int maxCapacity;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String courselD, String name, int duration, int noOfLearners, double fees, int maxCapacity) {
		super();
		this.courselD = courselD;
		this.name = name;
		this.duration = duration;
		this.noOfLearners = noOfLearners;
		this.fees = fees;
		this.maxCapacity = maxCapacity;
	}

	public String getCourselD() {
		return courselD;
	}

	public void setCourselD(String courselD) {
		this.courselD = courselD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getNoOfLearners() {
		return noOfLearners;
	}

	public void setNoOfLearners(int noOfLearners) {
		this.noOfLearners = noOfLearners;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

}
