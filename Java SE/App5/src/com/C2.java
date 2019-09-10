package com;

public class C2 {
	
	public static void main(String[] args) {
		
		C1 c1=new C1();
		C1 c2=new C1();
		c1.x=1000;
		c2.x=2000;
		
		C1.process(c1);
		C1.process(c2);
		
		
		
	}

}
