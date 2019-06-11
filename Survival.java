package hearthstone;

import java.util.ArrayList;

public class Survival extends Puzzles {
    public Survival(ArrayList<Card> d, ArrayList<Card> ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int cp, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, cp, sm, cm, aHero, eHero);
    }
    
    public Survival(){
        super(null, null, null, null, null, null, 0, 0, 0, null, null);
    }

    public boolean checkWin(Hero h1) {//checks all enemy minions have been removed
        if(h1.hp > 0){
            return true;
        }else{
            return false;
        }
    }
}
