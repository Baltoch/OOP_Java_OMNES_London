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
 * Create an application whose main() method holds two double variables. 
 * Assign values to the variables. Pass both variables to a method named computePercent() that 
 * displays the two values and the value of the first number as a percentage of the second one. 
 * For example, if the numbers are 2.0 and 5.0, the method should display a statement 
 * similar to “2.0 is 40% of 5.0.” Then call the method a second time, passing the values in 
 * reverse order. 
 * 
 */

public class Tutorial2_12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double value1, value2;
        System.out.println("Enter the first value");
        value1 = input.nextDouble();
        System.out.println("Enter the second value");
        value2 = input.nextDouble();
        computePercent(value1, value2);
        computePercent(value2, value1);
        System.exit(0);
    }
    public static void computePercent(double value1, double value2)
    {
        long percent;
        percent = (long) (100 * value1 / value2);
        System.out.println(value1 + " is " + percent + "% of " + value2);
    }
}
