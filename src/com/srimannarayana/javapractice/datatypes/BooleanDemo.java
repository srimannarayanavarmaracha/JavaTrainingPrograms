package com.srimannarayana.javapractice.datatypes;

import java.util.Scanner;

public class BooleanDemo {
	
	public static void main(String[] args) {
		System.out.println("========== AND (&&) ==========");

	    System.out.println("true && true = " + (true && true));
	    System.out.println("true && false = " + (true && false));
	    System.out.println("false && true = " + (false && true));
	    System.out.println("false && false = " + (false && false));


	    System.out.println("\n========== OR (||) ==========");

	    System.out.println("true || true = " + (true || true));
	    System.out.println("true || false = " + (true || false));
	    System.out.println("false || true = " + (false || true));
	    System.out.println("false || false = " + (false || false));


	    System.out.println("\n========== NOT (!) ==========");

	    System.out.println("!true = " + (!true));
	    System.out.println("!false = " + (!false));
	     
	    Scanner sc = new Scanner(System.in);
	     
	    System.out.println("Enter your Age : ");
	    int age = sc.nextInt();
	     
	    System.out.println("If you have ticket go for true/ if not go for false (true/ false)");
	    boolean hasTicket = sc.nextBoolean();
	     
	    boolean canEnter = age >=18 && hasTicket;
	     
	    System.out.println(canEnter);
	     
	    System.out.println("======= End of Boolean Type Practice =======");
	     
	    sc.close();

	}

}
