package hearthstone;

abstract public class Entity {
    public int hp;
    public int attack;
    public String name;
    public int cost;
    public Entity(String nm, int atk, int health, int c){
        hp = health;
        attack = atk;
        name = nm;
        cost = c;
    }
}
