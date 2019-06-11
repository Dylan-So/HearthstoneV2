package hearthstone;

import java.util.ArrayList;

public class BoardClear extends Puzzles {

    public BoardClear(ArrayList<Card> d, ArrayList<Card> ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int cp, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, cp, sm, cm, aHero, eHero);
    }
    
    public BoardClear(){
        super(null, null, null, null, null, null, 0, 0, 0, null, null);
    }
    public boolean checkWinConditions() {//checks all enemy minions have been removed
        for(int i = 0; i < 7; i++){
            if(!this.enemyFieldCards[i].name.equals("empty")){
                return false;
            }
        }
        return true;
    }
}