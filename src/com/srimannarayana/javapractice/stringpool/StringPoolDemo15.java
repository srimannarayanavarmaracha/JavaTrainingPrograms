package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo15 {

	public static void main(String[] args) {
		
		System.out.println("\n======= Final String Constants with (new) =========");
		
		final String x = new String("Java");

		String a = x + "Programming";
		String b = "JavaProgramming";
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a.equals(b) : " + a.equals(b));
		
		System.out.println("\n======= with final =========");
		
		final String h = "Hasi";
		final String u = "ni";
		
		String m = h + u;
		String j = "Hasini";
		
		System.out.println("m == j : " + (m == j));
		System.out.println("m.equals(j) : " + m.equals(j));
		
		
		final String c = "Meenakshi";
		String d = "Devi";

		String e = c + d;
		String f = "MeenakshiDevi";

		System.out.println("e == f : " + (e == f));
		System.out.println("e.equals(f) : " + e.equals(f));
		
		
		System.out.println("\n======== without final =========");
		
		String v = "Baglamukhi";
		String r = "Devi";
		
		String k = v + r;
		
		String l = "BaglamukhiDevi";
		
		System.out.println("k == l : " + (k == l));
		System.out.println("k.equals(l) : " + k.equals(l));
	}

}
