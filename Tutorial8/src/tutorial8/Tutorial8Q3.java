/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial8;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author balth
 */

/**
 * @hidden 
 * Create a quiz game that displays, in turn, five questions about any topic of your choice.
 * All five questions should have the same three possible multiple-choice answers. For example, 
 * you might ask trivia questions about U.S. states for which the correct response is either California, 
 * Florida, or New York. After each question is displayed, allow the user to choose one, two, or all three
 * answers by selecting JCheckBoxes. In other words, if the user is sure of an answer, he will select just 
 * one box, but if he is uncertain, he might select two or three boxes. When the user is ready to submit the 
 * answer(s), he clicks a button. If the user’s answer to the question is correct and he has selected just one
 * box, award 5 points. If the user is correct but has selected two boxes, award 2 points. If the user has 
 * selected all three boxes, award 1 point. If the user has selected fewer than three boxes but is incorrect,
 * the user receives 0 points. A total of 25 points is possible. If the user has accumulated more than 21 
 * points at the end of the quiz, display the message “Fantastic!”. If the user has accumulated more than
 * 15 points, display the message “Very good”, and if the user has accumulated fewer points, display “OK”. 
 * 
 */
public class Tutorial8Q3 extends JFrame {
    final int QUESTION_QUANTITY = 5;
    private JLabel[] questions = {
        new JLabel("Which state raises the more turkeys ?"),
        new JLabel("Which state as the Orange Blossom as its official state flower ?"),
        new JLabel("In which state is the home of L. Frank Baum, author of the “Wizard of Oz” ?"),
        new JLabel("Where is the Sequoia National Park ?"),
        new JLabel("Which state has the Eastern Bluebird-Sialia sialis as its official state bird ?")
    };
    private int[] answers = {
        0,
        1,
        2,
        0,
        2
    }; 
    private JPanel questionsPanel = new JPanel();
    private int displayedIndex;
    private JPanel answersPrompt = new JPanel();
    private JCheckBox[] ans = {
        new JCheckBox("California"),
        new JCheckBox("Florida"),
        new JCheckBox("New York")
    };
    private int points;
    private JButton action = new JButton("Validate");
    private JPanel panel = new JPanel();
    private final int WINDOW_WIDTH = 533, WINDOW_HEIGHT = 300;
    
    public Tutorial8Q3()
    {
        points = 0;
        displayedIndex = 0;
        for(int i = 0; i < questions.length; i++)
        {
            questionsPanel.add(questions[i]);
            questions[i].setVisible(false);
        }
        questions[displayedIndex].setVisible(true);
        
        questionsPanel.setLayout(new CardLayout());
        
        for(int i = 0; i < ans.length; i++)
        {
            answersPrompt.add(ans[i]);
        }
        answersPrompt.setLayout(new GridLayout(3,0));
        
        action.addActionListener(new ActionButtonListener());
        
        JPanel subPanel1 = new JPanel();
        subPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        JPanel subPanel2 = new JPanel();
        subPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        JPanel subPanel3 = new JPanel();
        subPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        subPanel1.add(questionsPanel);
        subPanel2.add(answersPrompt);
        subPanel3.add(action);
        
        panel.add(subPanel1);
        panel.add(subPanel2);
        panel.add(subPanel3);
        panel.setLayout(new GridLayout(3,1));
        
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Quizz Game");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
    }
    
    private class ActionButtonListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if(displayedIndex < questions.length)
            {
                if(ans[answers[displayedIndex]].isSelected())
                {
                    if(ans[(answers[displayedIndex] + 1)%3].isSelected())
                    {
                        if(ans[(answers[displayedIndex] + 2)%3].isSelected()) points += 1;
                        else points += 2;
                    }
                    else if(ans[(answers[displayedIndex] + 2)%3].isSelected()) points += 2;
                    else points += 5;
                }
                displayedIndex++;
            }
            if(displayedIndex == questions.length)
            {
                if(points > 21) JOptionPane.showMessageDialog(rootPane, "Fantastic !\n" + points + "/25");
                else if(points > 15) JOptionPane.showMessageDialog(rootPane, "Very good\n" + points + "/25");
                else JOptionPane.showMessageDialog(rootPane, "OK\n" + points + "/25");
                System.exit(0);
            }
            else 
            {
                questions[displayedIndex - 1].setVisible(false);
                questions[displayedIndex].setVisible(true);
                for(int i = 0; i < ans.length; i++) ans[i].setSelected(false);
            }
        }
    }
    
    public static void main(String[] args)
    {
        new Tutorial8Q3();
    }
    
}
