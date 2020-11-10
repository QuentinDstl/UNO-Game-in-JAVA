package uno_desautel_pellen_perold;

import javax.swing.ImageIcon;

public class WildCard implements Card {

    private final char m_color;
    private final ImageIcon m_image;
    
    public WildCard (char color) {
        m_color = color;
        m_image = initImageWildCard(color);
    }
    
    private ImageIcon initImageWildCard(char color) {
        ImageIcon image_card = null;
        String file_name = "CarteUNO\\";
        file_name = file_name + "\\wild";
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
        return WILD_CARD;
    }
    
    @Override
    public ImageIcon getImage() {
        return m_image;
    }

    @Override
    public boolean canPlayOn(Card card) {
        return true;
    }

    @Override
    public void play(Game g) {
        
    }
}
