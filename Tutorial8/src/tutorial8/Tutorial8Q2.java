/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial8;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Write an application for Lambert’s Vacation Rentals. Use separate ButtonGroups to allow a client to
 * select one of three locations, the number of bedrooms, and whether meals are included in the rental. 
 * Assume that the locations are parkside for $600 per week, poolside for $750 per week, or lakeside for
 * $825 per week. Assume that the rentals have one, two, or three bedrooms and that each bedroom over 
 * one adds $75 to the base price. Assume that if meals are added, the price is $200 more per rental. 
 * Help the customer to calculate the price of the vacation based on the opted choices. 
 * 
 */
public class Tutorial8Q2 {
    private final double PARKSIDE_PRICE = 600;
    private JRadioButton parkside = new JRadioButton("Parkside $" + PARKSIDE_PRICE);
    private final double POOLSIDE_PRICE = 750;
    private JRadioButton poolside = new JRadioButton("Poolside $" + POOLSIDE_PRICE);
    private final double LAKESIDE_PRICE = 825;
    private JRadioButton lakeside = new JRadioButton("Lakeside $" + LAKESIDE_PRICE);
    private ButtonGroup location = new ButtonGroup();
    private JLabel locationLabel = new JLabel("Choose the location you want:");
    private JRadioButton oneRoom = new JRadioButton("1 room");
    private final double TWO_ROOMS_PRICE = 75;
    private JRadioButton twoRooms = new JRadioButton("2 rooms $" + TWO_ROOMS_PRICE);
    private final double THREE_ROOMS_PRICE = 150;
    private JRadioButton threeRooms = new JRadioButton("3 rooms $" + THREE_ROOMS_PRICE);
    private ButtonGroup numberOfRooms = new ButtonGroup();
    private JLabel roomsLabel = new JLabel("Choose the number of rooms you want:");
    private JCheckBox meals = new JCheckBox("Meals"); 
    private final double MEALS_PRICE = 200;
    private JLabel extrasLabel = new JLabel("Choose the extras you want:");
    private JButton action = new JButton("Compute Price");
    private JPanel panel = new JPanel();
    private JFrame window = new JFrame();
    private final int WINDOW_WIDTH = 1280/4, WINDOW_HEIGHT = 720/3;
    
    public Tutorial8Q2()
    {
        action.addActionListener(new ActionButtonListener());
        
        location.add(parkside);
        location.add(poolside);
        location.add(lakeside);
        
        numberOfRooms.add(oneRoom);
        numberOfRooms.add(twoRooms);
        numberOfRooms.add(threeRooms);
        
        panel.add(locationLabel);
        panel.add(parkside);
        panel.add(poolside);
        panel.add(lakeside);
        panel.add(roomsLabel);
        panel.add(oneRoom);
        panel.add(twoRooms);
        panel.add(threeRooms);
        panel.add(extrasLabel);
        panel.add(meals);
        panel.add(action);
        
        window.add(panel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Lambert’s Vacation Rentals");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setVisible(true);
    }
    
    private class ActionButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            double price = 0;
            
            if(parkside.isSelected()) price += PARKSIDE_PRICE;
            else if(poolside.isSelected()) price += POOLSIDE_PRICE;
            else if(lakeside.isSelected()) price += LAKESIDE_PRICE;
            
            if(twoRooms.isSelected()) price += TWO_ROOMS_PRICE;
            else if(threeRooms.isSelected()) price += THREE_ROOMS_PRICE;
            
            if(meals.isSelected()) price += MEALS_PRICE;
            
            JOptionPane.showMessageDialog(window, "The total price is $" + price);
        }
    }
    
    
    public static void main(String[] args)
    {
        new Tutorial8Q2();
    }
}
