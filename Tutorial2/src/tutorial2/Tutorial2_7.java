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
 * Write a program that will calculate the average (mean) of a set of numbers. 
 * The user should be asked how many numbers are to be averaged, the user must then enter 
 * these numbers. Your program will calculate and display the average of those numbers.
 * 
 */

public class Tutorial2_7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long howMany;
        double sum = 0;
        System.out.println("How many numbers are to be averaged");
        howMany = input.nextLong();
        for(int i = 0; i < howMany; i++)
        {
            System.out.println("Enter a number to be averaged");
            sum += input.nextDouble();
        }
        System.out.println("The average is: " + (sum/howMany));
        
    }
    
}
