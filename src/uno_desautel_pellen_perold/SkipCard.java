package uno_desautel_pellen_perold;

public class SkipCard implements Card {

    @Override
    public boolean testUseCard() {
        return false;
    }

    @Override
    public void useCard() {
        
    }
    
}
