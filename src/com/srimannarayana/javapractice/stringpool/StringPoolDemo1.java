package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo1 {

	public static void main(String[] args) {
		
		System.out.println("\n =============== Java Block ================");
		
		String a = "Java";
		String b = "Java";
		String c = "Java";
		
		String g = new String("Java");
		
		String h = new String("Java");
		
		System.out.println("\n ========== (==) comparison block ==========");
		
		
		System.out.println("\n ====== Without () Parenthesis =======");
		
		
		System.out.println("a == b : " + a == b);
		System.out.println("b == a : " + b == a);
		System.out.println("a == c : " + a == c);
		System.out.println("c == a : " + c == a);
		System.out.println("b == c : " + b == c);
		System.out.println("c == b : " + c == b);
		
		System.out.println("\n ====== With () Parenthesis =======");
		
		System.out.println("a == b : " + (a == b));
		System.out.println("a == b : " + (b == a));
		System.out.println("a == c : " + (a == c));
		System.out.println("c == a : " + (c == a));
		System.out.println("b == c : " + (b == c));
		System.out.println("c == b : " + (c == b));
		
		
		System.out.println("\n ========== .equals() comparison block ==========");
		
		System.out.println("Equals a with b : " + a.equals(b));
		System.out.println("Equals b with a : " + b.equals(a));
		System.out.println("Equals a with c : " + a.equals(c));
		System.out.println("Equals c with a : " + c.equals(a));
		System.out.println("Equals b with c : " + b.equals(c));
		System.out.println("Equals c with b : " + c.equals(b));
		
		
		System.out.println("\n ==== Pool Object Vs New Object ====");
		
		System.out.println(a == g);
		System.out.println("a == g : " + a == g);
		System.out.println("(a == g) : " + (a == g));
		
		System.out.println("Equals a with g : " + a.equals(g));
		
		
		System.out.println(g == a);
		System.out.println("g == a : " + g == a);
		System.out.println("(g == a) : " + (g == a));
		System.out.println("Equals g with a : " + g.equals(a));
		
		
		System.out.println("\n ==== New Object vs New Object ====");
		
		System.out.println(g == h);
		System.out.println("g == h : " + g == h);
		System.out.println("(g == h) : " + (g == h));
		
		System.out.println(h == g);
		System.out.println("h == g : " + h == g);
		System.out.println("(h == g) : " + (h == g));
		
		
		
		System.out.println("\n =================== Python Block ====================");
		
	
		String d = "Python";
		String e = "Python";
		String f = "Python";
		
		String i = new String("Python");
		
		String j = new String("Python");
		
		
		System.out.println("\n ========== (==) comparison block ==========");
		
		
		System.out.println("\n ====== Without () Parenthesis =======");
		
		
		System.out.println("d == e : " + d == e);
		System.out.println("e == d : " + e == d);
		System.out.println("d == f : " + d == f);
		System.out.println("f == d : " + f == d);
		System.out.println("e == f : " + e == f);
		System.out.println("f == e : " + f == e);
        
		System.out.println("\n ====== With () Parenthesis =======");
		
		System.out.println("d == e : " + (d == e));
		System.out.println("e == d : " + (e == d));
		System.out.println("d == f : " + (d == f));
		System.out.println("f == d : " + (f == d));
		System.out.println("e == f : " + (e == f));
		System.out.println("f == e : " + (f == e));
		
		
		System.out.println("\n ========== .equals() comparison block ==========");
		
		System.out.println("Equals d with e : " + d.equals(e));
		System.out.println("Equals e with d : " + e.equals(d));
		System.out.println("Equals d with f : " + d.equals(f));
		System.out.println("Equals f with d : " + f.equals(d));
		System.out.println("Equals e with f : " + e.equals(f));
		System.out.println("Equals f with e : " + f.equals(e));
		
		
		System.out.println("\n ==== Pool Object Vs New Object ====");
		
		
		System.out.println(d == i);
		System.out.println("d == i : " + d == i);
		System.out.println("(d == i) : " + (d == i));
		System.out.println(" Equals d with i : " + d.equals(i));
		
		System.out.println(i == d);
		System.out.println("i == d : " + i == d);
		System.out.println("(i == d) : " + (i == d));
		
		System.out.println(" Equals i with d : " + i.equals(d));
		
		System.out.println("\n ==== New Object vs New Object ====");
		
		System.out.println(i == j);
		System.out.println("i == j : " + i == j);
		System.out.println("(i == j) : " + (i == j));
		System.out.println(" Equals i with j : " + i.equals(j));
		
		System.out.println(j == i);
		System.out.println("j == i : " + j == i);
		System.out.println("(j == i) : " + (j == i));
		System.out.println(" Equals j with i : " + j.equals(i));
		
		
	}

}
