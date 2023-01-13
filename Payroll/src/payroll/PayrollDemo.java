/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payroll;

import java.util.Scanner;

/**
 *
 * @author balth
 */
public class PayrollDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Payroll employee = new Payroll();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        employee.setEmployeeName(input.next());
        System.out.println("Enter employee's ID:");
        employee.setId(input.nextLong());
        System.out.println("Enter employee's hourly rate:");
        employee.setHourlyPayRate(input.nextDouble());
        System.out.println("Enter employee's worked hours:");
        employee.setNumberOfHours(input.nextDouble());
        System.out.println("Hello " + employee.getEmployeeName() + ", employee " + employee.getId() + ".");
        System.out.println("Your gross pay is: " + employee.grossPay());                
    }
    
}
