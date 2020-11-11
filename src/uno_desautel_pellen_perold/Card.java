package uno_desautel_pellen_perold;

import javax.swing.ImageIcon;

public interface Card {

    public final static int NB_TOTAL_CARDS = 108;
    
    public final static int NB_COLOR = 4;
    
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
    public final static char NO_COLOR_SELECT = '%';
    
    
    /* UNO CARD's IMAGES */
    public final static int NB_IMAGES_CARD = 42;

    /* NUMBER CARDS */
    public final static ImageIcon RED_0_IMAGE = new ImageIcon("CartesUNO\\0R.png");
    public final static ImageIcon BLUE_0_IMAGE = new ImageIcon("CartesUNO\\0B.png");
    public final static ImageIcon GREEN_0_IMAGE = new ImageIcon("CartesUNO\\0G.png");
    public final static ImageIcon YELLOW_0_IMAGE = new ImageIcon("CartesUNO\\0Y.png");
    
    public final static ImageIcon RED_1_IMAGE = new ImageIcon("CartesUNO\\1R.png");
    public final static ImageIcon BLUE_1_IMAGE = new ImageIcon("CartesUNO\\1B.png");
    public final static ImageIcon GREEN_1_IMAGE = new ImageIcon("CartesUNO\\1G.png");
    public final static ImageIcon YELLOW_1_IMAGE = new ImageIcon("CartesUNO\\1Y.png");
    
    public final static ImageIcon RED_2_IMAGE = new ImageIcon("CartesUNO\\2R.png");
    public final static ImageIcon BLUE_2_IMAGE = new ImageIcon("CartesUNO\\2B.png");
    public final static ImageIcon GREEN_2_IMAGE = new ImageIcon("CartesUNO\\2G.png");
    public final static ImageIcon YELLOW_2_IMAGE = new ImageIcon("CartesUNO\\2Y.png");
    
    public final static ImageIcon RED_3_IMAGE = new ImageIcon("CartesUNO\\3R.png");
    public final static ImageIcon BLUE_3_IMAGE = new ImageIcon("CartesUNO\\3B.png");
    public final static ImageIcon GREEN_3_IMAGE = new ImageIcon("CartesUNO\\3G.png");
    public final static ImageIcon YELLOW_3_IMAGE = new ImageIcon("CartesUNO\\3Y.png");
    
    public final static ImageIcon RED_4_IMAGE = new ImageIcon("CartesUNO\\4R.png");
    public final static ImageIcon BLUE_4_IMAGE = new ImageIcon("CartesUNO\\4B.png");
    public final static ImageIcon GREEN_4_IMAGE = new ImageIcon("CartesUNO\\4G.png");
    public final static ImageIcon YELLOW_4_IMAGE = new ImageIcon("CartesUNO\\4Y.png");
    
    public final static ImageIcon RED_5_IMAGE = new ImageIcon("CartesUNO\\5R.png");
    public final static ImageIcon BLUE_5_IMAGE = new ImageIcon("CartesUNO\\5B.png");
    public final static ImageIcon GREEN_5_IMAGE = new ImageIcon("CartesUNO\\5G.png");
    public final static ImageIcon YELLOW_5_IMAGE = new ImageIcon("CartesUNO\\5Y.png");
    
    public final static ImageIcon RED_6_IMAGE = new ImageIcon("CartesUNO\\6R.png");
    public final static ImageIcon BLUE_6_IMAGE = new ImageIcon("CartesUNO\\6B.png");
    public final static ImageIcon GREEN_6__IMAGE = new ImageIcon("CartesUNO\\6G.png");
    public final static ImageIcon YELLOW_6_IMAGE = new ImageIcon("CartesUNO\\6Y.png");
    
    public final static ImageIcon RED_7_IMAGE = new ImageIcon("CartesUNO\\7R.png");
    public final static ImageIcon BLUE_7_IMAGE = new ImageIcon("CartesUNO\\7B.png");
    public final static ImageIcon GREEN_7_IMAGE = new ImageIcon("CartesUNO\\7G.png");
    public final static ImageIcon YELLOW_7_IMAGE = new ImageIcon("CartesUNO\\7Y.png");
    
    public final static ImageIcon RED_8_IMAGE = new ImageIcon("CartesUNO\\8R.png");
    public final static ImageIcon BLUE_8_IMAGE = new ImageIcon("CartesUNO\\8B.png");
    public final static ImageIcon GREEN_8_IMAGE = new ImageIcon("CartesUNO\\8G.png");
    public final static ImageIcon YELLOW_8_IMAGE = new ImageIcon("CartesUNO\\8Y.png");
    
    public final static ImageIcon RED_9_IMAGE = new ImageIcon("CartesUNO\\9R.png");
    public final static ImageIcon BLUE_9_IMAGE = new ImageIcon("CartesUNO\\9B.png");
    public final static ImageIcon GREEN_9_IMAGE = new ImageIcon("CartesUNO\\9G.png");
    public final static ImageIcon YELLOW_9_IMAGE = new ImageIcon("CartesUNO\\9Y.png");
    
    /* REVERSE CARDS */
    public final static ImageIcon RED_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reverseR.png");
    public final static ImageIcon BLUE_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reverseB.png");
    public final static ImageIcon GREEN_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reverseG.png");
    public final static ImageIcon YELLOW_REVERSE_IMAGE = new ImageIcon("CartesUNO\\reverseY.png");

    /* SKIP CARDS */
    public final static ImageIcon RED_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipR.png");
    public final static ImageIcon BLUE_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipB.png");
    public final static ImageIcon GREEN_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipG.png");
    public final static ImageIcon YELLOW_SKIP_IMAGE = new ImageIcon("CartesUNO\\skipY.png");
    
    /* WILD CARDS */
    public final static ImageIcon RED_WILD_IMAGE = new ImageIcon("CartesUNO\\wildR.png");
    public final static ImageIcon BLUE_WILD_IMAGE = new ImageIcon("CartesUNO\\wildB.png");
    public final static ImageIcon GREEN_WILD_IMAGE = new ImageIcon("CartesUNO\\wildG.png");
    public final static ImageIcon YELLOW_WILD_IMAGE = new ImageIcon("CartesUNO\\wildY.png");
    
    /* DRAW CARD */
    public final static ImageIcon DRAW_IMAGE = new ImageIcon("CartesUNO\\draw.png");
    
    /* WILD DRAW CARD */
    public final static ImageIcon WILD_DRAW_IMAGE = new ImageIcon("CartesUNO\\wilddraw.png");
    

    

    public char getColor();                 // get the colour 
    
    public ImageIcon getImage();

    public int getSymbol();                // get the symbol
    
    public int getValue();

    public boolean canPlayOn(Card card);    // test if it can be played

    public void play(Game g);               // implement any effects 

}
