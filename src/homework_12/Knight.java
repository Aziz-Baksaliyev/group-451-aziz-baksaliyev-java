package homework_12;

public class Knight {
    public String name = "Рыцарь";
    public int hp = 100;

    @Override
    public int attack() {
        return 20;
    }

    @Override
    public void takeDamage(int dmg) {
        int finalDamage = dmg - 5;
        
        if (finalDamage < 0) {
            finalDamage = 0;
        }
        
        this.hp = this.hp - finalDamage;
        System.out.println("Рыцарь получил " + finalDamage + " урона. Осталось HP: " + this.hp);
    }

    @Override
    public boolean isAlive() {
        if (this.hp > 0) {
            return true;
        } else {
            return false;
        }
    }
}
