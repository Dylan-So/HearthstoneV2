package hearthstone;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class GameDeck extends Card{
    public ArrayList<Card> card;
    //public File cards;
    
    public GameDeck(String path){
        File cardFile = new File(path);
        try{
            card = new ArrayList<>();
            Scanner sc = new Scanner(cardFile);
            while(sc.hasNextLine() || sc.hasNextInt()){
                card.add(new Card(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next()));
                sc.nextLine();
            }
        }catch(Exception e){
            System.out.print("");
        }
    }
    
    public Card getCard(int index){
        return this.card.get(index);
    }
    
    public void search(){
        
    }
    
    public Card drawCard(){
        Random rand = new Random();
        return this.card.get(rand.nextInt(this.card.size() - 1));
    }
}
