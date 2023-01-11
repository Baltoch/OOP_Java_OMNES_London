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
 * Assume that a gallon of paint covers about 350 square feet of wall space. Create an application with a main() 
 * method that prompts the user for the length, width, and height of a rectangular room. 
 * Pass these three values to a method that does the following: 
 * a.	Calculates the wall area for a room. Passes the calculated wall area to another method that calculates 
 *      and returns the number of gallons of paint needed 
 * b.	Displays the number of gallons needed 
 * c.	Computes the price based on a paint price of $32 per gallon, assuming that the painter can buy 
 *      any fraction of a gallon of paint at the same price as a whole gallon 
 * d.	Returns the price to the main() method 
 * e.	The main() method displays the final price. For example, the cost to paint a 15- by-20-foot 
 *      room with 10-foot ceilings is $64. 
 * 
 */

public class Tutorial2_14 {
    static final double PRICE_PER_GALLON = 32;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long length, width, height;
        double price;
        System.out.println("Enter the length (in foot) of the room");
        length = input.nextLong();
        System.out.println("Enter the width (in foot) of the room");
        width = input.nextLong();
        System.out.println("Enter the height (in foot) of the room");
        height = input.nextLong();
        price = price(length, width, height);
        System.out.println("The cost to paint a " + width + "-by-" + length + "-foot room with " + height + "-foot ceilings is $" + (long)price + ".");
        System.exit(0);
    }
    public static double price(long length, long width, long height)
    {
        long wallArea = (length + width) * 2 * height;
        double gallonsOfPaint = paint(wallArea);
        System.out.println(gallonsOfPaint + " gallons of paint needed");
        return PRICE_PER_GALLON * gallonsOfPaint;
    }
    public static double paint(long wallArea)
    {
        return wallArea / 350.0;
    }
}
