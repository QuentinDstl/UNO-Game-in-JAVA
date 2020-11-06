package uno_desautel_pellen_perold;

public class WildCard implements Card {

    private char m_color;
    
    public WildCard (char color) {
        m_color = color;
    }
    
    @Override
    public char getColor() {
        return m_color;
    }

    @Override
    public int getSymbol() {
        return WILD_CARD;
    }

    @Override
    public boolean canPlayOn(Card card) {
        return false;
    }

    @Override
    public void play(Game g) {
        
    }
}
