package com.srimannarayana.javapractice.stringpool;

public class StringPoolMaster4 {
	
	static String make(String s) {
        return s + "va";
    }

    static String makeFinal(final String s) {
        return s + "va";
    }

    public static void main(String[] args) {

        String a = "Java";

        final String x = "Ja";
        String b = x + "va";

        String c = make(x);

        final String y = "Ja";
        String d = makeFinal(y);

        String e = new String("Java");
        String f = e.intern();

        e = e.intern();

        System.out.println("a == b : " + (a == b));
        System.out.println("a == c : " + (a == c));
        System.out.println("a == d : " + (a == d));
        System.out.println("a == f : " + (a == f));
        System.out.println("e == f : " + (e == f));
        System.out.println("b == f : " + (b == f));

        System.out.println("b.equals(c) : " + b.equals(c));
        System.out.println("b.equals(d) : " + b.equals(d));
        System.out.println("c.equals(d) : " + c.equals(d));
    }

}
