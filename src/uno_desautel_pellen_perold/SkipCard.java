package uno_desautel_pellen_perold;

import javax.swing.ImageIcon;

public class SkipCard implements Card {

    private final char m_color;
    private final ImageIcon m_image;
    private final int m_value;
    
    public SkipCard(char color) {
        m_color = color;
        m_image = initImageSkipCard(color);
        m_value = 20;
    }
    
    private ImageIcon initImageSkipCard(char color) {
        ImageIcon image_card = null;
        String file_name = "CarteUNO\\";
        file_name = file_name + "\\skip";
        file_name = file_name + color + ".png";
        image_card = new ImageIcon(file_name);
        return image_card;
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
    public ImageIcon getImage() {
        return m_image;
    }
    
    @Override
    public int getValue() {
        return m_value;
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
