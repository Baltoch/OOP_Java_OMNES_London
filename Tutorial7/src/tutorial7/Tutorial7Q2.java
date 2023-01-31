/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Create a ProductException class whose constructor receives a String that consists of a product number and price. 
 * Save the file as ProductException.java. Create a Product class with two fields, productNum and price. The Product
 * constructor requires values for both fields. Upon construction, throw a ProductException if the product number does
 * not consist of three digits, if the price is less than $0.01, or if the price is over $1,000. Save the class as Product.java.
 * Write an application that establishes at least four Product objects with valid and invalid values. Display an appropriate
 * message when a Product object is created successfully and when one is not. 
 * 
 */
public class Tutorial7Q2 {
    public static void main(String[] args)
    {
        Product[] array = new Product[4];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
        {
            try
            {
                String productNum;
                double price;
                System.out.println("Enter product number:");
                productNum = input.next();
                System.out.println("Enter product price:");
                price = input.nextDouble();
                array[i] = new Product(productNum, price);
                System.out.println("Product " + productNum + " saved successfully !");
            }
            catch(ProductException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
