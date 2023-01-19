/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture.pkg5.inheritence.exercise;

/**
 *
 * @author balth
 */
public class ProductionWorker extends Employee {
    int shift;
    double hourlyPayRate;
    
    public ProductionWorker() {
        super();
        shift = 0;
        hourlyPayRate = 0;
    }
    
    public ProductionWorker(String name, long number, String hireDate, int shift, double hourlyPayRate)
    {
        super(name, number, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }
    
    public ProductionWorker(String name, long number, String hireDate, String shift, double hourlyPayRate)
    {
        super(name, number, hireDate);
        if(shift.equalsIgnoreCase("night")) this.shift = 2;
        else this.shift = 1;
        this.hourlyPayRate = hourlyPayRate;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    
    
    
    
}
