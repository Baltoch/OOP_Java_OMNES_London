/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_lecture_7_error_handling;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Write an application that prompts the user to enter a number to use as an array size, and then attempt to declare 
 * an array using the entered size. If the array is created successfully, display an appropriate message. 
 * 
 * Java generates a NegativeArraySizeException if you attempt to create an array with a negative size
 * 
 * Use a catch block that executes if the array size is negative, displaying a message that indicates the array was 
 * not created. Save the file as NegativeArray.java. 
 * 
 */
public class NegativeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int arraySize;
        System.out.println("Enter the array size");
        arraySize = input.nextInt();
        try
        {
            int[] array = new int[arraySize];
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Error: " + e.getMessage() + " is  a negative array size");
        }
    }   
}
