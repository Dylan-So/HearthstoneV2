package hearthstone;

public class Hero extends Entity {

    public int armor;

    public Hero(String name, int atk, int arm, int hp, int max, int c) {
        super(name, max, atk, hp, c);
        armor = arm;
    }

    public Hero() {
        super("", 0, 0, 0, 0);
        armor = 0;
    }

    public void heroPower(Entity e1) {
        if (e1.name.contains("mage")) {

        }
    }
}
