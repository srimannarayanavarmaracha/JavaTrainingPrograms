package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo8 {

	public static void main(String[] args) {
		
        System.out.println("\n====================== String Methods ====================");
        
		System.out.println("\n========= Splitting and joining ============");
        
		
		String value = "Java-Python-C++-SQL";
		
		String[] a = value.split("-");
		String[] b = value.split("-", 2);
		String[] c = value.split("-", 3);
		
		System.out.println("a_firstValue : " + a[0]);
		System.out.println("a_secondValue : " + a[1]);
		System.out.println("a_thirdValue : " + a[2]);
		System.out.println("a_fourthValue : " + a[3]);
		
		String rejoinedValue_a = String.join(" _ ", a);
		
		System.out.println("rejoinedValue_a : " + rejoinedValue_a);
		
		System.out.println("b_firstValue : " + b[0]);
		System.out.println("b_secondValue : " + b[1]);
		
		String rejoinedValue_b = String.join(" _ ", b);
		
		System.out.println("rejoinedValue_b : " + rejoinedValue_b);
		
		System.out.println("c_firstValue : " + c[0]);
		System.out.println("c_secondValue : " + c[1]);
		System.out.println("c_thirdValue : " + c[2]);
		
		String rejoinedValue_c = String.join(" _ ", c);
		
		System.out.println("rejoinedValue_c : " + rejoinedValue_c);

	}

}
