package hearthstone;

import java.util.ArrayList;
import java.util.Scanner;

abstract public class Puzzles {

    ArrayList<Card> deck;
    ArrayList<Card> enemyDeck;
    Card hand[] = new Card[10];
    Card enemyHand[] = new Card[10];
    Card fieldCards[] = new Card[7];
    Card enemyFieldCards[] = new Card[7];
    int startMana;
    int currentMana;
    Hero allyHero;
    Hero enemyHero;
    int cardsPlayed;

    public Puzzles(ArrayList<Card> d, ArrayList<Card> ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int cp, int sm, int cm, Hero aHero, Hero eHero) {
        deck = new ArrayList<Card>(d);
        enemyDeck = new ArrayList<Card>(ed);
        hand = h;
        enemyHand = eh;
        fieldCards = fc;
        enemyFieldCards = efc;
        cardsPlayed = cp;
        startMana = sm;
        currentMana = cm;
        allyHero = aHero;
        enemyHero = eHero;
    }

    public Puzzles() {
        deck = new ArrayList<Card>();
        enemyDeck = new ArrayList<Card>();
        for (int i = 0; i < 10; i++) {
            hand[i] = new Card();
            enemyHand[i] = new Card();
        }
        for (int i = 0; i < 7; i++) {
            fieldCards[i] = new Card();
            enemyFieldCards[i] = new Card();
        }
        cardsPlayed = 0;
        startMana = 0;
        currentMana = 0;
        allyHero = new Hero();
        enemyHero = new Hero();
    }

    public void checkDeaths(int index) {
        if (index == 7) {

        } else {
            if (this.fieldCards[index].hp <= 0) {
                this.fieldCards[index].name = "";
                this.fieldCards[index].hp = 0;
                this.fieldCards[index].attack = 0;
                this.fieldCards[index].condition = "";
                this.fieldCards[index].cost = 0;
                checkDeaths(index + 1);
            }
            if (this.enemyFieldCards[index].hp <= 0) {
                this.enemyFieldCards[index].name = "";
                this.enemyFieldCards[index].hp = 0;
                this.enemyFieldCards[index].attack = 0;
                this.enemyFieldCards[index].condition = "";
                this.enemyFieldCards[index].cost = 0;
                checkDeaths(index + 1);
            }
        }
    }

    public void printGame() {
        String line = "_____________________________________________________________________________________________________";
        String line2 = "><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><";
        String line3 = "****************************************************************************************************";

        System.out.println(line3);
        System.out.print("Enemy Minions ||");//15 chars
        for (int i = 0; i < 7; i++) {//print enemy card names
            if (this.enemyFieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else if (this.enemyFieldCards[i].name.length() > 6) {//print card name limit to 5 chars
                System.out.print(" " + this.enemyFieldCards[i].name.substring(0, 5) + "\t|");
            } else {//print card name
                System.out.print(" " + this.enemyFieldCards[i].name + "\t|");
            }
        }
        System.out.println("");

        System.out.print("              ||");//15 chars
        for (int i = 0; i < 7; i++) {//print enemy attack, hp
            if (this.enemyFieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else {//print enemy attack, hp
                System.out.print(" " + this.enemyFieldCards[i].attack + "A " + this.enemyFieldCards[i].hp + "H\t|");
            }
        }
        System.out.println("");

        System.out.print("              ||");//15 chars
        for (int i = 0; i < 7; i++) {//print enemy conditions
            if (this.enemyFieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else {//print enemy conditions
                if (this.enemyFieldCards[i].condition.equals("N/A")) {
                    System.out.print("\t  |");
                } else {
                    String arrConditions[] = this.enemyFieldCards[i].condition.split(",");
                    for (int j = 0; j < arrConditions.length; j++) {//prints out every condition that the minion contains
                        System.out.print(" " + arrConditions[j].charAt(0) + "/");
                    }
                    System.out.print("\t|");
                }
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println(line2);//divider between enemy and ally minions
        System.out.println("");

        System.out.print("Your Minions  ||");//15 chars
        for (int i = 0; i < 7; i++) {//print ally card names
            if (this.fieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else if (this.fieldCards[i].name.length() > 6) {//print card name limit to 5 chars
                System.out.print(" " + this.fieldCards[i].name.substring(0, 5) + " |");
            } else {//print card name
                System.out.print(" " + this.fieldCards[i].name + "\t|");
            }
        }
        System.out.println("");

        System.out.print("              ||");//15 chars
        for (int i = 0; i < 7; i++) {//print ally attack, hp
            if (this.fieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else {//print enemy attack, hp
                System.out.print(" " + this.fieldCards[i].attack + "A " + this.fieldCards[i].hp + "H\t|");
            }

        }
        System.out.println("");

        System.out.print("              ||");//15 chars
        for (int i = 0; i < 7; i++) {//print ally conditions
            if (this.fieldCards[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else {//print enemy conditions
                String arrConditions[] = this.fieldCards[i].condition.split(",");
                for (int j = 0; j < arrConditions.length; j++) {//prints out every condition that the minion contains
                    System.out.print(" " + arrConditions[j].charAt(0) + "/");
                }
                System.out.print("\t|");
            }

        }
        System.out.println("\n" + line2);

        System.out.print("Your Hand     ||");//15 chars
        for (int i = 0; i < 10; i++) {//print ally card names
            if (this.hand[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else if (this.hand[i].name.length() > 6) {//print card name limit to 5 chars
                System.out.print(" " + this.hand[i].name.substring(0, 5) + "\t|");
            } else {//print card name
                System.out.print(" " + this.hand[i].name + "");
            }
        }
        System.out.println("");

        System.out.print("              ||");//15 chars
        for (int i = 0; i < 10; i++) {//print cost of the card
            if (this.hand[i].name.equals("")) {//print empty card
                System.out.print("\t|");
            } else {//print cost
                System.out.print(" " + this.hand[i].cost + "Mana\t|");
            }

        }
        System.out.println("");

        System.out.print("              ||");//15 chars
        for (int i = 0; i < 10; i++) {//print card attack, hp
            if (this.hand[i].name.equals("") || this.hand[i].condition.contains("Spell")) {//print empty card
                System.out.print("\t|");
            } else {//print card attack, hp
                System.out.print(" " + this.hand[i].attack + "A " + this.hand[i].hp + "H\t|");
            }

        }
        System.out.println("");
        System.out.print("              ||");//15 chars

        for (int i = 0; i < 10; i++) {//print card conditions
            if (this.hand[i].name.equals("") || this.hand[i].condition.contains("Spell")) {//print empty card
                System.out.print("\t|");
            } else {//print enemy conditions
                String arrConditions[] = this.hand[i].condition.split(",");
                for (int j = 0; j < arrConditions.length; j++) {//prints out every condition that the minion contains
                    System.out.print(" " + arrConditions[j].charAt(0) + "/");
                }
                System.out.print("\t|");
            }

        }
        System.out.println("");
        System.out.println(line);
        System.out.println("YOUR MANA: " + this.currentMana);
        System.out.print("Choose your action: \"A\" - Attack | \"P\" - Play Card | \"R\" - Restart | \"E\" - Exit :\t");

    }

    public void attackAction() {
        Scanner scInt = new Scanner(System.in);
        boolean emptyBoard = true;
        for (int i = 0; i < 7; i++) {
            if (!this.fieldCards[i].name.equals("")) {
                emptyBoard = false;
                break;
            }
        }
        if (emptyBoard) {
            emptyBoard = false;
            System.out.println("You can't attack without any cards on the field (Press any button to continue)");
            scInt.next();
        } else {
            for (int i = 0; i < 7; i++) {//prints each avaliable minion that can attack
                if (!this.fieldCards[i].name.equals("")) {
                    if (!this.fieldCards[i].firstTurn) {
                        System.out.println("[" + i + "] - " + this.fieldCards[i].name);
                    }
                }
            }

            System.out.println("Choose a minion to attack with");
            int choice1 = scInt.nextInt();//selects the minion to attack with
            System.out.println("");

            for (int i = 0; i < 7; i++) {//prints each avaliable enemy minion
                if (!this.fieldCards[i].name.equals("")) {
                    System.out.println("[" + i + "] - " + this.enemyFieldCards[i].name);
                }
            }

            System.out.println("Choose the minion to attack");
            int choice2 = scInt.nextInt();//selects the minion to be attacked
            System.out.println("");

            attack(this.fieldCards[choice1 - 1], this.enemyFieldCards[choice2]);//issue for dylan to deal with
        }

    }

    public void cardAction() {
        Scanner scInt = new Scanner(System.in);
        
        System.out.println("");
        for (int i = 0; i < 10; i++) {//prints each avaliable card that can be played
            if (!this.hand[i].name.equals("")) {
                if (this.hand[i].cost <= this.currentMana) {
                    System.out.println("[" + i + "] - " + this.hand[i].name + "(" + this.hand[i].cost + " mana)");
                }
            }
        }

        System.out.print("Choose the card to be played:");
        int choice1 = scInt.nextInt();//selects the card
        System.out.println("");

        if (!this.hand[choice1].condition.contains("Spell")) {//if the card is a minion card
            boolean check = false;
            for (int i = 0; i < 7; i++) {//checks if there is room on the field to play a minion
                if (this.fieldCards[i].name.equals("")) {
                    check = true;
                }
            }

            if (this.hand[choice1].condition.contains("Battlecry")) {//for battlecry minions

                if (this.hand[choice1].name.equals("Elven Archer")) {
                    for (int i = 0; i < 7; i++) {//prints each avaliable enemy minion
                        if (!this.fieldCards[i].name.equals("")) {
                            System.out.println("[" + i + "] - " + this.enemyFieldCards[i].name);
                        }
                    }
                    System.out.print("Choose the minion to attack:");
                    int attackChoice = scInt.nextInt();//selects the minion to be attacked
                    System.out.println("");
                    this.enemyFieldCards[attackChoice].hp -= 1;
                }
            }

            if (check) {
                System.out.print("Choose where to play the minion (1-7):");
                int choice2 = scInt.nextInt();//selects the position to place the minion
                while (!this.fieldCards[choice2 - 1].name.equals("")) {
                    System.out.println("There is already a card here, please choose a different position: ");
                    choice2 = scInt.nextInt();
                }
                this.fieldCards[choice2 - 1] = this.hand[choice1];

                //////////////////place down minion method
            }
            if (this.hand[choice1].condition.equals("Rush") || this.hand[choice1].condition.equals("Charge")) {
                this.hand[choice1].firstTurn = false;
            }
        } else {//if th card is a spell card
            switch (this.hand[choice1].getName()) {
                case "Holy Nova":
                    for (int i = 0; i < 7; i++) {
                        if (!this.enemyFieldCards[i].name.equals("")) {
                            this.enemyFieldCards[i].hp -= 2;
                            this.enemyHero.hp -= 2;
                        }
                        if (!this.fieldCards[i].name.equals("")) {
                            if (this.fieldCards[i].hp + 2 > this.fieldCards[i].maxHP) {
                                this.fieldCards[i].hp = this.fieldCards[i].maxHP;
                            } else {
                                this.fieldCards[i].hp += 2;
                            }
                        }
                    }
                    if (this.allyHero.hp + 2 > 30) {
                        this.allyHero.hp = 30;
                    } else {
                        this.allyHero.hp += 2;
                    }
                    break;

                case "Spirit Lash":
                    int healCounter = 0;
                    for (int i = 0; i < 7; i++) {
                        if (!this.enemyFieldCards[i].name.equals("")) {
                            this.enemyFieldCards[i].hp -= 1;
                            healCounter += 1;
                        }
                    }
                    if (this.allyHero.hp + healCounter > 30) {
                        this.allyHero.hp = 30;
                    } else {
                        this.allyHero.hp += healCounter;
                    }
                    break;

                case "The Coin":
                    this.currentMana += 1;
                    break;
                    
                default:
                    break;
            }
            
        }
        
        this.currentMana -= this.hand[choice1].cost;//subtracts the mana
                this.hand[choice1] = new Card();//empties the hand
                System.out.println("");

    }

    public void attack(Card e1, Card e2) {
        if ((e2.hp -= e1.attack) <= 0 && (e1.hp -= e1.attack) <= 0) {
            System.out.println("You attacked this card and both of you died.");
            e2.setAttack(0);
            e2.setHp(0);
            e2.setName("");
            e1.setAttack(0);
            e1.setHp(0);
            e1.setName("");
            if (e2.condition.equals("Deathrattle")) {
                switch (e2.getName()) {
                    case "Infested Wolf":
                        Card spider = new Card("Spider", 1, 1, 1, 1, "N/A");
                        this.fieldCards[0] = spider;
                        this.fieldCards[1] = spider;

                    case "Rat Pack":
                        int counter = e2.attack;
                        Card rat = new Card("Rat", 1, 1, 1, 1, "N/A");
                        for (int i = 0; i < 7; i++) {
                            if (counter == 0) {
                                break;
                            } else if (!this.fieldCards[i].name.equals("")) {
                                this.fieldCards[i] = rat;
                                this.fieldCards[i] = rat;
                                counter -= 1;
                            }
                        }
                }
            }
            if (e1.condition.equals("Deathrattle")) {
                switch (e1.getName()) {
                    case "Infested Wolf":
                        Card spider = new Card("Spider", 1, 1, 1, 1, "N/A");
                        this.fieldCards[0] = spider;
                        this.fieldCards[1] = spider;

                    case "Rat Pack":
                        int counter = e2.attack;
                        Card rat = new Card("Rat", 1, 1, 1, 1, "N/A");
                        for (int i = 0; i < 7; i++) {
                            if (counter == 0) {
                                break;
                            } else if (!this.fieldCards[i].name.equals("")) {
                                this.fieldCards[i] = rat;
                                this.fieldCards[i] = rat;
                                counter -= 1;
                            }
                        }
                }
            }
        } else if ((e2.hp -= e1.attack) <= 0) {
            e2.hp -= e1.attack;
            e1.hp -= e2.attack;
            System.out.println("You killed this card. The health has been reduced to 0, " + e1.name + "'s hp is " + e1.getHp());
            e1.setName("");
            if (e2.condition.equals("Deathrattle")) {
                switch (e2.getName()) {
                    case "Infested Wolf":
                        Card spider = new Card("Spider", 1, 1, 1, 1, "N/A");
                        this.fieldCards[0] = spider;
                        this.fieldCards[1] = spider;

                    case "Rat Pack":
                        int counter = e2.attack;
                        Card rat = new Card("Rat", 1, 1, 1, 1, "N/A");
                        for (int i = 0; i < 7; i++) {
                            if (counter == 0) {
                                break;
                            } else if (!this.fieldCards[i].name.equals("")) {
                                this.fieldCards[i] = rat;
                                this.fieldCards[i] = rat;
                                counter -= 1;
                            }
                        }
                }
            }
        } else {
            e1.setHp(e1.hp - e2.getAttack());
            e2.setHp(e2.getHp() - e1.getAttack());
            System.out.println("You attacked this card, " + e1.name + "'s hp is " + e1.hp + ", " + e2.name + "'s hp is " + e2.hp);
            if (e2.condition.equals("Deathrattle")) {
                switch (e2.name) {
                    case "Infested Wolf":
                        Card spider = new Card("Spider", 1, 1, 1, 1, "N/A");
                        this.fieldCards[0] = spider;
                        this.fieldCards[1] = spider;

                    case "Rat Pack":
                        int counter = e2.attack;
                        Card rat = new Card("Rat", 1, 1, 1, 1, "N/A");
                        for (int i = 0; i < 7; i++) {
                            if (counter == 0) {
                                break;
                            } else if (!this.fieldCards[i].name.equals("")) {
                                this.fieldCards[i] = rat;
                                this.fieldCards[i] = rat;
                                counter -= 1;
                            }
                        }
                }
            }
            if (e1.condition.equals("Deathrattle")) {
                switch (e1.name) {
                    case "Infested Wolf":
                        Card spider = new Card("Spider", 1, 1, 1, 1, "N/A");
                        this.fieldCards[0] = spider;
                        this.fieldCards[1] = spider;

                    case "Rat Pack":
                        int counter = e2.attack;
                        Card rat = new Card("Rat", 1, 1, 1, 1, "N/A");
                        for (int i = 0; i < 7; i++) {
                            if (counter == 0) {
                                break;
                            } else if (!this.fieldCards[i].name.equals("")) {
                                this.fieldCards[i] = rat;
                                this.fieldCards[i] = rat;
                                counter -= 1;
                            }
                        }
                }
            }
        }
    }

}
