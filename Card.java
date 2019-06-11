package hearthstone;

public class Card extends Hearthstone{
    public String name;
    public int hp;
    public int attack;
    public String condition;
    public int cost;
    public boolean firstTurn;
    
    public Card(String n, int health, int atk, int c, String con){
        //super(n, health, atk);
        name = n;
        hp = health;
        attack = atk;
        condition = con;
        cost = c;
        firstTurn = true;
    }
    
    public Card(){
        //super("", 0, 0);
        name = "";
        hp = 0;
        attack = 0;
        cost = 0;
        condition = "";
        firstTurn = true;
    }
    
    public void attack(Card e1){
        e1.hp -= this.attack;
        this.hp -= e1.attack;
        if((!this.firstTurn || this.condition.contains("Charge") || e1.attack < 0) && !e1.condition.contains("Special1")){
            System.out.println("You can't attack with this card");
        }else if(e1.hp <= 0 && this.hp <= 0){
                System.out.println("You attacked this card and both of you died.");
                e1.setAttack(0);
                e1.setHp(0);
                e1.setName("");
                this.setAttack(0);
                this.setHp(0);
                this.setName("");
            }else if(e1.hp <= 0){
                System.out.println("You killed this card. The health has been reduced to 0, " + this.name + "'s hp is " + this.getHp());
                e1.setAttack(0);
                e1.setHp(0);
                e1.setName("");
                this.setHp(this.hp - e1.getAttack());
            }else{
                this.setHp(this.hp - e1.getAttack());
                e1.setHp(e1.getHp() - this.getAttack());
                System.out.println("You attacked this card, " + this.name + "'s hp is " + this.hp + ", " + e1.name + "'s hp is " + e1.hp);
            }
    }
    
    public void checkCondition(Card c1){
        if(this.condition.contains("Battlecry")){
            
        }else if(this.condition.contains("Deathrattle")){
            
        }else if(this.condition.contains("Spell")){
            
        }
    }
    
    public Card playCard(Card c1, Puzzles p1){
        p1.currentMana -= c1.cost;
        checkCondition(c1);
        return c1;
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
    
    public void setCost(int cost){
        this.cost = cost;
    }
    
    public int getCost(){
        return this.cost;
    }
    
    public static void cardStats(Card c1){
        System.out.println("Name: " + c1.getName());
        System.out.println("Health: " + c1.getHp());
        System.out.println("Attack: " + c1.getAttack());
        System.out.println("Conditions: " + c1.getCondition());
    }
}
