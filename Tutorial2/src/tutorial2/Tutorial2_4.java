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
 * Write a program to read a positive number from the user. Display the message to indicate 
 * whether the entered number is odd/even.
 * 
 */

public class Tutorial2_4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long positiveNumber;
        do
        {
            System.out.println("Enter a positive number");
            positiveNumber = input.nextLong();
            if(positiveNumber < 0)
            {
                System.out.println("Error: The number is not positive, try again");
            }
        }while(positiveNumber < 0);
        if(positiveNumber % 2 == 1)
        {
            System.out.println(positiveNumber + " is odd");
        }
        else
        {
            System.out.println(positiveNumber + " is even");
        }
        System.exit(0);
    }
}
