package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo14 {

	public static void main(String[] args) {
		
		System.out.println("\n====== (Compile-Time Vs Runtime Vs Final String) ======");
		
		System.out.println("\n===== Compile-Time =====");
		
		String a = "Java" + "Programming";
		String b = "JavaProgramming";

		System.out.println("a == b : " + (a == b));
		
		
		System.out.println("\n====== Runtime ======");
		
		String x = "Kamakshi";

		String c = x + "Devi";
		String d = "KamakshiDevi";

		System.out.println("c == d : " + (c == d));
		
		
		System.out.println("\n====== Final String =======");
		
		final String s = "Pratyangira";

		String u = s + "Devi";
		String v = "PratyangiraDevi";

		System.out.println("u == v : " + (u == v));
	}

}
