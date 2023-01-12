/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial3;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Design a SavingsAccount class that stores a savings account’s annual interest rate and balance.
 * The class constructor should accept the amount of the savings account’s starting balance.
 * The class should also have methods for subtracting the amount of a withdrawal, adding the amount
 * of a deposit, and adding the amount of monthly interest to the balance. The monthly interest rate
 * is the annual interest rate divided by twelve. To add the monthly interest to the balance, 
 * multiply the monthly interest rate by the balance, and add the result to the balance. 
 * Test the class in a program that calculates the balance of a savings account at the end 
 * of a period of time. It should ask the user for the annual interest rate, the starting balance, 
 * the number of months that have passed since the account was established and then iterate once for 
 * every month, performing the following: 
 * •	Ask the user for the amount deposited into the account during the month. Use the class method to add this amount to the account balance.  
 * •	Ask the user for the amount withdrawn from the account during the month. class method to subtract this amount from the account balance.  
 * •	Use the class method to calculate the monthly interest. 
 * After last iteration, the program should display the ending balance ( by the end of the year), 
 * the total amount of deposits, the total amount of withdrawals, and the total interest earned. 
 *
 */
public class Tutorial3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double interestRate, startingBalance;
        long numberOfMonth;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting balance");
        startingBalance = input.nextDouble();
        SavingsAccount account = new SavingsAccount();
    }
    
}

class SavingsAccount {
    private double annualInterestRate;
    private double balance;
    public SavingsAccount(double startingBalance, double startingAnnualInterestRate) {
        balance = startingBalance;
        annualInterestRate = startingAnnualInterestRate;
    }
    public void withdrawal(double amount)
    {
        balance -= amount;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public void addMonthlyRate()
    {
        balance += annualInterestRate / 12 * balance;
    }
}
