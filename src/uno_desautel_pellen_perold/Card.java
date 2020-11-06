package uno_desautel_pellen_perold;

public interface Card {

    public final static int NUMBER_TOTAL_CARD = 108;
    
    /* CARD TYPE */
    public final static int REVERSE_CARD = -1;
    public final static int DRAW_CARD = -2;
    public final static int SKIP_CARD = -3;
    public final static int WILD_CARD = -4;
    public final static int WILD_DRAW_CARD = -5;

    public char getColor();                 // get the colour 

    public int getSymbol();                // get the symbol

    public boolean canPlayOn(Card card);    // test if it can be played

    public void play(Game g);               // implement any effects 

}
