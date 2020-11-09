package uno_desautel_pellen_perold;

import java.util.ArrayList;
import java.util.Scanner;

public class Uno_desautel_pellen_perold {
    
    public static void playGame()
    {
        /* initialisation og game */
        Game game = new Game();
        int numberPlayers  = 2;//playWelcome();
        
        game.initPickCards();
        game.initPlayers(numberPlayers);
        
        ArrayList<Card> deck = game.getPlayerDeck(0);
        
        for( int i= 0; i<Player.NUMBER_OF_CARD; i++)
            System.out.println("Symbole: " + deck.get(i).getSymbol() + "| Couleur: " + deck.get(i).getColor());
        
        System.out.println("quel carte tej ?");
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        game.play(a);
        a = sc.nextInt();
        sc.nextLine();
        game.play(a);
        a = sc.nextInt();
        sc.nextLine();
        game.play(a);
        
        ArrayList<Card> poubelle = game.getTrash();
        for(int i=0; i<poubelle.size(); i++)
            System.out.println("trash :: Symbole: " + poubelle.get(i).getSymbol() + "| Couleur: " + poubelle.get(i).getColor());
        for( int i= 0; i<Player.NUMBER_OF_CARD-1; i++)
            System.out.println("Symbole: " + deck.get(i).getSymbol() + "| Couleur: " + deck.get(i).getColor());
    }
    
    public static int playWelcome()
    {
        int numberPlayer=0;
        GraphicWelcome displayOne = new GraphicWelcome();
        
        do 
        {            
            numberPlayer = displayOne.getNumberPlayer();
            System.out.print("");
        } while (numberPlayer ==0);
        
        // A DELETE PLUS TARD 
        System.out.println(" NUmbers players : "  +numberPlayer);
        
        return numberPlayer;
    }
    
    public static void main(String[] args) 
    {   
        playGame();
    }
    
}
