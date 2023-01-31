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
 * Create a ProductException class whose constructor receives a String that consists of a product number and price. 
 * Save the file as ProductException.java. 
 * 
 */
public class ProductException extends Error {
    
    public ProductException(String ProductNumberAndPrice)
    {
        super("Error: Invalid Product (" + ProductNumberAndPrice + ")");
    }
}
