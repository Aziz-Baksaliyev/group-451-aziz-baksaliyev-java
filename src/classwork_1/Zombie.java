package classwork_1;

//class Zombie {
//
//    String name;
//    int health;
//    double nauseaDamage;
//    boolean canBiteBetter;
//
//    public Zombie(String name, int health, double nauseaDamage, boolean canBiteBetter) {
//        this.name = name;
//        this.health = health;
//        this.nauseaDamage = nauseaDamage;
//        this.canBiteBetter = canBiteBetter;
//    }
//
//    void nausea() {
//        System.out.println(name + " кусается и вызывает тошноту с уроном " + nauseaDamage);
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


public class Zombie extends Monster{
	public Zombie(String name, int health, double dmg, boolean canFly, int speed) {
		super(name, health, dmg, canFly, speed);
    }
}
