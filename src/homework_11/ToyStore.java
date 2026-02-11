package homework_11;

public class ToyStore {

    public static long roundUp(double price) {
        return Math.round(price);
    }

    public static void main(String[] args) {
        double[] prices = {45.6, 19.9, 99.4, 8.2, 150.7, 33.1, 67.8, 12.5, 200.0, 55.3};
        
        System.out.println("Цены в магазине игрушек:");
        
        double pricesSum = 0.0;

        for (int i = 0; i < prices.length; i++) {
            double price = prices[i];
            long roundedPrice = roundUp(price);
            
            System.out.println("Игрушка: " + price + " после округления: " + roundedPrice);
            
            pricesSum += price;
        }

        double averagePrice = pricesSum / 10;
        long roundedAverage = Math.round(averagePrice);
        
        System.out.println("Средняя цена ~ " + roundedAverage);
    }
}