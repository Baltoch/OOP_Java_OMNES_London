/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial5;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Every summer, Leeland Lakeside resort rents cabins by the week. Create a class named CabinRental that
 * includes an integer field for the cabin number and a double field for the weekly rental rate. Include get methods 
 * for these fields and a constructor that requires an integer argument representing the cabin number. The constructor 
 * sets the weekly rate based on the cabin number; cabins numbered 1, 2, and 3 are $950 per week, and others are
 * $1,100 per week. Create an extended class named HolidayCabinRental that is used for rentals during weeks that 
 * include summer holiday weekends. The constructor for this class requires a room number and adds a $150 surcharge 
 * to the regular rental rate. Write an application named Tutorial5Q1 that calculates the charges of holiday as per
 * the customer specification for cabin and the room. 
 * 
 */
public class Tutorial5Q1 {

 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HolidayCabinRental cabin;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the room you want:");
        cabin = new HolidayCabinRental(input.nextInt());
        System.out.println("the weekly rental rate will be " + cabin.getWeeklyRentalRate());
    }    
}

class CabinRental {
    private int cabinNumber;
    private double weeklyRentalRate;
    
    public CabinRental(int cabinNumber)
    {
        this.cabinNumber = cabinNumber;
        if(cabinNumber > 0 && cabinNumber < 4) weeklyRentalRate = 950;
        else weeklyRentalRate = 1100;
    }

    public int getCabinNumber() {
        return cabinNumber;
    }

    public void setCabinNumber(int cabinNumber) {
        this.cabinNumber = cabinNumber;
    }

    public double getWeeklyRentalRate() {
        return weeklyRentalRate;
    }

    public void setWeeklyRentalRate(double weeklyRentalRate) {
        this.weeklyRentalRate = weeklyRentalRate;
    }
    
    
}

class HolidayCabinRental extends CabinRental {
    
    public HolidayCabinRental(int roomNumber)
    {
        super(roomNumber);
        double weeklyRentalRate = getWeeklyRentalRate();
        setWeeklyRentalRate(weeklyRentalRate + 150);
    }
}