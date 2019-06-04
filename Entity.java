package hearthstone;

abstract public class Entity {
    public int hp;
    public int attack;
    public String name;
    public Entity(String nm, int atk, int health){
        hp = health;
        attack = atk;
        name = nm;
    }
}
