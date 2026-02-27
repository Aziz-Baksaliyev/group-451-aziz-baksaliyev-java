package homework_13;

import java.util.Arrays;

interface Superhero {
 void introduce();
 void attack();
 void defend();
 int getPowerLevel();
}


class FireHero implements Superhero {
 String name;
 int powerLevel;

 public FireHero(String name, int powerLevel) {
     this.name = name;
     this.powerLevel = powerLevel;
 }

 public void introduce() {
     System.out.println("Я " + name + "! Мастер огня! Мой уровень силы: " + powerLevel);
 }
 public void attack() {
     System.out.println(name + " бросает огненный шар! БУМ!");
 }
 public void defend() {
     System.out.println(name + " создаёт огненный щит!");
 }
 public int getPowerLevel() {
     return powerLevel;
 }
}

class IceHero implements Superhero {
 String name;
 int powerLevel;
 int freezePower;

 public IceHero(String name, int powerLevel, int freezePower) {
     this.name = name;
     this.powerLevel = powerLevel;
     this.freezePower = freezePower;
 }

 public void introduce() {
     System.out.println("Меня зовут " + name + ". Я замораживаю всё на своём пути! Сила: " + powerLevel);
 }
 public void attack() {
     System.out.println(name + " выпускает ледяные шипы! Замерзай!");
 }
 public void defend() {
     System.out.println(name + " окружает себя ледяной стеной!");
 }
 public int getPowerLevel() {
     return powerLevel;
 }
}

class SpeedHero implements Superhero {
 String name;
 int powerLevel;
 boolean isSuperFast;

 public SpeedHero(String name, int powerLevel, boolean isSuperFast) {
     this.name = name;
     this.powerLevel = powerLevel;
     this.isSuperFast = isSuperFast;
 }

 public void introduce() {
     System.out.println("Привет! Я " + name + " — самый быстрый в мире! Сила: " + powerLevel);
 }
 public void attack() {
     if (isSuperFast) {
         System.out.println(name + " бьёт 10 раз за секунду!!!");
     } else {
         System.out.println(name + " быстро бьёт кулаком!");
     }
 }
 public void defend() {
     System.out.println(name + " уворачивается со скоростью света!");
 }
 public int getPowerLevel() {
     return powerLevel;
 }
}

class Team {
 String teamName;
 Superhero[] members = new Superhero[3];
 int count = 0;

 void addHero(Superhero hero) {
     if (count < members.length) {
         members[count] = hero;
         count++;
     } else {
         System.out.println("Команда полная! Нельзя добавить " + hero.getPowerLevel());
     }
 }

 void showTeam() {
     System.out.println("\nКоманда " + teamName + ":");
     for (int i = 0; i < count; i++) {
         members[i].introduce();
     }
 }

 void teamAttack() {
     System.out.println("\nКоманда атакует!");
     for (int i = 0; i < count; i++) {
         members[i].attack();
     }
 }

 int getTotalPower() {
     int total = 0;
     for (int i = 0; i < count; i++) {
         total += members[i].getPowerLevel();
     }
     return total;
 }
}


public class Main {
 public static void main(String[] args) {
     FireHero torch = new FireHero("Torch", 85);
     IceHero frost = new IceHero("Frost", 70, 8);
     SpeedHero flash = new SpeedHero("Flash", 95, true);

     Team avengers = new Team();
     avengers.teamName = "Мстители";

     avengers.addHero(torch);
     avengers.addHero(frost);
     avengers.addHero(flash);

     avengers.showTeam();
     System.out.println("Общая сила команды: " + avengers.getTotalPower());
     avengers.teamAttack();

     SpeedHero extra = new SpeedHero("Extra", 50, false);
     avengers.addHero(extra);
 }
}