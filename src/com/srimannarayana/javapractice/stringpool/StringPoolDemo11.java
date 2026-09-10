package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo11 {

	public static void main(String[] args) {
		
		System.out.println("\n===== Runtime Concatenation =====");

		String x = "Java";

		String a = x + "Programming";
		String b = "JavaProgramming";

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		System.out.println("a == b : " + (a == b));
		System.out.println("a.equals(b) : " + a.equals(b));
		
		String firstName = "Srimannarayana" + " " + "Varma";
		String lastName = " " + "Racha";
		
		String concatedName = firstName + lastName;
		
		String fullName = "Srimannarayana Varma Racha";
		
		System.out.println("cancatedName == fullName : " + (concatedName == fullName));
		
		System.out.println("fullName == concatedName : " + (fullName == concatedName));
		
		System.out.println("concatedName.equals(fullName) : " + concatedName.equals(fullName));
		
		System.out.println("fullName.equals(concatedName) : " + fullName.equals(concatedName));
		
	}

}
