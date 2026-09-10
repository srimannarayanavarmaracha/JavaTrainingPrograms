package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo5 {

	public static void main(String[] args) {
		
		System.out.println("\n========== intern() Demo3 ==========");
		
		String a = new String("Mango");
		String b = a.intern();
		
		System.out.println("\n========= Before a.intern() ===========");
		
		System.out.println("a == b : " + (a == b));
		
		System.out.println("\n========= After a.intern() ===========");
		
		a = a.intern();
		
		System.out.println("a == b : " + (a == b));
	}

}
