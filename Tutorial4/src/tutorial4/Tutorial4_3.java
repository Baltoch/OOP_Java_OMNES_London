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
 * Write a class named RetailItem that holds data about an item in a retail store. The class  should 
 * have the following fields: 
 * 
 *      description: The description field references a String object that holds a brief description 
 *      of the item.  
 * 
 *      unitsOnHand: The unitsOnHand field is an int variable that holds the number of units 
 *      currently in inventory.  
 * 
 *      price: The price field is a double that holds the item’s retail price.
 * 
 * Write a constructor that accepts arguments for each field and accessor methods that return 
 * the values in these fields. Once you have written the class, write a separate program that 
 * creates three RetailItem objects and stores the following data in them:  
 * 
 *                              Description        Units on Hand        Price
 *          Item #1      Jacket                            12                   59.95
 *          Item #2      Designer Jeans            40                   34.95
 *          Item #3      Shirt                                20                   24.95
 * 
 * 
 * Write a CashRegister class that can be used with the RetailItem class. The CashRegister class 
 * should simulate the sale of a retail item. It should have a constructor that accepts a RetailItem
 * object as an argument. The constructor should also accept an integer that represents the quantity
 * of items being purchased. In addition, the class should have the following methods: 
 * 
 *      getSubtotal method should return the subtotal of the sale, which is the quantity multiplied
 *      by the price. This method must get the price from the RetailItem object that was passed as
 *      an argument to the constructor.  
 * 
 *      getTax method should return the amount of sales tax on the purchase. The sales tax rate is
 *      6 percent of a retail sale.  
 * 
 *      getTotal method should return the total of the sale, which is the subtotal plus the 
 *      sales tax. Demonstrate the class in a program that asks the user for the quantity of 
 *      items being purchased, and then displays the sale’s subtotal, amount of sales tax, and total. 
 * 
 */

public class Tutorial4_3 {
    public static void main(String[] args)
    {
        CashRegister cashRegister;
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
        Scanner input = new Scanner(System.in);
        int choice, quantity;
        do
        {
            System.out.println("Menu:\n"
                    + "1. Jacket\n"
                    + "2. Designer Jeans\n"
                    + "3. Shirt\n"
                    + "Enter the number corresponding to your choice\n");
            choice = input.nextInt();
        }while(choice < 1 || choice > 3);
        System.out.println("Enter the quantity you want:");
        quantity = input.nextInt();
        switch(choice)
        {
            case 1:
                cashRegister = new CashRegister(item1, quantity);
                break;
            case 2:
                cashRegister = new CashRegister(item2, quantity);
                break;
            case 3:
                cashRegister = new CashRegister(item3, quantity);
                break;
            default:
                System.out.println("Error: Unknown item");
                cashRegister = new CashRegister(item3, quantity);
                System.exit(1);
        }
        System.out.println("The total price is $" + cashRegister.getTotal() + " including $" + cashRegister.getTax() + " in tax");
        System.exit(0);
                
        
        
    }
}

class CashRegister {
    private final RetailItem item;
    private final long quantity;
    
    public CashRegister(RetailItem item, long quantity) {
        this.item = item;
        this.quantity = quantity;
    }
    
    public double getSubtotal()
    {
        return item.getPrice() * quantity;
    }
    
    public double getTax()
    {
        return this.getSubtotal() * 6 / 100;
    }
    public double getTotal()
    {
        return this.getSubtotal() + this.getTax();
    }
}

class RetailItem {
    private String description;
    private int unitsOnHands;
    private double price;

    public RetailItem(String description, int unitsOnHands, double price) {
        this.description = description;
        this.unitsOnHands = unitsOnHands;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getUnitsOnHands() {
        return unitsOnHands;
    }

    public double getPrice() {
        return price;
    }
}