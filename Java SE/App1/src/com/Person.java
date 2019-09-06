package com;
public class Person {
	
	static String country="India";
	
	int personId;
	String personName;
	
	static void f2() { // static method
		// accepts directly only static data from the same class
		// accepts static data of other classe with help of other class names
		country="UK";
		Employee.companyName="COgnizant Technologies";
		
		//personId=100; // Can not access
		
		
		
	}
	
	void f1() { // non static 
		country="USA";
		Employee.companyName="TCS";
		personId=100;
		personName="Prtashath";
		
		Employee e1=new Employee();
		
		
	}
	
	
	public static void main(String[] args) {
		
     /*
      * Needy of Object creation?
      * ---------------------------
      * 	-> To access non static data from a static method
      * 	-> To access non static data of other classes from sttaic and non static 
      *        methods
      */
	
		
	 Person p1=new Person();
	 Person p2=new Person();
	 Person p3=new Person();
	 
	 
	 
	 p1.personId=10;
	 p1.personName="Bucky";
	 
	 p2.personId=11;
	 p2.personName="James";
	 
	 p3.personId=13;
	 p3.personName="Praveen";
	 
	 Employee.companyName="CTS";
	 
	 System.out.println(Employee.companyName);
	 
	 System.out.println(country);
	 System.out.println(p1.personId);
	 System.out.println(p1.personName);
	 
	 System.out.println("-----------------");
	 
	// p2.personName="Bucky";
	 
	 System.out.println(country);
	 System.out.println(p2.personId);
	 System.out.println(p2.personName);

	 System.out.println("-------------");
	 
	 System.out.println(country);
	 System.out.println(p3.personId);
	 System.out.println(p3.personName);
		
		
	}

}
