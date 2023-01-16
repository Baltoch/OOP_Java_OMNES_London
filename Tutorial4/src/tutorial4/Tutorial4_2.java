/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial4;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * The Westfield Carpet Company has asked you to write an application that calculates the price of 
 * carpeting for rectangular rooms. To calculate the price, you multiply the area of the floor 
 * (width times length) by the price per square foot of carpet. For example, the area of floor 
 * that is 12 feet long and 10 feet wide is 120 square feet. To cover that floor with carpet that 
 * costs $8 per square foot would cost $960. (12 X 10 X 8 = 960.) 
 * First, you should create a class named RoomDimension that has two fields: one for the length of 
 * the room and one for the width. The RoomDimension class should have a method that returns the 
 * area of the room. (The area of the room is the room’s length multiplied by the room’s width.) 
 * Next you should create a RoomCarpet class that has a RoomDimension object as a field. 
 * It should also have a field for the cost of the carpet per square foot. The RoomCarpet class 
 * should have a method that returns the total cost of the carpet. 
 * Following is the UML diagram that shows possible class designs. Once you have written these 
 * classes, use them in an application that asks the user to enter the dimensions of a room and 
 * the price per square foot of the desired carpeting. The application should display the total 
 * cost of the carpet. 
 * 
 */
public class Tutorial4_2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double len, w, cost;
        System.out.println("Enter the length of the room (in foot):");
        len = input.nextDouble();
        System.out.println("Enter the width of the room (in foot):");
        w = input.nextDouble();
        System.out.println("Enter the cost per foot of the carpets (in $)");
        cost = input.nextDouble();
        RoomDimension dim = new RoomDimension(len, w);
        RoomCarpet carpet = new RoomCarpet(dim, cost);
        System.out.println("Total cost for " + dim.toString() +": " + carpet.toString());
    }
}

class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;
    
    public RoomCarpet(RoomDimension dim, double cost)
    {
        this.size = dim;
        this.carpetCost = cost;
    }

    public RoomDimension getRoomDimension() {
        return size;
    }

    public void setRoomDimension(RoomDimension dim) {
        this.size = dim;
    }

    public double getPricePerSquareFoot() {
        return carpetCost;
    }

    public void setPricePerSquareFoot(double cost) {
        this.carpetCost = cost;
    }
    
    public double getTotalCost()
    {
        return size.getArea() * carpetCost;
    }
    public String toString()
    {
        return "$" + Double.toString(this.getTotalCost());
    }
}

class RoomDimension {
    private double length;
    private double width;
    
    public RoomDimension(double len, double w)
    {
        this.length = len;
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double len) {
        this.length = len;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        this.width = w;
    }
    
    public double getArea()
    {
        return length * width;
    }
    public String toString()
    {
        return Double.toString(this.getArea()) + " square feet";
    }
}
