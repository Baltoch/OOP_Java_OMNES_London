/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pastmidterm;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * A company pays its employees on a weekly basis. The employees are of four types: 
 * •	Salaried employees are paid a fixed weekly salary regardless of the number of hours worked
 * 
 * •	Hourly employees are paid by the hour and receive overtime pay. 
 * 
 * •	Commission employees are paid a percentage of their sales and base-salaried commission
 * employees receive a base salary plus a percentage of their sales. 
 * 
 * •	For the current pay period, the company has decided to reward salaried-commission 
 * employees by adding 10% to their base salaries. 
 * 
 * The company wants to write an application that performs its payroll calculations.
 * Write an abstract class Employee to represent the general concept of an employee. The classes 
 * that extend Employee are 
 * 
 * 	o  Salaried_Employee,  Hourly_Employee and Commission_Employee.
 * 	o  Class BasePlus_Commission_Employee - which extends Commission_Employee - 
 * represents the last employee type. 
 * 
 *                  Class name                                                  Earnings method	                                                      Variables associated
 *                  Employee                                                     Abstract	                                                      firstname, lastname, social_security_number 
 * 
 *                  Salaried_Employee	                        basesalary	                                                      firstname, lastname, social_security_number, basesalary
 * 
 *                  Hourly_Employee	                        hourly_wage * hours_worked + 1.5               firstname, lastname, social_security_number,
 *                                                                                          times their hourly salary wage for all                  hourly_wage, hours_worked
 *                                                                                          hours worked >40 hours	                                             
 *                  Commision_Employee	                        commission_rate*gross_sale	firstname, lastname, social_security_numbe,gross_sale, commission_rate
 * 
 *                  BasePlus_Commission_Employee	(commission_rate*gross_sale)                  firstname, lastname, social_security_numbe,gross_sale, 
 *                                                                                                  + basesalary                                                                  commission_rate, basesalary
 * 
 * Write an application that maintains an array of Employee variables, each holding a reference to
 * different type of Employee object. The program will run through the array and call method earnings
 * for each Employee object and will display the earnings of each type of employee.
 * 
 * Write the exception for the situation:
 * o	gross_sales
 * o	hourly_wage
 * 
 */

public class PastMidtermQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee[] array = new Employee[4];
        array[0] = new Salaried_Employee(2000,"John","Doe",1);
        try
        {
            array[1] = new Hourly_Employee(100,45,"John","Doe",2);
            array[2] = new Commission_Employee(200000,0.05,"John","Doe",3);
            array[3] = new BasePlus_Commission_Employee(2000, 200000, 0.01,"John","Doe",4);
        }
        catch(InvalidGrossSalesException | IllegalHourlyWageException e)
        {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i].toString() + "\n"
                    + "Earnings : " + array[i].earnings() + "\n");
        }
        System.exit(0);
    }
    
}

abstract class Employee {
    protected String firstname;
    protected String lastname;
    protected int social_security_number;

    public Employee(String firstname, String lastname, int social_security_number) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.social_security_number = social_security_number;
    }
    
    public abstract double earnings();
    
    @Override
    public final String toString()
    {
        return firstname + " " + lastname + "\n" + "Social security number: " + social_security_number;
    }
} 

class Salaried_Employee extends Employee {
    private double basesalary;

    public Salaried_Employee(double basesalary, String firstname, String lastname, int social_security_number) {
        super(firstname, lastname, social_security_number);
        this.basesalary = basesalary;
    }
    
    
    @Override
    public double earnings()
    {
        return basesalary;
    }
}

class Hourly_Employee extends Employee {
    private double hourly_wage;
    private long hours_worked;

    public Hourly_Employee(double hourly_wage, long hours_worked, String firstname, String lastname, int social_security_number) throws IllegalHourlyWageException {
        super(firstname, lastname, social_security_number);
        if(hourly_wage < 8) throw new IllegalHourlyWageException();
        this.hourly_wage = hourly_wage;
        this.hours_worked = hours_worked;
    }

    @Override
    public double earnings()
    {
        return hourly_wage * (hours_worked%40 + 1.5*(hours_worked/40));
    }
}

class Commission_Employee extends Employee {
    protected double gross_sale;
    protected double commission_rate;

    public Commission_Employee(double gross_sale, double commission_rate, String firstname, String lastname, int social_security_number) throws InvalidGrossSalesException {
        super(firstname, lastname, social_security_number);
        if(gross_sale < 0) throw new InvalidGrossSalesException();
        this.gross_sale = gross_sale;
        this.commission_rate = commission_rate;
    }

    @Override
    public double earnings()
    {
        return commission_rate * gross_sale;
    }
}

class BasePlus_Commission_Employee extends Commission_Employee {
    private double basesalary;

    public BasePlus_Commission_Employee(double basesalary, double gross_sale, double commission_rate, String firstname, String lastname, int social_security_number) throws InvalidGrossSalesException {
        super(gross_sale, commission_rate, firstname, lastname, social_security_number);
        if(gross_sale < 0) throw new InvalidGrossSalesException();
        this.basesalary = basesalary;
    }

    @Override
    public double earnings()
    {
        return (commission_rate * gross_sale) + basesalary;
    }
}

class InvalidGrossSalesException extends Exception {

    public InvalidGrossSalesException() {
        super("Error: Gross sales are less than 0");
    }    
}

class IllegalHourlyWageException extends Exception {
    public IllegalHourlyWageException() {
        super("Error: Hourly wage under 8 per hour is illegal");
    }
}