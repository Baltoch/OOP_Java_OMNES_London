/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial3;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Write a class named MonthDays. The class’s constructor should accept two arguments: 
 * •	An integer for month (1=January, 2 February, etc. )
 * •	An integer for the year
 * The class should have a method named getNumberOfDays that returns the number of days 
 * in the specified month. The method should use the following criteria to identify leap years: 
 * •	Determine whether the year is divisible by 100. If it is, then it is a leap year if and 
 *      if only it is divisible by 400. For example, 2000 is a leap year but 2100 will not be. 
 * •	If the year is not divisible by 100, then it is a leap year if and if only it is divisible
 *      by 4. For example, 2008 is a leap year but 2009 is not. 
 * Demonstrate the class in a program that asks the user to enter the month 
 * (letting the user enter an integer in the range of 1 through 12) and the year. 
 * The program should display the number of days in that month. Here is a sample 
 * run of the program: 
 * Enter a month (1-12): 2 [Enter] 
 * Enter a year: 2008 [Enter] 
 * 29 days 
 * 
 */
public class Tutorial3Q2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long m, y;
        System.out.println("Enter a month (as a number between 1 and 12):");
        do
        {
            m = input.nextLong();
        }while(m < 1 || m > 12);
        System.out.println("Enter a year:");
        y = input.nextLong();
        MonthDays monthDays = new MonthDays(m, y);
        System.out.println(monthDays.getNumberOfDays() + " days");
    }
}

class MonthDays {
    private long month;
    private long year;
    public MonthDays(long m, long y)
    {
        month = m;
        year = y;
    }
    public long getNumberOfDays()
    {
        if(month == 2)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0) return 29;
                else return 28;
            }
            else if(year % 4 == 0) return 29;
            else return 28;
        }
        else if(month < 8)
        {
            if(month % 2 == 1) return 31;
            else return 30;
        }
        else
        {
            if(month % 2 == 0) return 31;
            else return 30;
        }
    }
    
}
