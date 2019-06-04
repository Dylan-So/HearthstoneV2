package hearthstone;

abstract public class Puzzles extends HearthstoneBoard{
    protected Puzzles levels[][] = new Puzzles[4][7];
    public Card[] deck; 
    public Card[] edeck; 
    public Card[] hand = new Card[10];
    public Card[] ehand = new Card[10];
    public Card[] fcard = new Card[7];
    public Card[] efcard = new Card[7];
    public int startMana;
    public int currentMana;
    public Hero allyHero;
    public Hero enemyHero;
    public Puzzles(Card[] d, Card[] ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int sm, int cm, Hero aHero, Hero eHero){
        deck = d;
        edeck = ed;
        hand = h;
        ehand = eh;
        fcard = fc;
        efcard = efc;
        startMana = sm;
        currentMana = cm;
        allyHero = aHero;
        enemyHero = eHero;
    }
    public Puzzles(){
        Card[] d = null,ed = null;
        Card[] h = new Card[7],eh = new Card[7];
        Card[] fc = new Card[10],efc = new Card[10];
        int sm = 0,cm = 0;
        Hero aHero = null,eHero = null;
        for(int i = 0; i < 7; i++){
            h[i] = new Card();
            eh[i] = new Card();
        }
        for(int i = 0; i < 10; i++){
            fc[i] = new Card();
            efc[i] = new Card();
        }
        deck = d;
        edeck = ed;
        hand = h;
        ehand = eh;
        fcard = fc;
        efcard = efc;
        startMana = sm;
        currentMana = cm;
        allyHero = aHero;
        enemyHero = eHero;
        for(int i = 0; i < 4; i++){
            for(int a = 0; a < 7; a++){
                if(i == 0){
                    levels[i][a] = new Lethal();
                }else if(i == 1){
                    levels[i][a] = new Mirror();
                }else if(i == 2){
                    levels[i][a] = new BoardClear();
                }else if(i == 3){
                    levels[i][a] = new Survival();
                }
            }
        }
    }
    }
    
    

