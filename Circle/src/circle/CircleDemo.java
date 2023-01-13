/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle;

/**
 *
 * @author balth
 */
public class CircleDemo {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle radius1 = new Circle();
        Circle radius2 = new Circle(2);
        System.out.println("Circle with a radius = 1: ");
        System.out.println("\t- Perimeter = " + radius1.getPerimeter());
        System.out.println("\t- Area = " + radius1.getArea());
        System.out.println("Circle with a radius = 2: ");
        System.out.println("\t- Perimeter = " + radius2.getPerimeter());
        System.out.println("\t- Area = " + radius2.getArea());
    }
}
