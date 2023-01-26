/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * Picky Publishing House publishes stories in three categories and has strict requirements for page counts in 
 * each category. Create an abstract class named Story that includes a story title, an author name, a number 
 * of pages, and a String message. Include get and set methods for each field. The method that sets the number 
 * of pages is abstract. Also include constants for the page limits in each category. Create three Story subclasses 
 * named Novel, Novella, and ShortStory, each with a unique setPages() method. A Novel must have more than
 * 100 pages, a Novella must have between 50 and 100 pages inclusive, and a ShortStory must have fewer than
 * 50 pages. If the parameter passed to any of the set methods in the child class is out of range, set the page value
 * but also create and store a message that indicates how many pages must be added or cut to satisfy the rules for
 * the story type. 
 * 
 * Write an application named Tutorial5_1Q3 that creates an array of at least six objects to demonstrate 
 * how the methods work for objects created both with valid and invalid page counts for each story type. For each 
 * story, display the title, author, page count, and message if any was generated. Save the files as Story.java, 
 * Novel.java, Novella.java, ShortStory.java, and Tutorial5_1Q3.java. 
 * 
 */

public class Tutorial5_1Q3 {
    public static void main(String[] args)
    {
        final int ARRAY_LENGTH = 6;
        ArrayList<Story> array = new ArrayList<>(ARRAY_LENGTH);
        
        // Novel story type
        
        // Valid page count
        array.add(new Novel());
        array.get(array.size() - 1).setStoryTitle("Novel Valid");
        array.get(array.size() - 1).setPages(500);
        
        // Invalid page count
        array.add(new Novel());
        array.get(array.size() - 1).setStoryTitle("Novel Invalid");
        array.get(array.size() - 1).setPages(5);
        
        // Novella story type
        
        // Valid page count
        array.add(new Novella());
        array.get(array.size() - 1).setStoryTitle("Novella Valid");
        array.get(array.size() - 1).setPages(60);
        
        // Invalid page count
        array.add(new Novella());
        array.get(array.size() - 1).setStoryTitle("Novella Invalid");
        array.get(array.size() - 1).setPages(5);
        
        // ShortStory story type
        
        // Valid page count
        array.add(new ShortStory());
        array.get(array.size() - 1).setStoryTitle("ShortStory Valid");
        array.get(array.size() - 1).setPages(5);
        
        // Invalid page count
        array.add(new ShortStory());
        array.get(array.size() - 1).setStoryTitle("ShortStory Invalid");
        array.get(array.size() - 1).setPages(500);
        
        for(int i = 0; i < array.size(); i++)
        {
            Story story = array.get(i);
            if(story.getMessage().equals(""))
            {
                System.out.println(story.getStoryTitle() + ":");
                System.out.println("Number of pages: " + story.getNumberOfPages());
                System.out.println();
            }
            else
            {
                System.out.println(story.getStoryTitle() + ":");
                System.out.println("Number of pages: " + story.getNumberOfPages());
                System.out.println(story.getMessage());
                System.out.println();    
            }
        }
        
    }
}
