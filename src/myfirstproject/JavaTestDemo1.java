package myfirstproject;

class Account {
    Account(int accNo) {
        System.out.println("Account No: " + accNo);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(int accNo, double balance) {
        // Calls the constructor of Account
        super(accNo); 
        System.out.println("Balance: " + balance);
    }
}

public class JavaTestDemo1 {
    public static void main(String[] args) {
        // Creating the object
        SavingsAccount myAccount = new SavingsAccount(101, 5000.50);
    }
}	