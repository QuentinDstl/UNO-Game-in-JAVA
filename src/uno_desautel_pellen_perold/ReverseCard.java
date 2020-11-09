package uno_desautel_pellen_perold;

import javax.swing.ImageIcon;

public class ReverseCard implements Card {

    private char m_color;
    private ImageIcon m_image;
    
    public ReverseCard(char color) {
        m_color = color;
        m_image = initImageReverseCard(color);
    }
    
    public ImageIcon initImageReverseCard(char color) {
        ImageIcon image_card = null;
        String file_name = "CarteUNO\\reverse" +color +".jpg";
        image_card = new ImageIcon(file_name);
        return image_card;
    }
    
    @Override
    public char getColor() {
        return m_color;
    }

    @Override
    public int getSymbol() {
        return REVERSE_CARD;
    }
    
    public ImageIcon getImage() {
        return m_image;
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
