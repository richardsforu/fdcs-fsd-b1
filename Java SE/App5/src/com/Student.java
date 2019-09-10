package com;

import java.util.Scanner;

public class Student {
	int regNo;
	String studentName;
	
	
	/*
	 * Note:
	 * ->  JVM adds default constructor when you are not providing any 
	 *     argument constructors
	 * -> When You provided argument constructor, the, creating a blank object 
	 *    with default constructor is not possible. you should explicilty provide
	 *    default constructor on your own
	 *     
	 */
	
	
	Student() {
		Scanner sc=new Scanner("d:/abc.txt");
		
	}
	
	 
	 Student(int regNo,String studentName){
		 this.regNo=regNo;
		 this.studentName=studentName;
	 }
	 
	 

	void registerStudent() {
		Teacher t = new Teacher();
		t.display(this); // formal
	}

}
