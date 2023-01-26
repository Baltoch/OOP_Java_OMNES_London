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
 * Create three Story subclasses 
 * named Novel, Novella, and ShortStory, each with a unique setPages() method. A Novel must have more than
 * 100 pages, a Novella must have between 50 and 100 pages inclusive, and a ShortStory must have fewer than
 * 50 pages. If the parameter passed to any of the set methods in the child class is out of range, set the page value
 * but also create and store a message that indicates how many pages must be added or cut to satisfy the rules for
 * the story type.
 * 
 */
public class Novella extends Story {
    
    @Override
    public void setPages(int numberOfPages)
    {
        if(numberOfPages < MAX_PAGES_SHORT_STORY)
        {
            this.numberOfPages = numberOfPages;
            message = (MAX_PAGES_SHORT_STORY - numberOfPages) + " pages must be added to satisfy the rules for Novella type";
        }
        else if(numberOfPages > MAX_PAGES_NOVELLA)
        {
            this.numberOfPages = numberOfPages;
            message = (numberOfPages - MAX_PAGES_NOVELLA) + " pages must be cut to satisfy the rules for Novella type";
        }
        else
        {
            this.numberOfPages = numberOfPages;
        }
    }
}
