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
 * Write a program using select case statement to allow the user to select from a menu of operations.
 *      •	Add two numbers
 *      •	Subtract numbers
 *      •	Multiply two numbers
 *      •	Divide two numbers
 * Read two numbers as input from the user. Based on the user’s choice of operation, perform the operation on the two numbers and display the result.
 *
 */
public class Tutorial2_3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice;
        double number1, number2;
        System.out.println("Menu:\n"
                + "\t1. Add two numbers\n"
                + "\t2. Substract numbers\n"
                + "\t3. Multiply two numbers\n"
                + "\t4. Divide two numbers\n"
                + "Enter the digit corresponding to your choice");
        choice = input.nextInt();
        System.out.println("Enter first number");
        number1 = input.nextDouble();
        System.out.println("Enter second number");
        number2 = input.nextDouble();
        switch(choice)
        {
            case 1:
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 * number2));
                break;
            case 4:
                System.out.println("Result: " + (number1 / number2));
                break;
            default:
                System.out.println("Error: Incorrect choice");
        }
        System.exit(0);
    }
}
