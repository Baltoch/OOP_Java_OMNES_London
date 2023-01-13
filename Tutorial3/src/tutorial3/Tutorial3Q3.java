/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial3;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 *  On a roulette wheel, the pockets are numbered from 0 to 36. The colours 
 * of the pockets are as follows:
 *  Pocket 0 is green
 *  pockets 1 through 10, the odd numbered pockets are red and the even numbered pockets are black. 
 *  For pockets 11 through 18, the odd numbered pockets are black and the even numbered 
 * pockets are red.
 *  For pockets 19 through 28, the odd numbered pockets are red and the even numbered 
 * pockets are black.
 *  For pockets 29 through 36, the odd numbered pockets are black and the even numbered
 * pockets are red.
 *  Write a class named RoulettePocket. The class’s constructor should accept a pocket number.
 *  The class should have a method named getPocketColor that returns the pocket’s color, as a string. 
 *  Demonstrate the class in a program that asks the user to enter a pocket number, and displays 
 * whether the pocket is green, red, or black. The program should display an error message if the 
 * user enters a number that is outside the range of 0 through 36.

 * @author balth
 */
public class Tutorial3Q3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long pocketNumber;
        System.out.println("Enter a pocket number (between 0 and 36):");
        pocketNumber = input.nextLong();
        if(pocketNumber < 0 || pocketNumber > 36)
        {
            System.out.println("Error: The number must be between 0 and 36");
            System.exit(1);
        }
        else
        {
            RoulettePocket roulettePocket = new RoulettePocket(pocketNumber);
            System.out.println("The pocket is " + roulettePocket.getPocketColor());
        }
    }
}

class RoulettePocket {
    long pocketNumber;
    public RoulettePocket(long pocketNumber)
    {
        this.pocketNumber = pocketNumber;
    }
    public String getPocketColor()
    {
        if(pocketNumber == 0) return "green";
        else if(pocketNumber < 11)
        {
            if(pocketNumber % 2 == 1) return "red";
            else return "black";
        }
        else if(pocketNumber < 19)
        {
            if(pocketNumber % 2 == 1) return "black";
            else return "red";
        }
        else if(pocketNumber < 29)
        {
            if(pocketNumber % 2 == 1) return "red";
            else return "black";
        }
        else
        {
            if(pocketNumber % 2 == 1) return "black";
            else return "red";
        }
    }
}