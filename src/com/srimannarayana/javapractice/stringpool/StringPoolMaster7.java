package com.srimannarayana.javapractice.stringpool;

public class StringPoolMaster7 {
	
	static String get(String s) {
        return s;
    }

    public static void main(String[] args) {

        String a = "Java";

        final String x = "Ja";
        final String y = "va";

        String b = x + y;

        String c = new String("Java");

        String d = get(c);

        String e = d.intern();

        final String f = "Java";

        String g = true ? f : new String("Java");

        String h = false ? new String("Java") : f;

        final String p = new String("Ja");

        String q = p + "va";

        String r = q.intern();

        String s = "Java" + "";

        String t = "Java" + null;

        c = c.intern();

        System.out.println("a == b : " + (a == b));
        System.out.println("a == c : " + (a == c));
        System.out.println("a == d : " + (a == d));
        System.out.println("a == e : " + (a == e));
        System.out.println("a == g : " + (a == g));
        System.out.println("a == h : " + (a == h));
        System.out.println("a == q : " + (a == q));
        System.out.println("a == r : " + (a == r));
        System.out.println("a == s : " + (a == s));
        System.out.println("a == t : " + (a == t));

        System.out.println("b == e : " + (b == e));
        System.out.println("d == e : " + (d == e));
        System.out.println("c == e : " + (c == e));
        System.out.println("q == r : " + (q == r));

        System.out.println("d.equals(a) : " + d.equals(a));
        System.out.println("q.equals(a) : " + q.equals(a));
        System.out.println("t.equals(a) : " + t.equals(a));
        
    }
}
