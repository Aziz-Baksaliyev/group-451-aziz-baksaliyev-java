package classwork_1;

//class Ghast {
//
//    String name;
//    int health;
//    double fireballDamage;
//    boolean canFly;
//
//    public Ghast(String name, int health, double fireballDamage, boolean canFly) {
//        this.name = name;
//        this.health = health;
//        this.fireballDamage = fireballDamage;
//        this.canFly = canFly;
//    }
//
//    void fireball() {
//        System.out.println(name + " кидается огненными шарами " + fireballDamage);
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


public class Ghast extends Monster {
	public Ghast(String name, int health, double dmg, boolean canFly, int speed) {
		super(name, health, dmg, canFly, speed);
    }
}
