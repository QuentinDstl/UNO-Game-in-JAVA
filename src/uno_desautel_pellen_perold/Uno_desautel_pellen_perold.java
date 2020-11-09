package uno_desautel_pellen_perold;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class Uno_desautel_pellen_perold {
    
    public static void main(String[] args) 
    {   
        playGame();
    }
    
    public static void playGame()
    {
        /* initialisation of the  game */
        Game game = new Game();
        int numberPlayers  = playWelcome();
        
        game.initPickCards();
        game.initPlayers(numberPlayers);
        game.initTrash();
        
        game.startGame();
 
    }
    
    public static int playWelcome()
    {
        int numberPlayer=0;
        GraphicWelcome displayOne = new GraphicWelcome();
        
        do 
        {            
            numberPlayer = displayOne.getNumberPlayer();
            System.out.print("");
        }while (numberPlayer ==0);
        
        // A DELETE PLUS TARD 
        System.out.println(" Numbers players : "  +numberPlayer);
        
        return numberPlayer;
    }
}
