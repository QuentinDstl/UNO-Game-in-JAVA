package uno_desautel_pellen_perold;

public class NumberCard implements Card {

    private char m_color;
    private int m_number;
    
    public NumberCard (char color, int number){
        //TODO faire les blindages ici de color et number
        m_color = color;
        m_number = number;
    }
    
    @Override
    public char getColor() {
        return m_color;
    }

    @Override
    public int getSymbol() {
        return m_number;
    }

    /**
     * test pour voir si on peut utiliser la carte en question
     * @param card
     * @return
     */
    @Override
    public boolean canPlayOn(Card card) {
        if(this.m_color == card.getColor())
            return true;
        else 
            return this.m_number == card.getSymbol();                   // if statement redondant : si this.m_number == card.getSymbol() alors return true sinon false
    }

    /**
     * jouer la carte en question
     * @param g
     */
    @Override
    public void play(Game g) {
        //g.getPlayer();
    }

}
