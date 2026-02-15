package homework_12;

public class Dungeon {
    public void battle(Fighter[] team, Monster boss) {
        System.out.println("Битва началась!");
        
        while (boss.hp > 0) {
            for (int i = 0; i < team.length; i++) {
                if (team[i].isAlive()) {
                    boss.takeDamage(team[i].attack());
                }
            }
            
            if (boss.hp > 0) {
                for (int i = 0; i < team.length; i++) {
                    if (team[i].isAlive()) {
                        team[i].takeDamage(boss.attack());
                        break;
                    }
                }
            }
        }
        System.out.println("Босс повержен!");
    }
}
