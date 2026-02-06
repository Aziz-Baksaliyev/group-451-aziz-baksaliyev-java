package classwork_1;

//class Vampire {
//
//    String name;
//    int health;
//    double magicDamage;
//    boolean canInvisible;
//
//    public Vampire(String name, int health, double magicDamage, boolean canInvisible) {
//        this.name = name;
//        this.health = health;
//        this.magicDamage = magicDamage;
//        this.canInvisible = canInvisible;
//    }
//
//    void magic() {
//        System.out.println(name + " использует магию " + magicDamage);
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


public class Vampire extends Monster{
	public Vampire(String name, int health, double dmg, boolean canFly, int speed) {
		super(name, health, dmg, canFly, speed);
    }
}
