package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo10 {

	public static void main(String[] args) {
		
		System.out.println("\n======= Compile-Time Concatenation =======");

		String a = "Java" + "Programming";
		String b = "JavaProgramming";
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a.equals(b) : " + a.equals(b));
		
		String hleem = "Baglamukhi" + "Devi";
		String pitambara= "BaglamukhiDevi";
		
		System.out.println("hleem == pitambara : " + (hleem == pitambara));
		System.out.println("hleem.equals(pitambara) : " + hleem.equals(pitambara));
	}

}

