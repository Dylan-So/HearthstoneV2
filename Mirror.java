package hearthstone;

public class Mirror extends Puzzles {

    public Mirror(Card[] d, Card[] ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, sm, cm, aHero, eHero);
    }

    public boolean checkWinCondition() {//checks enemies board matches your board

        //compares every minion
        for (int i = 0; i < 7; i++) {

            if (logicalXOR(this.efcard[i], this.fcard[i])) {//checks if only one minion is null
                return false;
            }

            if (this.efcard[i] != null && this.fcard[i] != null) {
                //compares that it is same minion
                if (!this.efcard[i].name.equals(this.fcard[i].name)) {
                    return false;

                    //compares that it is the same health
                } else if (this.efcard[i].hp != this.fcard[i].hp) {
                    return false;

                    //compares that it is the same attack
                } else if (this.efcard[i].attack != this.fcard[i].attack) {
                    return false;
                }
            }

        }
        //if everything matches
        return true;
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
