/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial1;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Travel Tickets Company sells tickets for airlines, tours, and other travel-related services.
 * Because ticket agents frequently mistype long ticket numbers, Travel Tickets has asked you 
 * to write an application that indicates invalid ticket number entries. 
 * The class prompts a ticket agent to enter a six-digit ticket number. 
 * Ticket numbers are designed so that if you drop the last digit of the number, then divide 
 * the number by 7, the remainder of the division will be identical to the last dropped digit. 
 * This process is illustrated in the following example:
 * 
 *      Step 1   Enter the ticket number; for example, 123454.
 *      Step 2   Remove the last digit, leaving 12345.
 *      Step 3   Determine the remainder when the ticket number is divided by 7. In this case, 12345 divided by 7
 *               leaves a remainder of 4.
 *      Step 4   Assign th Boolean value of the comparison between the remainder and the digit dropped from the 
 *               ticket number.
 *      Step 5   Display the result (true or false) in a message box.
 * 
 * Accept the ticket number from the agent and verify whether it is a valid number. 
 * Test the application with the following ticket numbers: 
 *      • 123454; the comparison should evaluate to true 
 *      • 147103; the comparison should evaluate to true 
 *      • 154123; the comparison should evaluate to false
 *
 */
public class Tutorial1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long ticketNumber, droppedDigit;
        System.out.println("Enter ticket number");
        ticketNumber = input.nextLong();
        droppedDigit = ticketNumber % 10;
        ticketNumber /= 10;
        System.out.println((ticketNumber % 7) == droppedDigit);
    }
}
