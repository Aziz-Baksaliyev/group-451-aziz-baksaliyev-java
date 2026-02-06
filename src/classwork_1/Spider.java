package classwork_1;

//class Spider {
//
//    String name;
//    int health;
//    double attackDamage;
//    boolean canBite;
//
//    public Spider(String name, int health, double attackDamage, boolean canBite) {
//        this.name = name;
//        this.health = health;
//        this.attackDamage = attackDamage;
//        this.canBite = canBite;
//    }
//
//    void attack() {
//        System.out.println(name + " атакует " + attackDamage );
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


public class Spider extends Monster {
	public Spider(String name, int health, double dmg, boolean canFly, int speed) {
		super(name, health, dmg, canFly, speed);
    }
}
