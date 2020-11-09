package uno_desautel_pellen_perold;

import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for GridLayout class

public class GraphicInterface extends JFrame 
{
    private final int WINDOW_WIDTH = 1500;   // Window width
    private final int WINDOW_HEIGHT = 1000;  // Window height
    
    // UNO CARD's IMAGES
    public final static int NB_IMAGES_CARD = 42;

    // NUMBER CARDS
    public final static ImageIcon RED_0_IMAGE = new ImageIcon("CartesUNO\\0red.jpg");
    public final static ImageIcon BLUE_0_IMAGE = new ImageIcon("CartesUNO\\0blue.jpg");
    public final static ImageIcon GREEN_0_IMAGE = new ImageIcon("CartesUNO\\0green.jpg");
    public final static ImageIcon YELLOW_0_IMAGE = new ImageIcon("CartesUNO\\0yellow.jpg");
    
    public final static ImageIcon RED_1_IMAGE = new ImageIcon("CartesUNO\\1red.jpg");
    public final static ImageIcon BLUE_1_IMAGE = new ImageIcon("CartesUNO\\1blue.jpg");
    public final static ImageIcon GREEN_1_IMAGE = new ImageIcon("CartesUNO\\1green.jpg");
    public final static ImageIcon YELLOW_1_IMAGE = new ImageIcon("CartesUNO\\1yellow.jpg");
    
    public final static ImageIcon RED_2_IMAGE = new ImageIcon("CartesUNO\\2red.jpg");
    public final static ImageIcon BLUE_2_IMAGE = new ImageIcon("CartesUNO\\2blue.jpg");
    public final static ImageIcon GREEN_2_IMAGE = new ImageIcon("CartesUNO\\2green.jpg");
    public final static ImageIcon YELLOW_2_IMAGE = new ImageIcon("CartesUNO\\2yellow.jpg");
    
    public final static ImageIcon RED_3_IMAGE = new ImageIcon("CartesUNO\\3red.jpg");
    public final static ImageIcon BLUE_3_IMAGE = new ImageIcon("CartesUNO\\3blue.jpg");
    public final static ImageIcon GREEN_3_IMAGE = new ImageIcon("CartesUNO\\3green.jpg");
    public final static ImageIcon YELLOW_3_IMAGE = new ImageIcon("CartesUNO\\3yellow.jpg");
    
    public final static ImageIcon RED_4_IMAGE = new ImageIcon("CartesUNO\\4red.jpg");
    public final static ImageIcon BLUE_4_IMAGE = new ImageIcon("CartesUNO\\4blue.jpg");
    public final static ImageIcon GREEN_4_IMAGE = new ImageIcon("CartesUNO\\4green.jpg");
    public final static ImageIcon YELLOW_4_IMAGE = new ImageIcon("CartesUNO\\4yellow.jpg");
    
    public final static ImageIcon RED_5_IMAGE = new ImageIcon("CartesUNO\\5red.jpg");
    public final static ImageIcon BLUE_5_IMAGE = new ImageIcon("CartesUNO\\5blue.jpg");
    public final static ImageIcon GREEN_5_IMAGE = new ImageIcon("CartesUNO\\5green.jpg");
    public final static ImageIcon YELLOW_5_IMAGE = new ImageIcon("CartesUNO\\5yellow.jpg");
    
    public final static ImageIcon RED_6_IMAGE = new ImageIcon("CartesUNO\\6red.jpg");
    public final static ImageIcon BLUE_6_IMAGE = new ImageIcon("CartesUNO\\6blue.jpg");
    public final static ImageIcon GREEN_6__IMAGE = new ImageIcon("CartesUNO\\6green.jpg");
    public final static ImageIcon YELLOW_6_IMAGE = new ImageIcon("CartesUNO\\6yellow.jpg");
    
    public final static ImageIcon RED_7_IMAGE = new ImageIcon("CartesUNO\\7red.jpg");
    public final static ImageIcon BLUE_7_IMAGE = new ImageIcon("CartesUNO\\7blue.jpg");
    public final static ImageIcon GREEN_7_IMAGE = new ImageIcon("CartesUNO\\7green.jpg");
    public final static ImageIcon YELLOW_7_IMAGE = new ImageIcon("CartesUNO\\7yellow.jpg");
    
    public final static ImageIcon RED_8_IMAGE = new ImageIcon("CartesUNO\\8red.jpg");
    public final static ImageIcon BLUE_8_IMAGE = new ImageIcon("CartesUNO\\8blue.jpg");
    public final static ImageIcon GREEN_8_IMAGE = new ImageIcon("CartesUNO\\8green.jpg");
    public final static ImageIcon YELLOW_8_IMAGE = new ImageIcon("CartesUNO\\8yellow.jpg");
    
    public final static ImageIcon RED_9_IMAGE = new ImageIcon("CartesUNO\\9red.jpg");
    public final static ImageIcon BLUE_9_IMAGE = new ImageIcon("CartesUNO\\9blue.jpg");
    public final static ImageIcon GREEN_9_IMAGE = new ImageIcon("CartesUNO\\9green.jpg");
    public final static ImageIcon YELLOW_9_IMAGE = new ImageIcon("CartesUNO\\9yellow.jpg");
    
    // REVERSE CARDS
    public final static ImageIcon RED_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reversered.jpg");
    public final static ImageIcon BLUE_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reverseblue.jpg");
    public final static ImageIcon GREEN_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reversegreen.jpg");
    public final static ImageIcon YELLOW_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reverseyellow.jpg");

    // SKIP CARDS
    public final static ImageIcon RED_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipred.jpg");
    public final static ImageIcon BLUE_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipblue.jpg");
    public final static ImageIcon GREEN_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipgreen.jpg");
    public final static ImageIcon YELLOW_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipyellow.jpg");
    
    // WILD CARDS
    public final static ImageIcon RED_WILD_IMAGE = new ImageIcon("CartesUNO\\wildred.jpg");
    public final static ImageIcon BLUE_WILD_IMAGE = new ImageIcon("CartesUNO\\wildblue.jpg");
    public final static ImageIcon GREEN_WILD_IMAGE = new ImageIcon("CartesUNO\\wildgreen.jpg");
    public final static ImageIcon YELLOW_WILD_IMAGE = new ImageIcon("CartesUNO\\wildyellow.jpg");
    
    // DRAW CARD
    public final static ImageIcon DRAW_IMAGE = new ImageIcon("CartesUNO\\draw.jpg");
    
    // WILD DRAW CARD
    public final static ImageIcon WILD_DRAW_IMAGE = new ImageIcon("CartesUNO\\wilddraw.jpg");
    


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
