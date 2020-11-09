package uno_desautel_pellen_perold;

import java.util.ArrayList;
import java.util.Random; 
import java.util.Collections;

public class Game {
    
    private ArrayList<Card> m_pick_cards; //draw of cards
    private ArrayList<Card> m_trash;      //trash of cards played
    private int m_playTurn;
    private ArrayList<Player> m_players;
    
    
    
    /* CONSTRUCTOR */
    public Game() {
        
        m_pick_cards = new ArrayList<>();
        m_trash = new ArrayList<>();
        m_players = new ArrayList<>();
        m_playTurn = 0;
    }
    
    /* INITIALISATION METHODS */
    public void initPickCards() {
        initNumberCards();
        initSkipCards();
        initReverseCards();
        initWildCards();
        initDrawCards();
        initWildDrawCards();
        m_pick_cards = shufflePickCards(m_pick_cards);
    }
    
    public void initNumberCards() {
        initNumberColorCards(Card.BLUE_CARD);
        initNumberColorCards(Card.RED_CARD);
        initNumberColorCards(Card.YELLOW_CARD);
        initNumberColorCards(Card.GREEN_CARD);
    }
    
    public void initNumberColorCards(char color) {
        m_pick_cards.add( new NumberCard(color, 0));
        for(int j=0; j<Card.NB_COLOR_CARDS_EXCEPT_0/2; ++j)
        {
            m_pick_cards.add( new NumberCard(color, j+1));   //creation of cards from 1 to 9
            m_pick_cards.add( new NumberCard(color, j+1));   //2 cards with same symbol
        }
        
    }
    
    public void initSkipCards() {
        initSkipColorCards(Card.BLUE_CARD);
        initSkipColorCards(Card.RED_CARD);
        initSkipColorCards(Card.YELLOW_CARD);
        initSkipColorCards(Card.GREEN_CARD);
    }
    
    public void initSkipColorCards(char color) {
        m_pick_cards.add( new SkipCard(color));
        m_pick_cards.add( new SkipCard(color));
    }
    
    public void initReverseCards() {
        initReverseColorCards(Card.BLUE_CARD);
        initReverseColorCards(Card.RED_CARD);
        initReverseColorCards(Card.YELLOW_CARD);
        initReverseColorCards(Card.GREEN_CARD);
    }
    
    public void initReverseColorCards(char color) {
        m_pick_cards.add( new ReverseCard(color));
        m_pick_cards.add( new ReverseCard(color));
    }
    
    public void initWildCards() {
        initWildColorCards(Card.BLUE_CARD);
        initWildColorCards(Card.RED_CARD);
        initWildColorCards(Card.YELLOW_CARD);
        initWildColorCards(Card.GREEN_CARD);
    }
    
    public void initWildColorCards(char color) {
        m_pick_cards.add( new WildCard(color));
        m_pick_cards.add( new WildCard(color));
    }
    
    public void initDrawCards() {
        for(int i=0; i<Card.NB_DRAW_CARDS; ++i)
        {
            m_pick_cards.add( new DrawCard());
        }
    }
    
    public void initWildDrawCards() {
        for(int i=0; i<Card.NB_WILD_DRAW_CARDS; ++i)
        {
            m_pick_cards.add( new WildDrawCard());
        }
    }
    
    public void initPlayers(int numberPlayers) {
        for(int i=0; i<numberPlayers; i++) {
            Player player = new Player();
            
            for(int j=0; j<Player.NUMBER_OF_CARD ;j++) {
                player.pickCard(m_pick_cards.get(m_pick_cards.size()-1));
                m_pick_cards.remove(m_pick_cards.size()-1);
            }
            m_players.add(player);
        }
    }
    
    
    
    private void next() {
        if(m_playTurn == m_players.size())
            m_playTurn = 0;
        else
            m_playTurn++;
    }
    
    /* SHUFFLE OF LIST METHOD */
    public ArrayList<Card> shufflePickCards(ArrayList<Card> pick_cards) {
        Random randomGenerator = new Random();  //declaration of an aleatory object
        int randomInt; 
        
        boolean[] tab = new boolean[108];   //tab which checks eac indice of draw_cards
        for(int i=0; i<tab.length; ++i) {
            tab[i] = false;
        }
        
        for(int i=0; i<Card.NB_TOTAL_CARDS; ++i) {
            do {
                randomInt = randomGenerator.nextInt(Card.NB_TOTAL_CARDS);
            }while(tab[randomInt]!=false);
            
            Collections.swap(pick_cards, i, randomInt); //aleatory swap
            tab[i] = true;  
        }
        
        return pick_cards;
    }
    
    
    /* Getters */
    public ArrayList<Card> getPickCards() {
        return m_pick_cards;
    }
    
    public int getSizePickCards() {
        return m_pick_cards.size();
    }
    
    public Card getCard(int indice) {
        return m_pick_cards.get(indice);
    }
    
    public ArrayList<Card> getTrash() {
        return m_trash;
    }
    
    public int getSizeTrash() {
        return m_trash.size();
    }
    
    public Card getCardTrash(int indice) {
        return m_trash.get(indice);
    }       
}
