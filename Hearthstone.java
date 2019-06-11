package hearthstone;

import java.util.ArrayList;
import java.util.Scanner;

public class Hearthstone{
    static BoardClear bc1;
    static BoardClear bc2;
    static BoardClear bc3;
    public static void main(String[] args) {
        BoardClear lvl1 = new BoardClear();
        Scanner sc = new Scanner(System.in);
        GameDeck deck = new GameDeck("C:\\Users\\324616879\\Desktop\\cards.txt");
        boolean win = false;
        int optionAns = 0;
        System.out.println("-------------Welcome to the Hearthstone Puzzle Game-------------");
        while(optionAns != 3 || !win){
            char playerAns = 0;
            if(playerAns == 'E' || playerAns == 0){
                playerAns = 1;
                System.out.println("Choose from the 3 options (Enter the Number)");
                System.out.println("1. Play Puzzles");
                System.out.println("2. Collections");
                System.out.println("3. Quit Game");
                System.out.println("");
                optionAns = sc.nextInt();
                while(optionAns < 1 || optionAns > 3){
                    System.out.println("Please enter a valid option: ");
                    optionAns = sc.nextInt();
                }
                if(optionAns == 1){
                    System.out.println("Please select a puzzle you want to play");
                    System.out.println("1. Board Clear");
                    System.out.println("2. Lethal");
                    System.out.println("3. Survival");
                    System.out.println("4. Mirror");
                    int puzzleAns = sc.nextInt();
                    if(puzzleAns == 1){
                        //GameDeck playerDeck = new GameDeck("C:\\Users\\324616879\\Desktop\\boardClearCards.txt");
                        createPuzzle("Board Clear");
                        bc1.printGame();
                        playerAns = sc.next().charAt(0);
                        if(playerAns == 'A'){
                            boolean emptyBoard = true;
                            for(int i = 0; i < 7; i++){
                                if(!bc1.fieldCards[i].name .equals("")){
                                    emptyBoard = false;
                                    break;
                                }
                            }
                            if(emptyBoard){
                                System.out.println("You can't attack without any cards on the field");
                            }
                        }else if(playerAns == 'P'){

                        }else if(playerAns == 'R'){
                            createPuzzle("Board Clear");
                        }else{
                            System.out.println("....Leaving the game!");
                            System.out.println("");
                        }
                    }else if(puzzleAns == 2){
                        Puzzles[] lethalLvls = new Lethal[3];
                        for(int i = 0; i < 3; i++){
                            lethalLvls[i] = new Lethal();
                        }

                    }else if(puzzleAns == 3){
                        Puzzles[] survivalLvls = new Survival[3];
                        for(int i = 0; i < 3; i++){
                            survivalLvls[i] = new Survival();
                        }
                    }else{
                        Puzzles[] mirrorLvls = new Mirror[3];
                        for(int i = 0; i < 3; i++){
                            mirrorLvls[i] = new Mirror();
                        }
                    }
                }else if(optionAns == 2){

                }else{
                    break;
                }
            }
            }
            System.out.println("You chose to quit the game!");
        }

        public static void cardStats(Card c1){
            System.out.println("Name: " + c1.getName());
            System.out.println("Health: " + c1.getHp());
            System.out.println("Attack: " + c1.getAttack());
            System.out.println("Cost: " + c1.getCost());
            System.out.println("Conditions: " + c1.getCondition());
        }

        public static void createPuzzle(String puzzleType){
            if(puzzleType.equals("Board Clear")){
                GameDeck playerDeck = new GameDeck("C:\\Users\\Dylan\\Desktop\\boardClearCards.txt");
                ArrayList<Card> deck = new ArrayList<>();
                ArrayList<Card> enemyDeck = new ArrayList<>();
                Card[] eField = new Card[7];
                Card[] fField = new Card[7];
                for(int i = 0; i < 7; i++){
                    eField[i] = new Card();
                    fField[i] = new Card();
                }
                eField[0] = playerDeck.getCard(0);
                eField[1] = playerDeck.getCard(1);
                eField[0].firstTurn = false;
                eField[1].firstTurn = false;
                Puzzles[] boardClearLvls = new BoardClear[3];
                Card[] playerHand1 = new Card[10];
                for(int i = 0; i < 10; i++){
                    playerHand1[i] = new Card();
                }
                playerHand1[0] = playerDeck.getCard(2);
                playerHand1[1] = playerDeck.getCard(3);
                Hero playerHero = new Hero("Warrior", 0, 0, 30, 2);
                Hero enemyHero = new Hero("Dexter the Dendrologist", 0, 0, 0, 0);
                bc1 = new BoardClear(deck, enemyDeck, playerHand1, null, fField, eField, 0, 4, 4, playerHero, enemyHero);

            }
        }
    }
