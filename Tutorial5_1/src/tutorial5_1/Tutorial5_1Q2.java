/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial5_1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Sanchez Construction Loan Co. makes loans of up to $100,000 for construction projects. There are two categories
 * of Loans—those to businesses and those to individual applicants.  Write an application that tracks all new construction
 * loans. The application must also calculate the total amount owed at the due date (original loan amount + loan fee). 
 * The application should include the following classes:  
 * 
 * i.	Loan—A public abstract class that implements the LoanConstants interface. A Loan includes a loan number,
 * customer last name, amount of loan, interest rate, and term. The constructor requires data for each of the fields
 * except interest rate. Do not allow loan amounts over $100,000. Force any loan term that is not one of the three defined
 * in the LoanConstants class to a short-term, one-year loan. Create a toString() method that displays all the loan data. 
 * 
 * ii.	LoanConstants—A public interface class. LoanConstants includes constant values for short-term (one year),
 * medium-term (three years), and long-term (five years) loans. It also contains constants for the company name and the
 * maximum loan amount. 
 * 
 * iii.	BusinessLoan—A public class that extends Loan. The BusinessLoan constructor sets the interest rate to 
 * 1 percent over the current prime interest rate. 
 * 
 * iv.	PersonalLoan—A public class that extends Loan. The PersonalLoan constructor sets the interest rate to
 * 2 percent over the current prime interest rate. 
 * 
 * v.	Tutorial5_1Q2—An application that creates an array of five Loans. Prompt the user for the current prime 
 * interest rate. Then, in a loop, prompt the user for a loan type and all relevant information for that loan. 
 * Store the created Loan objects in the array. When data entry is complete, display all the loans. 
 * 
 * Save the files as Loan.java, LoanConstants.java, BusinessLoan.java, PersonalLoan. java, and Tutorial5_1Q2.java. 
 * 
 */
public class Tutorial5_1Q2 {
    public static void main(String[] args)
    {
        final int ARRAY_LENGTH = 5;
        ArrayList<Loan> array = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double currentPrimeInterestRate;
        int loanNumber;
        String customerLastName;
        double amountOfLoan;
        double term;
        String type;
        System.out.println("Enter the current prime interest rate (in %) :");
        currentPrimeInterestRate = input.nextDouble() / 100;
        for(int i = 0; i < ARRAY_LENGTH; i++)
        {
            System.out.println("Enter customer's last name:");
            customerLastName = input.next();
            System.out.println("Enter loan number:");
            loanNumber = input.nextInt();
            System.out.println("Enter the amount of the loan:");
            amountOfLoan = input.nextDouble();
            System.out.println("Enter loan's term (in years):");
            term = input.nextDouble();
            do
            {
                System.out.println("Enter loan's type:");
                type = input.next();
                if(type.equals("done")) type = "";
                else if(type.equalsIgnoreCase("Business") || type.equalsIgnoreCase("BusinessLoan"))
                {
                    array.add(new BusinessLoan(loanNumber, customerLastName, amountOfLoan, term, currentPrimeInterestRate));
                    type = "done";
                }
                else if(type.equalsIgnoreCase("Personal") || type.equalsIgnoreCase("PersonalLoan"))
                {
                    array.add(new PersonalLoan(loanNumber, customerLastName, amountOfLoan, term, currentPrimeInterestRate));
                    type = "done";
                }
            }while(!(type.equals("done")));
        }
        for(int i = 0; i < array.size(); i++)
        {
            System.out.println(array.get(i));
        }
    }
}
