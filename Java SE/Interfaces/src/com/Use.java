package com;

public class Use {

	public static void main(String[] args) {
		
		MyInter mi=new C1();
		mi.f1();
		
		MyInter1 mi1=new C1();
		mi1.f1();
		
		mi=new C2();
		mi.f1();
		
		System.out.println(MyInter.MAX_AGE);
		
	}

}
