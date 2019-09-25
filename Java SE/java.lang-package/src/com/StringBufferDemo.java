package com;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
	
		StringBuffer sb=new StringBuffer("Abc");
		System.out.println("SB: "+sb);
		System.out.println("HashCode of SB: "+System.identityHashCode(sb));
		
		sb.replace(0, 3, "Praveen");
		
		System.out.println("SB: "+sb);
		System.out.println("HashCode of SB: "+System.identityHashCode(sb));
		
		
		
	}

}
