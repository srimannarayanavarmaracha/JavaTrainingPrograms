package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo2 {

	public static void main(String[] args) {
		
		System.out.println("\n======= Intern() Demo =======");
		
		
		String s1 = new String("Java");
		String s2 = s1.intern();
		String s3 = "Java";
		
		System.out.println("\n========= Before s1 = s1.intern() ==========");
		
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s2 == s1 : " + (s2 == s1));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s3 == s1 : " + (s3 == s1));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s3 == s2 : " + (s3 == s2));
		
		System.out.println("Equals s1 with s2 : " + s1.equals(s2));
		System.out.println("Equals s2 with s1 : " + s2.equals(s1));
		System.out.println("Equals s1 with s3 : " + s1.equals(s3));
		System.out.println("Equals s3 with s1 : " + s3.equals(s1));
		System.out.println("Equals s2 with s3 : " + s2.equals(s3));
		System.out.println("Equals s3 with s2 : " + s3.equals(s2));
		
		
		System.out.println("\n========= After  s1 = s1.intern() ==========");
		
		s1 = s1.intern();
		
		System.out.println("s3 == s1 : " + (s3 == s1));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s2 == s1 : " + (s2 == s1));
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s3 == s2 : " + (s3 == s2));
		
		
		System.out.println("Equals s3 with s1 : " + s3.equals(s1));
		System.out.println("Equals s1 with s3 : " + s1.equals(s3));
		System.out.println("Equals s2 with s1 : " + s2.equals(s1));
		System.out.println("Equals s1 with s2 : " + s1.equals(s2));
		System.out.println("Equals s2 with s3 : " + s2.equals(s3));
		System.out.println("Equals s3 with s2 : " + s3.equals(s2));
		
	}

}
