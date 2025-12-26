package homework_3;

public class Homework_3 {
	public static void main(String[] args) {
		//1)
		int grade = 4;
		
		if (grade == 5) {
		    System.out.println("Отлично");
		} else if (grade == 4) {
		    System.out.println("Хорошо");
		} else if (grade == 3) {
		    System.out.println("Удовлетворительно");
		} else if (grade == 2) {
		    System.out.println("Неудовлетворительно");
		} else {
		    System.out.println("Некорректная оценка");
		}
		

		//2)
		//int a = 3;
		//int b = 6;
		//int c = 9;
		//
		//if (
//		    (a % 2 == 0 && (b % 2 != 0 || c % 2 != 0)) ||
//		    (b % 2 == 0 && (a % 2 != 0 || c % 2 != 0)) ||
//		    (c % 2 == 0 && (a % 2 != 0 || b % 2 != 0))
		//) {
//		    System.out.println("Да");
		//} else {
//		    System.out.println("Нет");
		//}

		//3)
		//int month = 2;
		//
		//switch (month) {
//		    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
//		    case 4, 6, 9, 11 -> System.out.println(30);
//		    case 2 -> System.out.println(28);
//		    default -> System.out.println("Ошибка");
		//}

		//4)
		//int age = 15;
		//
		//if (age < 0) {
//		    System.out.println("Ошибка");
		//} else if (age <= 12) {
//		    System.out.println("Ребёнок");
		//} else if (age <= 17) {
//		    System.out.println("Подросток");
		//} else if (age <= 59) {
//		    System.out.println("Взрослый");
		//} else {
//		    System.out.println("Пожилой");
		//}

		//5)...
		//6)...
		//7)
		//int score = 82;
		//
		//if (score < 0 || score > 100) {
//		    System.out.println("Ошибка");
		//} else if (score >= 90) {
//		    System.out.println(5);
		//} else if (score >= 75) {
//		    System.out.println(4);
		//} else if (score >= 60) {
//		    System.out.println(3);
		//} else {
//		    System.out.println(2);
		//}

		//8)
		//int day = 6;
		//
		//switch (day) {
//		    case 1 -> System.out.println("Понедельник");
//		    case 2 -> System.out.println("Вторник");
//		    case 3 -> System.out.println("Среда");
//		    case 4 -> System.out.println("Четверг");
//		    case 5 -> System.out.println("Пятница");
//		    case 6 -> System.out.println("Суббота");
//		    case 7 -> System.out.println("Воскресенье");
//		    default -> System.out.println("Ошибка");
		//}

		//9)
		//int a = 5;
		//int b = 5;
		//int c = 8;
		//
		//if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
//		    System.out.println("Не треугольник");
		//} else if (a == b && b == c) {
//		    System.out.println("Равносторонний");
		//} else if (a == b || a == c || b == c) {
//		    System.out.println("Равнобедренный");
		//} else {
//		    System.out.println("Разносторонний");
		//}

		//10)
		//int year = 2024;
		//
		//if (year <= 0) {
//		    System.out.println("Ошибка");
		//} else {
//		    if (year % 400 == 0) {
//		        System.out.println("Високосный");
//		    } else {
//		        if (year % 100 == 0) {
//		            System.out.println("Обычный");
//		        } else {
//		            if (year % 4 == 0) {
//		                System.out.println("Високосный");
//		            } else {
//		                System.out.println("Обычный");
//		            }
//		        }
//		    }
		//}
	}
}
