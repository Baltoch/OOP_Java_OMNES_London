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
 * iv.	PersonalLoan—A public class that extends Loan. The PersonalLoan constructor sets the interest rate to
 * 2 percent over the current prime interest rate. 
 * 
 */ 
public class PersonalLoan extends Loan {
    
    public PersonalLoan(int loanNumber, String customerLastName, double amountOfLoan, double term, double currentPrimeInterestRate) 
    {
        super(loanNumber, customerLastName, amountOfLoan, term);
        interestRate = currentPrimeInterestRate + 0.02;
    }
}
