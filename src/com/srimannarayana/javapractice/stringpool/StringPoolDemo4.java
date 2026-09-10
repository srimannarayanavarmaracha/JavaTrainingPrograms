package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo4 {

	public static void main(String[] args) {
		
		System.out.println("\n=========== intern() Demo2 ===========");
		
		String a = "Java";
		String b = new String("Java");
		
		System.out.println("a == b : " + (a == b));
		
		String c = b.intern();
		
		System.out.println("a == c : " + (a == c));
		System.out.println("b == c : " + (b == c));
		
		System.out.println("a.equals(c) : " + a.equals(c));
		System.out.println("b.equals(c) : " + b.equals(c));
	}

}
