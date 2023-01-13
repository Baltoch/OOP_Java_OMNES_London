/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle;

/**
 *
 * @author balth
 */
public class Circle {
    double radius;
    Circle()
    {
        radius = 1;
    }
    Circle(double r)
    {
        radius = r;
    }
    public void setRadius(double r)
    {
        radius = r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return 3.14 * radius * radius;
    }
    public double getPerimeter()
    {
        return 3.14 * 2 * radius;
    }
}
