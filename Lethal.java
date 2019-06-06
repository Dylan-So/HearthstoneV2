package hearthstone;

public class Lethal extends Puzzles {

    public Lethal(Card[] d, Card[] ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, sm, cm, aHero, eHero);
    }

    public boolean checkWinCondition() {//checks enemies health is < 0
        if (enemyHero.health > 0) {
            return true;
        } else {
            return false;
        }
    }
}
