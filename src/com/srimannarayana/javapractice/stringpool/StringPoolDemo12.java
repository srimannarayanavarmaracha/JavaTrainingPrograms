package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo12 {

	public static void main(String[] args) {
		
		System.out.println("\n========= Runtime Concatenation with new String And intern() =========");
		
		String x = new String("Durga");
		
		String a = x + "Devi";
		String b = "DurgaDevi";
		String c = a.intern();
		
		System.out.println("x : " + x);
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a.equals(b) : " + a.equals(b));
		System.out.println("b == c : " + (b == c));
		System.out.println("b.equals(c) : " + b.equals(c));
		
		System.out.println("\n======= Before a = a.intern() ========");
		
		System.out.println("a == c : " + (a == c));
		System.out.println("c == a : " + (c == a));
		System.out.println("a.equals(c) : " + a.equals(c));
		System.out.println("c.equals(a) : " + c.equals(a));
		
		a = a.intern();
		
		System.out.println("\n======= after a = a.intern() ========");
		
		System.out.println("a == c : " + (a == c));
		System.out.println("c == a : " + (c == a));
		System.out.println("a.equals(c) : " + a.equals(c));
		System.out.println("c.equals(a) : " + c.equals(a));
		
		System.out.println("\n======= intern() Without Assignment ========");
		
		String p = new String("Mango");
		String q = "Mango";
		
		System.out.println("Before intern:");
		System.out.println("p == q : " + (p == q));
		
		p.intern();
		
		System.out.println("\n======= intern() With Assignment ========");
		
		System.out.println("After p.intern():");
		System.out.println("p == q : " + (p == q));
		
		p = p.intern();

		System.out.println("After p = p.intern():");
		System.out.println("p == q : " + (p == q));
	}

}
