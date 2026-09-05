package com.srimannarayana.javapractice.myfirstjavaprograms;

import java.util.Scanner;

public class MobileSpecs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Phone Brand : ");
        String phoneBrand = scanner.nextLine();
       
        System.out.print("Enter your phone Model : ");
        String phoneModel = scanner.nextLine();
        
        System.out.print("Enter the Phone's Price : ");
        int phonePrice = scanner.nextInt();

        System.out.print("Enter the ROM : ");
        int phoneROM = scanner.nextInt();

        System.out.print("Enter the RAM : ");
        int phoneRAM = scanner.nextInt();
        
        String category;
        if(phonePrice <= 15000) {
        	category = "Budget Friendly";
        }
        else if(phonePrice <= 30000){
        	category = "Mid-Range";
        }
        else if(phonePrice <= 60000) {
        	category = "Costly";
        }
        else if(phonePrice <= 120000) {
        	category = "Premium";
        }
        else{
        	category = "Ultra-Flagship";
        }
        
        System.out.println("Mobile Specifications :");
        System.out.println("The brand of your phone is : " + phoneBrand);
        System.out.println("The model of your phone is : " + phoneModel);
        System.out.println("The price of your Phone is : " + " ₹" + phonePrice + "/-");
        System.out.println("Storage : " + phoneROM + "GB ROM" + " | " + phoneRAM + "GB RAM" );
        System.out.println("ROM : " + phoneROM + "GB");
        System.out.println("RAM : " + phoneRAM + "GB");
        System.out.println("Category : " + category);
        scanner.close();
	}

}
