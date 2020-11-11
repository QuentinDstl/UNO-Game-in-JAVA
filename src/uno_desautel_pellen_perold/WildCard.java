package uno_desautel_pellen_perold;

import javax.swing.ImageIcon;

public class WildCard implements Card {

    private final char m_color;
    private final ImageIcon m_image;
    private final int m_value;
    
    public WildCard (char color) {
        m_color = color;
        m_image = initImageWildCard(color);
        m_value = 20;
    }
    
    private ImageIcon initImageWildCard(char color) {
        ImageIcon image_card = null;
        String file_name = "CarteUNO\\";
        file_name = file_name + "\\wild";
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
        return WILD_CARD;
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
            return  card.getSymbol() == WILD_CARD;
    }

    @Override
    public void play(Game g) {
        /* +2 cartes pour le joueur suivant */
        for(int i=0; i<2; i++) {
            g.WildCard();
        }
    }
}
