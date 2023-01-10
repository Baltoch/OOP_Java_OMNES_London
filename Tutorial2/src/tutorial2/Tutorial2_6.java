/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial2;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Write a program to count how many numbers between 1 and 300 are 
 * divisible by 3 with no remainder.
 * 
 */
public class Tutorial2_6 {
    public static void main(String[] args)
    {
        final long DIVISIBLE_BY = 3, MIN = 1, MAX = 300;
        long counter = 0, number;
        number = MIN;
        if(number % DIVISIBLE_BY != 0)
        {
            number += DIVISIBLE_BY - number % DIVISIBLE_BY;
        }
        while(number <= MAX)
        {
            counter += 1;
            number += DIVISIBLE_BY;
        }
        System.out.println("There is " + counter + " numbers between " + MIN + " and " + MAX + " divisible by " + DIVISIBLE_BY);
        System.exit(0);
    }
}
