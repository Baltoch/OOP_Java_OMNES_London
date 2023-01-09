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
 * Write a class that calculates and displays the conversion of an entered number of dollars 
 * into currency denominations—20s, 10s, 5s, and 1s. (Note: Do NOT use loops or conditional 
 * statements if you know them already)
 * 
 */
public class Tutorial1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long numberOfDollars, numberOf20s, numberOf10s, numberOf5s, numberOf1s;
        System.out.println("Enter a number of dollars");
        numberOfDollars = input.nextLong();
        numberOf20s = numberOfDollars / 20;
        numberOfDollars -= 20 * numberOf20s;
        numberOf10s = numberOfDollars / 10;
        numberOfDollars -= 10 * numberOf10s;
        numberOf5s = numberOfDollars / 5;
        numberOfDollars -= 5 * numberOf5s;
        numberOf1s = numberOfDollars / 1;
        System.out.println("You need :\n\t"
                + numberOf20s + " $20 bill\n\t"
                + numberOf10s + " $10 bill\n\t"
                + numberOf5s + " $5 bill\n\t"
                + numberOf1s + " $1 bill\n");
        
    }
}
