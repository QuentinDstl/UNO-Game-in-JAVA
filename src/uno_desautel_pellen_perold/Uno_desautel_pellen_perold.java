package uno_desautel_pellen_perold;

public class Uno_desautel_pellen_perold {
    
    public static void playGame()
    {
        /* initialisation og game */
        Game game = new Game();
        game.initPickCards();
        
    }
    
    public static void playWelcome()
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
    }
    
    public static void main(String[] args) 
    {
        playWelcome();
        
        playGame();
    }
    
}
