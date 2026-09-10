package com.srimannarayana.javapractice.stringpool;

public class StringPoolMaster6 {
	
	public static void main(String[] args) {

        String a = "Java";

        final String x = "Ja";
        final String y = "va";

        String b = true ? x + y : "Python";

        String c = false ? "Python" : x + y;

        final String p = new String("Ja");
        String d = true ? p + "va" : "Python";

        String e = new String("Java");
        String f = e.intern();

        final String q = "Java";
        String g = true ? q : new String("Java");

        String h = "Java" + null;

        System.out.println("a == b : " + (a == b));
        System.out.println("a == c : " + (a == c));
        System.out.println("a == d : " + (a == d));
        System.out.println("a == f : " + (a == f));
        System.out.println("a == g : " + (a == g));
        System.out.println("a == h : " + (a == h));

        System.out.println("b == c : " + (b == c));
        System.out.println("b == d : " + (b == d));
        System.out.println("c == g : " + (c == g));

        System.out.println("d.equals(a) : " + d.equals(a));
        System.out.println("h.equals(a) : " + h.equals(a));
    }
}
