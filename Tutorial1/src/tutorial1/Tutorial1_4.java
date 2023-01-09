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
 * Meadowdale Dairy Farm sells organic brown eggs to local customers. They charge $3.25 
 * for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen. 
 * Write a class that prompts a user for the number of eggs in the order and then display 
 * the amount owed with a full explanation. For example, typical output might be, 
 * “You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45.0 cents each 
 * for a total of $7.85.” 
 * 
 */
public class Tutorial1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double DOZEN_PRICE = 3.25, UNIT_PRICE = 0.45;
        long numberOfEggs, numberOfDozen, numberOfLooseEggs;
        System.out.println("Enter the number of eggs");
        numberOfEggs = input.nextLong();
        numberOfDozen = numberOfEggs / 12;
        numberOfLooseEggs = numberOfEggs % 12;
        System.out.println("You ordered "
                +numberOfEggs+" eggs. That's "
                +numberOfDozen+" dozen at $3.25 per dozen and "
                +numberOfLooseEggs+" loose eggs at 45.0 cents each * for a total of $"
                +(numberOfDozen * DOZEN_PRICE + numberOfLooseEggs * UNIT_PRICE)+".");
    }
}
