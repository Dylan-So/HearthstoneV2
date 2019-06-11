package hearthstone;

import java.util.ArrayList;

public class Mirror extends Puzzles{
    public Mirror(ArrayList<Card> d, ArrayList<Card> ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int cp, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, cp, sm, cm, aHero, eHero);
    }
    
    public Mirror(){
        super(null, null, null, null, null, null, 0, 0, 0, null, null);
    }
    
//    public boolean checkWin(){
//        
//    }
}
