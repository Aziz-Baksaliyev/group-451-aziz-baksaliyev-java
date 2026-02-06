package classwork_1;

//class Dragon {
//
//    String name;
//    int health;
//    double firePower;
//    boolean canFly;
//
//    public Dragon(String name, int health, double firePower, boolean canFly) {
//        this.name = name;
//        this.health = health;
//        this.firePower = firePower;
//        this.canFly = canFly;
//    }
//
//    void breatheFire() {
//        System.out.println(name + " дышит огнём с силой " + firePower);
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

public class Dragon extends Monster {
	public Dragon(String name, int health, double dmg, boolean canFly, int speed) {
		super(name, health, dmg, canFly, speed);
    }
}
