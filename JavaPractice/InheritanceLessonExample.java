package JavaPractice;

public class InheritanceLessonExample {
    public static void main(String[] args) {
        
        Character c1 = new Warrior("Arthur", 1, 100);
        Character c2 = new Mage(null, 0, 0);
        Character c3 = new Archer(null, 0, 0);
        

        c1.attack();
        c2.attack();
        c3.attack();

        
        
    }
}

abstract class Character {
    private String name;
    private int level;
    private int health;
    Character (String name, int level, int health){
            this.name = name;
            this.level = level;
            this.health = health;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public int getLevel(){
            return level;
        }
        public void setLevel(int level){
            this.level = level;
        }
        public int getHealth(){
            return health;
        }
        public void setHealth(int health){
            this.health = health;
        }
    void attack(){ }
    void takeDamage(int damage){
       int newHealth = getHealth();
       setHealth(newHealth);
    }
    void showStatus(){
        System.out.println("Name: ");
        System.out.println("Level: ");
        System.out.println("Health: ");
    }
}
class Warrior extends Character{
    Warrior(String name, int level, int health) {
        super(name, level, health);
    }
    void attack(){
        System.out.println("Attack using SWORD");
    }
    void castSpell(){
        System.out.println("Heavenly Bash");
    }
    void weaponName(){
        System.out.println("Benevolent Sword");
    }
    int armor = 10;
    
}
class Mage extends Character{
    Mage (String name, int level, int health){
        super(name, level, health);
    }
    void attack(){
        System.out.println("Attack using WAND");
    }
    void castSpell(){
    System.out.println("FireBall");
    }
    void Mana(){
        System.out.println(100);
    }
}
class Archer extends Character{
    Archer(String name, int level, int age){
        super(name, level, age);
    }
    void attack(){
        System.out.println("Attack using BOW and ARROW");
    }
    void castSpell(){
        System.out.println("Arrow Rain");
    }
    void arrowCount(){
        System.out.println(300);
    }
}