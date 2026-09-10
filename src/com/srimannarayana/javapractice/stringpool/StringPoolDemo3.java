package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo3 {

	public static void main(String[] args) {
		
		System.out.println("\n====== intern() Demo1 ======");
		
		String a = "Java";
		String g = new String("Java");
		
		System.out.println("a == g : " + (a == g));
		
		String h = g.intern();
		
		System.out.println("a == h : " + (a == h));
		System.out.println("g == h : " + (g == h));
		
		
		System.out.println("a.equals(g) : " + a.equals(g));
		System.out.println("g.equals(h) : " + g.equals(h));
		
	}

}
