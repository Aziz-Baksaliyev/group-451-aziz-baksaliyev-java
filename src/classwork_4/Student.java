package classwork_4;

public class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void showInfo() {
        System.out.println("Студент: " + name + " | Возраст: " + age + " | Оценка: " + grade);
    }
}
