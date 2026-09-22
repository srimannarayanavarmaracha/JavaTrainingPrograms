package com.srimannarayana.javapractice.stringhandling;

public class StringImmutabilityDemo2 {

	public static void main(String[] args) {
		
		String original = "Java";
		String result = original.concat(" Programming");

		System.out.println("original : " + original);
		System.out.println("result   : " + result);
		
		String a = "Java";
		String b = a;

		a = a.concat(" Programming");

		System.out.println("a : " + a);
		System.out.println("b : " + b);

	}

}