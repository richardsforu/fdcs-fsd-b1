package com;
import static java.lang.System.*;

public class WraperOverloadDemo {
	
	enum gender {MALE,FEMALE};
	
	void f2(int ...nums) {
		for(int x:nums) {
			System.out.println(x);
		}
		System.out.println("------------");
	}
	
	
	void f1(Integer x) {
		System.out.println("Integer X: "+x);
	}

	public static void main(String[] args) {
		WraperOverloadDemo wd=new WraperOverloadDemo();
		
		//Integer x=100;
		
		Integer x=new Integer(100);
		
		
		Integer x1=200; // Up Casting / Boxing
		int i=x1; // Down Casting / un boxing
		
		int i1=100;
		float f=i1;
		double d=i1;
		byte b=(byte)i1;
		Integer intObj=i1;
		
		//byte b=intObj.byteValue();
		
		
		
		
		
		int x2=300; // new Integer(300);
		
		
		wd.f1(x2);
		
		
		float f1=34.76f;
		Float floatObj=f1;
		int i4=(int)f1;
		
		int i3=floatObj.intValue();
		
		//out.println(i3);
		
		int x5[]= {10,34,23,756,32};
		
		//wd.f2(x5);
		wd.f2(10,20);
		
		System.out.println(Integer.toBinaryString(65));
		System.out.println(Integer.toHexString(347563745));
		System.out.println(Integer.toOctalString(84644646));
		//System.out.println(Integer.reverse(344));
		
		//wd.f1(x);
		//wd.f2(10,20);
		//wd.f2(1,34,32);
		//wd.f2(100,43,45,6677);
		
		System.out.println(Colours.RED);
		
		System.out.println(gender.FEMALE);
		
		Object s1=gender.FEMALE;
		
		System.out.println(s1);
		
		//String s2=(String) s1;
		
		
		
		
		
		
		
		
	}

}
