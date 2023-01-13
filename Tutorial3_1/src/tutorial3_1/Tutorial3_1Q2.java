/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial3_1;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Sammy’s Seashore Supplies rents beach equipment such as kayaks, canoes, beach chairs, and 
 * umbrellas to tourists. Write a Rental class for the company. The Rental class contains two 
 * public final static fields that hold the number of minutes in an hour and the hourly rental 
 * rate ($40), and four private fields that hold a contract number, number of hours for the rental,
 * number of minutes over an hour, and the price.
 * Write the Rental class to contain two overloaded constructors. One constructor accepts a contract
 * number and number of minutes as parameters. Use these values in the methods of the class to 
 * calculate the number of hours and the number of minutes over an hour and the total price to be 
 * paid by the customer. 
 * The other constructor is a default constructor that passes “A000” and 100 to the two-parameter 
 * constructor. Instantiate two Rental objects.  Instantiate one object to retain the constructor 
 * default values.  Accept user data for the contract number and minutes fields and use this data 
 * set to instantiate the second object. Display all the details for both objects. 
 * 
 */

public class Tutorial3_1Q2 {
    public static void main(String[] args)
    {
        Rental defaultRental = new Rental();
        Rental otherRental = new Rental("A001", 86);
        System.out.println("Default Rental:\n"
                + "Contract number: " + defaultRental.getContractNumber() + "\n"
                + "Number of hours: " + defaultRental.getNumberOfHours() + "\n"
                + "Number of minutes over the hours: " + defaultRental.getNumberOfMinutes() + "\n"
                + "Price: " + defaultRental.getPrice() + "\n");
        System.out.println("Other Rental:\n"
                + "Contract number: " + otherRental.getContractNumber() + "\n"
                + "Number of hours: " + otherRental.getNumberOfHours() + "\n"
                + "Number of minutes over the hours: " + otherRental.getNumberOfMinutes() + "\n"
                + "Price: " + otherRental.getPrice() + "\n");
        System.exit(0);
    }
}

class Rental {
    public final static long NUMBER_OF_MINUTES_PER_HOUR = 60;
    public final static double HOURLY_RENTAL_RATE = 40;
    private String contractNumber;
    private long numberOfHours;
    private long numberOfMinutes;
    private double price;

    public Rental(String contractNumber, long numberOfMinutes)
    {
        this.contractNumber = contractNumber;
        numberOfHours = numberOfMinutes / NUMBER_OF_MINUTES_PER_HOUR;
        this.numberOfMinutes = numberOfMinutes % NUMBER_OF_MINUTES_PER_HOUR;
        price = ((double)numberOfHours + (double)this.numberOfMinutes / 60) * HOURLY_RENTAL_RATE;
    }
    
    public Rental()
    {
        this("A000", 100);
    }
    
    public String getContractNumber() {
        return contractNumber;
    }

    public long getNumberOfHours() {
        return numberOfHours;
    }

    public long getNumberOfMinutes() {
        return numberOfMinutes;
    }

    public double getPrice() {
        return price;
    }

}