package homework_11;

public class Cube {
	public static int throwCube() {
        return (int)(Math.random() * 6) + 1;
    }
    public static void main(String[] args) {
        int totalScore = 0;
        int numberOfThrows = 15;

        System.out.println("Игра начинается!");

        for (int i = 1; i <= numberOfThrows; i++) {
            int очки = throwCube();
            
            System.out.print("Бросок " + i + ": " + очки);

            if (очки == 1) {
                System.out.print("Плохо...");
            }
            if (очки == 6) {
                System.out.print("Классно! Шестёрка!");
            }
            totalScore += очки;
        }

        System.out.println("Всего набрано очков: " + totalScore);
    }
}
