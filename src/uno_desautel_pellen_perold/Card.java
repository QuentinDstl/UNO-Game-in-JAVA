package uno_desautel_pellen_perold;

import javax.swing.ImageIcon;

public interface Card {

    public final static int NB_TOTAL_CARDS = 108;
    
    public static final int NB_COlOR = 4;
    
    /* NUMBER CARDS */
    public final static int NB_NUMBER_CARDS = 68;
    public final static int NB_COLOR_CARDS = 19;
    public final static int NB_COLOR_CARDS_EXCEPT_0 = 18;
    public final static int NB_EACH_COLOR_NUMBER_EXCEPT_0 = 2;
    public final static int NB_EACH_COLOR_0 = 1;
    
    
    /* SKIP CARDS */
    public final static int NB_SKIP_CARDS = 8;
    public final static int NB_EACH_COLOR_SKIP_CARD = 2;
    
    /* REVERSE CARDS */
    public final static int NB_REVERSE_CARDS = 8;
    public final static int NB_EACH_COLOR_REVERSE_CARD = 2;
    
    /* WILD CARDS */
    public final static int NB_WILD_CARDS = 8;
    public final static int NB_EACH_COLOR_WILD_CARD = 2;
    
    /* DRAW CARDS */
    public final static int NB_DRAW_CARDS = 4;

    /* WILD DRAW CARDS */
    public final static int NB_WILD_DRAW_CARDS = 4;
    
    
    /* CARD TYPE */
    public final static int REVERSE_CARD = -1;
    public final static int DRAW_CARD = -2;
    public final static int SKIP_CARD = -3;
    public final static int WILD_CARD = -4;
    public final static int WILD_DRAW_CARD = -5;
    
    /* CARD COLOR */
    public final static char BLUE_CARD = 'B';
    public final static char RED_CARD = 'R';
    public final static char GREEN_CARD = 'G';
    public final static char YELLOW_CARD = 'Y';
    public final static char ALL_COLORS_CARD = 'S';
    
    
    /* UNO CARD's IMAGES */
    public final static int NB_IMAGES_CARD = 42;

    /* NUMBER CARDS */
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
    
    /* REVERSE CARDS */
    public final static ImageIcon RED_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reversered.jpg");
    public final static ImageIcon BLUE_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reverseblue.jpg");
    public final static ImageIcon GREEN_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reversegreen.jpg");
    public final static ImageIcon YELLOW_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reverseyellow.jpg");

    /* SKIP CARDS */
    public final static ImageIcon RED_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipred.jpg");
    public final static ImageIcon BLUE_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipblue.jpg");
    public final static ImageIcon GREEN_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipgreen.jpg");
    public final static ImageIcon YELLOW_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipyellow.jpg");
    
    /* WILD CARDS */
    public final static ImageIcon RED_WILD_IMAGE = new ImageIcon("CartesUNO\\wildred.jpg");
    public final static ImageIcon BLUE_WILD_IMAGE = new ImageIcon("CartesUNO\\wildblue.jpg");
    public final static ImageIcon GREEN_WILD_IMAGE = new ImageIcon("CartesUNO\\wildgreen.jpg");
    public final static ImageIcon YELLOW_WILD_IMAGE = new ImageIcon("CartesUNO\\wildyellow.jpg");
    
    /* DRAW CARD */
    public final static ImageIcon DRAW_IMAGE = new ImageIcon("CartesUNO\\draw.jpg");
    
    /* WILD DRAW CARD */
    public final static ImageIcon WILD_DRAW_IMAGE = new ImageIcon("CartesUNO\\wilddraw.jpg");
    

    

    public char getColor();                 // get the colour 

    public int getSymbol();                // get the symbol

    public boolean canPlayOn(Card card);    // test if it can be played

    public void play(Game g);               // implement any effects 

}
