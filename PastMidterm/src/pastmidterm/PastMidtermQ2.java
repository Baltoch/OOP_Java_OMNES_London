/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastmidterm;

import java.util.Random;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Write a Java class named MyRectangle with four public data members representing the x- and
 * y-coordinates of the bottom-left vertex and top-right vertex of a rectangle, whose sides are parallel 
 * to the x- or y-axis.
 * 
 * For example, the statement new MyRectangle(20,80,30,90) creates a rectangle with bottom-left 
 * vertex at position (20,80), and	 top-right vertex at (30,90). For this class,
 * 
 * (a) Complete the area() method, which computes the area of a rectangle.
 * 
 * (b) Complete the overlap(MyRectangle rect) method. This method returns a rectangle which
 * is the overlapped region of two rectangles. In the event that there is no overlap, it should return a 
 * rectangle with both bottom-left vertex and top-right vertex at position (0,0).
 * 
 */

public class PastMidtermQ2 {
    public static void main(String[] args)
    {
        Random random = new Random();
        MyRectangle[] array = new MyRectangle[3];
        for(int i = 0; i < 2; i++)
        {
            array[i] = new MyRectangle(random.nextDouble(100), random.nextDouble(100), 100+random.nextDouble(100), 100+random.nextDouble(100));
        }
        array[2] = array[0].overlap(array[1]);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i].toString());
        }
    }
}

class MyRectangle {
    public double bottom_left_x;
    public double bottom_left_y;
    public double top_right_x;
    public double top_right_y;

    public MyRectangle(double bottom_left_x, double bottom_left_y, double top_right_x, double top_right_y) {
        this.bottom_left_x = bottom_left_x;
        this.bottom_left_y = bottom_left_y;
        this.top_right_x = top_right_x;
        this.top_right_y = top_right_y;
    }
    
    public double area()
    {
        return (top_right_x - bottom_left_x)*(top_right_y - bottom_left_y);
    }
    
    public MyRectangle overlap(MyRectangle rect)
    {
        double min_x, min_y, max_x, max_y;
        if(this.bottom_left_x < rect.bottom_left_x) min_x = rect.bottom_left_x;
        else min_x = this.bottom_left_x;
        if(this.bottom_left_y < rect.bottom_left_y) min_y = rect.bottom_left_y;
        else min_y = this.bottom_left_y;
        if(this.top_right_x > rect.top_right_x) max_x = rect.top_right_x;
        else max_x = this.top_right_x;
        if(this.top_right_y > rect.top_right_y) max_y = rect.top_right_y;
        else max_y = this.top_right_y;
        if(max_x - min_x > 0 && max_y - min_y > 0) return new MyRectangle(min_x, min_y, max_x, max_y);
        else return new MyRectangle(0,0,0,0);
    }
    
    @Override
    public String toString()
    {
        return "Bottom left (" + bottom_left_x + "; " + bottom_left_y + ")\n"
                + "Top right (" + top_right_x + "; " + top_right_y + ")\n";
    }
}