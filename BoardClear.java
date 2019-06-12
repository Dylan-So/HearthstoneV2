package hearthstone;

import java.util.ArrayList;

public class BoardClear extends Puzzles {

    public BoardClear(ArrayList<Card> d, ArrayList<Card> ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int cp, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, cp, sm, cm, aHero, eHero);
    }

    public BoardClear() {
        super(new ArrayList<>(), new ArrayList<>(), null, null, null, null, 0, 0, 0, null, null);
    }

    public boolean checkWin(int index) {//checks all minions have been removed
        boolean check = true;
        if (index < 7 && check == true) {
            if ( !this.enemyFieldCards[index].name.equals("") || !this.fieldCards[index].name.equals("")) {
                check = false;
            } else {
                checkWin(index + 1);
            }
        }
        return check;
    }
}

