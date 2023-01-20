/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial5;

import java.util.Scanner;
/**
 *
 * @author balth
 */

/**
 * @hidden
 * Create a class named CollegeCourse that includes data fields that hold the department (for example, ENG), 
 * the course number (for example, 101), the credits (for example, 3), and the fee for the course (for example, $360). 
 * All of the fields are required as arguments to the constructor, except for the fee, which is calculated at $120 per
 * credit hour. Include a display() method that displays the course data. Create a subclass named LabCourse
 * that adds $50 to the course fee. Override the parent class display() method to indicate that the course is a lab 
 * course and to display all the data. Write an application named UseCourse that prompts the user for course
 * information. If the user enters a class in any of the following departments, create a LabCourse: BIO,
 * CHM, CIS, or PHY. If the user enters any other department, create a CollegeCourse that does not include the lab fee.  
 * 
 */
public class Tutorial5Q2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String courseDep;
        int number, credits;
        System.out.println("Enter the course department:");
        courseDep = input.next();
        System.out.println("Enter course number:");
        number = input.nextInt();
        System.out.println("Enter the number of credits for the course:");
        credits = input.nextInt();
        if(courseDep.equalsIgnoreCase("BIO") || courseDep.equalsIgnoreCase("CHM") || courseDep.equalsIgnoreCase("CIS") || courseDep.equalsIgnoreCase("PHY"))
        {
            LabCourse course = new LabCourse(courseDep, number, credits);
            course.display();
        }
        else 
        {
            CollegeCourse course = new CollegeCourse(courseDep, number, credits);
            course.display();
        }
        
    }
}

class CollegeCourse {
    private String department;
    private int number;
    private int credits;
    private double fee;

    public CollegeCourse(String department, int number, int credits) {
        this.department = department;
        this.number = number;
        this.credits = credits;
        fee = 120 * credits;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    public void display()
    {
        System.out.println(department + " " + number + " :");
        System.out.println("Credits : " + credits);
        System.out.println("Fee : $" + fee);
    }
}

class LabCourse extends CollegeCourse {
    
    public LabCourse(String department, int number, int credits)
    {
        super(department, number, credits);
        this.setFee(this.getFee() + 50);
    }
    
    public void display()
    {
        System.out.println("Lab course " + this.getDepartment() + " " + this.getNumber() + " :");
        System.out.println("Credits : " + this.getCredits());
        System.out.println("Fee : $" + this.getFee());
    }
}