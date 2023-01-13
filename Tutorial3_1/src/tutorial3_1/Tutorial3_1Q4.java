/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial3_1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Make a LandTract class that has two fields: one for the tract’s length and one for the width.
 * The class should have a method that returns the tract’s area, as well as an equals method. 
 * Demonstrate the class in a program that asks the user to enter the dimensions for two tracts
 * of land. The program should display the area of each tract of land and indicate whether 
 * the tracts are of equal size. 
 * 
 */

public class Tutorial3_1Q4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final long NUM_OF_TRACTS = 2;
        ArrayList<LandTract> tracts = new ArrayList<>();
        double length, width;
        for(int i = 0; i < NUM_OF_TRACTS; i++)
        {
            System.out.println("Enter the length of the tract " + (i+1) + ":");
            length = input.nextDouble();
            System.out.println("Enter the width of the tract " + (i+1) + ":");
            width = input.nextDouble();
            tracts.add(new LandTract(length, width));
        }
        for(int i = 0; i < NUM_OF_TRACTS; i++)
        {
            System.out.println("\nTract " + (i+1) + " as an area of " + tracts.get(i).getArea());
            for(int j = 0; j < NUM_OF_TRACTS; j++)
            {
                if(i != j)
                {
                    if(tracts.get(i).equal(tracts.get(j))) System.out.println("Its area is equal to the one of tract " + (j+1));
                    else System.out.println("Its area is different from the one of tract " + (j+1));
                }
            }
        }
        System.exit(0);
    }
}

class LandTract {
    private double length;
    private double width;

    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double getArea()
    {
        return length * width;
    }
    
    public boolean equal(LandTract to)
    {
        return this.getArea() == to.getArea();
    }
}
