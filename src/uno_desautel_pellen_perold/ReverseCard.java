package uno_desautel_pellen_perold;

import javax.swing.ImageIcon;

public class ReverseCard implements Card {

    private final char m_color;
    private final ImageIcon m_image;
    
    public ReverseCard(char color) {
        m_color = color;
        m_image = initImageReverseCard(color);
    }
    
    private ImageIcon initImageReverseCard(char color) {
        ImageIcon image_card = null;
        String file_name = "CarteUNO\\";
        file_name = file_name + "\\reverse";
        file_name = file_name + color + ".jpg";
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
    
    @Override
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
