package uno_desautel_pellen_perold;

import javax.swing.ImageIcon;

public class WildDrawCard implements Card {

    private char m_color;
    private ImageIcon m_image;
    
    public WildDrawCard () {
        m_color =ALL_COLORS_CARD;
        m_image = initImageWildDrawCard();
    }
    
    public ImageIcon initImageWildDrawCard() {
        ImageIcon image_card = null;
        String file_name = "CarteUNO\\";
        file_name = file_name + "\\";
        file_name = file_name + "wilddraw.jpg";
        image_card = new ImageIcon(file_name);
        return image_card;
    }
    
    @Override
    public char getColor() {
        return m_color;
    }

    @Override
    public int getSymbol() {
        return WILD_DRAW_CARD;
    }
    
    @Override
    public ImageIcon getImage() {
        return m_image;
    }

    @Override
    public boolean canPlayOn(Card card) {
        return false;
    }

    @Override
    public void play(Game g) {
        //TODO faire ici le choix de la couleur de la nouvelle carte
        m_color = 'B';
        // change color of the card
    }
}
