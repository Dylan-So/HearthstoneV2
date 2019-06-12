package hearthstone;

import java.util.ArrayList;

public class Mirror extends Puzzles {

    public Mirror(ArrayList<Card> d, ArrayList<Card> ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int cp, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, cp, sm, cm, aHero, eHero);
    }

    public Mirror() {
        super(null, null, null, null, null, null, 0, 0, 0, null, null);
    }

    
    
     public boolean checkWin() {//checks enemies board matches your board
         boolean check = true;
        //compares every minion
        for (int i = 0; i < 7; i++) {
            
            if (logicalXOR(this.enemyFieldCards[i], this.fieldCards[i])) {//checks if only one minion is null
                check = false;
            }

            if (this.enemyFieldCards[i] != null && this.fieldCards[i] != null) {
                //compares that it is same minion
                if (!this.enemyFieldCards[i].name.equals(this.fieldCards[i].name)) {
                    check = false;

                    //compares that it is the same health
                } else if (this.enemyFieldCards[i].hp != this.fieldCards[i].hp) {
                    check = false;

                    //compares that it is the same attack
                } else if (this.enemyFieldCards[i].attack != this.fieldCards[i].attack) {
                    check = false;
                }
            }

        }
        //if everything matches
        return check;
    }
     
     public boolean logicalXOR(Card enemyMinion, Card allyMinion) {//returns the XOR operation if only one card is null
        boolean eM, aM;
        if (enemyMinion == null) {
            eM = true;
        } else {
            eM = false;
        }

        if (allyMinion == null) {
            aM = true;
        } else {
            aM = false;
        }
        return ((aM || eM) && !(aM && eM));
     }
}
