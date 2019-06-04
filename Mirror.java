package hearthstone;

public class Mirror extends Puzzles{
    public Mirror(Card[] d, Card[] ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, sm, cm, aHero, eHero);
    }
    
    public Mirror(){
        super(null, null, null, null, null, null, 0, 0, null, null);
    }
    
    public boolean checkWin(){
        
    }
}
