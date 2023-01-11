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
 * 9.	Write a program with a loop that lets the user enter a series of integers. 
 * The user should enter −99 to signal the end of the series. After all the numbers have been 
 * entered, the program should display the largest and smallest numbers entered
 * 
 */
public class Tutorial2_9 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long value, min, max;
        System.out.println("Enter the first integer of the serie");
        min = input.nextLong();
        max = min;
        do
        {
            System.out.println("Enter an integer or -99 to end the serie");
            value = input.nextLong();
            if(value > max) max = value;
            if(value < min && value != -99) min = value;
        }while(value != -99);
        System.out.println("The smallest number is : " + min);
        System.out.println("The largest number is : " + max);
        System.exit(0);
    }
}
