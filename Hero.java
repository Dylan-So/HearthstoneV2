package hearthstone;

public class Hero{
    public String name;
    public int attack;
    public int hp;
    public int cost;
    public int armor;
    public int maxHp;
    
    public Hero(String nm, int atk, int arm, int health, int c){
        name = nm;
        attack = atk;
        hp = health;
        armor = arm;
        maxHp = 30;
    }
    public Hero(){
        name = "";
        attack = 0;
        hp = 0;
        armor = 0;
        maxHp = 0;
    }
    
}
