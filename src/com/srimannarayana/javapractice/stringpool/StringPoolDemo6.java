package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo6 {

	public static void main(String[] args) {
		
		String a = new String("Java");
		
		System.out.println("a == \"Java\" : " + (a == "Java"));
		
		a = a.intern();
		
		System.out.println("a == \"Java\" : " + (a == "Java"));

	}

}
