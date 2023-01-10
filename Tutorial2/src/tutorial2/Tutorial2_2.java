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
 * Read three values as input from the user. Display the maximum value among the 
 * given input values.
 * 
 */
public class Tutorial2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] values = {0, 0, 0};
        System.out.println("Enter first value");
        values[0] = input.nextDouble();
        System.out.println("Enter second value");
        values[1] = input.nextDouble();
        System.out.println("Enter third value");
        values[2] = input.nextDouble();
        for(int i = 0; i < values.length - 1; i++)
        {
            if(values[i] > values[i + 1])
            {
                double temp = values[i];
                values[i] = values[i + 1];
                values[i + 1] = temp;
            }
        }
        System.out.println("Max : " + values[values.length - 1]);
        System.exit(0);
    }   
}
