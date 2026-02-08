package homework_10;

public class Main {
    public static void main(String[] args) {

        // 1
        Zombie zombie = new Zombie("Гнилой Джо");
        zombie.attack();
        zombie.defend();
        zombie.useSpecial();;

        // 2
        Creeper creeper = new Creeper("Зеленый Бабах");
        creeper.attack();
        creeper.defend();
        creeper.useSpecial();

        // 3
        Dragon dragon = new Dragon("Смауг");
        dragon.attack();
        dragon.defend();
        dragon.useSpecial();

        // 4
        Enderman enderman = new Enderman("Странник Края");
        enderman.attack();
        enderman.defend();
        enderman.useSpecial();

        // 5
        Ghast ghast = new Ghast("Летающий Зефир");
        ghast.attack();
        ghast.defend();
        ghast.useSpecial();

        // 6
        Golem golem = new Golem("Железяка");
        golem.attack();
        golem.defend();
        golem.useSpecial();

        // 7
        Skeleton skeleton = new Skeleton("Костян");
        skeleton.attack();
        skeleton.defend();
        skeleton.useSpecial();

        // 8
        Spider spider = new Spider("Арагог");
        spider.attack();
        spider.defend();
        spider.useSpecial();

        // 9
        Witch witch = new Witch("Баба Яга");
        witch.attack();
        witch.defend();
        witch.useSpecial();

        // 10
        Vampire vampire = new Vampire("Граф Дракула");
        vampire.attack();
        vampire.defend();
        vampire.useSpecial();

    }
}