/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_desautel_pellen_perold;

import java.awt.*;     // Needed for BorderLayout class
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;  // Needed for Swing classes


public class GraphicColor extends JFrame
{
   /**
      Constructor
   */

   public GraphicColor()
   {
      setTitle("Choose your color");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);

      // Add a BorderLayout manager to the content pane.
      setLayout(new BorderLayout());
      
      // Create five buttons.
      JButton buttonBlue = new JButton("BLUE");
      buttonBlue.addActionListener(new PushButton());
      buttonBlue.setBackground(Color.BLUE);
      
      JButton buttonGreen = new JButton("GREEN");
      buttonGreen.addActionListener(new PushButton());
      buttonGreen.setBackground(Color.GREEN);
      
      JButton buttonRed = new JButton("RED");
      buttonRed.addActionListener(new PushButton());
      buttonRed.setBackground(Color.RED);
      
      JButton buttonYellow = new JButton("YELLOW");
      buttonYellow.addActionListener(new PushButton());
      buttonYellow.setBackground(Color.YELLOW);
      
      JLabel testCenter = new JLabel("Choose you color : ");
      
      // Create five panels.
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
      JPanel panel3 = new JPanel();
      JPanel panel4 = new JPanel();
      JPanel panel5 = new JPanel();
      
      // Add the buttons to the panels.
      panel1.add(buttonBlue);
      panel2.add(buttonGreen);
      panel3.add(buttonRed);
      panel4.add(buttonYellow);
      panel5.add(testCenter);

      // Add the five panels to the content pane.
      add(panel1, BorderLayout.NORTH);
      add(panel2, BorderLayout.SOUTH);
      add(panel3, BorderLayout.EAST);
      add(panel4, BorderLayout.WEST);
      add(panel5, BorderLayout.CENTER);

      // Pack and display the window.
      pack();
      setVisible(true);
   }
   
   private class PushButton implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         
      }
   }
}