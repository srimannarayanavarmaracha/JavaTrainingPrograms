package com.srimannarayana.javapractice.stringpool;

public class StringPoolMaster3 {
	
	public static void main(String[] args) {
		
		String a = "Java";

		String b = new String("Java");

		String c = b.intern();

		b = b.intern();

		final String x = "Ja";
		final String y = "va";

		String d = x + y;

		String e = new String(d);

		e = e.intern();

		System.out.println("a == b : " + (a == b));
		System.out.println("b == c : " + (b == c));
		System.out.println("c == d : " + (c == d));
		System.out.println("d == e : " + (d == e));
		System.out.println("a == e : " + (a == e));
		System.out.println("a.equals(e) : " + a.equals(e));
		System.out.println("b.equals(e) : " + b.equals(e));
	}

}
