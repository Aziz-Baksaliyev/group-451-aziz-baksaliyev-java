package homework_12;

public class Main {
    public static void main(String[] args) {
        
        //1)
    	
        Superhero hero1 = new Superhero("Бэтмен", 90, "Брюс Уэйн", true);
        Superhero hero2 = new Superhero("Джокер", 95, "Неизвестно", false);
        
        hero1.showHeroCard();
        hero2.showHeroCard();
        
        if (hero1.powerLevel > hero2.powerLevel) {
            System.out.println("Результат битвы: Победил " + hero1.name);
        } else {
            System.out.println("Результат битвы: Победил " + hero2.name);
        }
        System.out.println();

        //3)
        
        Pizza p1 = new Pizza("большая");
        p1.addIngredient("Сыр");
        p1.addIngredient("Пепперони");
        p1.addIngredient("Грибы");
        
        Order myOrder = new Order("Азиз");
        myOrder.addPizza(p1);
        myOrder.printCheck();
        System.out.println();
        
        //4)
        
        Band myBand = new Band("Java Stars");
        myBand.addMusician(new Guitarist("Слэш", 15));
        myBand.perform();
        System.out.println();

        //5)
        
        System.out.println("=== ЗАДАНИЕ 5: БИБЛИОТЕКА ===");
        Book b1 = new Book("Чистый код");
        Reader r1 = new Reader("Иван Иванов");

        r1.borrowBook(b1);
        System.out.println();

        //6)

        Fighter[] squad = new Fighter[2];
        squad[0] = new Knight();
        squad[1] = new Knight(); 
        
        Monster dragon = new Monster();
        Dungeon dungeon = new Dungeon();
        
        dungeon.battle(squad, dragon);
    }
}