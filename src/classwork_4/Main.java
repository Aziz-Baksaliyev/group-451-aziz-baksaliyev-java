package classwork_4;

class Hero {
    String name;
    int health;
    int strength;
    int level;

    public Hero(String name, int health, int strength, int level) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.level = level;
    }

    public void attack() {
        System.out.println("Герой атакует с силой " + this.strength);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
        System.out.println(this.name + " получил " + damage + " урона. Осталось здоровья: " + this.health);
    }

    public void showInfo() {
        System.out.println("Имя: " + this.name + ", Здоровье: " + this.health + ", Сила: " + this.strength + ", Уровень: " + this.level);
    }
}

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Азиз", 100, 15, 1);
        Hero hero2 = new Hero("Мамед", 120, 12, 1);

        hero1.showInfo();
        hero2.showInfo();

        hero1.attack();
        hero2.takeDamage(hero1.strength);

        hero2.attack();
        hero1.takeDamage(hero2.strength);
    }
}
