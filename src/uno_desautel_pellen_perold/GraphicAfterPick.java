/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_desautel_pellen_perold;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicAfterPick extends JFrame
{
   protected int chooseAfterPickFinal = -1;

   public GraphicAfterPick()
   {
      
   }
   
   public int AfterPick()
   {
      setTitle("Can you play ?");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);

      // Add a BorderLayout manager to the content pane.
      setLayout(new BorderLayout());
      
      // Create five buttons.
      JButton buttonNo = new JButton("NO");
      buttonNo.addActionListener(new PushButton());
      buttonNo.setBackground(Color.RED);
      
      JButton buttonYes = new JButton("YES");
      buttonYes.addActionListener(new PushButton());
      buttonYes.setBackground(Color.GREEN);
      
      JLabel testCenter = new JLabel("Can you play ? ");
      
      // Create five panels.
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
      JPanel panel5 = new JPanel();
      
      // Add the buttons to the panels.
      panel1.add(buttonNo);
      panel2.add(buttonYes);
      panel5.add(testCenter);

      // Add the five panels to the content pane.
      add(panel1, BorderLayout.NORTH);
      add(panel2, BorderLayout.SOUTH);
      add(panel5, BorderLayout.CENTER);

      // Pack and display the window.
      pack();
      setVisible(true);
      
      return chooseAfterPickFinal;
   }
   
   private class PushButton implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
          /* Take the name of the card */
          String source = e.getActionCommand();
          /* Take th symbol of the color */
          char firstLetter = source.charAt(0);
          
          if (firstLetter == 'N')
              chooseAfterPickFinal = 0;
          else if (firstLetter == 'Y')
              chooseAfterPickFinal = 1;
          
      }
   }
}