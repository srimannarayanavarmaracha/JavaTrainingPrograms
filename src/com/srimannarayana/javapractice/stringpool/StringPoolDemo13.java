package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo13 {

	public static void main(String[] args) {
		
		System.out.println("\n================== final/String constants =======================");
		
		System.out.println("\n========= Without final String========");
		
		String p = "Python";
		
		String g = p + "Programming";
		String h = "PythonProgramming";
		
		System.out.println("p : " + p);
		System.out.println("g : " + g);
		System.out.println("h : " + h);
		
		System.out.println("g == h : " + (g == h));
		System.out.println("g.equals(h) : " + g.equals(h));
		
		
		System.out.println("\n========= With final String =========");
		
		final String x = "Java";
		
		String a = x + "Programming";
		String b = "JavaProgramming";
		
		System.out.println("x : " + x);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a.equals(b) : " + a.equals(b));
		
	}

}
