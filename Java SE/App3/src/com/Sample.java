package com;

public class Sample {

	void f1(CallByRef obj) { // obj formal
		obj.x = 5000;
		System.out.println("In f1 method of Sample " + obj.x);
	}

}
