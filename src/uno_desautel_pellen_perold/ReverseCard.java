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
        if(this.m_color == card.getColor())
            return true;
        else 
            return  card.getSymbol() == REVERSE_CARD;                   // if statement redondant : si REVERSE_CARD == card.getSymbol() alors return true sinon false
    }

    @Override
    public void play(Game g) {
        g.switchOrder();
    }
}
