/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial2;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Without using power function (^), write a program that asks the user to enter two integers
 * ‘a’ and ‘b’. The macro should calculate a^b.
 * 
 */

public class Tutorial2_8 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long a, b, out = 1;
        System.out.println("Enter an integer");
        a = input.nextLong();
        System.out.println("Enter another integer");
        b = input.nextLong();
        for(int i = 0; i < b; i++)
        {
            out *= a;
        }
        System.out.println("Result: " + out);
        System.exit(0);
    }
}
