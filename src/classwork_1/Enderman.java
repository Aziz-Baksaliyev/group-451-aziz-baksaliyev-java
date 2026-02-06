package classwork_1;

//class Enderman {
//
//    String name;
//    int health;
//    double teleportDamage;
//    boolean canTeleport;
//
//    public Enderman(String name, int health, double teleportDamage, boolean canTeleport) {
//        this.name = name;
//        this.health = health;
//        this.teleportDamage = teleportDamage;
//        this.canTeleport = canTeleport;
//    }
//
//    void teleport() {
//        System.out.println(name + " телепортируется " + teleportDamage);
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

public class Enderman extends Monster {
	public Enderman(String name, int health, double dmg, boolean canFly, int speed) {
		super(name, health, dmg, canFly, speed);
    }
}