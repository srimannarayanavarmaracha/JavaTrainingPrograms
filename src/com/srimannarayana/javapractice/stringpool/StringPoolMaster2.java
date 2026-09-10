package com.srimannarayana.javapractice.stringpool;

public class StringPoolMaster2 {
	
	public static void main(String[] args) {

        String a = "Java";

        final String x = "Ja";
        final String y = "va";

        String b = x + y;

        String c = new String("Java");

        String d = c.intern();

        final String p = new String("Ja");
        String q = p + "va";

        String r = "Java";

        System.out.println("a == b : " + (a == b));
        System.out.println("a == c : " + (a == c));
        System.out.println("a == d : " + (a == d));
        System.out.println("a == q : " + (a == q));
        System.out.println("b == d : " + (b == d));
        System.out.println("c == d : " + (c == d));
        System.out.println("d == r : " + (d == r));

        System.out.println("b.equals(q) : " + b.equals(q));
        System.out.println("c.equals(q) : " + c.equals(q));
    }

}
