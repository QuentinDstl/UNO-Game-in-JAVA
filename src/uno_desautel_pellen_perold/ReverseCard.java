package uno_desautel_pellen_perold;

public class ReverseCard implements Card {

    private char m_color;
    
    public ReverseCard(char color) {
        m_color = color;
    }
    
    @Override
    public char getColor() {
        return m_color;
    }

    @Override
    public int getSymbol() {
        return REVERSE_CARD;
    }

    @Override
    public boolean canPlayOn(Card card) {
        return false;
    }

    @Override
    public void play(Game g) {
        
    }
}
