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
    protected int m_pickCard = -10;

   public GraphicInterface()
   {
        
   }
   public void startGamenterface(Game game, int player)
   {
       int length = game.getTrash().size();
       int pickCardNew = 0;

        startPlayerInterface(game.getPlayers().get(player), player+1,game.getTrash().get(length-1));
        
        do
        {   /* Shielding for user action */         
            pickCardNew = m_pickCard;
            System.out.print("");

        }while (pickCardNew == -10);
       
        game.play(pickCardNew);      
   }
   
   public void startPlayerInterface(Player hey, int place,Card trash)
   {
         //ArrayList<JPanel> tabJPanel= new ArrayList<JPanel>();
       
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
            
        /* Insertion of there void */
        for (int i = 0; i<hey.getDeck().size()-2; i++ ) {
            JLabel buttonVoid = new JLabel("");
            JPanel panelVoid = new JPanel();
            panelVoid.add(buttonVoid);
            add(panelVoid);
        }
        
        /*Insertion of the Trash*/
        JLabel TrashCard = new JLabel(trash.getImage());
        JPanel panelTrashCard = new JPanel();
        panelTrashCard.add(TrashCard);
        add(panelTrashCard);
        
        /* Insertion of the deck of the player */
        for (int i = 0; i<hey.getDeck().size(); i++ ) {
            String t = String.valueOf(i);
            JButton button = new JButton(t,hey.getDeck().get(i).getImage());
            button.addActionListener(new PlayNumberCardListener());          
            
            JPanel panel = new JPanel();
            panel.add(button);
            add(panel);  
        }

        // Display the window.
        setVisible(true);
   }
   
   
   private class PlayNumberCardListener implements ActionListener
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
          /* Take the name of the card */
          String source = e.getActionCommand();
          int resultat = Integer.parseInt(source);
          
          m_pickCard = resultat;
          
          setVisible(false);
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
