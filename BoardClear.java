package hearthstone;

public class BoardClear extends Puzzles {

    public BoardClear(Card[] d, Card[] ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, sm, cm, aHero, eHero);
    }

    public boolean checkWinCondition() {//checks all enemy minions have been removed
        for(int i = 0; i < 7; i++){
            if(!enemyFieldCards[i].name.equals("empty")){
                return false;
            }
        }
        return true;
    }
}
