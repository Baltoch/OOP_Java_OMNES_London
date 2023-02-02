/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * a.	Create an application that allows you to enter salesperson data that consists  of an ID number,
 * first name, last name, and current month sales in whole dollars. Depending on whether the salesperson’s
 * sales value exceeds $1,000, output each record either to a high-performers file or a low-performers file.
 * Save the program as HighAndLowSales.java. 
 * 
 * b.	Create an application that displays the record in the text file for the salesperson ID entered 
 * by the user. An error message should be displayed if the record does not exist in any of the two files.  
 * 
 */
public class HighAndLowSales {
    public static void main(String[] args)
    {
        boolean highFlag;
        final double MIN_HIGH_SALES = 1000;
        Scanner input = new Scanner(System.in);
        PrintWriter highPerformers = null;
        PrintWriter lowPerformers = null;
        File high;
        File low;
        char choice;
        try
        {
            highPerformers = new PrintWriter("HighPerformers.txt");
            lowPerformers = new PrintWriter("LowPerformers.txt");
        }
        catch(IOException e)
        {
            System.out.println("Error: Invalid Output Files");
            System.exit(500);
        }
        do
        {
            System.out.println("Do you want to add a sales person (enter Y for yes and N for no):");
            choice = input.next().charAt(0);
            if(choice == 'Y')
            {
                double monthSales;
                SalesPerson person = new SalesPerson();
                System.out.println("Enter ID number:");
                person.setIdNumber(input.nextInt());
                System.out.println("Enter first name:");
                person.setFirstName(input.next());
                System.out.println("Enter last name:");
                person.setLastName(input.next());
                System.out.println("Enter current month sales");
                monthSales = input.nextDouble();
                person.setMonthSales(monthSales);
                if(monthSales > MIN_HIGH_SALES) highPerformers.print(person);
                else lowPerformers.print(person);
            }
        }while(choice == 'Y');
        highPerformers.close();
        lowPerformers.close();
        try
        {
            high = new File("HighPerformers.txt");
            input = new Scanner(high);
            highFlag = true;
        }
        catch(IOException e)
        {
            highFlag = false;
            System.out.println("No high performers");
        }
        if(highFlag)
        {
            System.out.println("High Performers:");
            while(input.hasNext())
            {
                SalesPerson person = new SalesPerson();
                if(input.hasNext()) person.setIdNumber(Integer.parseInt(input.nextLine()));
                if(input.hasNext()) person.setFirstName(input.nextLine());
                if(input.hasNext()) person.setLastName(input.nextLine());
                if(input.hasNext()) person.setMonthSales(Double.parseDouble(input.nextLine()));
                System.out.println(person);
            }
        } 
        try
        {
            low = new File("LowPerformers.txt");
            input = new Scanner(low);

        }
        catch(IOException e)
        {
            if(highFlag) System.out.println("Error: Files not found");
            else System.out.println("No low performers");
            System.exit(404);
        }
        System.out.println("Low Performers:");
        while(input.hasNext())
        {
            SalesPerson person = new SalesPerson();
            if(input.hasNext()) person.setIdNumber(Integer.parseInt(input.nextLine()));
            if(input.hasNext()) person.setFirstName(input.nextLine());
            if(input.hasNext()) person.setLastName(input.nextLine());
            if(input.hasNext()) person.setMonthSales(Double.parseDouble(input.nextLine()));
            System.out.println(person);
        } 
    }
}

class SalesPerson {
    private int idNumber;
    private String firstName;
    private String lastName;
    private double monthSales;

    public SalesPerson() {
    }

    public SalesPerson(int idNumber, String firstName, String lastName, double monthSales) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthSales = monthSales;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthSales(double monthSales) {
        this.monthSales = monthSales;
    }
    
    @Override
    public String toString()
    {
       return idNumber + "\n" + firstName + "\n" + lastName + "\n" + monthSales + "\n";
    }
}
