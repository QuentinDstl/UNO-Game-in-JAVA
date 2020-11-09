package uno_desautel_pellen_perold;

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
    

    public char getColor();                 // get the colour 

    public int getSymbol();                // get the symbol

    public boolean canPlayOn(Card card);    // test if it can be played

    public void play(Game g);               // implement any effects 

}
