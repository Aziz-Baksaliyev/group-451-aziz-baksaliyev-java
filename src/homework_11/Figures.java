package homework_11;

public class Figures {

    public static double squareArea(double side) {
        return side * side;
    }

    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        double maxArea = 0;

        double[] squareSides = {5, 8, 3, 10, 6};
        System.out.println("Площади квадратов:");
        for (int i = 0; i < squareSides.length; i++) {
            double area = squareArea(squareSides[i]);
            System.out.println("Квадрат: " + area);
            maxArea = Math.max(maxArea, area);
        }

        System.out.println("Площади прямоугольников:");
        
        double area1 = rectangleArea(4, 6);
        System.out.println("Прямоугольник 4x6: " + area1);
        maxArea = Math.max(maxArea, area1);

        double area2 = rectangleArea(7, 3);
        System.out.println("Прямоугольник 7x3: " + area2);
        maxArea = Math.max(maxArea, area2);

        double area3 = rectangleArea(9, 2);
        System.out.println("Прямоугольник 9x2: " + area3);
        maxArea = Math.max(maxArea, area3);

        double area4 = rectangleArea(5, 5);
        System.out.println("Прямоугольник 5x5: " + area4);
        maxArea = Math.max(maxArea, area4);

        System.out.println("Максимальная площадь: " + maxArea);
    }
}