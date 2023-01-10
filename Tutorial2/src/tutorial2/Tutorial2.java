/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial2;

import java.util.Scanner;
/**
 *
 * @author balth
 */

/**
 * @hidden
 * Write a program to read the salary from the user and determine how much tax someone should pay
 * according to the following rules: People pay no tax if they earn up to £10000. 
 * They pay tax at the rate of 20% on the amount they earn over £10000 but up to £50000. 
 * They pay tax at 50% on any money they earn over £50000. For example, if the salary is £90,000. 
 * The tax will be 0.2*40,000+0.5*40,000 = 28,000
 * 
 */
public class Tutorial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        final double TAX_ABOVE_10K = 0.2, TAX_ABOVE_50K = 0.5;
        long salary, above10k, above50k;
        System.out.println("Enter your salary");
        salary = input.nextLong();
        if(salary > 50000)
        {
            above50k = salary - 50000;
            above10k = salary - 10000;
        }
        else if(salary > 10000)
        {
            above50k = 0;
            above10k = salary - 10000;
        }
        else
        {
           above50k = 0;
           above10k = 0; 
        }
        System.out.println("Tax: " + (above10k * TAX_ABOVE_10K + above50k * TAX_ABOVE_50K));
        System.exit(0);
    }
    
}
