/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial3_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Write a class named Employee that has the following fields: 
 * •	name. The name field references a String object that holds the employee’s name. 
 * •	idNumber. The idNumber is an int variable that holds the employee’s ID number.
 * •	department. The department field references a String object that holds the name of the 
 *      department where the employee works. 
 * •	position. The position field references a String object that holds the employee’s job title. 
 * The class should have the following constructors: 
 * •	A constructor that accepts the following values as arguments and assign them to the 
 *      appropriate fields: employee’s name, employee’s ID number, department, and position. 
 * •	A constructor that accepts the following values as arguments and assign them to the 
 *      appropriate fields: employee’s name and ID number. The department and position fields 
 *      should be assigned an empty string ("").
 * Write appropriate accessor and mutator methods. Create at least five Employee objects using 
 * the above constructors and display the data for each employee on the screen
 * 
 */
public class Tutorial3_1Q3 {
    public static void main(String[] args)
    {
        final int NUMBER_OF_EMPLOYEES = 5;
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String name, dep, pos;
        int id;
        for(int i = 0; i < NUMBER_OF_EMPLOYEES; i++)
        {
            
            System.out.println("Enter employee " + i + " name:");
            name = input.next();
            System.out.println("Enter employee " + i + " ID:");
            id = input.nextInt();
            System.out.println("Enter N to skip the department and position (or anything else to continiue)");
            if(input.next().charAt(0) != 'N')
            {
                System.out.println("Enter employee " + i + " department:");
                dep = input.next();
                System.out.println("Enter employee " + i + " position:");
                pos = input.next();
                employees.add(new Employee(name, id, dep, pos));
            }
            else employees.add(new Employee(name, id));
        }
        for(int i = 0; i < NUMBER_OF_EMPLOYEES; i++)
        {
            System.out.println("Employee " + i + ":");
            employees.get(i).displayEmployee();
            System.out.println();
        }
        System.exit(0);
    }
}

class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    public Employee(String name, int idNumber, String department, String position)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    public Employee(String name, int idNumber)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void displayEmployee()
    {
        if(department.isBlank() || position.isBlank())
        {
            System.out.println(
                "Name: " + name 
                + "\nID: " + idNumber
            );
        }
        else
        {
            System.out.println(
                "Name: " + name 
                + "\nID: " + idNumber 
                + "\nDepartment: " + department 
                + "\nPosition: " + position
            );
        }
    }
    
}
