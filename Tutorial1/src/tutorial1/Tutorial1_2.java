/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial1;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
* @hidden 
* Write a program that computes the tax and tip on a restaurant bill. 
* The program should ask the user to enter the charge for the meal(For example, Charge =80).
* The tax should be 6.75% of the meal charge (x=80+ 6.75% of 80). The tip should be 20% of 
* the total after adding the tax(x+20% of x). Display the meal charge, tax amount, tip amount, 
* and total bill on the screen. 
*/
public class Tutorial1_2 {
        public static void main(String[] args) {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            final double tax = 0.0675, tip = 0.2;
            double mealCharge, taxAmount, tipAmount, totalBill;
            System.out.println("Enter the meal charge");
            mealCharge = input.nextDouble();
            taxAmount = tax * mealCharge;
            totalBill = mealCharge + taxAmount;
            System.out.println("The tax amount is " + taxAmount);
            tipAmount = tip * totalBill;
            System.out.println("The tip amount is " + tipAmount);
            totalBill += tipAmount;
            System.out.println("The total bill is " + totalBill);
    }
}
