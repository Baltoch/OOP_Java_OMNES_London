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
 * Gadget, which contains an item number, description, and price for a gadget; a constructor that sets all the fields; 
 * and get methods to retrieve the field values. 
 * 
 */

public class Gadget {
    private int itemNumber;
    private String description;
    private double price;

    public Gadget(int itemNumber, String description, double price) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.price = price;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
