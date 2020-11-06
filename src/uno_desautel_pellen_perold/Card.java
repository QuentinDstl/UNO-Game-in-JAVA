package uno_desautel_pellen_perold;

public interface Card {

    public final static int NB_TOTAL_CARDS = 108;
    
    public static final int NB_COlOR = 4;
    
    public final static int NB_NUMBER_CARDS = 68;
    public final static int NB_COLOR_CARDS = 19;
    public final static int NB_COLOR_CARDS_EXCEPT_0 = 18;
    public final static int NB_EACH_COLOR_NUMBER_EXCEPT_0 = 2;
    public final static int NB_EACH_COLOR_0 = 1;
    
    
    public boolean testUseCard ();

    public void useCard ();

}
