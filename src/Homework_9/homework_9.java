package Homework_9;

public class homework_9 {

// 1

    static class Person {
        String name;
        public Person(String name) { this.name = name; }
        public void printNameLength() {
            if (name != null) {
                System.out.println("Длина имени " + name + ": " + name.length());
            } else {
                System.out.println("Ошибка: name равно null!");
            }
        }
    }

// 2
    static class Counter {
        static int totalCount = 0;
        int instanceCount = 0;
        public Counter() {
            totalCount++;
            instanceCount++;
        }
    }

// 3
    public static double sumNumbers(Integer a, double b) {
        return a + b; 
    }

// 4
    static class Box {
        int value;
        public Box(int value) { this.value = value; }
    }
    public static void changeValue(Box b) {
        b.value = 100;
    }

// Раздел где запускаются задания
    
    public static void main(String[] args) {

// 1
        System.out.println("=== Задание 1 ===");
        Person p1 = new Person("Alex");
        p1.printNameLength();
        Person p2 = new Person(null);
        p2.printNameLength();

// 2
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("Общий (static): " + Counter.totalCount);
        System.out.println("Личный у c3 (instance): " + c3.instanceCount);

// 3
        double res = sumNumbers(5, 10.5); 
        System.out.println("Результат суммы: " + res);

// 4
        Box b = new Box(10);
        System.out.println("До метода: " + b.value);
        changeValue(b);
        System.out.println("После метода: " + b.value);

// 5
        int x = 10;
        if (x > 5) {
            int y = x * 2;
            System.out.println("y внутри if: " + y);
        }
        System.out.println("x видна везде: " + x);
    }
}