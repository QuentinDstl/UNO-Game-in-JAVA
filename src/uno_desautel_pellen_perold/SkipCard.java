package uno_desautel_pellen_perold;

public class SkipCard implements Card {

    private char m_color;
    
    public SkipCard(char color) {
        m_color = color;
    }
    
    @Override
    public char getColor() {
        return m_color;
    }

    @Override
    public int getSymbol() {
        return SKIP_CARD;
    }

    @Override
    public boolean canPlayOn(Card card) {
        if(this.m_color == card.getColor())
            return true;
        else 
            return  card.getSymbol() == SKIP_CARD;
    }

    @Override
    public void play(Game g) {
        g.next();
    }
}
