package hearthstone;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class gameDeck extends Card{
    public ArrayList<Card> card;
    public File cards;
    
    public gameDeck(String path){
        cards = new File(path);
        try{
            card = new ArrayList<Card>();
            Scanner sc = new Scanner(cards);
            do{
                card.add(new Card(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.next()));
            }
            while(sc.hasNext() || sc.hasNextInt() || sc.hasNextLine());
        }catch(Exception e){
            System.out.println("An error has occured");
        }
    }
    
    public Card getCard(int index){
        return card.get(index);
    }
}
