package hearthstone;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Hearthstone {

    static BoardClear bc1, bc2, bc3;
    static Mirror m1, m2, m3;
    static Survival s1, s2, s3;
    static Lethal l1, l2, l3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameDeck deck1 = new GameDeck("C:\\Users\\324616879\\Desktop\\cards.txt");
        //Deck deck = new Deck("C:\\Users\\Dylan\\Desktop\\cards1.txt");
        Card[] allCards = new Card[32];
        for (int i = 0; i < 32; i++) {
            allCards[i] = new Card();
        }
        boolean win = false;
        int optionAns = 0;
        System.out.println("-------------Welcome to the Hearthstone Puzzle Game-------------");
        while (optionAns != 3 || !win) {
            char playerAns = 0;
            if (playerAns == 'E' || playerAns == 0) {
                playerAns = 1;
                System.out.println("Choose from the 3 options (Enter the Number)");
                System.out.println("1. Play Puzzles");
                System.out.println("2. Collections");
                System.out.println("3. Quit Game");
                System.out.println("");
                optionAns = sc.nextInt();
                while (optionAns < 1 || optionAns > 3) {
                    System.out.println("Please enter a valid option: ");
                    optionAns = sc.nextInt();
                }
                if (optionAns == 1) {
                    System.out.println("Please select a puzzle you want to play");
                    System.out.println("1. Board Clear");
                    System.out.println("2. Lethal");
                    System.out.println("3. Survival");
                    System.out.println("4. Mirror");
                    int puzzleAns = sc.nextInt();
                    if (puzzleAns == 1) {
                        GameDeck playerDeck = new GameDeck("C:\\Users\\Steve Nhan\\Documents\\NetBeansProjects\\Hearthstone\\src\\hearthstone\\boardClearCards.txt");
                        createPuzzle("Board Clear");
                        while (!bc1.checkWin(0)) {
                            bc1.checkDeaths(0);
                            bc1.printGame();
                            playerAns = sc.next().charAt(0);
                            if (playerAns == 'A') {
                                bc1.attackAction();
                                bc1.checkDeaths(0);
                            } else if (playerAns == 'P') {
                                bc1.cardAction();
                                bc1.checkDeaths(0);
                            } else if (playerAns == 'R') {
                                createPuzzle("Board Clear");
                            } else if (playerAns == 'H') {
                                bc1.heroPowerAction();
                            } else {
                                System.out.println("....Leaving the game!");
                                System.out.println("");
                                playerAns = 0;
                                break;
                            }
                            bc1.checkDeaths(0);
                        }
                        System.out.println("You completed Level 1!");
                        System.out.println("Would you like to move on to Level 2? (Enter N to quit)");
                        if (sc.next().charAt(0) == 'N') {
                            break;
                        }
                        while (!bc2.checkWin(0)) {
                            bc2.checkDeaths(0);
                            bc2.printGame();
                            playerAns = sc.next().charAt(0);
                            if (playerAns == 'A') {
                                bc2.attackAction();
                                bc2.checkDeaths(0);
                            } else if (playerAns == 'P') {
                                bc2.cardAction();
                                bc2.checkDeaths(0);
                            } else if (playerAns == 'R') {
                                createPuzzle("Board Clear");
                            } else if (playerAns == 'H') {
                                bc2.heroPowerAction();
                            } else {
                                System.out.println("....Leaving the game!");
                                System.out.println("");
                                playerAns = 0;
                                break;
                            }
                            bc2.checkDeaths(0);
                        }
                        System.out.println("You completed Level 2!");
                        System.out.println("Would you like to move on to Level 3? (Enter N to quit)");
                        if (sc.next().charAt(0) == 'N') {
                            break;
                        }
                    } else if (puzzleAns == 2) {
                        createPuzzle("Lethal");
                        while (!l1.checkWin(l1.enemyHero)) {
                            l1.checkDeaths(0);
                            l1.printGame();
                            playerAns = sc.next().charAt(0);
                            if (playerAns == 'A') {
                                l1.attackAction();
                                l1.checkDeaths(0);
                            } else if (playerAns == 'P') {
                                l1.cardAction();
                                l1.checkDeaths(0);
                            } else if (playerAns == 'R') {
                                createPuzzle("Lethal");
                            } else if (playerAns == 'H') {
                                l1.heroPowerAction();
                            } else {
                                System.out.println("....Leaving the game!");
                                System.out.println("");
                                playerAns = 0;
                                break;
                            }
                            l1.checkDeaths(0);
                        }
                        System.out.println("You completed Level 1!");
                        System.out.println("Would you like to move on to Level 2? (Enter N to quit)");
                        if (sc.next().charAt(0) == 'N') {
                            break;
                        }
                    } else if (puzzleAns == 2) {
                        createPuzzle("Lethal");
                        while (!l1.checkWin(l1.enemyHero)) {
                            l1.checkDeaths(0);
                            l1.printGame();
                            playerAns = sc.next().charAt(0);
                            if (playerAns == 'A') {
                                l1.attackAction();
                                l1.checkDeaths(0);
                            } else if (playerAns == 'P') {
                                l1.cardAction();
                                l1.checkDeaths(0);
                            } else if (playerAns == 'R') {
                                createPuzzle("Lethal");
                            } else if (playerAns == 'H') {
                                l1.heroPowerAction();
                            } else {
                                System.out.println("....Leaving the game!");
                                System.out.println("");
                                playerAns = 0;
                                break;
                            }
                            l1.checkDeaths(0);
                        }
                        System.out.println("You completed Level 1!");
                        System.out.println("Would you like to move on to Level 2? (Enter N to quit)");
                        if (sc.next().charAt(0) == 'N') {
                            break;
                        } else if (puzzleAns == 3) {
                            createPuzzle("Survival");
                            while (!s1.checkWin(s1.allyHero)) {
                                s1.checkDeaths(0);
                                s1.printGame();
                                playerAns = sc.next().charAt(0);
                                if (playerAns == 'A') {
                                    s1.attackAction();
                                    s1.checkDeaths(0);
                                } else if (playerAns == 'P') {
                                    s1.cardAction();
                                    s1.checkDeaths(0);
                                } else if (playerAns == 'R') {
                                    createPuzzle("Survival");
                                } else if (playerAns == 'H') {
                                    s1.heroPowerAction();
                                } else {
                                    System.out.println("....Leaving the game!");
                                    System.out.println("");
                                    playerAns = 0;
                                    break;
                                }
                                s1.checkDeaths(0);
                            }
                            System.out.println("You completed Level 1!");
                            System.out.println("Would you like to move on to Level 2? (Enter N to quit)");
                            if (sc.next().charAt(0) == 'N') {
                                break;
                            }
                        }
                    } else if (optionAns == 2) {
                        //search(deck.card);
                        //cardStats(deck.card[1]);
                    } else {
                        break;
                    }
                }
            }
            System.out.println("You chose to quit the game!");
        }
    }

    public static void cardStats(Card c1) {
        System.out.println("Name: " + c1.getName());
        System.out.println("Health: " + c1.getHp());
        System.out.println("Attack: " + c1.getAttack());
        System.out.println("Cost: " + c1.getCost());
        System.out.println("Conditions: " + c1.getCondition());
    }

    public static void createPuzzle(String puzzleType) {
        if (puzzleType.equals("Board Clear")) {
            GameDeck playerDeck = new GameDeck("C:\\Users\\Steve Nhan\\Documents\\NetBeansProjects\\Hearthstone\\src\\hearthstone\\boardClearCards.txt");
            ArrayList<Card> deck = new ArrayList<>();
            ArrayList<Card> enemyDeck = new ArrayList<>();
            Card[] eField = new Card[7];
            Card[] fField = new Card[7];
            for (int i = 0; i < 7; i++) {
                eField[i] = new Card();
                fField[i] = new Card();
            }
            eField[0] = playerDeck.getCard(0);
            eField[1] = playerDeck.getCard(1);
            eField[0].setFirstTurn(false);
            eField[1].setFirstTurn(false);
            Card[] playerHand1 = new Card[10];
            for (int i = 0; i < 10; i++) {
                playerHand1[i] = new Card();
            }
            playerHand1[0] = playerDeck.getCard(2);
            playerHand1[1] = playerDeck.getCard(3);
            Hero playerHero = new Hero("Warrior", 0, 0, 30, 2);
            Hero enemyHero = new Hero("Dexter the Dendrologist", 0, 0, 0, 0);
            bc1 = new BoardClear(deck, enemyDeck, playerHand1, null, fField, eField, 0, 4, 4, playerHero, enemyHero);
            Card[] playerHand2 = new Card[10];
            for (int i = 0; i < 10; i++) {
                playerHand2[i] = new Card();
            }
            Card[] eField2 = new Card[7];
            Card[] fField2 = new Card[7];
            for (int i = 0; i < 7; i++) {
                eField2[i] = new Card();
                fField2[i] = new Card();
            }
            Hero playerHero2 = new Hero("Priest", 0, 0, 30, 2);
            playerHand2[0] = playerDeck.getCard(4);
            playerHand2[1] = playerDeck.getCard(6);
            playerHand2[2] = playerDeck.getCard(7);
            eField2[0] = playerDeck.getCard(5);
            eField2[1] = new Card("Rat Pack", 2, 2, 2, 3, "Deathrattle");
            playerHero2 = new Hero("Priest", 0, 0, 30, 2);
            bc2 = new BoardClear(deck, enemyDeck, playerHand2, null, fField2, eField2, 0, 8, 8, playerHero2, enemyHero);
            Card[] playerHand3 = new Card[10];
            for (int i = 0; i < 10; i++) {
                playerHand3[i] = new Card();
            }
            Card[] eField3 = new Card[7];
            Card[] fField3 = new Card[7];
            for (int i = 0; i < 7; i++) {
                eField3[i] = new Card();
                fField3[i] = new Card();
            }
            Hero playerHero3 = new Hero("Priest", 0, 0, 30, 2);
            playerHand3[0] = playerDeck.getCard(8);
            playerHand3[1] = playerDeck.getCard(8);
            playerHand3[2] = playerDeck.getCard(10);
            eField3[0] = new Card("Swamp King Dred", 9, 9, 9, 7, "Special3");
            fField3[0] = new Card("Gilded Gargoyle", 2, 1, 1, 3, "Deathrattle");
            fField3[1] = new Card("Gilded Gargoyle", 2, 1, 1, 3, "Deathrattle");
            bc3 = new BoardClear(deck, enemyDeck, playerHand3, null, fField3, eField3, 0, 2, 2, playerHero3, enemyHero);
        } else if (puzzleType.equals("Mirror")) {
            GameDeck playerDeck = new GameDeck("C:\\Users\\Steve Nhan\\Documents\\NetBeansProjects\\Hearthstone\\src\\hearthstone\\mirrorCards.txt");
            ArrayList<Card> deck = new ArrayList<>();
            ArrayList<Card> enemyDeck = new ArrayList<>();
            Card[] eField = new Card[7];
            Card[] fField = new Card[7];
            for (int i = 0; i < 7; i++) {
                eField[i] = new Card();
                fField[i] = new Card();
            }
            eField[0] = playerDeck.getCard(0);
            eField[1] = playerDeck.getCard(1);
            eField[0].setFirstTurn(false);
            eField[1].setFirstTurn(false);
            Card[] playerHand1 = new Card[10];
            for (int i = 0; i < 10; i++) {
                playerHand1[i] = new Card();
            }
            playerHand1[0] = playerDeck.getCard(0);
            playerHand1[1] = playerDeck.getCard(1);
            Hero playerHero = new Hero("Priest", 0, 0, 30, 2);
            Hero enemyHero = new Hero("Dexter the Dendrologist", 0, 0, 30, 0);
            m1 = new Mirror(deck, enemyDeck, playerHand1, null, fField, eField, 0, 4, 4, playerHero, enemyHero);
        } else if (puzzleType.equals("Survival")) {
            GameDeck playerDeck = new GameDeck("C:\\Users\\Steve Nhan\\Documents\\NetBeansProjects\\Hearthstone\\src\\hearthstone\\mirrorCards.txt");
            ArrayList<Card> deck = new ArrayList<>();
            ArrayList<Card> enemyDeck = new ArrayList<>();
            Card[] eField = new Card[7];
            Card[] fField = new Card[7];
            for (int i = 0; i < 7; i++) {
                eField[i] = new Card();
                fField[i] = new Card();
            }
            eField[0] = playerDeck.getCard(0);
            eField[1] = playerDeck.getCard(1);
            eField[0].setFirstTurn(false);
            eField[1].setFirstTurn(false);
            Card[] playerHand1 = new Card[10];
            for (int i = 0; i < 10; i++) {
                playerHand1[i] = new Card();
            }
            playerHand1[0] = playerDeck.getCard(0);
            playerHand1[1] = playerDeck.getCard(1);
            Hero playerHero = new Hero("Priest", 0, 0, 30, 2);
            Hero enemyHero = new Hero("Boomnician Breena", 0, 0, 0, 0);
            s1 = new Survival(deck, enemyDeck, playerHand1, null, fField, eField, 0, 4, 4, playerHero, enemyHero);
        } else if (puzzleType.equals("Lethal")) {
            //deck
            GameDeck playerDeck = new GameDeck("C:\\Users\\Steve Nhan\\Documents\\NetBeansProjects\\Hearthstone\\src\\hearthstone\\lethalCards.txt");
            ArrayList<Card> deck = new ArrayList<>();
            ArrayList<Card> enemyDeck = new ArrayList<>();

            //field
            Card[] eField = new Card[7];
            Card[] fField = new Card[7];
            for (int i = 0; i < 7; i++) {
                eField[i] = new Card();
                fField[i] = new Card();
            }
            fField[0] = playerDeck.getCard(2);
            fField[0].setFirstTurn(false);

            //hand
            Card[] playerHand1 = new Card[10];
            for (int i = 0; i < 10; i++) {
                playerHand1[i] = new Card();
            }
            playerHand1[0] = playerDeck.getCard(0);
            playerHand1[1] = playerDeck.getCard(1);

            //heroes
            Hero playerHero = new Hero("Rogue", 0, 0, 30, 2);
            Hero enemyHero = new Hero("Dexter the Dendrologist", 0, 0, 9, 0);

            //board
            l1 = new Lethal(deck, enemyDeck, playerHand1, null, fField, eField, 0, 4, 4, playerHero, enemyHero);
        }
    }

    public static void search(Card[] a1) {
        for (int i = 1; i < 32; i++) {
            int key = a1[i].attack;
            int j = i - 1;
            while (j >= 0 && a1[j].attack > key) {
                a1[j + 1].setAttack((a1[j].getAttack()));
                j = j - 1;
            }
            a1[j + 1].attack = key;
        }
        for (int i = 0; i < 32; i++) {
            System.out.println(a1[i].getAttack());
        }
    }
}
