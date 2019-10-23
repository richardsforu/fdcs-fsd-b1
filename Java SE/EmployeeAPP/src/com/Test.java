package com;

public class Test {
	
	public static void main(String[] args) {
		
		C1 c1=new C1();
		C1.C2 c2Obj=c1.new C2();
		
		c2Obj.v1();
		
		C1.C3 c3=new C1.C3();
		c3.f1();
		
	}

}
