package com.cts.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	// @Basic(fetch = FetchType.EAGER)
	private int deptId;
	private String deptName;
	private String location;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String deptName, String location) {

		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getDeptId() {
		return deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
