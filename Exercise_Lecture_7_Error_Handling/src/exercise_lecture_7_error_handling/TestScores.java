/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise_lecture_7_error_handling;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Write a class named TestScores. The class constructor should accept an array of test scores as its argument. 
 * The class should have a method that returns the average of the test scores. If any test score in the array is negative
 * or greater than 100, the class should throw an IllegalArgumentException. Demonstrate the class in a program. 
 * 
 */

public class TestScores {
    double[] testScores;
    
    public static void main(String[] args)
    {
        final double[] TEST_ARRAY = {-30, 0, 10, 40, 50, 90, 100, 180};
        TestScores testScores = new TestScores(TEST_ARRAY);
        System.out.println("Average : " + testScores.average());
        
    }
    
    public TestScores()
    {
        
    }
    
    public TestScores(double[] testScores)
    {
        this.testScores = new double[testScores.length];
        for(int i = 0; i < testScores.length; i++)
        {
            try
            {
                if(testScores[i] < 0 || testScores[i] > 100)
                {
                    throw new IllegalArgumentException("Error: One or more test scores are not between 0 and 100");
                }
                else this.testScores[i] = testScores[i];
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
                System.out.println("Score number " + i + " is saved as 0");
                this.testScores[i] = 0;
            }
        }
    }
    
    public double average()
    {
        double sum = 0;
        for(int i = 0; i < testScores.length; i++)
        {
            sum += testScores[i];
        }
        if(testScores.length == 0) return 0;
        else return sum / testScores.length;
    }
    
    
}


