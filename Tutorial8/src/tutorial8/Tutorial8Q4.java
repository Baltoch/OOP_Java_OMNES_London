/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Write an application that allows a user to select a city from a list box that contains at least seven options. 
 * Display the population of the city in a text field after the user makes a selection
 * 
 */
public class Tutorial8Q4 extends JFrame {
    private String[] cities = {
        "Choose a city",
        "Tokyo",
        "Jakarta",
        "Chongqing",
        "Delhi",
        "Shanghai",
        "Seoul",
        "Mumbai",
        "Manila",
        "New York City",
        "Sao Paulo",
        "Beijing",
        "Mexico City"
    };
    private JList citiesChoice = new JList(cities);
    private JLabel[] population = {
        new JLabel(""),
        new JLabel("Tokyo, Japan: 39 million people (urban area)"),
        new JLabel("Jakarta, Indonesia: 35 million people (urban area)"),
        new JLabel("Chongqing, China: 32 million people (city proper)"),
        new JLabel("Delhi, India: 28 million people (urban area)"),
        new JLabel("Shanghai, China: 26 million people (city proper)"),
        new JLabel("Seoul, South Korea: 26 million people (metropolitan area)"),
        new JLabel("Mumbai, India: 24 million people (metropolitan area)"),
        new JLabel("Manila, Philippines: 24 million people (urban area)"),
        new JLabel("New York City, USA: 24 million people (urban area)"),
        new JLabel("São Paulo, Brazil: 23 million people (urban area)"),
        new JLabel("Beijing, China: 22 million people (city proper)"),
        new JLabel("Mexico City, Mexico: 22 million people (metropolitan area)")
    };
    private JPanel populationPanel = new JPanel();
    private int displayedIndex;
    private final int WINDOW_WIDTH = 533, WINDOW_HEIGHT = 300;
    private JScrollPane scroll = new JScrollPane(citiesChoice);
    
    public Tutorial8Q4()
    {
        setLayout(new GridLayout(2,1));
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Cities Population");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        citiesChoice.addListSelectionListener(new ChoiceListener());
        
        populationPanel.setLayout(new CardLayout());
        for(int i = 0; i < population.length; i++)
        {
            populationPanel.add(population[i]);
            population[i].setVisible(false);
        }
        population[0].setVisible(true);
        displayedIndex = 0;
        
        JPanel upperPanel = new JPanel();
        upperPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        upperPanel.add(scroll);
        
        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        lowerPanel.add(populationPanel);
        
        add(upperPanel);
        add(lowerPanel);
        setVisible(true);
        
    }
    
    private class ChoiceListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent e)
        {
            population[displayedIndex].setVisible(false);
            displayedIndex = citiesChoice.getSelectedIndex();
            population[displayedIndex].setVisible(true);
        }
    }
    
    public static void main(String[] args)
    {
        new Tutorial8Q4();
    }
}
