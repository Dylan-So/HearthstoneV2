package hearthstone;

public class Survival extends Puzzles {

    //constructor
    public Survival(Card[] d, Card[] ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, sm, cm, aHero, eHero);

    }

    public boolean checkWinCondition() {//checks if hero health is greater than zero

        if (this.allyHero.hp >= 30) {
            return true;

        } else {
            return false;
        }

    }
}
