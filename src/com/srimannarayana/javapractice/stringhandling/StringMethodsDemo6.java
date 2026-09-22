package com.srimannarayana.javapractice.stringhandling;

public class StringMethodsDemo6 {

    public static void main(String[] args) {

    	System.out.println("\n================ String Methods ================");
    	
    	System.out.println("\n========== Removing whitespace ===========");

        String name = "   Srimannarayana   ";
        String city = "   Yanam";
        String state = "Puducherry   ";
        String message = "   Hello Java   ";

        System.out.println("Original name : [" + name + "]");
        System.out.println("Original city : [" + city + "]");
        System.out.println("Original state : [" + state + "]");
        System.out.println("Original message : [" + message + "]");

        System.out.println("\n================ trim() ================");

        System.out.println("name.trim() : " + name.trim());
        System.out.println("city.trim() : " + city.trim());
        System.out.println("state.trim() : " + state.trim());
        System.out.println("message.trim() : " + message.trim());
        
        
        System.out.println("name.trim() : [" + name.trim() + "]");
        System.out.println("city.trim() : [" + city.trim() + "]");
        System.out.println("state.trim() : [" + state.trim() + "]");
        System.out.println("message.trim() : [" + message.trim() + "]");
        
        
        System.out.println("\n================ strip() ================");

        System.out.println("name.strip() : " + name.strip());
        System.out.println("city.strip() : " + city.strip());
        System.out.println("state.strip() : " + state.strip());
        System.out.println("message.strip() : " + message.strip());
        
        System.out.println("name.strip() : [" + name.strip() + "]");
        System.out.println("city.strip() : [" + city.strip() + "]");
        System.out.println("state.strip() : [" + state.strip() + "]");
        System.out.println("message.strip() : [" + message.strip() + "]");
        
        

        System.out.println("\n================ stripLeading() ================");
        
        System.out.println("name.stripLeading() : " + name.stripLeading());
        System.out.println("city.stripLeading() : " + city.stripLeading());
        System.out.println("state.stripLeading() : " + state.stripLeading());
        System.out.println("message.stripLeading() : " + message.stripLeading());
        
        System.out.println("name.stripLeading() : [" + name.stripLeading() + "]");
        System.out.println("city.stripLeading() : [" + city.stripLeading() + "]");
        System.out.println("state.stripLeading() : [" + state.stripLeading() + "]");
        System.out.println("message.stripLeading() : [" + message.stripLeading() + "]");
        

        System.out.println("\n================ stripTrailing() ================");

        System.out.println("name.stripTrailing() : " + name.stripTrailing());
        System.out.println("city.stripTrailing() : " + city.stripTrailing());
        System.out.println("state.stripTrailing() : " + state.stripTrailing());
        System.out.println("message.stripTrailing() : " + message.stripTrailing());
        
        System.out.println("name.stripTrailing() : [" + name.stripTrailing() + "]");
        System.out.println("city.stripTrailing() : [" + city.stripTrailing() + "]");
        System.out.println("state.stripTrailing() : [" + state.stripTrailing() + "]");
        System.out.println("message.stripTrailing() : [" + message.stripTrailing() + "]");
    }
}