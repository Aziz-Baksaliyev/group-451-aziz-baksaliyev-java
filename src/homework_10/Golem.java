package homework_10;

public class Golem extends Monster implements Attackable, Defendable, SpecialAbility {
    public Golem(String name) { super(name, 100); }

    @Override
    public void attack() { System.out.println(name + " кидает врага в стратосферу.."); }
    @Override
    public void defend() { System.out.println(name + " блокирует удар железными руками."); }
    @Override
    public void useSpecial() { System.out.println(name + " дарит розу (шутка, он просто топает)."); }
}