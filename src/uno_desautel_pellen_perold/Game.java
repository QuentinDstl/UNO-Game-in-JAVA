package uno_desautel_pellen_perold;

import java.util.ArrayList;
import java.util.Random; 
import java.util.Collections;

public class Game {
    
    private ArrayList<Card> m_pick_cards; //draw of cards
    private ArrayList<Card> m_trash;      //trash of cards played
    
    
    ///CONSTRUCTOR
    public Game()
    {
        
        m_pick_cards = new ArrayList<>();
        m_trash = new ArrayList<>();
    }
    
    ///INITIALISATION METHODS
    public void initPickCards()
    {
        initNumberCards();
        m_pick_cards = shufflePickCards(m_pick_cards);
    }
    
    public void initNumberCards()
    {
        initNumberColorCards("blue");
        initNumberColorCards("red");
        initNumberColorCards("yellow");
        initNumberColorCards("green");
    }
    
    public void initNumberColorCards(String color)
    {
        m_pick_cards.add( new NumberCard(0, color));
        for(int j=0; j<Card.NB_COLOR_CARDS_EXCEPT_0; ++j)
        {
            m_pick_cards.add( new NumberCard(j+1, color));   //creation of cards from 1 to 9
        }
        
    }
    
    
    ///SHUFFLE OF LIST METHOD
    public ArrayList<Card> shufflePickCards(ArrayList<Card> pick_cards)
    {
        Random randomGenerator = new Random();  //declaration of an aleatory object
        int randomInt; 
        
        boolean[] tab = new boolean[108];   //tab which checks eac indice of draw_cards
        for(int i=0; i<tab.length; ++i)
        {
            tab[i] = false;
        }
        
        for(int i=0; i<Card.NB_NUMBER_CARDS; ++i)
        {
            do 
            {
                randomInt = randomGenerator.nextInt(Card.NB_NUMBER_CARDS);
            }while(tab[randomInt]!=false);
            
            Collections.swap(pick_cards, i, randomInt); //aleatory swap
            tab[i] = true;  
        }
        
        return pick_cards;
    }
}
