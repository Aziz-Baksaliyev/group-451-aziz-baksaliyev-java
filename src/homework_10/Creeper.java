package homework_10;

public class Creeper extends Monster implements Attackable, Defendable, SpecialAbility {
    public Creeper(String name) { super(name, 20); }

    @Override
    public void attack() { System.out.println(name + " шипит рядом!"); }

    @Override
    public void defend() { System.out.println(name + " убегает."); }

    @Override
    public void useSpecial() { System.out.println(name + " БУМ!"); }
}