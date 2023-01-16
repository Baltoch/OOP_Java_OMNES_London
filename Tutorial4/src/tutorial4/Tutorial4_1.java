/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial4;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Area Class  Write a class that has three overloaded static methods for calculating the areas 
 * of the following geometric shapes: 
 * Area of a circle: 	Area = πr2
 * where π is Math.PI and r is the circle’s radius
 * Area of a rectangle: Area = Width x Length 
 * Area of a cylinder: Area = πr2h 
 * where π is Math.PI, r is the radius of the cylinder’s base, and h is the cylinder’s height 
 * Because the three methods are to be overloaded, they should each have the same name,
 * but different parameter lists. Demonstrate the class in a complete program.
 * 
 */
public class Tutorial4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Area area = new Area();
        System.out.println("The area of a circle with radius of 1 is: " + area.computeArea(1));
        System.out.println("The area of a 2 x 1 rectangle is: " + area.computeArea(2, 1));
        System.out.println("The area of a cylinder which height is 2 and base has a radius of 1 is: " + area.computeArea(1, 2, Math.PI));
    }
    
}

class Area {
    public static double computeArea(double radius)
    {
        return Math.PI * radius * radius;
    }
    public static double computeArea(double radius, double height, double pi)
    {
        return pi * radius * radius * height;
    }
    public static double computeArea(double length, double width)
    {
        return length * width;
    }
}
