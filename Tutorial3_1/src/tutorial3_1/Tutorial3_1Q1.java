/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial3_1;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Create a class named Billing that includes three overloaded computeBill() methods for a photo 
 * book store. 
 * a. When computeBill() receives a single parameter, it represents the price of one photo 
 *    book ordered. Add 8% tax, and return the total due. 
 * b. When computeBill() receives two parameters, they represent the price of a photo book *
 *    and the quantity ordered. Multiply the two values, add 8% tax, and return the total due.  
 * c. When computeBill() receives three parameters, they represent the price of a photo book, 
 *    the quantity ordered, and a coupon value. Multiply the quantity and price, reduce the 
 *    result by the coupon value, and then add 8% tax and return the total due. 
 * Write a main() method that tests all three overloaded methods. 
 * 
 */
public class Tutorial3_1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Billing billing = new Billing();
        System.out.println("Price of 1 product costing $10 without taxes:");
        System.out.println("Expected: $10.8\nGot: $" + billing.computeBill(10));
        System.out.println("Price of 2 product costing $10 without taxes:");
        System.out.println("Expected: $21.6\nGot: $" + billing.computeBill(10, 2));
        System.out.println("Price of 2 product costing $10 without taxes with a 50% off coupon:");
        System.out.println("Expected: $10.8\nGot: $" + billing.computeBill(10, 2, 0.5));
    }
    
}

class Billing {
    public double computeBill(double price)
    {
        return price * 1.08;
    }
    public double computeBill(double unitPrice, double quantity)
    {
        return unitPrice * quantity * 1.08;
    }
    public double computeBill(double unitPrice, double quantity, double coupon)
    {
        return unitPrice * quantity * coupon * 1.08;
    }
}