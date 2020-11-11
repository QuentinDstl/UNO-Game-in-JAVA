package uno_desautel_pellen_perold;

import javax.swing.ImageIcon;

public class NumberCard implements Card {

    private final char m_color;
    private final int m_number;
    private final ImageIcon m_image;
    private final int m_value;
    
    public NumberCard (char color, int number){
        //TODO faire les blindages ici de color et number
        m_color = color;
        m_number = number;
        m_image = initImageNumberCard(m_color, m_number);
        m_value = m_number;
    }
    
    
    private ImageIcon initImageNumberCard(char color, int number) {
        ImageIcon image_card = null;
        String file_name = "CarteUNO\\";
        file_name = file_name + "\\";
        file_name = file_name + number + color + ".jpg";
        image_card = new ImageIcon(file_name);
        return image_card;
    }
      
    
    @Override
    public char getColor() {
        return m_color;
    }

    @Override
    public int getSymbol() {
        return m_number;
    }
    
    @Override
    public ImageIcon getImage() {
        return m_image;
    }
    
    @Override
    public int getValue() {
        return m_value;
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
    
    @Override
    public boolean canBePlayed(Game g, int play_turn) {
        return true;
    }

    /**
     * jouer la carte en question
     * @param g
     */
    @Override
    public void play(Game g) {
    }

}
