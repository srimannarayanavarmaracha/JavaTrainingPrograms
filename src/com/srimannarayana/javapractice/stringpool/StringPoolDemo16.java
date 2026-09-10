package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo16 {

	public static void main(String[] args) {
		
		System.out.println("\n========= Memory Implications =========");
		
		System.out.println("\n===== new String() =========");
		
		String a = new String("Varma");
		String b = new String("Varma");
		String c = new String("Varma");
		String d = new String("Varma");
		
		System.out.println("a == b : " + (a == b));
		System.out.println("b == c : " + (b == c));
		System.out.println("c == d : " + (c == d));
		System.out.println("d == a : " + (d == a));
		
		System.out.println("a.equals(b) : " + a.equals(b));
		System.out.println("b.equals(c) : " + b.equals(c));
		System.out.println("c.equals(d) : " + c.equals(d));
		System.out.println("d.equals(a) : " + d.equals(a));
		
		
		System.out.println("\n===== String Literal =======");
		
		String e = "Varma";
		String f = "Varma";
		String g = "Varma";
		String h = "Varma";
		
		System.out.println("e == f : " + (e == f));
		System.out.println("f == g : " + (f == g));
		System.out.println("g == h : " + (g == h));
		System.out.println("h == e : " + (h == e));
		
		System.out.println("e.equals(f) : " + e.equals(f));
		System.out.println("f.equals(g) : " + f.equals(g));
		System.out.println("g.equals(h) : " + g.equals(h));
		System.out.println("h.equals(e) : " + h.equals(e));
		
		System.out.println("\n======= Pool Vs new String() ========");
		
		System.out.println("a == e : " + (a == e));
		System.out.println("b == f : " + (b == f));
		System.out.println("c == g : " + (c == g));
		System.out.println("d == h : " + (d == h));
		
		System.out.println("a.equals(e) : " + a.equals(e));
		System.out.println("b.equals(f) : " + b.equals(f));
		System.out.println("c.equals(g) : " + c.equals(g));
		System.out.println("d.equals(h) : " + d.equals(h));
		
		
		System.out.println("\n======= intern() =======");

		a = a.intern();
		b = b.intern();
		c = c.intern();
		d = d.intern();
	    

	    System.out.println("a == e : " + (a == e));
	    System.out.println("b == f : " + (b == f));
		System.out.println("c == g : " + (c == g));
		System.out.println("d == h : " + (d == h));
		
		
		System.out.println("a.equals(e) : " + a.equals(e));
		System.out.println("b.equals(f) : " + b.equals(f));
		System.out.println("c.equals(g) : " + c.equals(g));
		System.out.println("d.equals(h) : " + d.equals(h));
		
	}

}
