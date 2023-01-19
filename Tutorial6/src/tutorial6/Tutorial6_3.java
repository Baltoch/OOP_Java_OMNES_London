/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial6;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * The Lo Shu Magic Square is a grid with 3 rows and 3 columns, shown in Figure (1) The Lo Shu Magic Square has 
 * the following properties: 
 *          •   The grid contains the numbers 1 through 9 exactly
 *          •   The sum of each row, each column, and each diagonal all add up to the same number
 * Simulate a magic square using a two-dimensional array. Write a method that accepts a two-dimensional array as
 * an argument, and determines whether the array is a Lo Shu Magic Square. Test the function. 
 * 
 */
public class Tutorial6_3 {
    public static void main(String[] args)
    {
        int[][] grid = {{4,9,2}, {3,5,7}, {8,1,6}};
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(grid[i][j] + "   ");
            }
            System.out.println();
        }
        if(isLoShuMagicSquare(grid)) System.out.println("is a Lo Shu Magic Square");
        else System.out.println("is not a Lo Shu Magic Square");                                                                                                                                                                                                                                                               
        
    }
    public static boolean isLoShuMagicSquare(int[][] grid)
    {
        int diag = grid[0][2] + grid[1][1] + grid[2][0];
        if(!(diag == grid[0][0] + grid[0][1] + grid[0][2])) return false;
        else if(!(diag == grid[1][0] + grid[1][1] + grid[1][2])) return false;
        else if(!(diag == grid[2][0] + grid[2][1] + grid[2][2])) return false;
        else if(!(diag == grid[0][0] + grid[1][0] + grid[2][0])) return false;
        else if(!(diag == grid[0][1] + grid[1][1] + grid[2][1])) return false;
        else if(!(diag == grid[0][1] + grid[1][1] + grid[2][1])) return false;
        else if(!(diag == grid[0][0] + grid[1][1] + grid[2][2])) return false;
        else return true;
    }
}
