package hearthstone;

public class Hero extends Entity {
    public int armor;
    
    public Hero(String name, int atk, int arm, int hp){
        super(name, atk, hp);
        armor = arm;
    }
    public Hero(){
        super("", 0, 0);
        armor = 0;
    }
    
    public void heroPower(Entity e1){
        
    }
}
