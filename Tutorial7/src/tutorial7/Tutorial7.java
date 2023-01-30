/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial7;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Write an application that throws and catches an ArithmeticException when you attempt to take the square root 
 * of a negative value. Prompt the user for an input value and try the Math.sqrt() method on it. The application either 
 * displays the square root or catches the thrown Exception and displays an appropriate message. 
 * 
 */

public class Tutorial7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double value;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to get its square root:");
        value = input.nextDouble();
        try
        {
            if(value < 0) throw new ArithmeticException("Error: The value you entered is less than 0");
            else System.out.println("The square root of " + value + " is " + Math.sqrt(value));
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    } 
}
