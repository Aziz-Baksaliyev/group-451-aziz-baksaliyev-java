package classwork_1;

//class Golem {
//
//    String name;
//    int health;
//    double punchDamage;
//    boolean canSlap;
//
//    public Golem(String name, int health, double punchDamage, boolean canSlap) {
//        this.name = name;
//        this.health = health;
//        this.punchDamage = punchDamage;
//        this.canSlap = canSlap;
//    }
//
//    void kick() {
//        System.out.println(name + " ударяет " + punchDamage);
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


public class Golem extends Monster {
	public Golem(String name, int health, double dmg, boolean canFly, int speed) {
		super(name, health, dmg, canFly, speed);
	}
}
