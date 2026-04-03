package myfirstproject;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your Salary :");
		double BasicSalary = scanner.nextDouble();
		
		double pf = 0.12 * BasicSalary;
		
		int da = 100;
		
		int DailyAllowance = 30 * da;
		
		double NetSalary =  BasicSalary + (double)DailyAllowance - pf;
		
		System.out.println("Basic Salary of Employee : " + BasicSalary);
		System.out.println("Provident Fund (PF) : " + pf);
		System.out.println("Daily Allowance : " + DailyAllowance);
		System.out.println("Net Salary of Employee : " + NetSalary);
	}

}
