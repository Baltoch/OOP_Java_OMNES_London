/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture.pkg6.array.exercise;

import java.util.Random;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * In a program, write a method that accepts two arguments: an array and a number n. Assume that the array 
 * contains integers. The method should display all of the numbers in the array that are greater than the number n. 
 * 
 */
public class Lecture6ArrayExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        int[] array = new int[100];
        int n = random.nextInt();
        for(int i = 0; i < array.length; i++) array[i] = random.nextInt();
        arrayGreaterThan(array, n);
    }
    
    public static void arrayGreaterThan(int[] array, int n)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(n < array[i])
            {
                System.out.println("The number at rank " + i + " is equals to " + array[i] + " which is greater than " + n);
            }
        }
    }
}
