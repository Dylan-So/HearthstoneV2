package hearthstone;

public class Lethal extends Puzzles {
    public int numTurns;
    public Lethal(Card[] d, Card[] ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int sm, int cm, Hero aHero, Hero eHero) {
        super(d, ed, h, eh, fc, efc, sm, cm, aHero, eHero);
        numTurns = 0;
    }
    
    public Lethal(){
        super(null, null, null, null, null, null, 0, 0, null, null);
        numTurns = 0;
    }
    
    public boolean checkWin(Hero e1){
        if(!(this.numTurns > 1) && e1.hp <= 0){
            return true;
        }else{
            return false;
        }
    }

}
