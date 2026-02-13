package classwork_4;

public class Car {
    String brand;
    int speed;
    int fuel;

    public Car(String brand, int speed, int fuel) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
    }

    public void drive() {
        if (fuel > 0) {
            fuel -= 10;
            if (fuel < 0) fuel = 0;
            System.out.println(brand + " проехала дистанцию. Скорость: " + speed + " км/ч. Топливо: " + fuel + "%");
        } else {
            System.out.println(brand + " не может ехать: бак пуст!");
        }
    }

    public void refuel(int amount) {
        fuel += amount;
        if (fuel > 100) fuel = 100;
        System.out.println(brand + " заправлена на " + amount + "% Текущее топливо: " + fuel + "%");
    }

    public void showInfo() {
        System.out.println("Машина: " + brand + " | Макс. скорость: " + speed + " | Топливо: " + fuel);
    }
}