package classwork_1;

//class Witch {
//
//    String name;
//    int health;
//    double poisonDamage;
//    boolean canPoison;
//
//    public Witch(String name, int health, double poisonDamage, boolean canPoison) {
//        this.name = name;
//        this.health = health;
//        this.poisonDamage = poisonDamage;
//        this.canPoison = canPoison;
//    }
//
//    void poison() {
//        System.out.println(name + " отравляет " + poisonDamage);
//    }
//
//    void takeDamage(int damage) {
//        health -= damage;
//    }
//
//    boolean isAlive() {
//        return health > 0;
//    }
//}


public class Witch extends Monster{
	public Witch(String name, int health, double dmg, boolean canFly, int speed) {
		super(name, health, dmg, canFly, speed);
    }
}
