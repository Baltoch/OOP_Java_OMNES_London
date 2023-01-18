/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial4;

import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Create a Tic-Tac-Toe game. In this game, two players alternate placing Xs and Os into a grid until one player
 * has three matching symbols in a row, either horizontally, vertically, or diagonally. Create a game in which the user 
 * is presented with a three-by-three grid containing the digits 1 through 9.When the user chooses a position by 
 * typing a number, place an X in the appropriate spot. Generate a random number for the position where the computer 
 * will place an O. Do not allow the player or the computer to place a symbol where one has already been placed. 
 * Figure below shows the first four windows in a typical game. When either the player or computer has three symbols 
 * in a row, declare a winner; if all positions have been exhausted and no one has three symbols in a row, declare a tie.
 * 
 */

public class Tutorial4_4 {
    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
        game.run();
        System.exit(0);
    }
    
}



class TicTacToe {
    private char[][] grid = {{'1','2','3'},
                    {'4','5','6'},
                    {'7','8','9'}};
    private int[] scores = {0,0,0};
    private char playerSymbol;
    private char computerSymbol;
    private boolean victory = false;
    
    public TicTacToe()
    {
        playerSymbol = 'X';
        computerSymbol = 'O';
    }
    
    public TicTacToe(char playerSymbol, char computerSymbol)
    {
        this.playerSymbol = playerSymbol;
        this.computerSymbol = computerSymbol;
    }
    
    public TicTacToe(char playerSymbol, char computerSymbol, int[] scores)
    {
        this.playerSymbol = playerSymbol;
        this.computerSymbol = computerSymbol;
        this.scores = scores;
    }
    
    public TicTacToe(int[] scores)
    {
        playerSymbol = 'X';
        computerSymbol = 'O';
        this.scores = scores;
    }
    
    private void computerTurn()
    {
        Random random = new Random();
        int choice = random.nextInt(9);
        while(grid[choice/3][choice%3] == 'X' || grid[choice/3][choice%3] == 'O') 
        {
            if(choice < 8) choice += 1;
            else choice = 0;
        }
        this.updateGrid(choice, computerSymbol);
    }
    
    private void playerTurn()
    {
        String choiceString = JOptionPane.showInputDialog("Enter the position where you want to play:\n" +
                "                  " + grid[0][0] + "  " + grid[0][1] + "  " + grid[0][2] + "\n" +
                "                  " + grid[1][0] + "  " + grid[1][1] + "  " + grid[1][2] + "\n" +
                "                  " + grid[2][0] + "  " + grid[2][1] + "  " + grid[2][2] + "\n");
        int choice = (int) Long.parseLong(choiceString) - 1;
        while(grid[choice/3][choice%3] == 'X' || grid[choice/3][choice%3] == 'O')
        {
            choiceString = JOptionPane.showInputDialog("Enter a valid position to play:\n" +
                "                  " + grid[0][0] + "  " + grid[0][1] + "  " + grid[0][2] + "\n" +
                "                  " + grid[1][0] + "  " + grid[1][1] + "  " + grid[1][2] + "\n" +
                "                  " + grid[2][0] + "  " + grid[2][1] + "  " + grid[2][2] + "\n");
            choice = (int) Long.parseLong(choiceString) - 1;
        }
        this.updateGrid(choice, playerSymbol);
    }
    
    private void updateGrid(int index, char symbol)
    {
        grid[index/3][index%3] = symbol;
        victory = checkVictory(index);
        if(victory && symbol == playerSymbol)
        {
            scores[0] += 1;
            JOptionPane.showMessageDialog(null, "You won ! Congrats ! \n" +
                "                  " + grid[0][0] + "  " + grid[0][1] + "  " + grid[0][2] + "\n" +
                "                  " + grid[1][0] + "  " + grid[1][1] + "  " + grid[1][2] + "\n" +
                "                  " + grid[2][0] + "  " + grid[2][1] + "  " + grid[2][2] + "\n" +
                "Scores :\n"
                + "\t-You : " + scores[0] + "\n"
                + "\t-Computer : " + scores[1] + "\n");
        }
        else if(victory && symbol == computerSymbol)
        {
            scores[1] += 1;
            JOptionPane.showMessageDialog(null, "Ouch ! The computer won ! \n" +
                "                  " + grid[0][0] + "  " + grid[0][1] + "  " + grid[0][2] + "\n" +
                "                  " + grid[1][0] + "  " + grid[1][1] + "  " + grid[1][2] + "\n" +
                "                  " + grid[2][0] + "  " + grid[2][1] + "  " + grid[2][2] + "\n" +
                "Scores :\n"
                + "\t-You : " + scores[0] + "\n"
                + "\t-Computer : " + scores[1] + "\n");
        }
    }
    
    private boolean checkVictory(int index)
    {
        int x = index/3;
        int y = index%3;
        //Checking vertical lines :
        switch(x)
        {
            case 0 -> {
                if(grid[x][y] == grid[(x)+1][y] && grid[x][y] == grid[(x)+2][y])
                {
                    return true;
                }
            }
            case 1 -> {
                if(grid[x][y] == grid[(x)+1][y] && grid[x][y] == grid[(x)-1][y])
                {
                    return true;
                }
            }
            case 2 -> {
                if(grid[x][y] == grid[(x)-2][y] && grid[x][y] == grid[(x)-1][y])
                {
                    return true;
                }
            }
        }
        
        //Checking horizontal lines :
        switch(y)
        {
            case 0 -> {
                if(grid[x][y] == grid[x][(y)+1] && grid[x][y] == grid[x][(y)+2])
                {
                    return true;
                }
            }
            case 1 -> {
                if(grid[x][y] == grid[x][(y)+1] && grid[x][y] == grid[x][(y)-1])
                {
                    return true;
                }
            }
            case 2 -> {
                if(grid[x][y] == grid[x][(y)-2] && grid[x][y] == grid[x][(y)-1])
                {
                    return true;
                }
            }
        }
        
        //Checking diagonal lines :
        if(x == y)
        {
           if(grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2])
           {
               return true;
           }
        }
        else if(x + y == 2)
        {
            if(grid[1][1] == grid[0][2] && grid[1][1] == grid[2][0])
           {
               return true;
           }
        }
        return false;
    }
    
    private void newGame()
    {
        int newGame = JOptionPane.showConfirmDialog(null, "Scores :\n"
                + "\t-You : " + scores[0] + "\n"
                + "\t-Computer : " + scores[1] + "\n", "Want to play a new game ?", JOptionPane.YES_NO_OPTION);
        if(newGame == 0)
        {
            for(int i = 0; i < 9; i++)
            {
                grid[i/3][i%3] = String.valueOf(i+1).charAt(0);
            }
            victory = false;
            this.run();
        }
    }
    
    public void run()
    {
        int order = (scores[0] + scores[1] + scores[2]) % 2;
        for(int i = 0; i < 9; i++)
        {
            if(i%2 == order)
            {
                this.playerTurn();
                if(!victory && i != 8)
                {
                    JOptionPane.showMessageDialog(null, "Your move as been rcorded,\n"
                    + "now the computer will play.\n" +
                    "                  " + grid[0][0] + "  " + grid[0][1] + "  " + grid[0][2] + "\n" +
                    "                  " + grid[1][0] + "  " + grid[1][1] + "  " + grid[1][2] + "\n" +
                    "                  " + grid[2][0] + "  " + grid[2][1] + "  " + grid[2][2] + "\n");
                }
                else break;
            }
            else
            {
                this.computerTurn();
                if(!victory)
                {
                    JOptionPane.showMessageDialog(null, "The computer has played:\n" +
                    "                  " + grid[0][0] + "  " + grid[0][1] + "  " + grid[0][2] + "\n" +
                    "                  " + grid[1][0] + "  " + grid[1][1] + "  " + grid[1][2] + "\n" +
                    "                  " + grid[2][0] + "  " + grid[2][1] + "  " + grid[2][2] + "\n");
                }
                else break;
            }
        }
        if(!victory)
        {
            scores[2] += 1;
            JOptionPane.showMessageDialog(null, "You managed to tie, very interesting ... \n" +
                "                  " + grid[0][0] + "  " + grid[0][1] + "  " + grid[0][2] + "\n" +
                "                  " + grid[1][0] + "  " + grid[1][1] + "  " + grid[1][2] + "\n" +
                "                  " + grid[2][0] + "  " + grid[2][1] + "  " + grid[2][2] + "\n" +
                "Scores :\n"
                + "\t-You : " + scores[0] + "\n"
                + "\t-Computer : " + scores[1] + "\n");
        }
        this.newGame();
    }
}