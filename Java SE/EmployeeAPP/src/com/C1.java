package com;

public class C1 {
	
	
	 class C2 implements Comparable<Employee>{

		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		public void v1() {
			System.out.println("Hey");
		}
		 
	 }
	 
	 static class C3 implements Comparable<Employee>{
		 @Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return 0;
		}
		 
		 void f1() {
			 System.out.println("-- yes");
		 }
	 }

}
