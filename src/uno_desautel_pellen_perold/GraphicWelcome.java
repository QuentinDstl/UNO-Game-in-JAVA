/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_desautel_pellen_perold;

import javax.swing.*;
import java.awt.event.*;

public class GraphicWelcome extends JFrame
{
    private JPanel panel;                   // To reference a panel
    private JLabel message;                 // To reference a label
    private JLabel imageUNO;
    private JTextField kiloTextField;       // To reference a text field
    private JButton playerButton;           // To reference a button
    private final int WINDOW_WIDTH = 1600;  // Window width
    private final int WINDOW_HEIGHT = 682;  // Window heigh
    private int numberPlayer=0;
   
    public GraphicWelcome() { 
        initGraphicWelcome();
    }
    
    private void initGraphicWelcome() {
        setTitle("UNO Game");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        buildPanel();

        add(panel);

        setVisible(true);
    }
    
    public int getNumberPlayer()
    {
        return numberPlayer;
    }
    
    private void buildPanel()
    {
       message = new JLabel("Please enter how many players want to play : ");
       imageUNO = new JLabel(new ImageIcon("icon.jpg"));
       kiloTextField = new JTextField(5);

       playerButton = new JButton("Enter");
       playerButton.addActionListener(new CalcButtonListener());
        
       panel = new JPanel();

       panel.add(message);
       panel.add(kiloTextField);
       panel.add(playerButton);
       panel.add(imageUNO);
    }
    
    private class CalcButtonListener implements ActionListener
    {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         String input;

         input = kiloTextField.getText();

         numberPlayer = Integer.parseInt(input);
         
         setVisible(false);
      }
    }

}
