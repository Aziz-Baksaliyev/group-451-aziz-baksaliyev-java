package classwork_4;

public abstract class Monster {
    protected String type;
    protected int health;
    protected int damage;

    public Monster(String type, int health, int damage) {
        this.type = type;
        this.health = health;
        this.damage = damage;
    }

    public void roar() {
        System.out.println("[" + type + "] издает жуткий рев!");
    }

    public int attack() {
        System.out.println(type + " атакует и наносит " + damage + " урона.");
        return damage;
    }

    public abstract int specialAbility();
    public int getHealth(){
    	return health; 
    	}
    public void takeDamage(int amount){ 
    	this.health -= amount; 
    }
    public String getType() {
    	return type; 
}
}