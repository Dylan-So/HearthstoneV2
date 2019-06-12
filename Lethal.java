package hearthstone;

import java.util.ArrayList;

public class Lethal extends Puzzles {
    public int numTurns;
    public Lethal(ArrayList<Card> d, ArrayList<Card> ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int cp, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, cp, sm, cm, aHero, eHero);
    }
    
    public Lethal(){
        super(null, null, null, null, null, null, 0, 0, 0, null, null);
    }
    
    public boolean checkWin(Hero e1){
        if(e1.hp <= 0){
            return true;
            
        }else{
            return false;
        }
    }

}
