package homework_7;

public class Homework_7 {
//1
//	...
	
//2
    static class Rectangle {
        double width;
        double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        double area() {
            return width * height;
        }

        Rectangle scale(double factor) {
            return new Rectangle(width * factor, height * factor);
        }
    }

//3
    static class Temperature {
        double celsius;

        Temperature(double celsius) {
            this.celsius = celsius;
        }

        double toFahrenheit() {
            return celsius * 9 / 5 + 32;
        }

        static Temperature fromFahrenheit(double f) {
            return new Temperature((f - 32) * 5 / 9);
        }
    }

//4
    static class BaseEmployee {
        double salary;

        BaseEmployee(double salary) {
            this.salary = salary;
        }

        double calculateBonus() {
            double baseBonus = salary * 0.1;
            System.out.println("BaseEmployee bonus: " + baseBonus);
            return baseBonus;
        }
    }

    static class Manager extends BaseEmployee {

        Manager(double salary) {
            super(salary);
        }

        @Override
        double calculateBonus() {
            double managerBonus = super.calculateBonus() * 2;
            System.out.println("Manager bonus: " + managerBonus);
            return managerBonus;
        }
    }
//5
//	...
}