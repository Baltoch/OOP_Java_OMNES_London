/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial5_1;

/**
 *
 * @author balth
 */

/**
 * @hidden
 * Create an abstract class named Story that includes a story title, an author name, a number 
 * of pages, and a String message. Include get and set methods for each field. The method that sets the number 
 * of pages is abstract. Also include constants for the page limits in each category.
 * 
 */
public abstract class Story {
    protected String storyTitle;
    protected int numberOfPages;
    protected String message = "";
    protected final int MAX_PAGES_NOVELLA = 100;
    protected final int MAX_PAGES_SHORT_STORY = 50;

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public abstract void setPages(int numberOfPages);

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }   
}
