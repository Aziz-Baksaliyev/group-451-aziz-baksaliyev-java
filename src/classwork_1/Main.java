package classwork_1;

public class Main {
	public static void main (String[] args) {
		Creeper myCreeper = new Creeper("Взрывчатка", 100, 60, false, 15);
		Dragon myDragon = new Dragon("Огонь", 100, 100, true, 40);
		Enderman myEnderman = new Enderman("Портал", 100, 60, false, 20);
		Ghast myGhast = new Ghast("Огниво", 100, 40, true, 20);
		Golem myGolem = new Golem("Дядя Шапалах", 100, 70, false, 15);
		Skeleton mySkeleton = new Skeleton("Стрелок", 100, 40, false, 10);
		Spider mySpider = new Spider("Куська", 100, 40, false, 15);
		Vampire myVampire = new Vampire("Скрынник", 100, 50, false, 20);
		Witch myWitch = new Witch ("Зелье", 100, 40, false, 20);
		Zombie myZombie = new Zombie ("Мозги", 100, 30, false, 10);
	}
}
