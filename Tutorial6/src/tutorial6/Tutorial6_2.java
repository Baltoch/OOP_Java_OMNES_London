/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial6;

import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * A teacher has five students who have taken four tests. The ten her uses the following grading scale to assign a 
 * letter grade to a student, based on the average of his or her four test scores:
 *      Test Score              Letter Grade
 *         90-100                          A
 *         80-89                            B
 *         70-79                            C
 *         60-69                            D
 *          0-59                             F
 * 
 * Write a class that uses a string array or an ArrayList object to hold the five students' names, an array of five 
 * characters to hold the five students' letter grades, and necessary arrays to hold each student's set of test scores
 * for four tests. The class should have methods that return a specific student's name, the average test score, and a
 * letter grade based on the average. 
 * Demonstrate the class in a program that allows the user to enter each student's name and his or her four test
 * scores. It should then display each student's average test score and letter grade. 
 * 
 * Input Validation: Do not accept test scores less than zero or greater than 100.
 * 
 */
public class Tutorial6_2 {
    public static void main(String[] args)
    {
        Grade grade = new Grade();
        grade.setStudentsNames();
        grade.setStudentsGrades();
        String[] studentsNames = grade.getStudentsNames();
        for(int i = 1; i < studentsNames.length; i++) grade.showStudentGrades(i);
        grade.showStudentGrades(studentsNames[0]);
    }
}

class Grade {
    String[] studentsNames = new String[5];
    char[] studentsLetterGrade = new char[5];
    int[][] studentsGrades = new int[5][4];

    public Grade() {
        for(int i = 0; i < studentsNames.length; i++) studentsNames[i] = "";
        for(int i = 0; i < studentsLetterGrade.length; i++) studentsLetterGrade[i] = 'A';
        for(int i = 0; i < studentsGrades.length; i++) 
        {
            for(int j = 0; j < studentsGrades[i].length; j++)
            {
                studentsGrades[i][j] = 100;
            }
        }
    }
    
    public Grade(String[] studentsNames, int[][] studentsGrades)
    {
        for(int i = 0; i < this.studentsNames.length; i++) this.studentsNames[i] = studentsNames[i];
        for(int i = 0; i < this.studentsGrades.length; i++) 
        {
            for(int j = 0; j < this.studentsGrades[i].length; j++)
            {
                this.studentsGrades[i][j] = studentsGrades[i][j];
            }
        }
        for(int i = 0; i < this.studentsLetterGrade.length; i++) this.studentsLetterGrade[i] = getLetterGrade(i);
    }
    
    public Grade(String[] studentsNames, char[] studentsLetterGrade, int[][] studentsGrades)
    {
        for(int i = 0; i < this.studentsNames.length; i++) this.studentsNames[i] = studentsNames[i];
        for(int i = 0; i < this.studentsLetterGrade.length; i++) this.studentsLetterGrade[i] = studentsLetterGrade[i];
        for(int i = 0; i < this.studentsGrades.length; i++) 
        {
            for(int j = 0; j < this.studentsGrades[i].length; j++)
            {
                this.studentsGrades[i][j] = studentsGrades[i][j];
            }
        }
    }

    public String[] getStudentsNames() {
        return studentsNames;
    }

    public void setStudentsNames(String[] studentsNames) {
        this.studentsNames = studentsNames;
    }
    
    public void setStudentsNames()
    {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < studentsNames.length; i++)
        {
            System.out.println("Enter student " + i + " name:");
            studentsNames[i] = input.next();
        }
    }

    public char[] getStudentsLetterGrade() {
        return studentsLetterGrade;
    }

    public void setStudentsLetterGrade(char[] studentsLetterGrade) {
        this.studentsLetterGrade = studentsLetterGrade;
    }

    public int[][] getStudentsGrades() {
        return studentsGrades;
    }

    public void setStudentsGrades(int[][] studentsGrades) {
        this.studentsGrades = studentsGrades;
        for(int i = 0; i < studentsLetterGrade.length; i++) studentsLetterGrade[i] = getLetterGrade(i);
    }
    
    public void setStudentsGrades()
    {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < studentsGrades.length; i++)
        {
            for(int j = 0; j < studentsGrades[i].length; j++)
            {
                System.out.println("Enter student " + i + " grade for exam " + (j+1));
                studentsGrades[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < studentsLetterGrade.length; i++) studentsLetterGrade[i] = getLetterGrade(i);
    }
    
    public int getAverageGrade(int i)
    {
        int averageGrade = 0;
        for(int j = 0; j < studentsGrades[i].length; j++) averageGrade += studentsGrades[i][j];
        averageGrade /= studentsGrades[i].length;
        return averageGrade;
    }
    
    public char getLetterGrade(int i)
    {
        int averageGrade = getAverageGrade(i);
        if(averageGrade < 60) return 'F';
        else if(averageGrade < 70) return 'D';
        else if(averageGrade < 80) return 'C';
        else if(averageGrade < 90) return 'B';
        else return 'A';
    }
    
    public void showStudentGrades(int i)
    {
        System.out.println(studentsNames[i] + " got: ");
        for(int j = 0; j < studentsGrades[i].length; j++) System.out.println(studentsGrades[i][j] + "/100 at exam " + (j+1));
        System.out.println("Which gives an average of " + getAverageGrade(i) + "/100");
        System.out.println(studentsNames[i] + " managed to score a " + studentsLetterGrade[i] + " for this module");
        System.out.println();
    }
    
    public void showStudentGrades(String name)
    {
        for(int i = 0; i < studentsNames.length; i++)
        {
            if(studentsNames[i].equalsIgnoreCase(name))
            {
                showStudentGrades(i);
                break;
            }
        }
    }   
}
