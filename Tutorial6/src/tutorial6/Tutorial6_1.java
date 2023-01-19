/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial6;

import java.util.Random;
/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Write a Lottery class that simulates a lottery. The class should have an array of five integers named lotteryNumbers.
 * The constructor should use the Random class (from the Java API) to generate a random number in the range of 0 
 * through 9 for each element in the array. The class should also have a method that accepts an array of five integers
 * that represent a person’s lottery picks. The method is to compare the corresponding elements in the two arrays and
 * return the number of digits that match. For example, the following shows the lotteryNumbers array and the user’s 
 * array with sample numbers stored in each. There are two matching digits (elements 2 and 4). 
 * 
 *  lotteryNumbers array : 7, 4, 9, 1, 3
 *  User's array : 4, 2, 9, 7, 3
 * 
 * In addition, the class should have a method that returns a copy of the lotteryNumbers array. 
 * Demonstrate the class in a program that asks the user to enter five numbers. The program should display the 
 * number of digits that match the randomly generated lottery numbers. If all of the digit match, display a message 
 * proclaiming the user a grand prize winner. 
 */
public class Tutorial6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        Lottery lottery = new Lottery();
        int[] lotteryNumbers = lottery.getLotteryNumbers();
        int[] picks = new int[5];
        for(int i = 0; i < picks.length; i++)
        {
            picks[i] = random.nextInt(9);
        }
        System.out.print("Lottery's array : ");
        for(int i = 0; i < lotteryNumbers.length; i++) System.out.print(lotteryNumbers[i] + ", ");
        System.out.println();
        System.out.print("User's array : ");
        for(int i = 0; i < picks.length; i++) System.out.print(picks[i] + ", ");
        System.out.println();
        lottery.verifyPicks(picks);
    }
    
}

class Lottery {
    int[] lotteryNumbers = new int[5];
    
    public static int min(int a, int b)
    {
        if(a > b) return b;
        return a;
    }
    
    public Lottery() {
        Random random = new Random();
        for(int i = 0; i < lotteryNumbers.length; i++) lotteryNumbers[i] = random.nextInt(9);
    }
    
    public int[] getLotteryNumbers() 
    {
        return lotteryNumbers;
    }
    
    public void verifyPicks(int[] picks)
    {
        int match = 0;
        for(int i = 0; i < min(lotteryNumbers.length, picks.length); i++)
        {
            if(picks[i] == lotteryNumbers[i])
            {
                System.out.println("Elements at rank " + i + " are matching");
                match += 1;
            }
        }
        System.out.println("You got a total of " + match + " matches");
    }
}
