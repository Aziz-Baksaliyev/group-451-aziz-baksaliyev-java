package homework_10;

public class Skeleton extends Monster implements Attackable, Defendable, SpecialAbility {
    public Skeleton(String name) { super(name, 20); }

    @Override
    public void attack() { System.out.println(name + " стреляет из лука!"); }
    @Override
    public void defend() { System.out.println(name + " гремит костями, уклоняясь от меча."); }
    @Override
    public void useSpecial() { System.out.println(name + " выпускает сразу 3 стрелы!"); }
}