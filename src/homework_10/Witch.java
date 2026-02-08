package homework_10;

public class Witch extends Monster implements Attackable, Defendable, SpecialAbility {
    public Witch(String name) { super(name, 26); }

    @Override
    public void attack() { System.out.println(name + " кидает взрывное зелье урона!"); }
    @Override
    public void defend() { System.out.println(name + " пьет зелье регенерации."); }
    @Override
    public void useSpecial() { System.out.println(name + " накладывает эффект отравления."); }
}