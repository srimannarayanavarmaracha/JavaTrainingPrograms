package com.srimannarayana.javapractice.stringpool;

public class StringPoolDemo17 {

	public static void main(String[] args) {

        System.out.println("\n======= String Literal =======");

        String a = "Java";
        String b = "Java";

        System.out.println("a == b : " + (a == b));


        System.out.println("\n======= new String() =======");

        String c = new String("Java");
        String d = new String("Java");

        System.out.println("c == d : " + (c == d));
        System.out.println("c.equals(d) : " + c.equals(d));


        System.out.println("\n======= Pool vs new String() =======");

        System.out.println("a == c : " + (a == c));
        System.out.println("a.equals(c) : " + a.equals(c));


        System.out.println("\n======= intern() =======");

        c = c.intern();

        System.out.println("a == c : " + (a == c));
        System.out.println("a.equals(c) : " + a.equals(c));
		

	}

}
