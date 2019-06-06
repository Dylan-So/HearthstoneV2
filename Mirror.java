package hearthstone;

public class Mirror extends Puzzles {

    public Mirror(Card[] d, Card[] ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, sm, cm, aHero, eHero);
    }

    public boolean checkWinCondition() {//checks enemies board matches your board

        //compares every minion
        for (int i = 0; i < 7; i++) {

                //compares that it is same minion
            if (!enemyFieldCards[i].name.equals(fieldCards[i].name)) {
                return false;

                //compares that it is the same health
            } else if (enemyFieldCards[i].hp != fieldCards[i].hp) {
                return false;

                //compares that it is the same attack
            } else if (enemyFieldCards[i].attack != fieldCards[i].attack) {
                return false;
            }
            
        }
        //if everything matches
        return true;
    }

}
