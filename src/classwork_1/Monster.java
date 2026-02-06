package classwork_1;

public class Monster {
	String name;
	int health;
	double dmg;
	boolean canFly;
	int speed = 50;
	
	public Monster(String name, int health, double dmg, boolean canFly, int speed) {
		this.name = name;
		this.health = health;
		this.dmg = dmg;
		this.canFly = canFly;
		this.speed = speed;
	}
}
