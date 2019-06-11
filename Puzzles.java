package hearthstone;

import java.util.ArrayList;
import java.util.Scanner;

abstract public class Puzzles{

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

    public Puzzles(ArrayList<Card> d, ArrayList<Card> ed, Card[] h, Card[] eh, Card[] fc, Card[] efc, int cp, int sm, int cm, Hero aHero, Hero eHero){
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
        deck =  new ArrayList<Card>();
        enemyDeck = new ArrayList<Card>();
        for(int i = 0; i < 10; i++){
            hand[i] = new Card();
            enemyHand[i] = new Card();
        }
        for(int i = 0; i < 7; i++){
            fieldCards[i] = new Card();
            enemyFieldCards[i] = new Card();
        }
        cardsPlayed = 0;
        startMana = 0;
        currentMana = 0;
        allyHero = new Hero();
        enemyHero = new Hero();
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
        System.out.println("Choose your action: \"A\" - Attack | \"P\" - Play Card | \"R\" - Restart | \"E\" - Exit");
        System.out.println(line);

    }

    public void attackAction() {
        Scanner scInt = new Scanner(System.in);

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

        this.fieldCards[choice1].attack(this.enemyFieldCards[choice2]);//issue for dylan to deal with

    }

    public void cardAction() {
        Scanner scInt = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {//prints each avaliable card that can be played
            if (!this.hand[i].name.equals("")) {
                if (this.hand[i].cost <= this.currentMana) {
                    System.out.println("[" + i + "] - " + this.hand[i].name + "(" + this.hand[i].cost + " mana)");
                }
            }
        }

        System.out.println("Choose the card to be played");
        int choice1 = scInt.nextInt();//selects the card
        System.out.println("");

        if (!this.hand[choice1].condition.contains("Spell")) {//if the card is a minion card
            boolean check = false;
            for (int i = 0; i < 7; i++) {//checks if there is room on the field to play a minion
                if (this.fieldCards[i].name.equals("")) {
                    check = true;
                }
            }
            if (check) {
                System.out.println("Choose where to play the minion (1-7)");
                int choice2 = scInt.nextInt();//selects the position to place the minion
                System.out.println("");
                
                //////////////////place down minion method
            }
        } else {//if th card is a spell card
            //////////////////play spell card method
        }

    }

}
