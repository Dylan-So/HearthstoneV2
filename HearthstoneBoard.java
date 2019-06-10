package hearthstone;

public class HearthstoneBoard {

    Card deck[];
    Card enemyDeck[];
    Card hand[] = new Card[10];
    Card enemyHand[] = new Card[10];
    Card fieldCards[] = new Card[7];
    Card enemyFieldCards[] = new Card[7];
    int startMana;
    int currentMana;
    Hero allyHero;
    Hero enemyHero;
    int cardsPlayed;

    public HearthstoneBoard() {

    }

    public void printGame() {
        String line = "________________________________________________________________________________________";
        String line2 = "><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><";
        String line3 = "****************************************************************************************";

        System.out.println(line3);
        System.out.print("Enemy Minions||");//15 chars
        for (int i = 0; i < 7; i++) {//print enemy card names
            if (this.enemyFieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else if (this.enemyFieldCards[i].name.length() > 6) {//print card name limit to 6 chars
                System.out.print(" " + this.enemyFieldCards[i].name.substring(0, 6) + " |");
            } else {//print card name
                System.out.print(" " + this.enemyFieldCards[i].name + "\t|");
            }
        }
        System.out.println("");

        System.out.print("               ||");//15 chars
        for (int i = 0; i < 7; i++) {//print enemy attack, hp
            if (this.enemyFieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else {//print enemy attack, hp
                System.out.print(" " + this.enemyFieldCards[i].attack + "ATK " + this.enemyFieldCards[i].hp + "HP\t|");
            }
        }
        System.out.println("");

        System.out.print("               ||");//15 chars
        for (int i = 0; i < 7; i++) {//print enemy conditions
            if (this.enemyFieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else {//print enemy conditions
                String arrConditions[] = this.enemyFieldCards[i].condition.split(",");
                for (int j = 0; j < arrConditions.length; j++) {//prints out every condition that the minion contains
                    System.out.print(arrConditions[j].charAt(0) + "/");
                }
                System.out.print("\t|");
            }
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println(line2);//divider between enemy and ally minions
        System.out.println("");

        System.out.print("Your Minions ||");//15 chars
        for (int i = 0; i < 7; i++) {//print ally card names
            if (this.fieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else if (this.fieldCards[i].name.length() > 6) {//print card name limit to 6 chars
                System.out.print(" " + this.fieldCards[i].name.substring(0, 6) + " |");
            } else {//print card name
                System.out.print(" " + this.fieldCards[i].name + "\t|");
            }
        }
        System.out.println("");

        System.out.print("               ||");//15 chars
        for (int i = 0; i < 7; i++) {//print ally attack, hp
            if (this.fieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else {//print enemy attack, hp
                System.out.print(" " + this.fieldCards[i].attack + "ATK " + this.fieldCards[i].hp + "HP\t|");
            }

        }
        System.out.println("");

        System.out.print("               ||");//15 chars
        for (int i = 0; i < 7; i++) {//print ally conditions
            if (this.fieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else {//print enemy conditions
                String arrConditions[] = this.fieldCards[i].condition.split(",");
                for (int j = 0; j < arrConditions.length; j++) {//prints out every condition that the minion contains
                    System.out.print(arrConditions[j].charAt(0) + "/");
                }
                System.out.print("\t|");
            }

        }
        System.out.println("\n" + line3);
        
        System.out.print("Your Hand    ||");//15 chars
        for (int i = 0; i < 10; i++) {//print ally card names
            if (this.hand[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else if (this.hand[i].name.length() > 6) {//print card name limit to 6 chars
                System.out.print(" " + this.hand[i].name.substring(0, 6) + " |");
            } else {//print card name
                System.out.print(" " + this.hand[i].name + "\t|");
            }
        }
        System.out.println("");
        
        System.out.print("               ||");//15 chars
        for (int i = 0; i < 10; i++) {//print cost of the card
            if (this.hand[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else {//print cost
                System.out.print(" " + this.hand[i].cost + " MANA\t|");
            }

        }
        System.out.println("");
        
        System.out.print("               ||");//15 chars
        for (int i = 0; i < 10; i++) {//print card attack, hp
            if (this.hand[i].name.equals("") || this.hand[i].condition.contains("Spell")) {//print empty card
                System.out.print("\t|");
            } else {//print card attack, hp
                System.out.print(" " + this.hand[i].attack + "ATK " + this.hand[i].hp + "HP\t|");
            }

        }
        System.out.println("");
        
        System.out.print("               ||");//15 chars
        for (int i = 0; i < 10; i++) {//print card conditions
            if (this.hand[i].name.equals("") || this.hand[i].condition.contains("Spell")) {//print empty card
                System.out.print("\t|");
            } else {//print enemy conditions
                String arrConditions[] = this.hand[i].condition.split(",");
                for (int j = 0; j < arrConditions.length; j++) {//prints out every condition that the minion contains
                    System.out.print(arrConditions[j].charAt(0) + "/");
                }
                System.out.print("\t|");
            }

        }
        System.out.println(line);
        System.out.println(line);
        
        

    }
}
