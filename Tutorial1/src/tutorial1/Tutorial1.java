/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial1;

import java.util.Scanner;

/**
 *
 * @author balth
 */
public class Tutorial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        long testScore1, testScore2, testScore3;
        System.out.println("Enter the first test score");
        testScore1 = input.nextLong();
        System.out.println("Enter the secound test score");
        testScore2 = input.nextLong();
        System.out.println("Enter the third test score");
        testScore3 = input.nextLong();
        System.out.println("The sum is " + (testScore1 + testScore2 + testScore3));
        System.out.println("The average is " + ((testScore1 + testScore2 + testScore3)/3));
    }
    
}
