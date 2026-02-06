package classwork_1;

//class Creeper {
//
//    String name;
//    int health;
//    double blowPower;
//    boolean canFly;
//
//    public Creeper(String name, int health, double blowPower) {
//        this.name = name;
//        this.health = health;
//        this.blowPower = blowPower;
//    }
//
//    void blowing() {
//        System.out.println(name + " взрывается " + blowPower);
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

public class Creeper extends Monster {
	public Creeper(String name, int health, double dmg, boolean canFly, int speed) {
		super(name, health, dmg, canFly, speed);
    }
}