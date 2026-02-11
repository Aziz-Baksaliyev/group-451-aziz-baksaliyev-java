package homework_11;

public class Distances {

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        double homeX = 0;
        double homeY = 0;

        double minDistance = 9999.0;
        double maxDistance = 0.0;

        System.out.println("Расстояние от дома до:");

        double distSchool = calculateDistance(homeX, homeY, 4, 3);
        System.out.println("Школа: " + distSchool + " метров");
        minDistance = Math.min(minDistance, distSchool);
        maxDistance = Math.max(maxDistance, distSchool);

        double distShop = calculateDistance(homeX, homeY, 0, 8);
        System.out.println("Магазин: " + distShop + " метров");
        minDistance = Math.min(minDistance, distShop);
        maxDistance = Math.max(maxDistance, distShop);

        double distPark = calculateDistance(homeX, homeY, 5, 12);
        System.out.println("Парк: " + distPark + " метров");
        minDistance = Math.min(minDistance, distPark);
        maxDistance = Math.max(maxDistance, distPark);

        double distFriend = calculateDistance(homeX, homeY, 9, 0);
        System.out.println("Друг: " + distFriend + " метров");
        minDistance = Math.min(minDistance, distFriend);
        maxDistance = Math.max(maxDistance, distFriend);

        double distCinema = calculateDistance(homeX, homeY, 2, 10);
        System.out.println("Кино: " + distCinema + " метров");
        minDistance = Math.min(minDistance, distCinema);
        maxDistance = Math.max(maxDistance, distCinema);

        double distGrandma = calculateDistance(homeX, homeY, 7, 5);
        System.out.println("Бабушка: " + distGrandma + " метров");
        minDistance = Math.min(minDistance, distGrandma);
        maxDistance = Math.max(maxDistance, distGrandma);

        System.out.println("Ближайшее место: " + minDistance + " метров");
        System.out.println("Самое дальнее: " + maxDistance + " метров");
    }
}