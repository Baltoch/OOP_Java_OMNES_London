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
 *@hidden
 * i.	Loan—A public abstract class that implements the LoanConstants interface. A Loan includes a loan number,
 * customer last name, amount of loan, interest rate, and term. The constructor requires data for each of the fields
 * except interest rate. Do not allow loan amounts over $100,000. Force any loan term that is not one of the three defined
 * in the LoanConstants class to a short-term, one-year loan. Create a toString() method that displays all the loan data. 
 * 
 */
public abstract class Loan implements LoanConstants {
    protected int loanNumber;
    protected String customerLastName;
    protected double amountOfLoan;
    protected double interestRate;
    protected double term;

    public Loan(int loanNumber, String customerLastName, double amountOfLoan, double term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        if(amountOfLoan > MAXIMUM_LOAN_AMOUNT) this.amountOfLoan = MAXIMUM_LOAN_AMOUNT;
        else this.amountOfLoan = amountOfLoan;
        if(term == LONG_TERM_VALUE) this.term = LONG_TERM_VALUE;
        else if(term == MEDIUM_TERM_VALUE) this.term = MEDIUM_TERM_VALUE;
        else this.term = SHORT_TERM_VALUE;
    }
    
    public void toString()
    {
        
    }
    
    
    
}
