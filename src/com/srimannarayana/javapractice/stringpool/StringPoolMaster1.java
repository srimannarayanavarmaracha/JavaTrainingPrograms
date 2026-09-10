package com.srimannarayana.javapractice.stringpool;

public class StringPoolMaster1 {

    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";

        String c = new String("Java");

        final String x = "Ja";
        final String y = "va";

        String d = x + y;

        String e = c + " ";

        String f = d.intern();

        System.out.println("a == b : " + (a == b));
        System.out.println("a == c : " + (a == c));
        System.out.println("a == d : " + (a == d));
        System.out.println("a == e : " + (a == e));
        System.out.println("a == f : " + (a == f));

        System.out.println("d == f : " + (d == f));
        System.out.println("e.equals(a) : " + e.equals(a));
        
        
    }
}