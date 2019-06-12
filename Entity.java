package hearthstone;

abstract public class Entity {
    public int hp;
    public int maxHP;
    public int attack;
    public String name;
    public int cost;
    public Entity(String nm, int atk, int health, int max, int c){
        hp = health;
        maxHP = max;
        attack = atk;
        name = nm;
        cost = c;
    }
}
