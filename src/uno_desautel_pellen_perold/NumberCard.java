package uno_desautel_pellen_perold;

public class NumberCard implements Card {

    private char m_color;                           // couleur ='R': red |'G': green |'Y': yellow |'B': blue |'S': Black : elle peut etre placé partout et prend une couleur|
    private int m_number;
    
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
        else if (this.m_color == 'S')
            return true;
        else 
            return this.m_number == card.getSymbol();                   // if statement redondant : si this.m_number == card.getSymbol() alors return true sinon false
    }

    @Override
    public void play(Game g) {

    }

}
