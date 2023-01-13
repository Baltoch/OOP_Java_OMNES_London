/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package payroll;

/**
 *
 * @author balth
 */
public class Payroll {
    private String employeeName;
    private long id;
    private double hourlyPayRate;
    private double numberOfHours;
    Payroll()
    {
        employeeName = "";
        id = 0;
        hourlyPayRate = 0;
        numberOfHours = 0;
    }
    Payroll(String name, long idNumber, double hourlyRate, double hours)
    {
        employeeName = name;
        id = idNumber;
        hourlyPayRate = hourlyRate;
        numberOfHours = hours;
    }
    public void setEmployeeName(String name)
    {
        employeeName = name;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public void setId(long idNumber)
    {
        id = idNumber;
    }
    public long getId()
    {
        return id;
    }
    public void setHourlyPayRate(double payRate)
    {
        hourlyPayRate = payRate;
    }
    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }
    public void setNumberOfHours(double hours)
    {
        numberOfHours = hours;
    }
    public double getNumberOfHours()
    {
        return numberOfHours;
    }
    public double grossPay()
    {
        return hourlyPayRate * numberOfHours;
    }
}
