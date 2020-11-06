package uno_desautel_pellen_perold;

public class WildDrawCard implements Card {

    private char m_color;
    
    public WildDrawCard () {
        m_color =ALL_COLORS_CARD;
    }
    
    @Override
    public char getColor() {
        return m_color;
    }

    @Override
    public int getSymbol() {
        return WILD_DRAW_CARD;
    }

    @Override
    public boolean canPlayOn(Card card) {
        return false;
    }

    @Override
    public void play(Game g) {
        //TODO faire ici le choix de la couleur de la nouvelle carte
        m_color = 'B';
        // change color of the card
    }
}
