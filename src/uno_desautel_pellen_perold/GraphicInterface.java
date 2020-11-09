package uno_desautel_pellen_perold;

import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for GridLayout class

public class GraphicInterface extends JFrame 
{
    private final int WINDOW_WIDTH = 1500;   // Window width
    private final int WINDOW_HEIGHT = 1000;  // Window height

    /**
      Constructor
    */

   public GraphicInterface()
   {
        // Set the title bar text.
        setTitle("Grid Layout");

        // Set the size of the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        // Add a GridLayout manager to the content pane.
        setLayout(new GridLayout(3, 3));

        // Create six buttons.
        JButton button1 = new JButton(new ImageIcon("Cartes UNO\\0rouge.jpg"));
        JButton button2 = new JButton(new ImageIcon("Cartes UNO\\1rouge.jpg"));
        JButton button3 = new JButton(new ImageIcon("Cartes UNO\\2rouge.jpg"));
        JButton button4 = new JButton(new ImageIcon("Cartes UNO\\draw.jpg"));
        JButton button5 = new JButton(new ImageIcon("Cartes UNO\\wilddraw.jpg"));
        JButton button6 = new JButton(new ImageIcon("Cartes UNO\\reversered.jpg"));


        // Create six panels.
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();

        // Add the buttons to the panels.
        panel1.add(button1);
        panel2.add(button2);
        panel3.add(button3);
        panel4.add(button4);
        panel5.add(button5);
        panel6.add(button6);

        // Add the panels to the content pane.
        add(panel1);  // Goes into row 1, column 1
        add(panel2);  // Goes into row 1, column 2
        add(panel3);  // Goes into row 1, column 3
        add(panel7);
        add(panel4);  // Goes into row 2, column 1
        add(panel5);  // Goes into row 2, column 2
        add(panel6);  // Goes into row 2, column 3

        // Display the window.
        setVisible(true);
   }
   
   /**
      The main method creates an instance of the
      GridPanelWindow class, displaying its window.
   */
   
   public static void main(String[] args)
   {
      new GraphicInterface();
   }
}
