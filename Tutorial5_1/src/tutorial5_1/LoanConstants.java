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
 * ii.	LoanConstants—A public interface class. LoanConstants includes constant values for short-term (one year),
 * medium-term (three years), and long-term (five years) loans. It also contains constants for the company name and the
 * maximum loan amount.
 * 
 */
public interface LoanConstants {
    int SHORT_TERM_VALUE = 1;
    int MEDIUM_TERM_VALUE = 3;
    int LONG_TERM_VALUE = 5;
    String COMPANY_NAME = "Sanchez Construction Loan Co.";
    double MAXIMUM_LOAN_AMOUNT = 100000;
}
