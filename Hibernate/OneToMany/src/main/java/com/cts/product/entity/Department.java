package com.cts.product.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Department {

	@Id
	//@Basic(fetch = FetchType.EAGER)
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

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "deptDetails", 
	joinColumns = { @JoinColumn(name = "deptId") }, 
	inverseJoinColumns = {@JoinColumn(name = "empId") })
	List<Employee> emps = new ArrayList<Employee>();

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
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
