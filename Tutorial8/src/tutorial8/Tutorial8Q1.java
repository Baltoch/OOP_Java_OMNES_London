/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
 * A long-distance provider charges the following rates for telephone calls: 
 *              Rate Category                                                               Rate per minute
 *              Daytime (6:00 A.M. through 5:59 P.M.)                               $0.07
 *              Evening (6:00 P.M. through 11:59 P.M.)                             $0.12
 *              Off-Peak (12:00 A.M. through 5:59 A.M.)                           $0.05
 * 
 * Create a GUI application that allows the user to select a rate category (from a set of radio buttons), 
 * and enter the number of minutes of the call into a text field. A dialog box should display the charge
 * for the call. 
 * 
 */

public class Tutorial8Q1 {

    private final int WINDOW_WIDTH = 1280/4, WINDOW_LENGTH = 720/3;
    private JFrame window;
    private JPanel panel;
    private ButtonGroup radioBox;
    private JLabel infoRadio;
    private JRadioButton daytime;
    private JRadioButton evening;
    private JRadioButton offPeak;
    private JLabel infoTime;
    private JTextField time;
    private JButton actionButton;
    
    
    public Tutorial8Q1() {
        
        window = new JFrame();
        panel = new JPanel();
        radioBox = new ButtonGroup();
        infoRadio = new JLabel("Select your rate category:");
        daytime = new JRadioButton("Daytime (6:00 A.M. through 5:59 P.M.)");
        evening = new JRadioButton("Evening (6:00 P.M. through 11:59 P.M.)");
        offPeak = new JRadioButton("Off-Peak (12:00 A.M. through 5:59 A.M.)");
        infoTime = new JLabel("Enter the number of minutes of the call bellow:");
        time = new JTextField();
        actionButton = new JButton("Compute Price");
        
        time.setSize(WINDOW_WIDTH/2, 30);
        
        radioBox.add(daytime);
        radioBox.add(evening);
        radioBox.add(offPeak);
        
        panel.add(infoRadio);
        panel.add(daytime);
        panel.add(evening);
        panel.add(offPeak);
        panel.add(infoTime);
        panel.add(time);
        panel.add(actionButton);
        
        window.add(panel);
        
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(WINDOW_WIDTH, WINDOW_LENGTH);
        window.setVisible(true);
        
        actionButton.addActionListener(new ActionButtonListener());
        
    }
   
    private class ActionButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double rate;
            String input = time.getText();
            int inputTime = Integer.parseInt(input);
            if(daytime.isSelected()) rate = 0.07; 
            else if(evening.isSelected()) rate = 0.12;
            else if(offPeak.isSelected()) rate = 0.05;
            else throw new Error("Error: One rate must be selected");
            JOptionPane.showMessageDialog(window, "Total Price: $" + (inputTime * rate));
        }
    }
    
    public static void main(String[] args)
    {
        new Tutorial8Q1();
    }
}
