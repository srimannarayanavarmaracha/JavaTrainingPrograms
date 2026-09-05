package com.srimannarayana.javapractice.myfirstjavaprograms;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name : ");
        String first_name = scanner.nextLine();

        System.out.println("Enter your last name : ");
        String last_name = scanner.nextLine();

        System.out.println("Enter your Employee ID : ");
        int e_id = scanner.nextInt();
        scanner.nextLine();

        String emp_id = "EMP" + String.valueOf(e_id);

        System.out.println("Enter your Date of Birth dd-mm-yyyy : ");
        String dob = scanner.nextLine();

        int date = Integer.parseInt(dob.substring(0, 2));
        int month = Integer.parseInt(dob.substring(3, 5));
        int year = Integer.parseInt(dob.substring(6));

        System.out.println("Enter present Date (dd) : ");
        int present_date = scanner.nextInt();

        System.out.println("Enter present Month (mm) : ");
        int present_month = scanner.nextInt();

        System.out.println("Enter present Year (yyyy) : ");
        int present_year = scanner.nextInt();

        int days = present_date - date;
        int months = present_month - month;
        int years = present_year - year;

        if (days < 0) {
            months--;
            int prevMonth = present_month - 1;
            int prevYear = present_year;
            if (prevMonth == 0) {
                prevMonth = 12;
                prevYear--;
            }
            days += daysInMonth(prevMonth, prevYear);
        }

        if (months < 0) {
            years--;
            months += 12;
        }

        System.out.println("first name : " + first_name);
        System.out.println("last name : " + last_name);
        System.out.println("full name : " + first_name + " " + last_name);
        System.out.println("Employee ID : " + emp_id);
        System.out.println();
        System.out.println("Age : " + years + " years, " + months + " months, " + days + " days" + " old");

        scanner.close();
    }

    // returns number of days in the given month/year, accounting for leap years
    static int daysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}