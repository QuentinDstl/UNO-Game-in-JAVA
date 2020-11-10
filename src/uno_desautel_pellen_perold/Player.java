package uno_desautel_pellen_perold;

import java.util.ArrayList;

public class Player {

    private ArrayList <Card> m_deck;
    public static final int NUMBER_OF_CARD = 7;
    public int m_deck_value;
    
    public Player() {
        m_deck = new ArrayList<>();
        m_deck_value = 0;
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
    
    public void sayUno() {
        //mettre le code de la fenetre dire UNO
    }
    
    public void calculateDeckValue(){
        
        for(int i=0; i<m_deck.size(); ++i) {
            m_deck_value += m_deck.get(i).getValue();
        }
    }
    
    public int getDeckValue() {
        return m_deck_value;
    }
    
    public void pickCard(Card pick) {
        m_deck.add(pick);
    }
    
    public ArrayList<Card> getDeck() {
        return m_deck;
    }
}
