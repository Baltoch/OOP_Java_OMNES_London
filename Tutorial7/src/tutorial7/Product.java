/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Create a Product class with two fields, productNum and price. The Product 
 * constructor requires values for both fields. Upon construction, throw a ProductException if the product number 
 * does not consist of three digits, if the price is less than $0.01, or if the price is over $1,000. Save the class as 
 * Product.java. Write an application that establishes at least four Product objects with valid and invalid values. 
 * Display an appropriate message when a Product object is created successfully and when one is not. 
 * 
 */

public class Product {
    private String productNum;
    private double price;

    public Product(String productNum, double price) {
        this.productNum = productNum;
        this.price = price;
        if(price < 0.01 || price > 1000) throw new ProductException("Product number: " + productNum + "; Price: $" + price);
    }  
}
