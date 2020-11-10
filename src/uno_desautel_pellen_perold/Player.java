package uno_desautel_pellen_perold;

import java.util.ArrayList;

public class Player {

    private ArrayList <Card> m_deck;
    public static final int NUMBER_OF_CARD = 7;
    
    public Player() {
        m_deck = new ArrayList<>();
    }
    
    /**
     * fonction pour jouer, supprime la carte du deck du joueur et la return
     * @param pos
     * @return Card card
     */
    public Card getCard(int pos) {        
        try {
            return m_deck.get(pos);
        }
        
        catch (IndexOutOfBoundsException e) {
            System.out.println("Exception : " + e.getMessage());
        }
        
        return null;
    }
    
    public void removeCard(int pos) {
        try {
            m_deck.remove(pos);
        }
        
        catch (IndexOutOfBoundsException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
    
    public void pickCard(Card pick) {
        m_deck.add(pick);
    }
    
    public ArrayList<Card> getDeck() {
        return m_deck;
    }
}
