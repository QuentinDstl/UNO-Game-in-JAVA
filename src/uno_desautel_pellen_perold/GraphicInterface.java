package uno_desautel_pellen_perold;

import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for GridLayout class
import java.awt.event.*;
import java.util.ArrayList;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class GraphicInterface extends JFrame 
{
    private final int WINDOW_WIDTH = 2000;   // Window width
    private final int WINDOW_HEIGHT = 1000;  // Window height

   public GraphicInterface(Player hey, int place)
   {
        ArrayList<JPanel> tabJPanel= new ArrayList<JPanel>();
       
        /* Initialisation of the interface */
        setTitle("Player " + place);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        /*Creation of the grid */
        setLayout(new GridLayout(2, hey.getDeck().size()));
        
        /*Insertion of the pickCard */
        JButton buttonPickCard = new JButton(new ImageIcon("CarteUNO\\doscarte.jpg"));
        buttonPickCard.addActionListener(new PlayPickCardListener());
        JPanel panelPickCard = new JPanel();
        panelPickCard.add(buttonPickCard);
        add(panelPickCard);
            
        /* Insertion of the void */
        for (int i = 0; i<hey.getDeck().size()-1; i++ ) {
            JLabel buttonVoid = new JLabel("");
            JPanel panelVoid = new JPanel();
            panelVoid.add(buttonVoid);
            add(panelVoid);
        }
        
        /* Insertion of the deck of the player */
        for (int i = 0; i<hey.getDeck().size(); i++ ) {
            String t = String.valueOf(i);
            
            System.out.println(hey.getDeck().get(i).getImage());
            JButton button = new JButton(t,hey.getDeck().get(i).getImage());
            button.addActionListener(new PlayCardListener());          
            
            JPanel panel = new JPanel();
            panel.add(button);
            add(panel);
            
        }

        // Display the window.
        setVisible(true);
   }
   
   
   private class PlayCardListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
          /* Take the name of the card */
          String source = e.getActionCommand();
          int resultat = Integer.parseInt(source);
          
          /// A DELETE PLUS TARD
          System.out.println(resultat);
          
      }
   }
   
   private class PlayPickCardListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
          String source = e.getActionCommand();
          
          System.out.println(source);
      }
   }
   
}
