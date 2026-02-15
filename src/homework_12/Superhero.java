package homework_12;

public class Superhero {
    String name;
    int powerLevel;
    String secretIdentity;
    boolean isGood;

    public Superhero(String name, int powerLevel, String secretIdentity, boolean isGood) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.secretIdentity = secretIdentity;
        this.isGood = isGood;
    }

    public void showHeroCard() {
        System.out.println("--- КАРТОЧКА ГЕРОЯ ---");
        System.out.println("Имя: " + name);
        System.out.println("Сила: " + powerLevel);
        System.out.println("Секрет: " + secretIdentity);
        if (isGood) {
            System.out.println("Сторона: Герой");
        } else {
            System.out.println("Сторона: Злодей");
        }
    }

    public void usePower() {
        System.out.println("Супергерой " + name + " использует силу уровня " + powerLevel + "!");
    }
}