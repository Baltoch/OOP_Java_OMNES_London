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
 * Internet Service Provider: An Internet service provider has three different subscription 
 * packages for its customers: 
 *      Package A:  For $9.95 per month 10 hours of access are provided. 
 *                  Additional hours are $2.00 per hour
 *      Package B: For $13.95 per month 20 hours of access are provided. 
 *                 Additional hours are $1.00 per hour. 
 *      Package C: For $19.95 per month unlimited access is provided. 
 * Write a program that calculates a customer’s monthly bill. It should ask the user to enter the 
 * letter of the package the customer has purchased (A, B, or C) and the number of hours that 
 * were used. It should then display the total charges. 
 * 
 */
public class Tutorial2_5 {
    public static void main(String[] args)
    {
        final double PACKAGE_A = 9.95, ADDITIONAL_A = 2, HOURS_A = 10, PACKAGE_B = 13.95, ADDITIONAL_B = 1, HOURS_B = 20, PACKAGE_C = 19.95;
        Scanner input = new Scanner(System.in);
        char pack;
        double numberOfHours;
        System.out.println("Enter the chosen package (A, B or C)");
        pack = input.next().charAt(0);
        System.out.println("Enter the number of hours");
        numberOfHours = input.nextDouble();
        switch(pack)
        {
            case 'A':
                if(numberOfHours > HOURS_A)
                {
                    System.out.println("Total charges: $" + (PACKAGE_A + ADDITIONAL_A * (numberOfHours - HOURS_A)));
                }
                else
                {
                    System.out.println("Total charges: $" + PACKAGE_A);
                }
                break;
            case 'B':
                if(numberOfHours > HOURS_B)
                {
                    System.out.println("Total charges: $" + (PACKAGE_B + ADDITIONAL_B * (numberOfHours - HOURS_B)));
                }
                else
                {
                    System.out.println("Total charges: $" + PACKAGE_B);
                }
                break;
            case 'C':
                System.out.println("Total charges: $" + PACKAGE_C);
                break;
            default:
                System.out.println("Error: innexistant package");
        }
        System.exit(0);
    }
}
