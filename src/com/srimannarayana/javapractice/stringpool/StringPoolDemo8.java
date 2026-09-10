package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo8 {

	public static void main(String[] args) {
		
		String a = "Varma";
		String b = new String("Varma");
		
		System.out.println("a == b : " + (a == b));
		
		System.out.println("a.equals(b) : " + a.equals(b));
		
		System.out.println("a == b.intern() : " + (a == b.intern()));

	}

}