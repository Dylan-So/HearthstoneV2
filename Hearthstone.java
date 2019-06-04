package hearthstone;

public class Hearthstone{

    public static void main(String[] args) {
        Puzzles[] boardClearLvls = new BoardClear[7];
        Puzzles[] lethalLvls = new Lethal[7];
        Puzzles[] survivalLvls = new Survival[7];
        Puzzles[] mirrorLvls = new Mirror[7];
        gameDeck deck = new gameDeck("C:\\Users\\324616879\\Desktop\\cards.txt");
        for(int i = 0; i < 7; i++){
            boardClearLvls[i] = new BoardClear();
            lethalLvls[i] = new Lethal();
            survivalLvls[i] = new Survival();
            mirrorLvls[i] = new Mirror();
        }
        
        
        System.out.println(deck.card.size());
        System.out.println(deck.card.get(0).getName());
        System.out.println(deck.card.get(0).getHp());
        System.out.println(deck.card.get(0).getAttack());
        System.out.println(deck.card.get(0).getCondition());
        System.out.println(deck.card.get(1).getName());
        System.out.println(deck.card.get(1).getHp());
        System.out.println(deck.card.get(1).getAttack());
        System.out.println(deck.card.get(1).getCondition());
        System.out.println(deck.card.get(2).getName());
        System.out.println(deck.card.get(2).getHp());
        System.out.println(deck.card.get(2).getAttack());
        System.out.println(deck.card.get(2).getCondition());
    }
}
