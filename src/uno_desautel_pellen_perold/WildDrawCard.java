package uno_desautel_pellen_perold;

import javax.swing.ImageIcon;

public class WildDrawCard implements Card {

    private char m_color;
    private final ImageIcon m_image;
    private final int m_value;
    
    public WildDrawCard () {
        m_color =ALL_COLORS_CARD;
        m_image = initImageWildDrawCard();
        m_value = 50;
    }
    
    private ImageIcon initImageWildDrawCard() {
        ImageIcon image_card = null;
        String file_name = "CarteUNO\\";
        file_name = file_name + "\\";
        file_name = file_name + "wilddraw.png";
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
    public int getValue() {
        return m_value;
    }

    @Override
    public boolean canPlayOn(Card card) {
        return true;
    }

    @Override
    public void play(Game g) {
       GraphicColor gColor = new GraphicColor();
        char letterChoose = NO_COLOR_SELECT;
        do {   
            letterChoose = gColor.chooseColor();
            System.out.print("");
            
        } while (letterChoose == NO_COLOR_SELECT);
        
        m_color = letterChoose;
        
        /* +4 cartes pour le joueur suivant */
        for(int i=0; i<4; i++) {
            g.WildCard();
        }
    }
}
