/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tutorial5_1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * a. Create an abstract class named Book. Include a String field for the book’s title and a double field for the 
 * book’s price. Within the class, include a constructor that requires the book title, and add two get methods—one 
 * that returns the title and one that returns the price. Include an abstract method named setPrice(). Create two
 * child classes of Book: Fiction and NonFiction. Each must include a setPrice() method that sets the price for all
 * Fiction Books to $24.99 and for all NonFiction Books to $37.99. Write a constructor for each subclass, and include
 * a call to setPrice() within each. Write an application demonstrating that you can create both a Fiction and a
 * NonFiction Book and display their fields.
 * 
 * b. Write an application named Tutorial5_1Q1 in which you create an array that holds 10 Books, some Fiction and some
 * NonFiction. Using a for loop, display details about all 10 books.
 * 
 */
public class Tutorial5_1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Book> books = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String name, type;
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Enter the name of the book:");
            name = input.next();
            do
            {
                System.out.println("Enter the book's type:");
                type = input.next();
                if(type.equalsIgnoreCase("Fiction")) books.add(new Fiction(name));
                else if(type.equalsIgnoreCase("NonFiction")) books.add(new NonFiction(name));
                else System.out.println("Error: Unknown type");
            }while(books.size() < i + 1);
        }
        for(int i = 0; i < books.size(); i++)
        {
             System.out.println(books.get(i).getName());
             System.out.println("Price: $" + books.get(i).getPrice());
             System.out.println();
        }
    }    
}

abstract class Book {
    private final String name;
    protected double price;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    public abstract void setPrice(); 
}

class Fiction extends Book {
    
    Fiction(String name)
    {
        super(name);
        setPrice();
    }
    
    @Override
    public final void setPrice()
    {
        this.price = 24.99; 
    }
}

class NonFiction extends Book {
    
    NonFiction(String name)
    {
        super(name);
        setPrice();
    }
    
    @Override
    public final void setPrice()
    {
        this.price = 37.99; 
    }
}
