package homework_11;

public class PointGame {
	public static void main(String[] args) {
        int[] points = {120, 85, 200, 95, 150, 60, 175, 110};

        int bestScore = points[0];
        int worstScore = points[0];

        for (int i = 1; i < points.length; i++) {
            bestScore = Math.max(bestScore, points[i]);
            worstScore = Math.min(worstScore, points[i]);
        }

        int difference = bestScore - worstScore;

        System.out.println("Лучший результат: " + bestScore);
        System.out.println("Худший результат: " + worstScore);
        System.out.println("Разница между лучшим и худшим: " + difference + " баллов");

        if (difference > 100) {
            System.out.println("Очень большая разница!");
        }
    }
}
