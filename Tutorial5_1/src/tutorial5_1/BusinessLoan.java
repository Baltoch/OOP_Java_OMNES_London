/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial5_1;

/**
 *
 * @author balth
 */

/**
 * @hidden
 *  iii.	BusinessLoan—A public class that extends Loan. The BusinessLoan constructor sets the interest rate to 
 * 1 percent over the current prime interest rate. 
 * 
 */
public class BusinessLoan extends Loan {
    
    public BusinessLoan(int loanNumber, String customerLastName, double amountOfLoan, double term, double currentPrimeInterestRate) 
    {
        super(loanNumber, customerLastName, amountOfLoan, term);
        interestRate = currentPrimeInterestRate + 0.01;
    }
}
