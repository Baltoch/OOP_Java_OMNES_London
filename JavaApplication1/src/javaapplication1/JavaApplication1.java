/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;


import java.util.Scanner;
/**
 *
 * @author balth
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Enter your age:");
        age = input.nextByte();
        System.out.println("Enter your name:");
        name = input.next();
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
    }
    
}
