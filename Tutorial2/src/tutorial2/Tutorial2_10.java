/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial2;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Write a program that asks the user for the number of days of work and then calculates 
 * the amount a person would earn over a period of time if his or her salary is ten pence 
 * the first day, twenty pence the second day, and continues to double each day. 
 * The program should display a table showing the salary for each day, and then show 
 * the total pay at the end of the period. The output should be displayed in a pound amount, 
 * not the number of pence. 
 * Input Validation: Do not accept a number less than 1 for the number of days worked.
 * 
 */
public class Tutorial2_10 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long numberOfDays, salary = 10, totalPay = 0;
        do
        {
            System.out.println("Enter the number of days of work (At least 1)");
            numberOfDays = input.nextLong();
        }while(numberOfDays < 1);
        for(int i = 1; i <= numberOfDays; i++)
        {
            System.out.print("Day " + i + ": ");
            if(salary/100 == 1) System.out.print((salary/100) + " pound ");
            else if(salary/100 > 1) System.out.print((salary/100) + " pounds ");
            if(salary%100 == 1) System.out.print((salary%100) + " pence ");
            else if(salary%100 > 1) System.out.print((salary%100) + " pences ");
            System.out.print("\n");
            totalPay += salary;
            salary *= 2;
        }
        if(numberOfDays == 1) System.out.print("Total pay after " + numberOfDays + " day: ");
        else System.out.print("Total pay after " + numberOfDays + " days: ");
        if(totalPay/100 == 1) System.out.print((totalPay/100) + " pound ");
        else if(totalPay/100 > 1) System.out.print((totalPay/100) + " pounds ");
        if(totalPay%100 == 1) System.out.print((totalPay%100) + " pence ");
        else if(totalPay%100 > 1) System.out.print((totalPay%100) + " pences ");
        System.exit(0);
    }
}
