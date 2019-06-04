package hearthstone;

public class HearthstoneBoard {

    Card deck[];
    Card enemyDeck[];
    Card hand[] = new Card [10];
    Card enemyHand[] = new Card [10];
    Card fieldCards[] = new Card [7];
    Card enemyFieldCards[] = new Card [7];
    int startMana;
    int currentMana;
    Hero allyHero;
    Hero enemyHero;

    public HearthstoneBoard() {

    }
}
