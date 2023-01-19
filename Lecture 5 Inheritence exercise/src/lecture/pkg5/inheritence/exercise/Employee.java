/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecture.pkg5.inheritence.exercise;

/**
 *
 * @author balth
 */
public class Employee {
    private String name;
    private long number;
    private String hireDate;

    public Employee() {
        name = "";
        number = 0;
        hireDate = "00/00/0000";
    }

    public Employee(String name, long number, String hireDate) {
        this.name = name;
        this.number = number;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
