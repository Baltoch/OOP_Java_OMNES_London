/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7;

import java.util.ArrayList;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Order, which contains an order number, customer name, and address (assume you need just a street address,
 * not city, state, and zip code); a list of item numbers ordered (up to four); the total price of all items ordered; and 
 * a shipping and handling fee for the order. Include a constructor to set the field values and get methods to retrieve
 * the field values. 
 * 
 */
public class Order {
    private int orderNumber;
    private String customerName;
    private String address;
    private ArrayList<Integer> itemsOrdered;
    private double totalPrice;
    private double shippingAndHandlingFee;

    public Order(int orderNumber, String customerName, String address, ArrayList<Integer> itemsOrdered, double totalPrice, double shippingAndHandlingFee) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.address = address;
        this.itemsOrdered = itemsOrdered;
        this.totalPrice = totalPrice;
        this.shippingAndHandlingFee = shippingAndHandlingFee;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public ArrayList<Integer> getItemsOrdered() {
        return itemsOrdered;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getShippingAndHandlingFee() {
        return shippingAndHandlingFee;
    }
}
