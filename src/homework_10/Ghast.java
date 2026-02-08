package homework_10;

public class Ghast extends Monster implements Attackable, Defendable, SpecialAbility {
    public Ghast(String name) { super(name, 10); }

    @Override
    public void attack() { System.out.println(name + " кричит и выпускает огненный шар!"); }
    @Override
    public void defend() { System.out.println(name + " уклоняется, паря в воздухе."); }
    @Override
    public void useSpecial() { System.out.println(name + " заливает лавой всё вокруг."); }
}