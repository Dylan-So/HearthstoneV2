package hearthstone;

import java.util.Scanner;

public class Hearthstone{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameDeck deck = new GameDeck("C:\\Users\\324616879\\Desktop\\cards.txt");
        boolean win = false;
        int optionAns = 0;
        System.out.println("-------------Welcome to the Hearthstone Puzzle Game-------------");
        while(optionAns != -1 || !win){
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
                int puzzleAns = 0;
                if(puzzleAns == 1){
                    Puzzles[] boardClearLvls = new BoardClear[7];
                    for(int i = 0; i < 7; i++){
                        boardClearLvls[i] = new BoardClear();
                    }
                    
                }else if(puzzleAns == 2){
                    Puzzles[] lethalLvls = new Lethal[7];
                    for(int i = 0; i < 7; i++){
                        lethalLvls[i] = new Lethal();
                    }
                    
                }else if(puzzleAns == 3){
                    Puzzles[] survivalLvls = new Survival[7];
                    for(int i = 0; i < 7; i++){
                        survivalLvls[i] = new Survival();
                    }
                }else{
                    Puzzles[] mirrorLvls = new Mirror[7];
                    for(int i = 0; i < 7; i++){
                        mirrorLvls[i] = new Mirror();
                    }
                }
            }else if(optionAns == 2){
                
            }else{
                break;
            }
    }
    }
}
