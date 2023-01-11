/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial2;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Write a program that asks the user to enter today’s sales for five stores.
 * The program should display a bar chart comparing each store’s sales. 
 * Create each bar in the bar chart by displaying a row of asterisks. 
 * Each asterisk should represent $100 of sales. 
 * Here is an example of the program’s output: 
 * Enter today's sales:
 * for store 1: 1000
 * for store 2: 1200
 * for store 3: 1800 
 * for store 4: 800 
 * for store 5: 1900 
 * SALES BAR CHART 
 * Store 1: ********** 
 * Store 2: ************ 
 * Store 3: ****************** 
 * Store 4: ******** 
 * Store 5: ******************* 
 * 
 */
public class Tutorial2_11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final long NUMBER_OF_STORES = 5;
        ArrayList<Integer> values = new ArrayList<>();
        System.out.println("Enter today's sales (in $)");
        for(int i = 0; i < NUMBER_OF_STORES; i++)
        {
            System.out.println("for store " + (i + 1) + ":");
            values.add(input.nextInt());
        }
        System.out.println("\nSALES BAR CHART  ");
        for(int i = 0; i < NUMBER_OF_STORES; i++)
        {
            System.out.print("Store " + (i + 1) + ": ");
            for(int j = 0; j < (values.get(i)/100) - 1; j++)
            {
                System.out.print("*");
            }
            System.out.print("*\n");
        }
    }
    
}
