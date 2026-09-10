package com.srimannarayana.javapractice.stringpool;

public class StringPoolMaster5 {
	
	static final String A = "Java";
    static final String B = "Ja" + "va";
    static final String C = getJava();

    static String getJava() {
        return "Java";
    }

    public static void main(String[] args) {

        String a = A;
        String b = B;
        String c = C;

        String d = "Ja" + "va";
        String e = "Java" + "";
        String f = "Java" + null;

        String g = new String("Java");
        String h = g.intern();

        g = g.intern();

        System.out.println("a == b : " + (a == b));
        System.out.println("a == c : " + (a == c));
        System.out.println("a == d : " + (a == d));
        System.out.println("a == e : " + (a == e));
        System.out.println("a == f : " + (a == f));
        System.out.println("a == h : " + (a == h));
        System.out.println("g == h : " + (g == h));

        System.out.println("c.equals(a) : " + c.equals(a));
        System.out.println("f.equals(a) : " + f.equals(a));
    }
}
