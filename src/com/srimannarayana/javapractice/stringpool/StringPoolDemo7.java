package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo7 {

	public static void main(String[] args) {
		
		System.out.println("\n======== intern() Demo4 =========");
		
		System.out.println("\n== intern() Demo Vs equals() ==");
		
		
		String a = new String("Java");
		String b = "Java";
		
		System.out.println("a == b : " + (a == b));
		
		System.out.println("\n ===== equals() =====");
		
		System.out.println("a.equals(b) : " + a.equals(b));
		
		System.out.println("\n ===== intern() =====");
		
		System.out.println("a.intern() == b : " + (a.intern() == b));
		
	}

}
