/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture5_1_abstract_classes_exercise;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Create an abstract class called GeometricFigure. Each figure includes a height, a width, a figure type, and an area. 
 * Include an abstract method to determine the area of the figure. Create two subclasses called Square and Triangle. 
 * Create an application that demonstrates creating objects of both subclasses, and store them in an array. 
 * 
 */

public class Lecture5_1_abstract_classes_exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeometricFigure[] array = {new Square(10), new Triangle(5,5)};
        System.out.println(array[0].getFigureType() + ":");
        System.out.println("Side: " + array[0].getHeight());
        System.out.println("Area: " + array[0].getArea());
        System.out.println();
        System.out.println(array[1].getFigureType() + ":");
        System.out.println("Height: " + array[1].getHeight());
        System.out.println("Width: " + array[1].getWidth());
        System.out.println("Area: " + array[1].getArea());
    }
    
}

abstract class GeometricFigure {
    private double height;
    private double width;
    private String figureType;
    private double area;

    public double getHeight() {
        return height;
    }

    public final void setHeight(double height) {
        this.height = height;
        this.computeArea();
    }

    public double getWidth() {
        return width;
    }

    public final void setWidth(double width) {
        this.width = width;
        this.computeArea();
    }

    public String getFigureType() {
        return figureType;
    }

    public final void setFigureType(String figureType) {
        this.figureType = figureType;
    }
    
    public double getArea()
    {
        return area;
    }
    
    protected final void setArea(double area)
    {
        this.area = area;
    }
    
    public abstract void computeArea();
}

class Square extends GeometricFigure {
    public Square(double sideLength)
    {
        setHeight(sideLength);
        setWidth(sideLength);
        setFigureType("Square");
        computeArea();
    }
    
    @Override
    public final void computeArea()
    {
        setArea(getHeight() * getWidth());
    }

    public void setSideLength(double length) {
        setHeight(length);
        setWidth(length);
        this.computeArea();
    }

    public double getSideLength() {
        return getHeight();
    }
}

class Triangle extends GeometricFigure {
    public Triangle(double height, double width)
    {
        setHeight(height);
        setWidth(width);
        setFigureType("Triangle");
        computeArea();
    }
    
    @Override
    public final void computeArea()
    {
        setArea(getHeight() * getWidth() / 2);
    }
}