/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial7;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Using a text editor, create a file that contains a list of at least 10 six-digit account numbers. Read in each account 
 * number and display whether it is valid. An account number is valid only if the last digit is equal to the sum of the first 
 * five digits divided by 10. For example, the number 223355 is valid because the sum of the first five digits is 15, the 
 * remainder when 15 is divided by 10 is 5, and the last digit is 5. Write only valid account numbers to an output file,
 * each on its own line. Save the application as ValidateCheckDigits.java. 
 * 
 */

public class ValidateCheckDigits {
    public static void main(String[] args)
    {
        PrintWriter output = null;
        Scanner testCheckDigits = null;
        try
        {
            File testFile = new File("TestCheckDigits.txt");
            testCheckDigits = new Scanner(testFile);
        }
        catch(IOException e)
        {
            System.out.println("Error: Test File not found");
            System.exit(404);
        }
        try
        {
            output = new PrintWriter("ValidCheckDigits.txt");
        }
        catch(IOException e)
        {
            System.out.println("Error: Invalid Output File");
            System.exit(500);
        }
        while(testCheckDigits.hasNextInt())
        {
            int tested = testCheckDigits.nextInt();
            int sum = 0;
            String firstFiveDigits = String.valueOf(tested/10);
            for(int i = 0; i < firstFiveDigits.length(); i++)
            {
                sum += (int) firstFiveDigits.charAt(i);
            }
            if(sum%10 == tested%10)
            {
                output.println(tested);
            }
        }
        testCheckDigits.close();
        output.close();
        testCheckDigits = null;
        output = null; 
    }
}
