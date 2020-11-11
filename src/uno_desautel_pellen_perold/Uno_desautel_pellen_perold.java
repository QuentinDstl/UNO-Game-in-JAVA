package uno_desautel_pellen_perold;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Uno_desautel_pellen_perold {
    
    public static void main(String[] args) 
    {   
        //new GraphicColor();
        playGame();
    }
    
    public static void playGame()
    {
        /* initialisation of the  game */         
        int numberPlayers= playWelcome();
            
        Game game = new Game(numberPlayers);
        
        game.startGame();
    }
    
    public static int playWelcome()
    {
        int numberPlayers=0;
        GraphicWelcome displayOne = new GraphicWelcome();
        
        do 
        {            
            numberPlayers = displayOne.getNumberPlayer();
            System.out.print("");  
            
        }while  (numberPlayers ==0);
        
        try 
        {
            if ((numberPlayers <=1) || (numberPlayers >= 9))
            {
                System.err.println("The number of players must be between 2 and 4");
                throw  new IllegalArgumentException();
            }
        } 
        catch (IllegalArgumentException e) 
        {
            System.exit(0);
        }
        
        return numberPlayers;
    }
}
