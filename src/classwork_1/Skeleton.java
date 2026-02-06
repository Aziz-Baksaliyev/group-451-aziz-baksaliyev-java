package classwork_1;

//class Skeleton {
//
//    String name;
//    int health;
//    double shootDamage;
//    boolean canDie;
//
//    public Skeleton(String name, int health, double shootDamage, boolean canDie) {
//        this.name = name;
//        this.health = health;
//        this.shootDamage = shootDamage;
//        this.canDie = canDie;
//    }
//
//    void shoot() {
//        System.out.println(name + " стреляет " + shootDamage);
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


public class Skeleton extends Monster {
	public Skeleton(String name, int health, double dmg, boolean canFly, int speed) {
		super(name, health, dmg, canFly, speed);
    }
}
