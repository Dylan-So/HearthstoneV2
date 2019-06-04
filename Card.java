package hearthstone;

public class Card extends HearthstoneBoard{
    public String name;
    public int hp;
    public int attack;
    public String condition;
    
    public Card(String n, int health, int atk, String con){
        name = n;
        hp = health;
        attack = atk;
        condition = con;
    }
    
    public Card(){
        name = "";
        hp = 0;
        attack = 0;
        condition = "";
    }
    
    public void attack(Entity e1){
        e1.hp -= this.attack;
        this.hp -= e1.attack;
        if(e1.hp == 0){
            e1 = null;
            System.out.println("You killed this card. The health has been reduced to 0");
        }else if(e1.hp == 0 && this.hp == 0){
            System.out.println("You attacked this card and both of you died.");
        }else{
            System.out.println("You attacked this card, " + this.name + "'s hp is " + this.hp + ", " + e1.name + "'s hp is " + e1.hp);
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getCondition() {
        return this.condition;
    }

    public void setTaunt(String condition) {
        this.condition = condition;
    }
    
    
}
