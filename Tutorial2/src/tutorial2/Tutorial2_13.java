/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial2;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * A prime number is a number that is evenly divisible only by itself and 1. 
 * For example, the number 5 is prime because it can be evenly divided only by 1 and 5. 
 * The number 6, however, is not prime because it can be divided evenly by 1, 2, 3, and 6. 
 * 
 * Write a method named isPrime, which takes an integer as an argument and returns true 
 * if the argument is a prime number, or false otherwise. Demonstrate the method in a complete 
 * program. 
 * Hint: The % operator divides one number by another, and returns the remain- der of 
 * the division. In an expression such as num1 % num2, the % operator will return 0 if num1 
 * is evenly divisible by num2. 
 * 
 */
public class Tutorial2_13 {
    public static void main(String[] args)
    {
        final int[] primeNumbers = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        System.out.println("Prime numbers under 100 are:");
        for(int i = 0; i < primeNumbers.length; i++)
        {
            System.out.println(primeNumbers[i]);
        }
        System.out.println("\nResults of isPrime(i) for i in [1,100] : ");
        for(int i = 1; i <= 100; i++)
        {
            System.out.print(i);
            if(isPrime(i)) System.out.print(" is a prime number\n");
            else System.out.print(" is not a prime number\n");
        }
        
        System.exit(0);
    }
    public static boolean isPrime(long num)
    {
        if(num % 2 == 0 && num != 2) return false;
        for(int i = 1; i < num / 2; i++)
        {
            if(num % (2 * i + 1) == 0) return false;
        }
        return true;
    }
}
