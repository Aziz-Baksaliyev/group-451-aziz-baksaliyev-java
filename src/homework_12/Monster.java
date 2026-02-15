package homework_12;

public class Monster {
	
	public int hp = 150;
	
	public int attack() {
		return 15;
	}

	public void takeDamage(int dmg) {
		this.hp = this.hp - dmg;
		
	}
}

